package br.com.fateczs.seazs.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.fateczs.seazs.model.Agendamento;
import br.com.fateczs.seazs.model.StaffAgendamento;
import br.com.fateczs.seazs.model.Usuario;
import br.com.fateczs.seazs.service.StaffAgendamentoService;

@RestController
@RequestMapping("/agendamento/staff")
public class StaffAgendamentoController {
	
	@PostMapping("/inserir")
	@ResponseBody
	public void inserirInscricao(@Valid @RequestBody StaffAgendamento staff) {
		staffServ.inserir(staff);
	}
	
	@PostMapping("/buscar")
	@ResponseBody
	public StaffAgendamento buscarInscricao(@Valid @RequestBody StaffAgendamento staff) {
		return staffServ.buscar(staff);
	}
	
	@PostMapping("/alterar")
	@ResponseBody
	public void alterarInscricao(@Valid @RequestBody StaffAgendamento staff) {
		staffServ.alterar(staff);
	}
	
	@PostMapping("/excluir")
	@ResponseBody
	public void excluirInscricao(@Valid @RequestBody StaffAgendamento staff) {
		staffServ.excluir(staff);
	}
	
	@PostMapping("/listar")
	@ResponseBody
	public List<StaffAgendamento> listarPapel() {
		return staffServ.listar();
	}
	
	@PostMapping("/listarData")
	@ResponseBody
	public List<StaffAgendamento> listarAtividadePorDtInicio() {
		return staffServ.listarPorDataAsc();
	}
	
	@PostMapping("/ValidarPresenca")
	@ResponseBody
	public StaffAgendamento validarPresenca(@RequestBody StaffAgendamento staff) {
		staff.toString();
		System.out.println(staff.getAgendamento().getId());
		return staffServ.validarPresencaStaff(staff);
	}
	
	@PostMapping("/AgendamentosUsuario")
	@ResponseBody
	public List<Agendamento> listarAgendamentosUsuario(@RequestBody Usuario usuario){
		return staffServ.listarAgendamentosUsuario(usuario);
	}
	
	@PostMapping("/AgendamentosUsuarioPassado")
	@ResponseBody
	public List<Agendamento> listarAgendamentosUsuarioPassado(@RequestBody Usuario usuario){
		return staffServ.listarAgendamentosUsuarioPassado(usuario);
	}
	
	@Autowired
	private StaffAgendamentoService staffServ;
	
}
