package com.rare.veel.controllers;

import com.rare.veel.models.User;
import com.rare.veel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//Connect services to controller
@CrossOrigin
@RestController //now my application knows that all requests have to come here to look for paths.
//@RequestMapping("/")
public class EoreController {

    private UserService userService;

    @Autowired
    public EoreController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/home/{id}")  // Now the code knows that this is a get end point
    public User getUser(@PathVariable String id){
        User user = userService.getUser(id);
        return user;

    }

    @PostMapping("/home")
    public Boolean userCreated(@RequestBody User user){
        return userService.createUser(user);
    }

    @PutMapping("/home")
    public Boolean userUpdated(@RequestBody User user){
        return userService.updateUser(user);
    }

    @DeleteMapping("/home/{id}")
    public Boolean userDeleted(@PathVariable String id){
        return userService.deleteUser(id);
    }

}

 // Get, Post, Put, Delete