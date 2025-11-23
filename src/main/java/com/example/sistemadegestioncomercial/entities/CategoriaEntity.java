package com.example.sistemadegestioncomercial.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "category")
public class CategoriaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", length = 50, nullable = false)
    private String nombre;

    @ManyToMany(cascade = CascadeType.MERGE)
    @JoinTable(
            name = "product_category",
            joinColumns = @JoinColumn(name = "category_id",nullable = false),
            inverseJoinColumns = @JoinColumn(name = "product_id",nullable = false)
    )
    private List<ProductoEntity> productos = new ArrayList<>();
}