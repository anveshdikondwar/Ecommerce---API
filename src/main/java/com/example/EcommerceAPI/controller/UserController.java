package com.example.EcommerceAPI.controller;

import com.example.EcommerceAPI.model.User;
import com.example.EcommerceAPI.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @GetMapping("/users/{userId}")
    public User getUserById(@PathVariable Integer userId){
        return userService.getUserById(userId);
    }
}
