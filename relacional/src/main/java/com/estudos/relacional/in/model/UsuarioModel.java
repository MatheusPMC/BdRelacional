package com.estudos.relacional.in.model;

import lombok.*;

@Getter
@Setter
@ToString
public class UsuarioModel {
    private String id;
    private String email;
    private String senha;
}