package com.example.sistemadegestioncomercial.enums;


import lombok.Getter;


@Getter
public enum RoleEnum {
    ADMIN("ADMIN"),USER("USER"),MODERATOR("MODERATOR")
    ;
    private final String roleName;

    RoleEnum(String roleName) {
        this.roleName = roleName;
    }
}
