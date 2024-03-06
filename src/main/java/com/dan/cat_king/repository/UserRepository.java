package com.dan.cat_king.repository;

import com.dan.cat_king.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findAllByNameContaining(String name);
}
