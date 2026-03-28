package com.example.service;

import com.example.bean.User;
import com.example.dao.UserDao;

public class UserService {
    private UserDao userDao = new UserDao();

    public boolean login(String username, String password) {
        User user = userDao.findByUsernameAndPassword(username, password);
        return user != null;
    }
}