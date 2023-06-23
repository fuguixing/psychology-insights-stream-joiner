package com.psychology.ratingconsumer.service;

import com.psychology.ratingconsumer.model.Rating;
import com.psychology.ratingconsumer.repository.RatingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class RatingServiceImpl implements RatingService {

    private final RatingRepository ratingRepository;

    @Override
    public Iterable<Rating> saveRings(List<Rating> ratings) {
        return ratingRepository.saveAll(ratings);
    }
}
