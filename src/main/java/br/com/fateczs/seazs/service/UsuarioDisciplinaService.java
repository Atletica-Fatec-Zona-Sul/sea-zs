package br.com.fateczs.seazs.service;

import java.util.List;
import br.com.fateczs.seazs.model.Usuario;
import br.com.fateczs.seazs.model.UsuarioDisciplina;

public interface UsuarioDisciplinaService {
	
	public UsuarioDisciplina buscar(UsuarioDisciplina usuarioDisciplina);
	
	public void inserir(UsuarioDisciplina usuarioDisciplina);
	
	public void alterar(UsuarioDisciplina usuarioDisciplina);
	
	public void excluir(UsuarioDisciplina usuarioDisciplina);
	
	public List<UsuarioDisciplina> listar();
	
	public List<UsuarioDisciplina> recuperarDisciplinasDoUsuario(Usuario usuario);
}
