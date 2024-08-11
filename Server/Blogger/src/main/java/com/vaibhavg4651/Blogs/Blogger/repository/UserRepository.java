package com.vaibhavg4651.Blogs.Blogger.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.vaibhavg4651.Blogs.Blogger.model.User;

public interface UserRepository extends MongoRepository<User, String> {
    // User findByUsername(String username);
    // User findByEmail(String email);
    User findByUsername(String username);
    
}
