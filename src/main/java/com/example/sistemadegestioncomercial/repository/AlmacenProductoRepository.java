package com.example.sistemadegestioncomercial.repository;

import com.example.sistemadegestioncomercial.entities.AlmacenProductoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlmacenProductoRepository extends JpaRepository<AlmacenProductoEntity,Long> {
}
