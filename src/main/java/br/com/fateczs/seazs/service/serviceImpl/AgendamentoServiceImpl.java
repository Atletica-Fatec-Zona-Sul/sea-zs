package br.com.fateczs.seazs.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.fateczs.seazs.model.Agendamento;
import br.com.fateczs.seazs.model.Evento;
import br.com.fateczs.seazs.repository.AgendamentoRepository;
import br.com.fateczs.seazs.service.AgendamentoService;


/**
 * [Implementação] Métodos da camada de Serviço do projeto, recebe os parametros para processar as regras de um agendamento e acessar o DAO
 * da tabela de Agendamentos do BD.
 * @author Gustavo Santos Valverde
 *
 */
@Service
public class AgendamentoServiceImpl implements AgendamentoService {
	
	@Autowired
	private AgendamentoRepository repository;
	
	private Sort sortByInicioAsc() {
		return new Sort(Sort.Direction.ASC, "inicio");
	}
	
	@Override
	public Agendamento buscar(Agendamento agendamento) {
		// TODO Auto-generated method stub
		return repository.getOne(agendamento.getId());
	}

	@Override
	public void inserir(Agendamento agendamento) {
		// TODO Auto-generated method stub
		repository.save(agendamento);
	}

	@Override
	public void alterar(Agendamento agendamento) {
		// TODO Auto-generated method stub
		repository.save(agendamento);
	}

	@Override
	public void excluir(Agendamento agendamento) {
		// TODO Auto-generated method stub
		repository.delete(agendamento);
	}

	@Override
	public List<Agendamento> listar() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public List<Agendamento> listarPorDataAsc() {
		// TODO Auto-generated method stub
		return repository.findAll(sortByInicioAsc());
	}

	@Override
	public List<Agendamento> listarPorEvento(Evento evento) {
		return repository.findByEventoId(evento.getId());
	}
}
