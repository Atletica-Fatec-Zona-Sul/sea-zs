package br.com.fateczs.seazs.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fateczs.seazs.model.Papel;
import br.com.fateczs.seazs.repository.PapelRepository;
import br.com.fateczs.seazs.service.PapelService;

@Service
public class PapelServiceImpl implements PapelService {

	@Override
	public Papel buscar(Papel papel) {
		return repository.getOne(papel.getId());
	}

	@Override
	public void inserir(Papel papel) {
		repository.save(papel);
	}

	@Override
	public void alterar(Papel papel) {
		repository.save(papel);
	}

	@Override
	public void excluir(Papel papel) {
		repository.delete(papel);
	}

	@Override
	public List<Papel> listar() {
		return repository.findAll();
	}
	
	@Autowired
	private PapelRepository repository;

}
