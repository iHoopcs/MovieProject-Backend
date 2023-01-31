package com.example.demo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/")
public class UserController {
    @Autowired
    UserRepository userRepository; //allows for interface method use
    @GetMapping("users") //get & display users
    public Iterable<User> getUsers(){ return userRepository.findAll(); }

    @PostMapping("add/user") //create & add user to db
    public String createUser(){

        User user1 = new User(
                1,
                "Caleb",
                "Simmons",
                "Csimmons@aol.com",
                22
        );

        User user2 = new User(
                2,
                "Al",
                "Simmons",
                "Asimmons@aol.com",
                53
        );

        userRepository.saveAll(List.of(user1, user2));
        return "Users Added:\n" + user1.getFirstName() + " "  + user1.getLastName() + "\n" +
                user2.getFirstName() + " " + user2.getLastName();
    }


}
