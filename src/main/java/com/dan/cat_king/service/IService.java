package com.dan.cat_king.service;

import com.dan.cat_king.model.Cat;

import java.util.List;
import java.util.Optional;

public interface IService<E> {
    void save(E e);
    void delete(Long id);
    List<E> findAll();
    Optional<E> findById(Long id);
    List<Cat> findByName(String name);
    List<Cat> findByBreed(Long id);
}
