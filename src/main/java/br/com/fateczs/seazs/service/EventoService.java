package br.com.fateczs.seazs.service;

import java.util.List;

import br.com.fateczs.seazs.model.Evento;

public interface EventoService {
	
	public Evento buscar(Evento evento);
	
	public void inserir(Evento evento);
	
	public void alterar(Evento evento);
	
	public void excluir(Evento evento);
	
	public List<Evento> listar();

	List<Evento> listarPorDataAsc();
	
	List<Evento> listarDisponivelPorDataAsc();
}
