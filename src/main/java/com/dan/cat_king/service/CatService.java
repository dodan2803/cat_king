package com.dan.cat_king.service;

import com.dan.cat_king.model.Cat;
import com.dan.cat_king.repository.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CatService implements IService<Cat> {
    @Autowired
    private CatRepository catRepository;
    @Override
    public void save(Cat cat) {
        catRepository.save(cat);
    }

    @Override
    public void delete(Long id) {
        catRepository.deleteById(id);
    }

    @Override
    public List<Cat> findAll() {
        return catRepository.findAll();
    }

    @Override
    public Optional<Cat> findById(Long id) {
        return catRepository.findById(id);
    }

    @Override
    public List<Cat> findByName(String name) {
        return catRepository.findAllByNameContaining(name);
    }
}
