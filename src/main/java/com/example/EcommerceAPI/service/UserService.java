package com.example.EcommerceAPI.service;

import com.example.EcommerceAPI.model.Address;
import com.example.EcommerceAPI.model.User;
import com.example.EcommerceAPI.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.NoSuchElementException;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    public User createUser(User user) {
        return userRepo.save(user);
    }

    public User getUserById(Integer userId) {
        return userRepo.findById(userId).orElseThrow(() ->
                new NoSuchElementException("User not found"));
    }
}

