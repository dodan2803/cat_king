package com.dan.cat_king.service;

import com.dan.cat_king.model.Breed;
import com.dan.cat_king.model.Cat;
import com.dan.cat_king.repository.BreedRepository;
import com.dan.cat_king.service.IService.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BreedService implements IService<Breed> {
    @Autowired
    private BreedRepository breedRepository;

    @Override
    public void save(Breed breed) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Breed> findAll() {
        return null;
    }

    @Override
    public Optional<Breed> findById(Long id) {
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
