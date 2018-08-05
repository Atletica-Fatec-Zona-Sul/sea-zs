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
import br.com.fateczs.seazs.model.Evento;
import br.com.fateczs.seazs.service.AgendamentoService;

@RestController
@RequestMapping("/agendamento")
public class AgendamentoController {
	
	@PostMapping("/inserir")
	@ResponseBody
	public void inserirAgendamento(@Valid @RequestBody Agendamento agendamento) {
		agendamentoServ.inserir(agendamento);
	}
	
	@PostMapping("/buscar")
	@ResponseBody
	public Agendamento buscarAgendamento(@Valid @RequestBody Agendamento agendamento) {
		return agendamentoServ.buscar(agendamento);
	}
	
	@PostMapping("/alterar")
	@ResponseBody
	public void alterarAgendamento(@Valid @RequestBody Agendamento agendamento) {
		agendamentoServ.alterar(agendamento);
	}
	
	@PostMapping("/excluir")
	@ResponseBody
	public void excluirAgendamento(@Valid @RequestBody Agendamento agendamento) {
		agendamentoServ.excluir(agendamento);
	}
	
	@PostMapping("/listar")
	@ResponseBody
	public List<Agendamento> listarAgendamento(){
		return agendamentoServ.listar();
	}
	
	@PostMapping("/listarData")
	@ResponseBody
	public List<Agendamento> lsitarAgendamentoPorDtinicio() {
		return agendamentoServ.listarPorDataAsc();
	}
	
	@PostMapping("/listarEvento")
	@ResponseBody
	public List<Agendamento> listarAgendamentoDoEvento(@RequestBody Evento evento){
		return agendamentoServ.listarPorEvento(evento);
	}
	
	@Autowired
	private AgendamentoService agendamentoServ;
	
}
