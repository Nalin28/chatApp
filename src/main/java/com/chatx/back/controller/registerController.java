package com.chatx.back.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class registerController {

    @GetMapping("/hello")
    public String getHello(){
        return "hello";
    }


}
