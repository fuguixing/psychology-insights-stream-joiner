package com.psychology.ratingconsumer.kafka;

import com.psychology.ratingconsumer.mapper.RatingMapper;
import com.psychology.ratingconsumer.model.Rating;
import com.psychology.ratingconsumer.service.RatingService;
import com.psychology.rating.avro.RatingMessage;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Component
public class RatingsConsumer {

    private final RatingService ratingService;
    private final RatingMapper ratingMapper;

    @KafkaListener(
            id = "${spring.kafka.consumer.client-id}",
            groupId = "${spring.kafka.consumer.group-id}",
            topics = "${spring.kafka.consumer.topic}"
    )
    public void listen(List<Message<RatingMessage>> messages, Acknowledgment ack) {
        log.info("Received batch of messages with size: {}", messages.size());
        List<Rating> ratings = messages.stream()
                .peek(this::logMessageReceived)
                .map(message -> ratingMapper.toRating(message.getPayload()))
                .toList();

        ratingService.saveRings(ratings).forEach(rating -> log.info("Saved ratingId={}", rating.getRatingId()));
        ack.acknowledge();
    }

    private void logMessageReceived(Message<RatingMessage> message) {
        log.info("Received ratingId {} , partition={}, offset={}",
                message.getPayload().getRATINGID(),
                message.getHeaders().get(KafkaHeaders.RECEIVED_PARTITION),
                message.getHeaders().get(KafkaHeaders.OFFSET));
    }
}
