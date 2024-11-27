package com.springbootcodemegeexample.service;


import com.springbootcodemegeexample.entity.User;

import java.util.List;
import java.util.stream.Stream;

public interface UserService {

    //create user
    public User createUser(User user);

    //get user list
    public List<User> getList();

    //get user by id
    public User getUserById(Long id);



}
