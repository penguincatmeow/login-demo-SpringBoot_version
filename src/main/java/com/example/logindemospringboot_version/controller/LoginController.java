package com.example.logindemospringboot_version.controller;

import com.example.logindemospringboot_version.common.Result;
import com.example.logindemospringboot_version.entity.User;
import com.example.logindemospringboot_version.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class LoginController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public Result login(@RequestBody User user) {
        User loginUser = userService.login(user);
        if (loginUser != null) {
            return Result.success(loginUser);
        } else {
            return Result.fail();
        }
    }
}