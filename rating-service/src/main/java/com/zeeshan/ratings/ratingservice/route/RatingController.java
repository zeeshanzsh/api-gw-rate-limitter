package com.zeeshan.ratings.ratingservice.route;

import com.zeeshan.ratings.ratingservice.dao.RatingRepository;
import com.zeeshan.ratings.ratingservice.model.Rating;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class RatingController {

    @Autowired
    RatingRepository ratingRepository;
    @GetMapping("/")
    public String index(){
        return "Rating service is up";
    }

    @GetMapping("/ratings")
    public List<Rating> ratings(){
       return ratingRepository.findAll();
    }

    @PostMapping("/rating")
    public Rating rating(@RequestBody Rating rating){
        return ratingRepository.save(rating);
    }

    @DeleteMapping("/rating")
    public String deleteRating(){
         ratingRepository.deleteAll();
         return  "deleted";
    }

}
