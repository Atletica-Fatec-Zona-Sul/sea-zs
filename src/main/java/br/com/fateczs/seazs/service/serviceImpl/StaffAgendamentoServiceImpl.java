package br.com.fateczs.seazs.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.fateczs.seazs.model.StaffAgendamento;
import br.com.fateczs.seazs.repository.StaffAgendamentoRepository;
import br.com.fateczs.seazs.service.StaffAgendamentoService;

@Service
public class StaffAgendamentoServiceImpl implements StaffAgendamentoService {

	@Override
	public StaffAgendamento buscar(StaffAgendamento staff) {
		return repository.getOne(staff.getSequencialStaff());
	}

	@Override
	public void inserir(StaffAgendamento staff) {
		repository.save(staff);
	}

	@Override
	public void alterar(StaffAgendamento staff) {
		repository.save(staff);
	}

	@Override
	public void excluir(StaffAgendamento staff) {
		repository.delete(staff);
	}

	@Override
	public List<StaffAgendamento> listar() {
		return repository.findAll();
	}

	@Override
	public List<StaffAgendamento> listarPorDataAsc() {
		return repository.findAll(sortByDtInscricaoAsc());
	}
	
	private Sort sortByDtInscricaoAsc() {
		return new Sort(Sort.Direction.ASC, "dtInscricao");
	}

	@Autowired
	private StaffAgendamentoRepository repository;

}
