package com.chatx.back.repository;

import com.chatx.back.model.Register;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RegisterDao extends MongoRepository<Register,String> {
}
