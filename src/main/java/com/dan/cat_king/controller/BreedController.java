package com.dan.cat_king.controller;

import com.dan.cat_king.model.Breed;
import com.dan.cat_king.service.IService.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/breed")
@CrossOrigin("*")
public class BreedController {
    @Autowired
    private IService<Breed> breedIService;
}