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

    @PostMapping("add")
    public String addMovies(){
        //create & add movies to db
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

        return movie1.getName() + " " + movie2.getName() + " " + movie3.getName() + " Saved!";
    }
}
