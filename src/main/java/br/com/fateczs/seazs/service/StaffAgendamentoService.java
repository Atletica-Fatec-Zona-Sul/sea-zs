package br.com.fateczs.seazs.service;

import java.util.List;

import br.com.fateczs.seazs.model.StaffAgendamento;

public interface StaffAgendamentoService {
	public StaffAgendamento buscar(StaffAgendamento staff);
	
	public void inserir(StaffAgendamento staff);
	
	public void alterar(StaffAgendamento staff);
	
	public void excluir(StaffAgendamento staff);
	
	public List<StaffAgendamento> listar();

	List<StaffAgendamento> listarPorDataAsc();
}
