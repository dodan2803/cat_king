package com.dan.cat_king.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private User user;
    private String orderDate;
    private double totalPrice;
    private int status;
}
