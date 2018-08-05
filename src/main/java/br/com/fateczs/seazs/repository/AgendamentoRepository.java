package br.com.fateczs.seazs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fateczs.seazs.model.Agendamento;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Integer>{
	
	public List<Agendamento> findByEventoId(Integer idEvento);

}
