package com.estudos.relacional.ports.out;

import com.estudos.relacional.domain.entities.UsuarioEntity;

public interface UsuarioDataIntegration {
    UsuarioEntity salvandoUsuario(UsuarioEntity usuarioEntity);
}