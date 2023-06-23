package com.psychology.ratingconsumer.mapper;

import com.psychology.ratingconsumer.model.Rating;
import com.psychology.rating.avro.RatingMessage;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RatingMapper {

    default Rating toRating(RatingMessage ratingMessage) {
        if (ratingMessage == null) {
            return null;
        }
        Rating rating = new Rating();
        rating.setRatingId(ratingMessage.getRATINGID());
        rating.setPredictionId(ratingMessage.getPREDICTIONID());
        rating.setPredSopen(ratingMessage.getPREDICTIONID().toString());
        rating.setRating(ratingMessage.getRATING().toString());
        rating.setCreatedAt(ratingMessage.getCREATEDAT());
        return rating;
    }
}
