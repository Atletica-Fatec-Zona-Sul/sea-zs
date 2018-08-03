package br.com.fateczs.seazs.service;

import java.util.List;

import br.com.fateczs.seazs.model.Inscricao;

public interface InscricaoService {
	public Inscricao buscar(Inscricao inscricao);
	
	public void inserir(Inscricao inscricao);
	
	public void alterar(Inscricao inscricao);
	
	public void excluir(Inscricao inscricao);
	
	public List<Inscricao> listar();

	List<Inscricao> listarPorDataAsc();
	
	public Inscricao validaPresença(Inscricao inscricao);
}
