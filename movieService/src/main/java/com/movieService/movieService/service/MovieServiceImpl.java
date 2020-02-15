package com.movieService.movieService.service;

import com.movieService.movieService.jpa.entity.Movie;
import com.movieService.movieService.jpa.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    private final MovieRepository repository;

    public MovieServiceImpl(MovieRepository repository) {
        this.repository = repository;
    }

    @Override
    public Movie getMovie(Long id) {
        return this.repository.findById(id).get();
    }

    @Override
    public Movie saveMovie(Movie movie) {
        return this.repository.save(movie);
    }

    @Override
    public Movie deleteMovie(Long id) {
        final Movie movie = this.repository.findById(id).get();
        this.repository.deleteById(id);
        return movie;
    }

    @Override
    public List<Movie> getList(){

        Iterable<Movie> it = repository.findAll();
        List<Movie> liste = new ArrayList<>();
        it.forEach(liste::add);

        return liste;

    }

}

