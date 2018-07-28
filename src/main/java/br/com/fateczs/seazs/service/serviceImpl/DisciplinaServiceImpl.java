package br.com.fateczs.seazs.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fateczs.seazs.model.Disciplina;
import br.com.fateczs.seazs.repository.DisciplinaRepository;
import br.com.fateczs.seazs.service.DisciplinaService;

@Service
public class DisciplinaServiceImpl implements DisciplinaService {
	
	@Autowired
	private DisciplinaRepository repository;
	
	@Override
	public Disciplina buscar(Disciplina disciplina) {
		// TODO Auto-generated method stub
		return repository.getOne(disciplina.getId());
	}

	@Override
	public void inserir(Disciplina disciplina) {
		// TODO Auto-generated method stub
		repository.save(disciplina);
	}

	@Override
	public void alterar(Disciplina disciplina) {
		// TODO Auto-generated method stub
		repository.save(disciplina);
	}

	@Override
	public void excluir(Disciplina disciplina) {
		// TODO Auto-generated method stub
		repository.save(disciplina);
	}

	@Override
	public List<Disciplina> listar() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
