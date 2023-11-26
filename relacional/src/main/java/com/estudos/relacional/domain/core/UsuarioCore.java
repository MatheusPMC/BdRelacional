package com.estudos.relacional.domain.core;

import com.estudos.relacional.domain.entities.UsuarioEntity;
import com.estudos.relacional.domain.mapper.UsuarioMapper;
import com.estudos.relacional.in.model.UsuarioModel;
import com.estudos.relacional.ports.in.UsuarioCoreIntegration;
import com.estudos.relacional.ports.out.UsuarioDataIntegration;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioCore implements UsuarioCoreIntegration {
    private final UsuarioDataIntegration usuarioDataIntegration;
    private final UsuarioMapper usuarioMapper;

    @Override
    public UsuarioModel criandoUsuario(UsuarioEntity usuarioEntity) {
        UsuarioEntity result = usuarioDataIntegration.salvandoUsuario(usuarioEntity);
        return usuarioMapper.mapOf(result);
    }
}