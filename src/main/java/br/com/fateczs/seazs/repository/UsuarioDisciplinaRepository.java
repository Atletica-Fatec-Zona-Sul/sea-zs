package br.com.fateczs.seazs.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.fateczs.seazs.model.UsuarioDisciplina;
import br.com.fateczs.seazs.model.UsuarioDisciplinaID;

public interface UsuarioDisciplinaRepository extends JpaRepository<UsuarioDisciplina, UsuarioDisciplinaID> {
		
	public List<UsuarioDisciplina> findByIdUsuarioDisciplinaUsuarioId(Integer id);
}
