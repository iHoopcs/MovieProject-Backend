package com.example.demo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

//Class Responsible for 'Business Logic'
@Service
public class UserService {

    @GetMapping()
    public List<User> getUsers(){
        return List.of(
                new User(
                        1l,
                        "Caleb",
                        "Simmons",
                        "Csimmons@gmail.com",
                        22
                ),
                new User(
                        1l,
                        "Michael",
                        "Jordan",
                        "Mjordan@gmail.com",
                        50
                ),
                new User(
                        1l,
                        "Billy",
                        "Bob",
                        "Bbob@gmail.com",
                        12
                ),
                new User(
                        1l,
                        "Barack",
                        "Obama",
                        "Bobama@gmail.com",
                        61

                ),
                new User(
                        1l,
                        "Johnny",
                        "Test",
                        "Jtest@gmail.com",
                        15
                )

        );
    }


}
