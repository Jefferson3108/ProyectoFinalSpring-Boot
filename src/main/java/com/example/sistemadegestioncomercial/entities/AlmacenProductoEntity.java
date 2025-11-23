package com.example.sistemadegestioncomercial.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Table(name= "warehouse_product")
public class AlmacenProductoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long  id;
    private Long stock;

    @ManyToOne(cascade=CascadeType.PERSIST)
    @JoinColumn(name = "id_product_fk",nullable = false)
    private ProductoEntity producto;

    @ManyToOne(cascade=CascadeType.PERSIST)
    @JoinColumn(name= "id_warehouse_fk",nullable = false)
    private AlmacenEntity almacen;
}
