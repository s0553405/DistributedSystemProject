package com.ratingService.web.model;

public class RatingModel {

    private long movieId;
    private String rating;

    public RatingModel() {
    }

    public RatingModel(long movieId, String rating) {
        this.movieId = movieId;
        this.rating = rating;
    }

    public long getMovieId() {
        return movieId;
    }

    public void setMovieId(long movieId) {
        this.movieId = movieId;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }


}
