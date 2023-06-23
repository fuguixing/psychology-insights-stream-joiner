package com.psychology.ratingconsumer.service;

import com.psychology.ratingconsumer.model.Rating;

import java.util.List;

public interface RatingService {

    Iterable<Rating> saveRings(List<Rating> ratings);
}
