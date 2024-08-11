package com.vaibhavg4651.Blogs.Blogger.controller;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.core.Authentication;
import com.vaibhavg4651.Blogs.Blogger.model.User;
import com.vaibhavg4651.Blogs.Blogger.service.UserService;
import com.vaibhavg4651.Blogs.Blogger.Exception.*;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
@RequestMapping("/api/v1/auth/user")
public class UserController {
    
    @Autowired
    private UserService service;
    
    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public User  createUser(@RequestBody User user){
        return service.addUser(user);
    }

    @GetMapping("/getAllUsers")
    @ResponseStatus(HttpStatus.FOUND)
    public List<User> getUsers(){
        return service.getUsers();
    }

    @GetMapping("/getUser/{id}")
    public ResponseEntity<?> getUser(@PathVariable String id, Authentication authentication){
        if (authentication != null && authentication.getName().equals(id)) {
            User user = service.getUser(id);
            System.out.println(user);
            return ResponseEntity.ok(user);
        }
        throw new UnauthorizedException("You can only access your own user information");
    }

    @PutMapping("/updateUser{id}")
    @ResponseStatus(HttpStatus.OK)
    public User updateUser(@PathVariable String id, @RequestBody User user, Authentication authentication) {
        if (authentication != null && authentication.getName().equals(id)) {
            user.setId(id);
            return service.updateUser(user);
        }
        throw new UnauthorizedException("You can only update your own user information");
    }

    @DeleteMapping("/deleteUser/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String deleteUser(@PathVariable String id,Authentication authentication){
        if (authentication != null && authentication.getName().equals(id)) {
            return service.deleteUser(id);
        }
        throw new UnauthorizedException("You can only delete your own user account");
    }
}
