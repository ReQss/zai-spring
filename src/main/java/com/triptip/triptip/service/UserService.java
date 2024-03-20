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
        if(exist != null)return null;
        return userRepository.save(user);
    }
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
    public User checkUser(String login, String password){
        List <User> userList = getAllUsers();
        for(User user : userList){
            if(user.getLogin().equals(login)){
                if(user.getPassword().equals(password)){
                    return user;
                }
            }
        }
        return null;
    }
}
