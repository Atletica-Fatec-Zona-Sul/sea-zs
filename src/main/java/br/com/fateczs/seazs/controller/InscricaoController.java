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
import br.com.fateczs.seazs.model.Inscricao;
import br.com.fateczs.seazs.model.Usuario;
import br.com.fateczs.seazs.service.InscricaoService;


@RestController
@RequestMapping("/atividade/inscricao")
public class InscricaoController {
	
	@PostMapping("/inserir")
	@ResponseBody
	public void inserirInscricao(@Valid @RequestBody Inscricao inscricao) {
		inscricaoServ.inserir(inscricao);
	}
	
	@PostMapping("/buscar")
	@ResponseBody
	public Inscricao buscarInscricao(@Valid @RequestBody Inscricao inscricao) {
		return inscricaoServ.buscar(inscricao);
	}
	
	@PostMapping("/alterar")
	@ResponseBody
	public void alterarInscricao(@Valid @RequestBody Inscricao inscricao) {
		inscricaoServ.alterar(inscricao);
	}
	
	@PostMapping("/excluir")
	@ResponseBody
	public void excluirInscricao(@Valid @RequestBody Inscricao inscricao) {
		inscricaoServ.excluir(inscricao);
	}
	
	@PostMapping("/listar")
	@ResponseBody
	public List<Inscricao> listarInscricao() {
		return inscricaoServ.listar();
	}
	
	@PostMapping("/listarData")
	@ResponseBody
	public List<Inscricao> listarAtividadePorDtInicio() {
		return inscricaoServ.listarPorDataAsc();
	}
	
	@PostMapping("/listarAtividadesInscrito")
	@ResponseBody
	public List<Atividade> listarAtividadesInscrito(@RequestBody Usuario usuario) {
		return inscricaoServ.listarAtividadesInscrito(usuario);
	}
	
	@PostMapping("/listarAtividadesParticipou")
	@ResponseBody
	public List<Atividade> listarAtividadesParticipou(@RequestBody Usuario usuario){
		return inscricaoServ.listarAtividadesInscritoPassado(usuario);
	}
	
	@PostMapping("/validaPresenca")
	@ResponseBody
	public Inscricao validaPresenca(@Valid @RequestBody Inscricao inscricao) {
		return inscricaoServ.validaPresenca(inscricao);
	}
	
	@PostMapping("/listarAtividade")
	@ResponseBody
	public List<Inscricao> listarPorAtividade(@RequestBody Atividade atividade){
		return inscricaoServ.listarPorAtividade(atividade);
	}
	
	@PostMapping("/listarUsuario")
	@ResponseBody
	public List<Inscricao> listarPorUsuario(@RequestBody Usuario usuario){
		return inscricaoServ.listarPorUsuario(usuario);
	}
	
	@PostMapping("/somarPontos")
	@ResponseBody
	public Integer somarTotalDePontos(@RequestBody Usuario usuario){
		return inscricaoServ.somaTotalDePontos(usuario);
	}
	
	@PostMapping("/somarPontosSemestre")
	@ResponseBody
	public Integer somarTotalDePontosSemestre(@RequestBody Usuario usuario) {
		return inscricaoServ.somaTotalDePontosNoSemestre(usuario);
	}
	
	
	@Autowired
	private InscricaoService inscricaoServ;
}
