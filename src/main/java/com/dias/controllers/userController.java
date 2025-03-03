package com.dias.controllers;

import com.dias.entites.User;
import com.dias.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/user")
public class userController {

    final UserService userService;

    public userController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping
    public User save(@RequestBody User user ){
        return userService.save(user);
    }
    @GetMapping("/list")
    public User list(){
        return userService.list();
    }
    @GetMapping("/mapUserList")
    public Map mapUserList(){
        return userService.mapUserList();
    }

}
