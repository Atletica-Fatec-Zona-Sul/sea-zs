package br.com.fateczs.seazs.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.fateczs.seazs.model.Curso;
import br.com.fateczs.seazs.service.CursoService;

@RestController
@RequestMapping("/curso")
public class CursoController {

	
	@PostMapping("/inserir")
	@ResponseBody
	public void inserirCurso(@Valid @RequestBody Curso curso) {
		cursoServ.inserir(curso);
	}
	
	@PostMapping("/buscar")
	@ResponseBody
	public Curso buscarCurso(@Valid @RequestBody Curso curso) {
		return cursoServ.buscar(curso);
	}
	
	@PostMapping("/alterar")
	@ResponseBody
	public void alterarCurso(@Valid @RequestBody Curso curso) {
		cursoServ.alterar(curso);
	}
	
	@PostMapping("/excluir")
	@ResponseBody
	public void excluirCurso(@Valid @RequestBody Curso curso) {
		cursoServ.excluir(curso);
	}
	
	@PostMapping("/listar")
	@ResponseBody
	public List<Curso> listarCurso() {
		return cursoServ.listar();
	}
	
	@Autowired
	private CursoService cursoServ;
}
