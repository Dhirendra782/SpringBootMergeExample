package com.springbootcodemegeexample.service.impl;

import com.springbootcodemegeexample.entity.User;
import com.springbootcodemegeexample.repository.UserRepository;
import com.springbootcodemegeexample.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;


    //create user
    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    //get user list
    @Override
    public List<User> getList() {
        List<User> user = userRepository.findAll();
        return user.stream().map(list-> list).collect(Collectors.toList());
    }

    //git user
    @Override
    public User getUserById(Long id) {
        User userById = userRepository.findById(id).orElseThrow(() ->
                new RuntimeException("Resource Not Found"));
        return userById;
    }

}
