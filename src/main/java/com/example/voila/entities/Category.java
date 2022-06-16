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
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String title;
    @OneToMany (fetch = FetchType.EAGER)
    List<Product> products = new ArrayList<Product>();

    public Category(String title) {
        this.title=title;
    }
}
