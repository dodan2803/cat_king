package com.dan.cat_king.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Cat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long age;
    private String gender;
    private String color;
    private String image;
    @ManyToOne
    private Breed breed;
}
