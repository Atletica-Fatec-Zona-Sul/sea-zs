package br.com.fateczs.seazs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fateczs.seazs.model.Agendamento;

/**
 * DAO de Acesso ao Banco de Dados para a Entidade Agendamento
 * @author gusta
 *
 */
public interface AgendamentoRepository extends JpaRepository<Agendamento, Integer>{
	
	/**
	 * Retorna os Agendamentos de um Evento
	 * @param idEvento id do evento desejado
	 * @return Lista de Agendamentos do Evento
	 */
	public List<Agendamento> findByEventoId(Integer idEvento);

}
