package com.example.voila.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    double price;
    @ManyToOne( fetch = FetchType.EAGER)
    Category category = new Category();

    public Product(String name, double price) {
        this.name=name;
        this.price=price;
    }
}
