package com.example.sistemadegestioncomercial.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Producto {
    private Long id;
    private String nombre;
    private String descripcion;
    private Double precio;
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaModificacion;
}
