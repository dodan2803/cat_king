package com.dan.cat_king.service.serviceImpl;

import com.dan.cat_king.model.Breed;
import com.dan.cat_king.repository.BreedRepository;
import com.dan.cat_king.service.BreedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BreedServiceImpl implements BreedService {
    @Autowired
    private BreedRepository breedRepository;
    @Override
    public List<Breed> findALl() {
        return breedRepository.findAll();
    }
}
