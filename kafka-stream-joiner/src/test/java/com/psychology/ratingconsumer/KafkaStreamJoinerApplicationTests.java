package com.psychology.ratingconsumer;

import com.psychology.rating.avro.RatingMessage;
import com.psychology.ratingconsumer.kafka.RatingsConsumer;
import com.psychology.ratingconsumer.mapper.RatingMapper;
import com.psychology.ratingconsumer.model.Rating;
import com.psychology.ratingconsumer.service.RatingService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;

import java.util.Collections;
import java.util.List;

import static org.mockito.Mockito.*;

@SpringBootTest
class KafkaStreamJoinerApplicationTests {

    @Mock
    private RatingService ratingService;

    @Mock
    private RatingMapper ratingMapper;

    @Mock
    private Acknowledgment acknowledgment;

    @InjectMocks
    private RatingsConsumer ratingsConsumer;

    @Test
    public void testListen() {
        // Create test data
        Rating rating = new Rating();
        RatingMessage ratingMessage = new RatingMessage();
        Message<RatingMessage> message = MessageBuilder
                .withPayload(ratingMessage)
                .setHeader(KafkaHeaders.RECEIVED_PARTITION, 0)
                .setHeader(KafkaHeaders.OFFSET, 0L)
                .build();
        List<Message<RatingMessage>> messages = Collections.singletonList(message);

        // Set up mock behavior
        when(ratingMapper.toRating(ratingMessage)).thenReturn(rating);
        when(ratingService.saveRings(Collections.singletonList(rating))).thenReturn(Collections.singletonList(rating));

        // Call the listen method
        ratingsConsumer.listen(messages, acknowledgment);

        // Verify method calls and results
        verify(ratingMapper, times(1)).toRating(ratingMessage);
        verify(ratingService, times(1)).saveRings(Collections.singletonList(rating));
        verify(acknowledgment, times(1)).acknowledge();
    }
}
