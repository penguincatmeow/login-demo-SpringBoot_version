package com.example.logindemospringboot_version.service;

import com.example.logindemospringboot_version.entity.User;
import com.example.logindemospringboot_version.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User login(User user) {
        return userMapper.login(user);
    }
}