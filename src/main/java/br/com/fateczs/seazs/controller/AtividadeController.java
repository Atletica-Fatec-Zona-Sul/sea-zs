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
import br.com.fateczs.seazs.model.Atividade;
import br.com.fateczs.seazs.model.Usuario;
import br.com.fateczs.seazs.service.AtividadeService;

@RestController
@RequestMapping("/atividade")
public class AtividadeController {
	
	@PostMapping("/inserir")
	@ResponseBody
	public void inserirAtividade(@Valid @RequestBody Atividade atividade) {
		System.out.println(atividade.toString());
		atividadeServ.inserir(atividade);
	}
	
	@PostMapping("/buscar")
	@ResponseBody
	public Atividade buscarAtividade(@Valid @RequestBody Atividade atividade) {
		return atividadeServ.buscar(atividade);
	}
	
	@PostMapping("/alterar")
	@ResponseBody
	public void alterarAtividade(@Valid @RequestBody Atividade atividade) {
		atividadeServ.alterar(atividade);
	}
	
	@PostMapping("/excluir")
	@ResponseBody
	public void excluirAtividade(@Valid @RequestBody Atividade atividade) {
		atividadeServ.excluir(atividade);
	}
	
	@PostMapping("/listar")
	@ResponseBody
	public List<Atividade> listarAtividade() {
		return atividadeServ.listar();
	}
	
	@PostMapping("/listarData")
	@ResponseBody
	public List<Atividade> listarAtividadePorDtInicio() {
		return atividadeServ.listarPorDataAsc();
	}
	
	@PostMapping("/listarAgendamento")
	@ResponseBody
	public List<Atividade> listarAtividadePorAgendamento(@RequestBody Agendamento agendamento) {
		return atividadeServ.listarPorAgendamento(agendamento);
	}
	
	@PostMapping("/listarDisponiveis")
	@ResponseBody
	public List<Atividade> listarAtividadesDisponiveis(@RequestBody Usuario usuario) {
		return atividadeServ.listarDisponiveisParaInscricao(usuario);
	}
	
	@PostMapping("/listarPassadas")
	@ResponseBody
	public List<Atividade> listarAtividadesPassadas(){
		return atividadeServ.listarPassadas();
	}
	
	@Autowired
	private AtividadeService atividadeServ;
}
