package com.ratingService.service;

import com.ratingService.web.model.RatingModel;

import java.util.List;

public interface RatingService {

    List<RatingModel> findRatingsByMovieId(long movieId);

    void addRating(RatingModel model);

    RatingModel deleteRatingById(String ratingId);

}
