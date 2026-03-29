package com.example.logindemospringboot_version.entity;

public class User {
    private Integer uid;
    private String username;
    private String password;

    // getter 和 setter
    public Integer getUid() { return uid; }
    public void setUid(Integer uid) { this.uid = uid; }
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}