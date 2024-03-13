package com.dan.cat_king.service.serviceImpl;

import com.dan.cat_king.model.User;
import com.dan.cat_king.repository.UserRepository;
import com.dan.cat_king.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void save(User username) {
        userRepository.save(username);
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public List<User> findALl() {
        return userRepository.findAll();
    }

    @Override
    public User findUserByUsername(String name) {
        return userRepository.findUserByUsername(name);
    }

    @Override
    public User findUserByUsernameAndPassword(String username, String password) {
        return userRepository.findUserByUsernameAndPassword(username, password);
    }
}
