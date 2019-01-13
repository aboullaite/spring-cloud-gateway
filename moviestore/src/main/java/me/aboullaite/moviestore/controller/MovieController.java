package me.aboullaite.moviestore.controller;

import me.aboullaite.moviestore.model.Movie;
import me.aboullaite.moviestore.service.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    MoviesService moviesService;

    @GetMapping("")
    public ResponseEntity<List<Movie>> getAllMovies(){
        return ResponseEntity.ok(moviesService.getAllMoviers());
    }

    @GetMapping("/year/{year}")
    public ResponseEntity<List<Movie>> getMovieByYear(@PathVariable String year){
        return ResponseEntity.ok(moviesService.getMovieByYear(year));
    }

    @GetMapping("/danger")
    public ResponseEntity<List<Movie>> unstableMoviesEndpoint(){
        return ResponseEntity.ok(moviesService.dangerMethod());
    }

}
