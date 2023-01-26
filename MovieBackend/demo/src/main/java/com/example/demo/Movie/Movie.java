package com.example.demo.Movie;

public class Movie {
    private long id;
    private String name;
    private String type;
    private int starRating;
    private String rated;

    public Movie(){

    }

    public Movie(long id, String name, String type, int starRating, String rated) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.starRating = starRating;
        this.rated = rated;
    }

    public Movie(String name, String type, int starRating, String rated) {
        this.name = name;
        this.type = type;
        this.starRating = starRating;
        this.rated = rated;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getStarRating() {
        return starRating;
    }

    public void setStarRating(int starRating) {
        this.starRating = starRating;
    }

    public String getRated() {
        return rated;
    }

    public void setRated(String rated) {
        this.rated = rated;
    }
}
