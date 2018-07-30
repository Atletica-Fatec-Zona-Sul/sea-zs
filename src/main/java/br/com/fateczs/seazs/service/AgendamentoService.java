package br.com.fateczs.seazs.service;

import java.util.List;

import br.com.fateczs.seazs.model.Agendamento;

public interface AgendamentoService {
	
	public Agendamento buscar(Agendamento agendamento);
	
	public void inserir(Agendamento agendamento);
	
	public void alterar(Agendamento agendamento);
	
	public void excluir(Agendamento agendamento);
	
	public List<Agendamento> listar();
	
	public List<Agendamento> listarPorDataAsc();
}
