package com.chatx.back.repository;

import com.chatx.back.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RegisterDao extends MongoRepository<User,String> {
}
