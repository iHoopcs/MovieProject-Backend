package com.example.demo.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//Interface allowing CRUD method usage
@Repository
public interface MovieRepository extends CrudRepository<Movie, Long> {
}
