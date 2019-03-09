package br.com.fateczs.seazs.service;

import br.com.fateczs.seazs.model.Agendamento;
import br.com.fateczs.seazs.model.Atividade;
import br.com.fateczs.seazs.model.Usuario;

import java.util.List;

public interface AtividadeService {
	
	Atividade buscar(Atividade atividade);
	
	void inserir(Atividade atividade);
	
	void alterar(Atividade atividade);
	
	void excluir(Atividade atividade);
	
	List<Atividade> listar();
	
	List<Atividade> listarPorDataAsc();
	
	List<Atividade> listarPorAgendamento(Agendamento agendamento);
	
	List<Atividade> listarDisponiveisParaInscricao(Usuario usuario);
	
	List<Atividade> listarPassadas();
}
