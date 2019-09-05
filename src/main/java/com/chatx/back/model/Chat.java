package com.chatx.back.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Chat {

    private String username;
    private String message;

    public Chat(String username, String message) {
        this.username = username;
        this.message = message;
    }

    public Chat(){

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Chat{" +
                "username='" + username + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
