package br.com.fateczs.seazs.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.fateczs.seazs.model.Atividade;
import br.com.fateczs.seazs.service.AtividadeService;

@RestController
@RequestMapping("/atividade")
public class AtividadeController {
	
	@PostMapping("/inserir")
	@ResponseBody
	public void inserirAtividade(@Valid @RequestBody Atividade atividade) {
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
	
	@Autowired
	private AtividadeService atividadeServ;
}
