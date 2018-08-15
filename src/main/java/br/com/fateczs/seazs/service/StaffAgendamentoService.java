package br.com.fateczs.seazs.service;

import java.util.List;

import br.com.fateczs.seazs.model.Agendamento;
import br.com.fateczs.seazs.model.StaffAgendamento;
import br.com.fateczs.seazs.model.Usuario;

public interface StaffAgendamentoService {
	public StaffAgendamento buscar(StaffAgendamento staff);
	
	public void inserir(StaffAgendamento staff);
	
	public void alterar(StaffAgendamento staff);
	
	public void excluir(StaffAgendamento staff);
	
	public List<StaffAgendamento> listar();

	public List<StaffAgendamento> listarPorDataAsc();
	
	public StaffAgendamento validarPresencaStaff(StaffAgendamento staff);
	
	public List<Agendamento> listarAgendamentosUsuario(Usuario usuario);
	
	public List<Agendamento> listarAgendamentosUsuarioPassado(Usuario usuario);
	}
