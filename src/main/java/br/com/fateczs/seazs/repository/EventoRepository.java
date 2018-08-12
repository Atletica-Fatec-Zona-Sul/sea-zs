package br.com.fateczs.seazs.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.fateczs.seazs.model.Evento;

public interface EventoRepository extends JpaRepository<Evento, Integer> {
	
	@Query("select e from Evento e where e.fim >= CURRENT_TIMESTAMP")
	public List<Evento> findByFimAfterToday(Sort ordem);

}
