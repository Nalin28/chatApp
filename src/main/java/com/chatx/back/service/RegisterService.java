package com.chatx.back.service;

import com.chatx.back.repository.RegisterDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RegisterService {

    @Autowired
    private RegisterDao registerDao;

    public boolean checkUsername(String username){
        return true;
    }
}
