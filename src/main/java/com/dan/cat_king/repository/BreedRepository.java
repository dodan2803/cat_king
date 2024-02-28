package com.dan.cat_king.repository;

import com.dan.cat_king.model.Breed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface BreedRepository extends JpaRepository<Breed, Long> {
}
