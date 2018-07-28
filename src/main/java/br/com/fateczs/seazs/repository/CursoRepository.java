package br.com.fateczs.seazs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fateczs.seazs.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Integer> {

}
