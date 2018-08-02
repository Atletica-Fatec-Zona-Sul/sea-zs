package br.com.fateczs.seazs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fateczs.seazs.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
	
	public Usuario getByEmailAndSenha(String email, String senha);
	
	public List<Usuario> findByNome(String nome);
}
