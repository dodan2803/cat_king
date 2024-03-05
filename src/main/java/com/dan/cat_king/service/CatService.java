package com.dan.cat_king.service;

import com.dan.cat_king.model.Cat;

import java.util.List;
import java.util.Optional;

public interface CatService {
    void save(Cat cat);
    void delete(Long id);
    List<Cat> findAll();
    Optional<Cat> findById(Long id);
    List<Cat> findByName(String name);
}
