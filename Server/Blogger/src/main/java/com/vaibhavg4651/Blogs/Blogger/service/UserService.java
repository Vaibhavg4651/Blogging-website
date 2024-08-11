package com.vaibhavg4651.Blogs.Blogger.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vaibhavg4651.Blogs.Blogger.model.User;
import com.vaibhavg4651.Blogs.Blogger.repository.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository repository;


    //crud operations

    public User addUser(User user){
        user.setId(UUID.randomUUID().toString().split("-")[0]);
        return repository.save(user);
    }

    public User getUser(String Id){
        return repository.findById(Id).get();
    }

    public List<User> getUsers(){
        return repository.findAll();
    }

    public User getUserByUsername(String username){
        return repository.findByUsername(username);
    }

    public User updateUser(User userRequest){
        User user = repository.findById(userRequest.getId()).get();
        user.setUsername(userRequest.getUsername());
        user.setEmail(userRequest.getEmail());
        user.setPassword(userRequest.getPassword());

        return repository.save(user);
    }

    public String deleteUser(String id){
        repository.deleteById(id);
        return "User removed !! "+id;
    }
}
