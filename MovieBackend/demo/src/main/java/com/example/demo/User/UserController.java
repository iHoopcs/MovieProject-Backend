package com.example.demo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
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
    public String createUser(@RequestBody User user){

        userRepository.save(user);
        return "User Added: \n" + user.getFirstName() +
                " " + user.getLastName()
                + " age: " + user.getAge()
                + " w/ email: " + user.getEmail() ;
    }
}
