package com.example.sistemadegestioncomercial.entities;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigInteger;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Table(name= "sale_product")
public class VentaProductoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigInteger Cantidad;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name= "id_venta",nullable = false)
    private VentaEntity venta;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name= "id_producto",nullable = false)
    private ProductoEntity producto;


}
