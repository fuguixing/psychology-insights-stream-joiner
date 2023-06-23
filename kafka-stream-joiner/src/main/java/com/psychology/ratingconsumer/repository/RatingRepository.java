package com.psychology.ratingconsumer.repository;

import com.psychology.ratingconsumer.model.Rating;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RatingRepository extends ElasticsearchRepository<Rating, Long> {
}
