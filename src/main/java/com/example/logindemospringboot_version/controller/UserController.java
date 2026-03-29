package com.example.logindemospringboot_version.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    // 测试接口
    @GetMapping("/test")
    public String test() {
        return "SpringBoot 项目启动成功！接口正常访问！";
    }
}