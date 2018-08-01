package br.com.fateczs.seazs.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.fateczs.seazs.model.Inscricao;
import br.com.fateczs.seazs.repository.InscricaoRepository;
import br.com.fateczs.seazs.service.InscricaoService;

@Service
public class InscricaoServiceImpl implements InscricaoService {

	@Override
	public Inscricao buscar(Inscricao inscricao) {
		return repository.getOne(inscricao.getSequencialInscricao());
	}

	@Override
	public void inserir(Inscricao inscricao) {
		// TODO Auto-generated method stub
		repository.save(inscricao);
	}

	@Override
	public void alterar(Inscricao inscricao) {
		// TODO Auto-generated method stub
		repository.save(inscricao);
	}

	@Override
	public void excluir(Inscricao inscricao) {
		// TODO Auto-generated method stub
		repository.delete(inscricao);
	}

	@Override
	public List<Inscricao> listar() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public List<Inscricao> listarPorDataAsc() {
		// TODO Auto-generated method stub
		return repository.findAll(sortByDtInscricaoAsc());
	}
	
	private Sort sortByDtInscricaoAsc() {
		return new Sort(Sort.Direction.ASC, "dtInscricao");
	}

	@Autowired
	private InscricaoRepository repository;

}
