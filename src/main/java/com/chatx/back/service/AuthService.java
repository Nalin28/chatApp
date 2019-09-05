package com.chatx.back.service;

import com.chatx.back.model.User;
import com.chatx.back.repository.RegisterDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = RegisterDao.class)
@Configuration
public class AuthService {

    @Autowired
    private RegisterDao registerDao;

    public boolean userValidity(User user) {

        if (registerDao.existsById(user.getUsername())) {
            User user1 = registerDao.findById(user.getUsername()).get();
            System.out.println(user);
            System.out.println(user1);
            if (user1.getPassword().equals(user.getPassword()))
                return true;
        }
        return false;
    }

}
