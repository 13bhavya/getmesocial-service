package com.example.getmesocialservice.git.Resource;

import com.example.getmesocialservice.git.Model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ResApi {

    @GetMapping("/user")
    public User getUser(){
        User user = new User("Kelly","452 Oakville Dr", 45, "https://media.vanityfair.com/photos/5c3a2d59ba532c6650deda58/master/pass/megyn-kelly-nbc.jpg");
    return user;
    }
}
