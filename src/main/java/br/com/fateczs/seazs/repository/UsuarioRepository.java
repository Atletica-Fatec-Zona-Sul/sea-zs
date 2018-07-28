package br.com.fateczs.seazs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fateczs.seazs.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {


}
