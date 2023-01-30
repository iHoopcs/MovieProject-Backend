package com.example.demo;

import com.example.demo.Movie.Movie;
import com.example.demo.Movie.MovieRepository;
import com.example.demo.User.User;
import com.example.demo.User.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Autowired
	MovieRepository movieRepository;
	@Autowired
	UserRepository userRepository;

	//Test Method
	@Override
	public void run(String... args) throws Exception {
		//create & add movies to db
		Movie movie1 = new Movie(
				1,
				"The Amazing Spider",
				"Action",
				5,
				"PG13",
				""
		);

		Movie movie2 = new Movie(
				2,
				"The Avengers",
				"Comedy",
				5,
				"PG13",
				""
		);

		Movie movie3 = new Movie(
				3,
				"Iron Man",
				"Action",
				5,
				"PG13",
				""
		);
		movieRepository.saveAll(List.of(movie1,movie2,movie3));


		//create & add users to db
		User user1 = new User(
				1,
				"Caleb",
				"Simmons",
				"Csimmons@aol.com",
				22
		);
		User user2 = new User(
				2,
				"John",
				"Guerra",
				"Jguerra@gmail.com",
				20
		);
		User user3 = new User(
				3,
				"Kevin",
				"Henri",
				"Khenri@yahoo.com",
				23
		);
		userRepository.saveAll(List.of(user1, user2, user3));
		System.out.println("*Data Saved*");
	}
}