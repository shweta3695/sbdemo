package com.rare.veel.service;

import com.rare.veel.models.User;
import com.rare.veel.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
// Service uses repository
@Service // will be used for writing functions like C to F
public class UserService {
    private UserRepo userRepository;

    @Autowired // connects service and repo automagically

    public UserService(UserRepo userRepository) {
        this.userRepository = userRepository;
    }

    public User getUser(String id) {
      User oolala =   userRepository.findByUserId(id);
      return oolala;

    }

    public Boolean createUser(User user){
        userRepository.save(user);
        return true;
    }

    public Boolean updateUser(User user){
        userRepository.save(user);
        return true;
    }

    public Boolean deleteUser(String id) {
        User userdelete = userRepository.findByUserId(id);
        userRepository.delete(userdelete);
        return true;
    }
}
