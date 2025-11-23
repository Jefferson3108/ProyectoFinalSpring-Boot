package com.example.sistemadegestioncomercial;

import com.example.sistemadegestioncomercial.entities.RolUsuarioEntity;
import com.example.sistemadegestioncomercial.entities.UsuarioEntity;
import com.example.sistemadegestioncomercial.enums.RoleEnum;
import com.example.sistemadegestioncomercial.repository.UsuarioRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;

import java.time.LocalDateTime;

@Slf4j
@SpringBootApplication
public class SistemaDeGestionComercialApplication { public static void main(String[] args) {SpringApplication.run(SistemaDeGestionComercialApplication.class, args);}

    @Bean
    @Order(1)
    ApplicationRunner runner(UsuarioRepository usuarioRepository) {
    return args -> {
        var role= RolUsuarioEntity.builder().role(RoleEnum.ADMIN).build();
        UsuarioEntity usuarioEntity = new UsuarioEntity().builder()
                .nombre("Jefferson")
                .apellido("Rico")
                .username("jefferson")
                .password("jefferdasasdkjsadl")
                .email("jefferson@dsalkadsj.com")
                .fechaRegistro(LocalDateTime.now())
                .telefono("2109381230")
                .rolUsuario(role)
                .build();
        var savedUser= usuarioRepository.save(usuarioEntity);
        System.out.println("El numero de usuarios es: "+usuarioRepository.count());

    };

    }

    }



