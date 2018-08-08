package br.com.fateczs.seazs.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.fateczs.seazs.model.Atividade;

public interface AtividadeRepository extends JpaRepository<Atividade, Integer> {
	
	public List<Atividade> findByAgendamentoId(Integer idAgendamento);
	
}
