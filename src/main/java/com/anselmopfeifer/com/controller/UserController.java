package com.anselmopfeifer.com.controller;

import com.anselmopfeifer.com.model.User;
import com.anselmopfeifer.com.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public List<User> usersList() {
        return userRepository.findAll();
    }
}
