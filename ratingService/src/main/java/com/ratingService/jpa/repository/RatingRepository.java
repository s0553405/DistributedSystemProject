package com.ratingService.jpa.repository;

import com.ratingService.jpa.document.RatingDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface RatingRepository extends MongoRepository<RatingDocument, String> {

    List<RatingDocument> findByMovieId(long movieId);
}
