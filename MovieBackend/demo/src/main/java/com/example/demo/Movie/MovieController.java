package com.example.demo.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/")
public class MovieController {
    //allows for interface method use
    @Autowired
    MovieRepository movieRepository;

    //Retrieve all movies from db
    @GetMapping("movies")
    public Iterable<Movie> getMovies(){
        return movieRepository.findAll();
    }
}
