package br.com.fateczs.seazs.service;

import java.util.List;

import br.com.fateczs.seazs.model.Agendamento;
import br.com.fateczs.seazs.model.Atividade;

public interface AtividadeService {
	
	public Atividade buscar(Atividade atividade);
	
	public void inserir(Atividade atividade);
	
	public void alterar(Atividade atividade);
	
	public void excluir(Atividade atividade);
	
	public List<Atividade> listar();
	
	public List<Atividade> listarPorDataAsc();
	
	public List<Atividade> listarPorAgendamento(Agendamento agendamento);
}
