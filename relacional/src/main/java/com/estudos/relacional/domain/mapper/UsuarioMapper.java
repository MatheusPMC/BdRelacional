package com.estudos.relacional.domain.mapper;

import com.estudos.relacional.domain.entities.UsuarioEntity;
import com.estudos.relacional.in.model.UsuarioModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {
    UsuarioMapper MAPPER = Mappers.getMapper(UsuarioMapper.class);

    UsuarioEntity mapOf(UsuarioModel model);
    UsuarioModel mapOf(UsuarioEntity entity);
}