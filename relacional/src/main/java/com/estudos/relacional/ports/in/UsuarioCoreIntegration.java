package com.estudos.relacional.ports.in;

import com.estudos.relacional.domain.entities.UsuarioEntity;
import com.estudos.relacional.in.model.UsuarioModel;

public interface UsuarioCoreIntegration {
    UsuarioModel criandoUsuario(UsuarioEntity usuarioEntity);
}