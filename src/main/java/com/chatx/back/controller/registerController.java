package com.chatx.back.controller;

import com.chatx.back.model.User;
import com.chatx.back.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class registerController {

    @Autowired
    private RegisterService registerService;

    @PostMapping("/checkAvailability/{username}")
    public boolean checkRegistry(@PathVariable String username){
        return registerService.checkUsername(username);
    }

    @PostMapping("/registerNew")
    public boolean checkRegistry(@RequestBody User user){
        return registerService.saveUser(user);
    }

}
