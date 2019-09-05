package com.chatx.back.repository;

import com.chatx.back.model.Chat;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface ChatDao extends MongoRepository<Chat, String> {
}
