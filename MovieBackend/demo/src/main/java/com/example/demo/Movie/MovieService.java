package com.example.demo.Movie;

import org.springframework.stereotype.Service;

import java.util.List;

//Responsible for 'Business Logic'
@Service
public class MovieService {
    public List<Movie> getMovies(){
        return List.of(
                new Movie(
                        3l,
                        "The Conjuring",
                        "Horror",
                        4,
                        "R"
                ),
                new Movie(
                        3l,
                        "Up",
                        "Adventure",
                        2,
                        "PG"
                ),
                new Movie(
                        3l,
                        "Transformers",
                        "Action",
                        5,
                        "PG13"
                ),
                new Movie(
                        3l,
                        "Star Wars The Empire Strikes Back",
                        "Action",
                        4,
                        "PG13"
                ),
                new Movie(
                        3l,
                        "Tron",
                        "Action",
                        5,
                        "PG13"
                ),
                new Movie(
                        3l,
                        "Toy Story",
                        "Coming of Age",
                        1,
                        "PG"
                ),
                new Movie(
                        3l,
                        "One Piece",
                        "Anime",
                        5,
                        "PG13"
                ),
                new Movie(
                        3l,
                        "Breaking Bad",
                        "TV Show",
                        5,
                        "Parental Discretion Advised"
                ),
                new Movie(
                        3l,
                        "Money Heist",
                        "TV Show",
                        5,
                        "Parental Discretion Advised"
                ),
                new Movie(
                        3l,
                        "Superbad",
                        "Comedy",
                        3,
                        "PG13"
                )

        );
    }

}
