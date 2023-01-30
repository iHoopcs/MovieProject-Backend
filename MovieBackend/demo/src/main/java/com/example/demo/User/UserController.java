package com.example.demo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/")
public class UserController {
    @GetMapping("users") //get & display users
    public Iterable<User> getUsers(){
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

        return List.of(user1, user2);
    }

}
