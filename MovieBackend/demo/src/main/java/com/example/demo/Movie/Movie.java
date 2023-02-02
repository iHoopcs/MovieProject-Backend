package com.example.demo.Movie;

import jakarta.persistence.*;

@Entity
@Table(name = "movies")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String type;
    private int starRating;
    private String rated;
    private String movieUrl;
    private String videoLink;

    public Movie(){
    }

    public Movie(long id, String name, String type, int starRating, String rated, String movieUrl, String videoLink) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.starRating = starRating;
        this.rated = rated;
        this.movieUrl = movieUrl;
        this.videoLink = videoLink;
    }

    public Movie(String name, String type, int starRating, String rated, String movieUrl, String videoLink) {
        this.name = name;
        this.type = type;
        this.starRating = starRating;
        this.rated = rated;
        this.movieUrl = movieUrl;
        this.videoLink = videoLink;
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

    public String getMovieUrl() {
        return movieUrl;
    }

    public void setMovieUrl(String movieUrl) {
        this.movieUrl = movieUrl;
    }

    public String getVideoLink(){return videoLink; }

    public void setVideoLink(String videoLink){this.videoLink = videoLink;}

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", starRating=" + starRating +
                ", rated='" + rated + '\'' +
                ", movieUrl='" + movieUrl + '\'' +
                ", videoLink='" + videoLink + '\'' +
                '}';
    }
}
