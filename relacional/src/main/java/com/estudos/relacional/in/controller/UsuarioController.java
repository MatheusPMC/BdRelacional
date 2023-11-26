package com.estudos.relacional.in.controller;

import com.estudos.relacional.domain.entities.UsuarioEntity;
import com.estudos.relacional.domain.mapper.UsuarioMapper;
import com.estudos.relacional.in.model.UsuarioModel;
import com.estudos.relacional.ports.in.UsuarioCoreIntegration;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
@RequiredArgsConstructor
public class UsuarioController {
    private final UsuarioCoreIntegration usuarioCoreIntegration;
    private final UsuarioMapper usuarioMapper;

    @PostMapping
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public UsuarioModel criandoUsuario(@RequestBody UsuarioModel userModel) {
        return usuarioCoreIntegration.criandoUsuario(usuarioMapper.mapOf(userModel));
    }
}