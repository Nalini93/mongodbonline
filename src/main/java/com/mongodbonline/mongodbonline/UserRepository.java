package com.mongodbonline.mongodbonline;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,Integer> {
    public List<User> findByName(String name);
 
}
