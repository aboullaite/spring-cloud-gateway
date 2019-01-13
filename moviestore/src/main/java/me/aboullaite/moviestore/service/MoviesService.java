package me.aboullaite.moviestore.service;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import me.aboullaite.moviestore.model.Actor;
import me.aboullaite.moviestore.model.Movie;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

@Service
public class MoviesService {

    private List<Movie> movies;

    public MoviesService() {
        this.movies = new ArrayList<>();
        movies.add(new Movie("Spider-Man: Into the Spider-Verse", "2018", Arrays.asList(new Actor("Shameik Moore"), new Actor("Jake Johnson"), new Actor("Hailee Steinfeld")), "Miles Morales is a New York teen struggling with school, friends and, on top of that, being the new Spider-Man. When he comes across Peter Parker, the erstwhile saviour of New York, in the multiverse, Miles must train to become the new protector of his city."));
        movies.add(new Movie("Avengers: Infinity War", "2018", Arrays.asList(new Actor("Robert Downey Jr."), new Actor("Chris Hemsworth"), new Actor("Mark Ruffalo")), "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment, the fate of Earth and existence has never been more uncertain."));
        movies.add(new Movie("Captain America: Civil War", "2016", Arrays.asList(new Actor("Chris Evans"), new Actor("Scarlett Johansson"), new Actor("Anthony Mackie")), "With many people fearing the actions of super heroes, the government decides to push for the Hero Registration Act, a law that limits a hero's actions. This results in a division in The Avengers. Iron Man stands with this Act, claiming that their actions must be kept in check otherwise cities will continue to be destroyed, but Captain America feels that saving the world is daring enough and that they cannot rely on the government to protect the world."));
        movies.add(new Movie("Ant-Man ", "2015", Arrays.asList(new Actor("Paul Rudd"), new Actor("Michael Douglas"), new Actor("Evangeline Lilly")), "Armed with the astonishing ability to shrink in scale but increase in strength, con-man Scott Lang must embrace his inner-hero and help his mentor, Dr. Hank Pym, protect the secret behind his spectacular Ant-Man suit from a new generation of towering threats. Against seemingly insurmountable obstacles, Pym and Lang must plan and pull off a heist that will save the world."));

    }

    public List<Movie> getAllMoviers(){
        return this.movies;
    }

    public List<Movie> getMovieByYear(String year){
        return movies.stream().filter(m -> m.getYear().equals(year)).collect(Collectors.toList());
    }

    @HystrixCommand(fallbackMethod = "dengerFallback")
    public List<Movie> dangerMethod(){
        if(ThreadLocalRandom.current().nextInt() > 0.5)
            throw new RuntimeException("Og gosh! Something bad happened");
        return this.movies;
    }

    public  List<Movie> dengerFallback(){
        return Arrays.asList();
    }

}
