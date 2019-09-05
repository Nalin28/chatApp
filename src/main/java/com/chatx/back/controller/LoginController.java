package com.chatx.back.controller;


import com.chatx.back.model.User;
import com.chatx.back.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private AuthService authService;

    @PostMapping("/login/api")
    public boolean authController(@RequestBody User user){
        return authService.userValidity(user);
    }
}
