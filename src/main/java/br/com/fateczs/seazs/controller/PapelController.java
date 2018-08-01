package br.com.fateczs.seazs.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.fateczs.seazs.model.Papel;
import br.com.fateczs.seazs.service.PapelService;

@RestController
@RequestMapping("/papel")
public class PapelController {
	
	@PostMapping("/inserir")
	@ResponseBody
	public void inserirPapel(@Valid @RequestBody Papel papel) {
		papelServ.inserir(papel);
	}
	
	@PostMapping("/buscar")
	@ResponseBody
	public Papel buscarPapel(@Valid @RequestBody Papel papel) {
		return papelServ.buscar(papel);
	}
	
	@PostMapping("/alterar")
	@ResponseBody
	public void alterarPapel(@Valid @RequestBody Papel papel) {
		papelServ.alterar(papel);
	}
	
	@PostMapping("/excluir")
	@ResponseBody
	public void excluirPapel(@Valid @RequestBody Papel papel) {
		papelServ.excluir(papel);
	}
	
	@PostMapping("/listar")
	@ResponseBody
	public List<Papel> listarPapel() {
		return papelServ.listar();
	}
	
	@Autowired
	private PapelService papelServ;
	
}
