package com.springbootcodemegeexample.service.impl;

import com.springbootcodemegeexample.entity.User;
import com.springbootcodemegeexample.repository.UserRepository;
import com.springbootcodemegeexample.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

}
