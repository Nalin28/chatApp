package com.chatx.back.service;


import com.chatx.back.model.Chat;
import com.chatx.back.repository.ChatDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.List;

@EnableMongoRepositories(basePackageClasses = ChatDao.class)
@Configuration
public class ChatService {

    @Autowired
    private ChatDao chatDao;

    public List<Chat> saveChat(Chat chat){
        chatDao.save(chat);
        return chatDao.findAll();
    }

    public List<Chat> getChat(){
        return chatDao.findAll();
    }
}
