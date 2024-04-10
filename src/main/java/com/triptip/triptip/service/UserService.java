package com.triptip.triptip.service;

import com.triptip.triptip.model.User;
import com.triptip.triptip.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    public UserRepository userRepository;
    public User getUser(String name){
        return userRepository.findByLogin(name);
    }
    public User addUser(User user){
        User exist = userRepository.findByLogin(user.getLogin());
        return exist == null ?  userRepository.save(user) : null;
    }
    public User login(String login, String password){
        User user = userRepository.findByLogin(login);
        if(user.getPassword().equals(password))return user;
        return null;
    }

}
