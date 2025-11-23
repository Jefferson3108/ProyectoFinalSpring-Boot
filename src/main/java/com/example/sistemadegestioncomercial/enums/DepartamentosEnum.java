package com.example.sistemadegestioncomercial.enums;

import lombok.Getter;

@Getter
public enum DepartamentosEnum {
    CUNDINAMARCA("CUNDINAMARCA"),VALLE_DEL_CAUCA("VALLE DEL CAUCA"),ANTIOQUIA("ANTIOQUIA"),BOYACA("BOYACA");

    private  final String departamento;

    DepartamentosEnum(String departamento) {
        this.departamento = departamento;
    }
}
