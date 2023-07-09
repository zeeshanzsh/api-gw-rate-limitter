package com.zeeshan.review.reviewservice.dao;

import com.zeeshan.review.reviewservice.model.Review;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReviewRepository extends MongoRepository<Review, String> {
}
