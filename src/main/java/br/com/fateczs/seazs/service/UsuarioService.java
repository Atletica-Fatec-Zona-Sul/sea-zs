package br.com.fateczs.seazs.service;

import java.util.List;

import br.com.fateczs.seazs.model.CrachaUsuario;
import br.com.fateczs.seazs.model.Usuario;

public interface UsuarioService {

	Usuario buscar(Usuario usuario);
	
	void inserir(Usuario usuario);
	
	void alterar(Usuario usuario);
	
	void excluir(Usuario usuario);
	
	List<Usuario> listar();
	
	Usuario validarLogin(Usuario usuario);

	CrachaUsuario emitirCracha(Usuario usuario);
	
}
