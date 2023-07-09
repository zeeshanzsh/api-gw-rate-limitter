package com.zeeshan.ratings.ratingservice.dao;

import com.zeeshan.ratings.ratingservice.model.Rating;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RatingRepository extends MongoRepository<Rating, String> {
}
