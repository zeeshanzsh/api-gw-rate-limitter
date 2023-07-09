package com.zeeshan.review.reviewservice.route;

import com.zeeshan.review.reviewservice.dao.ReviewRepository;
import com.zeeshan.review.reviewservice.model.Review;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class ReviewController {


    @Autowired
    ReviewRepository reviewRepository;
    @GetMapping("/")
    public String reviewHealth(){
        return "Review-service is up and running";
    }
    @GetMapping("/reviews")
    public List<Review> getreviews(){
        return  reviewRepository.findAll();
    }

    @PostMapping("/review")
    public Review addReview(@RequestBody Review review){
        return  reviewRepository.save(review);
    }

    @DeleteMapping("/reviewAll")
    public String deleteReview(){
        log.info("Deleting all reviews");
        reviewRepository.deleteAll();
        return "Deleted all the Review comments";
    }

}
