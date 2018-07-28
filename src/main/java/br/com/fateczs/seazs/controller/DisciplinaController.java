package br.com.fateczs.seazs.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.fateczs.seazs.model.Disciplina;
import br.com.fateczs.seazs.service.DisciplinaService;

@RestController
@RequestMapping("/disciplina")
public class DisciplinaController {
	
	@PostMapping("/inserir")
	@ResponseBody
	public void inserirDisciplina(@Valid @RequestBody Disciplina disciplina) {
		disciplinaServ.inserir(disciplina);
	}
	
	@PostMapping("/buscar")
	@ResponseBody
	public Disciplina buscarDisciplina(@Valid @RequestBody Disciplina disciplina) {
		return disciplinaServ.buscar(disciplina);
	}
	
	@PostMapping("/alterar")
	@ResponseBody
	public void alterarDisciplina(@Valid @RequestBody Disciplina disciplina) {
		disciplinaServ.alterar(disciplina);
	}
	
	@PostMapping("/excluir")
	@ResponseBody
	public void excluirDisciplina(@Valid @RequestBody Disciplina disciplina) {
		disciplinaServ.excluir(disciplina);
	}
	
	@PostMapping("/listar")
	@ResponseBody
	public List<Disciplina> listarDisciplina() {
		return disciplinaServ.listar();
	}
	
	@Autowired
	private DisciplinaService disciplinaServ;
}
