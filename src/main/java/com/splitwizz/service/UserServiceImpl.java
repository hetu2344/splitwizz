package com.splitwizz.service;

import com.splitwizz.dao.UserRepository;
import com.splitwizz.exception.ResourceNotFoundException;
import com.splitwizz.object.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserServiceImpl() {

    }

    @Override
    public User saveUser(User user) {
       return userRepository.save(user);
    }

    @Override
    public User getUser(long id) {
        return userRepository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("Employee", "Id", id));
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
