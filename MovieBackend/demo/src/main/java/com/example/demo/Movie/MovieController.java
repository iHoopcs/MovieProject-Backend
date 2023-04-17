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
    //Fetch Coming of Age
    @RequestMapping(value = "/api/movies/comingOfAge", method = RequestMethod.GET)
    public Iterable<Movie> fetchComingOfAge(){
        return movieRepository.findByType("Coming of Age");
    }
    //Fetch Drama
    @RequestMapping(value = "/api/movies/drama", method = RequestMethod.GET)
    public Iterable<Movie> fetchDrama(){
        return movieRepository.findByType("Drama");
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
    
    @RequestMapping(value = "/addMovie", method = RequestMethod.POST)
    public String addMovie(Movie movie){
        movieRepository.save(movie);

        return movie.toString() + " added!";

    }

}
