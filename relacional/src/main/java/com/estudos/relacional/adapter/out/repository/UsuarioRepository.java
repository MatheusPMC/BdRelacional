package com.estudos.relacional.adapter.out.repository;

import com.estudos.relacional.domain.entities.UsuarioEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, String> {
}