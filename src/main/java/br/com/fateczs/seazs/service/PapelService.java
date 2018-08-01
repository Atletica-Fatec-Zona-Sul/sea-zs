package br.com.fateczs.seazs.service;

import java.util.List;
import br.com.fateczs.seazs.model.Papel;

public interface PapelService {
	
	public Papel buscar(Papel papel);
	
	public void inserir(Papel papel);
	
	public void alterar(Papel papel);
	
	public void excluir(Papel papel);
	
	public List<Papel> listar();
	
}
