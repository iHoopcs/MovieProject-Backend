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
    private String imgUrl;
    private String videoUrl;
    private String movieDescription;
    private int year;
    private int hr;
    private int min;

    public Movie(){
    }

    public Movie(long id, String name, String type, int starRating, String rated, String imgUrl, String videoUrl, String movieDescription, int year, int hr, int min) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.starRating = starRating;
        this.rated = rated;
        this.imgUrl = imgUrl;
        this.videoUrl = videoUrl;
        this.movieDescription = movieDescription;
        this.year = year;
        this.hr = hr;
        this.min = min;
    }

    public Movie(String name, String type, int starRating, String rated, String imgUrl, String videoUrl, String movieDescription, int year, int hr, int min) {
        this.name = name;
        this.type = type;
        this.starRating = starRating;
        this.rated = rated;
        this.imgUrl = imgUrl;
        this.videoUrl = videoUrl;
        this.movieDescription = movieDescription;
        this.year = year;
        this.hr = hr;
        this.min = min;
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

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getVideoUrl(){return videoUrl; }

    public void setVideoUrl(String videoUrl){this.videoUrl = videoUrl;}

    public String getMovieDescription() {return movieDescription;}

    public void setMovieDescription(String movieDescription) {this.movieDescription = movieDescription;}

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public int getHr() {
        return hr;
    }

    public void setHr(int hr) {
        this.hr = hr;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", starRating=" + starRating +
                ", rated='" + rated + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", videoUrl='" + videoUrl + '\'' +
                ", movieDescription='" + movieDescription  + '\'' +
                ", year='" + year + '\'' +
                ", hr='" + hr + '\'' +
                ", min='" + min + '\'' +
                '}';
    }
}
