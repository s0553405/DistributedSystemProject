package com.movieService.movieService.service;

import com.movieService.movieService.jpa.entity.Movie;

import java.util.List;

public interface MovieService {

    //anzeigen
    Movie getMovie(Long id);

    // speichern
    Movie saveMovie(Movie movie);

    //löschen
    Movie deleteMovie(Long id);

    List<Movie> getList();




}
