package com.springbootcodemegeexample.controller;

import com.springbootcodemegeexample.entity.User;
import com.springbootcodemegeexample.service.UserService;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/users")
public class UserController {

    private UserService userService;

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
        User saveUser = userService.createUser(user);
        return new ResponseEntity(saveUser, HttpStatus.CREATED);
    }

    //get user list
    @GetMapping
    public ResponseEntity<List<User>> getList() {
        List<User> userList = userService.getList();
        return new ResponseEntity<>(userList, HttpStatus.OK);
    }

}
