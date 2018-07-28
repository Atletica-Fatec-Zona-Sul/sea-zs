package br.com.fateczs.seazs.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.fateczs.seazs.model.UsuarioDisciplina;
import br.com.fateczs.seazs.service.UsuarioDisciplinaService;

@RestController
@RequestMapping("/usuario/disciplina")
public class UsuarioDisciplinaController {
	
	@PostMapping("/inserir")
	@ResponseBody
	public void inserirUsuarioDisciplina(@Valid @RequestBody UsuarioDisciplina usuarioDisciplina) {
		usuarioDisciplinaServ.inserir(usuarioDisciplina);
	}
	
	@PostMapping("/buscar")
	@ResponseBody
	public UsuarioDisciplina buscarUsuarioDisciplina(@Valid @RequestBody UsuarioDisciplina usuarioDisciplina) {
		return usuarioDisciplinaServ.buscar(usuarioDisciplina);
	}
	
	@PostMapping("/alterar")
	@ResponseBody
	public void alterarUsuarioDisciplina(@Valid @RequestBody UsuarioDisciplina usuarioDisciplina) {
		usuarioDisciplinaServ.alterar(usuarioDisciplina);
	}
	
	@PostMapping("/excluir")
	@ResponseBody
	public void excluirUsuarioDisciplina(@Valid @RequestBody UsuarioDisciplina usuarioDisciplina) {
		usuarioDisciplinaServ.excluir(usuarioDisciplina);
	}
	
	@PostMapping("/listar")
	@ResponseBody
	public List<UsuarioDisciplina> listarUsuarioDisciplina() {
		return usuarioDisciplinaServ.listar();
	}
	
	@Autowired
	private UsuarioDisciplinaService usuarioDisciplinaServ;


}
