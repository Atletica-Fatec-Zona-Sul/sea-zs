package br.com.fateczs.seazs.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.fateczs.seazs.model.Agendamento;
import br.com.fateczs.seazs.model.StaffAgendamento;

public interface StaffAgendamentoRepository extends JpaRepository<StaffAgendamento, Integer> {
	
	public StaffAgendamento findByAgendamentoIdAndUsuarioId(Integer idAgendamento, Integer idUsuario);
	
	@Query("select sa.agendamento from StaffAgendamento sa where sa.agendamento.fim >= CURRENT_TIMESTAMP "
			+ "and sa.usuario.id = ?1")
	public List<Agendamento> findAgendamentosInscrito(Integer idUsuario, Sort ordem);
	
	@Query("select sa.agendamento from StaffAgendamento sa where sa.agendamento.fim < CURRENT_TIMESTAMP "
			+ "and sa.usuario.id = ?1 and sa.checkIn = true and sa.checkOut = true")
	public List<Agendamento> findAgendamentosInscritoPassado(Integer idUsuario, Sort ordem);
}
