package me.aboullaite.bookstore.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.UUID;

public class Author {
    @JsonIgnore
    String id = UUID.randomUUID().toString();
    String name;

    public Author() {
    }

    public Author( String name) {
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
