package com.example.demo.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/")
public class MovieController {
    @Autowired
    MovieRepository movieRepository; //allows for interface method use

    //Retrieve all movies from db
    @GetMapping("movies")
    public Iterable<Movie> getMovies(){
        return movieRepository.findAll();
    }

    @PostMapping("add/movie") //create & add movies to db
    public String addMovies(){
        Movie movie1 = new Movie(
                "Transformers",
                "Action",
                5,
                "PG13",
                ""
        );
        Movie movie2 = new Movie(
                "Spiderman",
                "Action",
                5,
                "PG13",
                ""
        );
        Movie movie3 = new Movie(
                "Superman",
                "Action",
                5,
                "PG13",
                ""
        );
        movieRepository.saveAll(List.of(movie1,movie2,movie3));
        return "Movies Added:\n" + movie1.getName() + "\n" + movie2.getName() + "\n" + movie3.getName();
    }
}
