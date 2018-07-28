package br.com.fateczs.seazs.service;

import java.util.List;
import br.com.fateczs.seazs.model.Curso;

public interface CursoService {

	public Curso buscar(Curso curso);
	
	public void inserir(Curso curso);
	
	public void alterar(Curso curso);
	
	public void excluir(Curso curso);
	
	public List<Curso> listar();
	
}
