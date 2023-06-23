package com.psychology.ratingconsumer.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@Document(indexName = "joined_ratings", createIndex = false)
public class Rating {

    @Id
    private Long ratingId;
    private Long predictionId;
    private String predSopen;
    private String rating;
    private Long createdAt;
}
