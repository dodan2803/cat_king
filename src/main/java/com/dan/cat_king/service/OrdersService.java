package com.dan.cat_king.service;

import com.dan.cat_king.model.Cat;
import com.dan.cat_king.model.Orders;
import com.dan.cat_king.service.IService.IService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrdersService implements IService<Orders> {
    @Override
    public void save(Orders orders) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Orders> findAll() {
        return null;
    }

    @Override
    public Optional<Orders> findById(Long id) {
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
