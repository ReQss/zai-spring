package com.triptip.triptip.controller;

import com.triptip.triptip.model.User;
import com.triptip.triptip.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin ("http://localhost:3000")
public class UserController {
    @Autowired
    private UserService userService;

//    @PostMapping("/addUser")
//    public User addUser(@RequestBody User user) {
//        return userService.addUser(user);
//
//    }
//    @CrossOrigin(origins = "http://localhost:3000")
//    @GetMapping("/login")
//    public ResponseEntity<?> login(@RequestBody User user) {
//        String token = "token -" + user.getLogin();
//        User loggedUser = userService.login(user.getLogin(), user.getPassword());
//        if (loggedUser == null) return  ResponseEntity.badRequest().body("Invalid login credentials");
//        Map<String, Object> response = new HashMap<>();
//        response.put("token" , token);
//        response.put("user",user);
//        return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
//    }
}
//    @GetMapping("/user/{name}")
//    public User findUser(@PathVariable String name){
//        return userService.getUser(name);
//    }
//    @GetMapping("/user/listAll")
//    public List<User> listAll(){
//        return userService.getAllUsers();
//    }
//    @GetMapping("/login/{login}/{password}")
//    public User login(@PathVariable String login, @PathVariable String password){
//        return userService.checkUser(login,password);
//    }

