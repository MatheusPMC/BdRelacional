package com.estudos.relacional.adapter.out.repository.impl;

import com.estudos.relacional.adapter.out.repository.UsuarioRepository;
import com.estudos.relacional.domain.entities.UsuarioEntity;
import com.estudos.relacional.ports.out.UsuarioDataIntegration;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UsuarioData implements UsuarioDataIntegration {
    private final UsuarioRepository usuarioRepository;

    @Override
    public UsuarioEntity salvandoUsuario(UsuarioEntity usuarioEntity) {
        usuarioEntity.setId(UUID.randomUUID().toString());
        return usuarioRepository.saveAndFlush(usuarioEntity);
    }
}