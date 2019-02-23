package br.com.fateczs.seazs.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.fateczs.seazs.model.Agendamento;
import br.com.fateczs.seazs.model.Atividade;
import br.com.fateczs.seazs.model.Usuario;
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
	
	@Override
	public List<Atividade> listarPorAgendamento(Agendamento agendamento) {
		return repository.findByAgendamentoId(agendamento.getId());
	}
	
	private Sort sortByInicioAsc() {
		return new Sort(Sort.Direction.ASC, "inicioAtividade");
	}
	
	@Override
	public List<Atividade> listarDisponiveisParaInscricao(Usuario usuario) {
		// TODO Auto-generated method stub
		return repository.findAtividadeDisponivelParaInscricao(usuario.getId(), sortByInicioAsc());
	}
	
	@Override
	public List<Atividade> listarPassadas(){
		return repository.findAtividadesPassadas(sortByInicioAsc());
	}

	@Autowired
	private AtividadeRepository repository;

}
