package com.zeeshan.userservice.dao;

import com.zeeshan.userservice.model.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<Users, String> {
}
