package com.example.sistemadegestioncomercial.entities;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigInteger;
import java.security.Timestamp;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Table(name= "Sales")
public class VentaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Timestamp fechaVenta;
    private BigInteger total;
    @ManyToOne
    @JoinColumn(name="id_Cliente_fk", nullable = false)
    private UsuarioEntity cliente;


}
