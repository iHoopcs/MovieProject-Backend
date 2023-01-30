package com.example.demo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/")
public class UserController {
    //allows for interface method use
    @Autowired
    UserRepository userRepository;

    //Retrieve all users from db
    @GetMapping("users") //get & display users
    public Iterable<User> getUsers(){
        return userRepository.findAll();
    }

}
