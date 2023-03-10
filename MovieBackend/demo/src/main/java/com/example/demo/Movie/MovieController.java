package com.example.demo.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping(path = "/api/")
public class MovieController {
    @Autowired
    MovieRepository movieRepository; //allows for interface method use

    //Retrieve all movies from db
    @GetMapping("movies")
    public Iterable<Movie> getMovies(){
        return movieRepository.findAll();
    }

    @PostMapping("addMovie")
    public String addMovie(Movie movie){
        movieRepository.save(movie);

        return movie.toString() + " added!";

    }

}
