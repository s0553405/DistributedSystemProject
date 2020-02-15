package com.ratingService.web.rest;

import com.ratingService.service.RatingService;
import com.ratingService.web.model.RatingModel;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RatingController {

    private RatingService service;

    public RatingController(RatingService service) {
        this.service = service;
    }

    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public String printWelcomeMessageBasedOnPath() {
        return "Willkommen zum Rating-Service! ";
    }

    @GetMapping("rating/{movieId}")
    public List<RatingModel> findRatingByMovieId(@PathVariable long movieId) {
        return this.service.findRatingsByMovieId(movieId);
    }

    @PostMapping("rating")
    public String addRating(@RequestBody RatingModel model) {
        this.service.addRating(model);
        return "200 - OK";
    }

    @DeleteMapping("rating/{ratingId}")
    public RatingModel deleteRatingById(@PathVariable String ratingId) {
        return this.service.deleteRatingById(ratingId);
    }

}
