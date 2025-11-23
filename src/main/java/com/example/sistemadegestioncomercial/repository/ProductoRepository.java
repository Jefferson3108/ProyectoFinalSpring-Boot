package com.example.sistemadegestioncomercial.repository;

import com.example.sistemadegestioncomercial.entities.ProductoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<ProductoEntity,Long> {
}
