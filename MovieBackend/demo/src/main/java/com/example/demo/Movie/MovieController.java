package com.example.demo.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin()
@RestController
public class MovieController {
    @Autowired
    MovieRepository movieRepository; //allows for interface method use

    //Retrieve all movies from db
    @RequestMapping(value = "/api/movies", method = RequestMethod.GET)
    public Iterable<Movie> getMovies(){
        return movieRepository.findAll();
    }

    //Fetch Anime
    @RequestMapping(value = "/api/movies/anime", method = RequestMethod.GET)
    public Iterable<Movie> fetchAnime(){
        return movieRepository.findByType("Anime");
    }
    //Fetch Action
    @RequestMapping(value = "/api/movies/action", method = RequestMethod.GET)
    public Iterable<Movie> fetchAction(){
        return movieRepository.findByType("Action");
    }
    //Fetch Comedy
    @RequestMapping(value = "/api/movies/comedy", method = RequestMethod.GET)
    public Iterable<Movie> fetchComedy(){
        return movieRepository.findByType("Comedy");
    }
    //Fetch Horror
    @RequestMapping(value = "/api/movies/horror", method = RequestMethod.GET)
    public Iterable<Movie> fetchHorror(){
        return movieRepository.findByType("Horror");
    }
    //Fetch Romance
    @RequestMapping(value = "/api/movies/romance", method = RequestMethod.GET)
    public Iterable<Movie> fetchRomance(){
        return movieRepository.findByType("Romance");
    }
    //Fetch Mystery/Sci-Fi
    @RequestMapping(value = "/api/movies/mystery/sci-fi", method = RequestMethod.GET)
    public Iterable<Movie> fetchMysterySciFi(){
        return movieRepository.findByType("Mystery/Sci-Fi");
    }

    @RequestMapping(value = "/searchMovie", method = RequestMethod.GET)
    public Iterable<Movie> searchMovie(String movieSearch){
        return movieRepository.findByType(movieSearch);
    }

    @RequestMapping(value = "/addMovie", method = RequestMethod.POST)
    public String addMovie(Movie movie){
        movieRepository.save(movie);

        return movie.toString() + " added!";

    }

}
