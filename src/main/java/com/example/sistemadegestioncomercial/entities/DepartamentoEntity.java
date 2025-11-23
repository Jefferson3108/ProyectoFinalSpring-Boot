package com.example.sistemadegestioncomercial.entities;

import com.example.sistemadegestioncomercial.enums.DepartamentosEnum;
import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Table(name= "department")
public class DepartamentoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private DepartamentosEnum departamentos;
}
