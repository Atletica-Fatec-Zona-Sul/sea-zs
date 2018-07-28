package br.com.fateczs.seazs.service;

import java.util.List;

import br.com.fateczs.seazs.model.Disciplina;

public interface DisciplinaService {
	
	public Disciplina buscar(Disciplina disciplina);
	
	public void inserir(Disciplina disciplina);
	
	public void alterar(Disciplina disciplina);
	
	public void excluir(Disciplina disciplina);
	
	public List<Disciplina> listar();

}
