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
                        "R",
                        "https://www.youtube.com/embed/VFsmuRPClr4"
                ),
                new Movie(
                        3l,
                        "Up",
                        "Adventure",
                        2,
                        "PG",
                        "https://www.youtube.com/embed/HWEW_qTLSEE"
                ),
                new Movie(
                        3l,
                        "Transformers",
                        "Action",
                        5,
                        "PG13",
                        "https://www.youtube.com/embed/v8ItGrI-Ou0"
                ),
                new Movie(
                        3l,
                        "Star Wars The Empire Strikes Back",
                        "Action",
                        4,
                        "PG13",
                        "https://www.youtube.com/embed/JNwNXF9Y6kY"
                ),
                new Movie(
                        3l,
                        "Tron",
                        "Action",
                        5,
                        "PG13",
                        "https://www.youtube.com/embed/L9szn1QQfas"
                ),
                new Movie(
                        3l,
                        "Toy Story",
                        "Coming of Age",
                        1,
                        "PG",
                        "https://www.youtube.com/embed/v-PjgYDrg70"
                ),
                new Movie(
                        3l,
                        "One Piece",
                        "Anime",
                        5,
                        "PG13",
                        "https://www.youtube.com/embed/S8_YwFLCh4U"
                ),
                new Movie(
                        3l,
                        "Breaking Bad",
                        "TV Show",
                        5,
                        "Parental Discretion Advised",
                        "https://www.youtube.com/embed/HhesaQXLuRY"
                ),
                new Movie(
                        3l,
                        "Money Heist",
                        "TV Show",
                        5,
                        "Parental Discretion Advised",
                        "https://www.youtube.com/embed/_InqQJRqGW4"
                ),
                new Movie(
                        3l,
                        "Superbad",
                        "Comedy",
                        3,
                        "PG13",
                        "https://www.youtube.com/embed/4eaZ_48ZYog"
                )

        );
    }

}
