package com.estudos.relacional.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@ToString
@Entity
public class UsuarioEntity {
    @Id
    private String id;
    private String email;
    private String senha;
}