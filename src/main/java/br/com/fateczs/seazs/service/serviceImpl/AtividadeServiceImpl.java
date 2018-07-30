package br.com.fateczs.seazs.service.serviceImpl;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.fateczs.seazs.model.Atividade;
import br.com.fateczs.seazs.repository.AtividadeRepository;
import br.com.fateczs.seazs.service.AtividadeService;

@Service
public class AtividadeServiceImpl implements AtividadeService {

	@Override
	public Atividade buscar(Atividade atividade) {
		// TODO Auto-generated method stub
		return repository.getOne(atividade.getId());
	}

	@Override
	public void inserir(Atividade atividade) {
		// TODO Auto-generated method stub
		repository.save(atividade);
	}

	@Override
	public void alterar(Atividade atividade) {
		// TODO Auto-generated method stub
		repository.save(atividade);
	}

	@Override
	public void excluir(Atividade atividade) {
		// TODO Auto-generated method stub
		repository.delete(atividade);
	}

	@Override
	public List<Atividade> listar() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public List<Atividade> listarPorDataAsc() {
		// TODO Auto-generated method stub
		return repository.findAll(sortByInicioAsc());
	}
	
	private AtividadeRepository repository;
	
	private Sort sortByInicioAsc() {
		return new Sort(Sort.Direction.ASC, "inicioAtividade");
	}
}
