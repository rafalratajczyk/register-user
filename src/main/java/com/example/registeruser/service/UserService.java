package com.example.registeruser.service;

import com.example.registeruser.model.User;

public interface UserService {

    public User findUserByEmail(String email);

    public void saveUser(User user);
}
