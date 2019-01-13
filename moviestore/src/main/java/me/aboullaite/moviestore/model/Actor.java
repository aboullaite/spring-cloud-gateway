package me.aboullaite.moviestore.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.UUID;

public class Actor {
    @JsonIgnore
    String id = UUID.randomUUID().toString();
    String name;

    public Actor() {
    }

    public Actor( String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
