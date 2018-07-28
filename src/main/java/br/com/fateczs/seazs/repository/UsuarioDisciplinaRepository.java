package br.com.fateczs.seazs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fateczs.seazs.model.UsuarioDisciplina;
import br.com.fateczs.seazs.model.UsuarioDisciplinaID;

public interface UsuarioDisciplinaRepository extends JpaRepository<UsuarioDisciplina, UsuarioDisciplinaID> {

}
