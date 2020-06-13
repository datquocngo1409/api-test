package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll(); // SELECT * FROM user;
    }

    public User findById(int id) {
        return userRepository.findById(id).get(); // SELECT * FROM user WHERE id = id;
    }

    public void save(User user) {
        userRepository.save(user); // INSERT INTO user ...
    }

    public void delete(int id) {
        userRepository.deleteById(id); //DELETE FROM user WHERE id = id
    }
}
