package br.com.fateczs.seazs.service.serviceImpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.fateczs.seazs.model.Agendamento;
import br.com.fateczs.seazs.model.StaffAgendamento;
import br.com.fateczs.seazs.model.Usuario;
import br.com.fateczs.seazs.repository.StaffAgendamentoRepository;
import br.com.fateczs.seazs.service.StaffAgendamentoService;
import br.com.fateczs.seazs.utils.DataUtils;

@Service
public class StaffAgendamentoServiceImpl implements StaffAgendamentoService {
	
	private Sort sortByDtInscricaoAsc() {
		return new Sort(Sort.Direction.ASC, "dtInscricao");
	}
	
	private Sort sortByDtInicioAgendamentoAsc() {
		return new Sort(Sort.Direction.ASC, "agendamento.inicio");
	}
	
	private DataUtils operaData = new DataUtils(); 

	@Autowired
	private StaffAgendamentoRepository repository;

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

	@SuppressWarnings("deprecation")
	@Override
	public StaffAgendamento validarPresencaStaff(StaffAgendamento staff) {
		staff = repository.findByAgendamentoIdAndUsuarioId(staff.getAgendamento().getId(), staff.getUsuario().getId());
		
		Date agora = new Date();
		Date inicioEntrada = operaData.somaMinutos(staff.getAgendamento().getInicio(), -10);
		Date fimSaida = operaData.somaMinutos(staff.getAgendamento().getFim(), 30);
		
		System.out.println("agora: " + agora.toLocaleString());
		System.out.println("inicioEntrada: " + inicioEntrada.toLocaleString());
		System.out.println("fimSaida: " + fimSaida.toLocaleString());
		
		if(agora.before(fimSaida) && agora.after(inicioEntrada)) {
			System.out.println("Dentro do horário de checagem");
			staff.setCheckIn(true);
			staff.setCheckOut(true);
			staff.setPontuacaoRecebida(staff.getAgendamento().getPontuacaoStaff());
			staff = repository.save(staff);
		}
		return staff;
	}
	
	@Override
	public List<Agendamento> listarAgendamentosUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return repository.findAgendamentosInscrito(usuario.getId(), sortByDtInicioAgendamentoAsc());
	}
	
	@Override
	public List<Agendamento> listarAgendamentosUsuarioPassado(Usuario usuario) {
		return repository.findAgendamentosInscritoPassado(usuario.getId(), sortByDtInicioAgendamentoAsc());
	}

}
