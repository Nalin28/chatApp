package com.chatx.back.controller;

import com.chatx.back.model.Chat;
import com.chatx.back.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class ChatController {

    @Autowired
    private ChatService chatService;

    @PostMapping("/chat")
    public List<Chat> chatHistory(@RequestBody Chat chat){
        return chatService.saveChat(chat);
    }
}
