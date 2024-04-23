package com.example.vizyon.controllers;


import com.example.vizyon.models.User;
import com.example.vizyon.security.JWTAuthenticationConfig;
import com.example.vizyon.services.UserService;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@CrossOrigin("*")
@PreAuthorize("hasRole('ADMIN')")
@SecurityRequirement(name = "bearerAuth")
public class UserController {
    @Autowired
    JWTAuthenticationConfig jwtAuthenticationConfig;

    @Autowired
    UserService userService;

    @PostMapping("/login")
    public User login(
            @RequestParam("user") String username,
            @RequestParam("encryptedPass") String encryptedPass) {

        userService.userValidation(username, encryptedPass);
        String token = jwtAuthenticationConfig.getJWTToken(username);
        return new User(username, encryptedPass, token);
    }

    @PostMapping("/register")
    public Map<Object, Object> registerUser(
            @RequestParam("user") String username,
            @RequestParam("encryptedPass") String encryptedPass) {

        return userService.registerUser(new User(username, encryptedPass, null));
    }
}