package br.com.fateczs.seazs.controller;

import java.util.List;

import javax.validation.Valid;

import br.com.fateczs.seazs.model.CrachaUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.fateczs.seazs.model.Usuario;
import br.com.fateczs.seazs.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	@PostMapping("/inserir")
	@ResponseBody
	public void inserirUsuario(@Valid @RequestBody Usuario usuario) {
		usuServ.inserir(usuario);
	}
	
	@PostMapping("/buscar")
	@ResponseBody
	public Usuario buscarUsuario(@Valid @RequestBody Usuario usuario) {
		return usuServ.buscar(usuario);
	}
	
	@PostMapping("/alterar")
	@ResponseBody
	public void alterarUsuario(@Valid @RequestBody Usuario usuario) {
		usuServ.alterar(usuario);
	}
	
	@PostMapping("/excluir")
	@ResponseBody
	public void excluirUsuario(@Valid @RequestBody Usuario usuario) {
		usuServ.excluir(usuario);
	}
	
	@PostMapping("/listar")
	@ResponseBody
	public List<Usuario> listarUsuario() {
		return usuServ.listar();
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/login")
	@ResponseBody
	public Usuario loginUsuario(@RequestBody Usuario usuario){
		return usuServ.validarLogin(usuario);
	}

	@PostMapping("/cracha")
	@ResponseBody
	public CrachaUsuario emitirCracha(@RequestBody Usuario usuario) {return usuServ.emitirCracha(usuario);}

	@Autowired
	private UsuarioService usuServ;
}
