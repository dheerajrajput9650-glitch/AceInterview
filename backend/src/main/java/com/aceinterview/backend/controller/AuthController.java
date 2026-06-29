package com.aceinterview.backend.controller;

import com.aceinterview.backend.dto.LoginRequest;
import com.aceinterview.backend.dto.LoginResponse;
import com.aceinterview.backend.dto.RegisterRequest;
import com.aceinterview.backend.dto.RegisterResponse;
import com.aceinterview.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private UserService userService;

    // Register API
    @PostMapping("/register")
    public RegisterResponse registerUser(@RequestBody RegisterRequest request) {
        return userService.registerUser(request);
    }

    // Login API
    @PostMapping("/login")
    public LoginResponse loginUser(@RequestBody LoginRequest request) {
        return userService.loginUser(request);
    }
}