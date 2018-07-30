package br.com.fateczs.seazs.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.fateczs.seazs.model.Evento;
import br.com.fateczs.seazs.repository.EventoRepository;
import br.com.fateczs.seazs.service.EventoService;

@Service
public class EventoServiceImpl implements EventoService {
	
	@Autowired
	EventoRepository repository;
	
	@Override
	public Evento buscar(Evento evento) {
		// TODO Auto-generated method stub
		return repository.getOne(evento.getId());
	}

	@Override
	public void inserir(Evento evento) {
		// TODO Auto-generated method stub
		repository.save(evento);
	}

	@Override
	public void alterar(Evento evento) {
		// TODO Auto-generated method stub
		repository.save(evento);
	}

	@Override
	public void excluir(Evento evento) {
		// TODO Auto-generated method stub
		repository.delete(evento);
	}

	@Override
	public List<Evento> listar() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}
	
	@Override
	public List<Evento> listarPorDataAsc() {
		return repository.findAll(sortByInicioAsc());
	}
	
	private Sort sortByInicioAsc() {
		return new Sort(Sort.Direction.ASC, "inicio");
	}

}
