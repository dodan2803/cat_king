package com.dan.cat_king.service;

import com.dan.cat_king.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    void save(User username);
    void delete(Long id);
    List<User> findALl();
    User findUserByUsername(String name);
    User findUserByUsernameAndPassword(String username, String password);
}
