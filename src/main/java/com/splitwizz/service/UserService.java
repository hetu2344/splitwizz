package com.splitwizz.service;

import com.splitwizz.object.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    User getUser(long id);
    List<User> getAllUsers();
}
