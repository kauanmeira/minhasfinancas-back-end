package com.kauanmeira.minhasfinancas.model.repositories;

import com.kauanmeira.minhasfinancas.model.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByEmail(String email);

    boolean existsByEmail (String email);
}
