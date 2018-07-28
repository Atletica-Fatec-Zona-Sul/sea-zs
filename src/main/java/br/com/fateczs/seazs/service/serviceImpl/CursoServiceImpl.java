package br.com.fateczs.seazs.service.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fateczs.seazs.model.Curso;
import br.com.fateczs.seazs.repository.CursoRepository;
import br.com.fateczs.seazs.service.CursoService;

@Service
public class CursoServiceImpl implements CursoService {
	
	@Autowired
	private CursoRepository repository;

	
	@Override
	public Curso buscar(Curso curso) {
		// TODO Auto-generated method stub
		return repository.getOne(curso.getId());
	}

	@Override
	public void inserir(Curso curso) {
		// TODO Auto-generated method stub
		repository.save(curso);
	}

	@Override
	public void alterar(Curso curso) {
		// TODO Auto-generated method stub
		repository.save(curso);
	}

	@Override
	public void excluir(Curso curso) {
		// TODO Auto-generated method stub
		repository.save(curso);
	}

	@Override
	public List<Curso> listar() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
