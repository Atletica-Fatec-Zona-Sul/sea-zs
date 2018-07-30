package br.com.fateczs.seazs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fateczs.seazs.model.Evento;

public interface EventoRepository extends JpaRepository<Evento, Integer> {

}
