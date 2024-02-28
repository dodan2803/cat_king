package com.dan.cat_king.service;

import com.dan.cat_king.model.Cat;
import com.dan.cat_king.model.User;
import com.dan.cat_king.service.IService.IService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements IService<User> {

    @Override
    public void save(User user) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public Optional<User> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Cat> findByName(String name) {
        return null;
    }

    @Override
    public List<Cat> findByBreed(Long id) {
        return null;
    }
}
