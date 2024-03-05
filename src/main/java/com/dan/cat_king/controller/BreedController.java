package com.dan.cat_king.controller;

import com.dan.cat_king.model.Breed;
import com.dan.cat_king.service.BreedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/breed")
@CrossOrigin("*")
public class BreedController {
    @Autowired
    private BreedService breedService;

    @GetMapping
    public ResponseEntity<List<Breed>> getALl() {
        List<Breed> breeds = breedService.findALl();
        return new ResponseEntity<>(breeds, HttpStatus.OK);
    }
}
