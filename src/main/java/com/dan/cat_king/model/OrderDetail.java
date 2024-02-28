package com.dan.cat_king.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Cat cat;
    @ManyToOne
    private Orders order;
    private Long quantity;
}
