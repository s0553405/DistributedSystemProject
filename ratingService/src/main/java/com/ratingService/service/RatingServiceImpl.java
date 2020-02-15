package com.ratingService.service;

import com.ratingService.jpa.document.RatingDocument;
import com.ratingService.jpa.repository.RatingRepository;
import com.ratingService.web.model.RatingModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RatingServiceImpl implements RatingService{

    private final RatingRepository repository;

    public RatingServiceImpl(RatingRepository repository) {
        this.repository = repository;
    }


    @Override
    public List<RatingModel> findRatingsByMovieId(long movieId) {
        final List<RatingModel> ratingModelList = new ArrayList<>();
        for (RatingDocument doc : repository.findByMovieId(movieId)) {
            final RatingModel model = new RatingModel();
            model.setRating(doc.getRating());
            model.setMovieId(doc.getMovieId());

            ratingModelList.add(model);
        }

        return ratingModelList;
    }

    @Override
    public void addRating(RatingModel model) {

        final RatingDocument doc = new RatingDocument();
        doc.setRating(model.getRating());
        doc.setMovieId(model.getMovieId());
        this.repository.save(doc);

    }

    @Override
    public RatingModel deleteRatingById(String ratingId) {
        final RatingModel model = new RatingModel();
        repository.findById(ratingId).ifPresent(doc -> {
            model.setRating(doc.getRating());
            model.setMovieId(doc.getMovieId());
        });
        repository.deleteById(ratingId);

        return model;
    }
}
