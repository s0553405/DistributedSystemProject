package com.movieService.movieService.web.rest;

import com.movieService.movieService.jpa.entity.Movie;
import com.movieService.movieService.service.MovieService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieController {

    private final MovieService service;

    public MovieController(MovieService service) {
        this.service = service;
    }

    //returns Movie Object
    @GetMapping("movie/{id}")
    public ResponseEntity<Movie> getMovie(@PathVariable Long id) {
        return ResponseEntity.ok(this.service.getMovie(id));
    }

    @GetMapping("/list")
    public List<Movie> getList() {
        return this.service.getList();
    }

    @PostMapping("movie")
    public ResponseEntity<Movie> createUser(@RequestBody Movie body) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(this.service.saveMovie(body));
    }

    @DeleteMapping("movie/{id}")
    public ResponseEntity deleteUser(@PathVariable Long id) {
        return ResponseEntity.ok(this.service.deleteMovie(id));
    }

    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public String printWelcomeMessageBasedOnPath() {
        return "Hier ist die Übersicht deiner Filme gespeichert! ";
    }


}
