package com.dan.cat_king.service;

import com.dan.cat_king.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    void save(User user);
    void delete(Long id);
    List<User> findALl();
    Optional<User> findById(Long id);
    List<User> findByName(String name);
}
