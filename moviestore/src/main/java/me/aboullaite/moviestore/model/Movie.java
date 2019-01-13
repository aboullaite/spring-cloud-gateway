package me.aboullaite.moviestore.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;
import java.util.UUID;

public class Movie {
    @JsonIgnore
    String id = UUID.randomUUID().toString();

    String title, year, storyline;
    List<Actor> actors;

    public Movie() {
    }

    public Movie(String title, String year, List<Actor> actors, String storyline) {
        this.title = title;
        this.year = year;
        this.storyline = storyline;
        this.actors = actors;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getStoryline() {
        return storyline;
    }

    public void setStoryline(String storyline) {
        this.storyline = storyline;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }
}
