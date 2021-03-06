package com.chatx.back.service;

import com.chatx.back.model.User;
import com.chatx.back.repository.RegisterDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = RegisterDao.class)
@Configuration
public class RegisterService {

    @Autowired
    private RegisterDao registerDao;

    public boolean checkUsername(String username){

        return !(registerDao.existsById(username));
    }

    public boolean saveUser(User user){
        registerDao.save(user);
        return true;
    }
}
