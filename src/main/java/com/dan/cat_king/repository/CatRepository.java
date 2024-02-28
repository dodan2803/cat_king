package com.dan.cat_king.repository;

import com.dan.cat_king.model.Cat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface CatRepository extends JpaRepository<Cat, Long> {
    List<Cat> findAllByNameContaining(String name);
    List<Cat> findAllByBreedContaining(Long id);
}
