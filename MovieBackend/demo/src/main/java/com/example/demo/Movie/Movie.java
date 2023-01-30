package com.example.demo.Movie;

public class Movie {
    private long id;
    private String name;
    private String type;
    private int starRating;
    private String rated;

    private String url;

    public Movie(){

    }

    public Movie(long id, String name, String type, int starRating, String rated, String url) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.starRating = starRating;
        this.rated = rated;
        this.url = url;
    }

    public Movie(String name, String type, int starRating, String rated, String url) {
        this.name = name;
        this.type = type;
        this.starRating = starRating;
        this.rated = rated;
        this.url = url;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", starRating=" + starRating +
                ", rated='" + rated + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
