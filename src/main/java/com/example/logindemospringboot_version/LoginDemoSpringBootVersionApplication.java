package com.example.logindemospringboot_version;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.logindemospringboot_version.mapper")

@SpringBootApplication
public class LoginDemoSpringBootVersionApplication {


    public static void main(String[] args) {

        SpringApplication.run(LoginDemoSpringBootVersionApplication.class, args);
    }

}