package com.example.sistemadegestioncomercial.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Table(name= "warehouse")
public class AlmacenEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String nombre;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name= "id_ciudad_fk",nullable = false)
    private CiudadEntity ciudad;

}
