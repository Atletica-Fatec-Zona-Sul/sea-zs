package br.com.fateczs.seazs.controller;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.fateczs.seazs.model.Evento;
import br.com.fateczs.seazs.service.EventoService;

@RestController
@RequestMapping("/evento")
public class EventoController {
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/inserir")
	@ResponseBody
	public void inserirEvento(@Valid @RequestBody Evento evento) {
		evento.setDataInclusao(new Date(System.currentTimeMillis()));
		eventoServ.inserir(evento);
	}
	
	@PostMapping("/buscar")
	@ResponseBody
	public Evento buscarEvento(@Valid @RequestBody Evento evento) {
		return eventoServ.buscar(evento);
	}
	
	@PostMapping("/alterar")
	@ResponseBody
	public void alterarEvento(@Valid @RequestBody Evento evento) {
		eventoServ.alterar(evento);
	}
	
	@PostMapping("/excluir")
	@ResponseBody
	public void excluirEvento(@Valid @RequestBody Evento evento) {
		eventoServ.excluir(evento);
	}
	
    @CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/listar")
	@ResponseBody
	public List<Evento> listarEvento() {
		return eventoServ.listar();
	}
	
	@PostMapping("/listarData")
	@ResponseBody
	public List<Evento> listarEventoPorDtInicio() {
		return eventoServ.listarPorDataAsc();
	}
	
	@PostMapping("/listarDisponivelData")
	@ResponseBody
	public List<Evento> listarEventoDisponivelPorDtInicio() {
		return eventoServ.listarDisponivelPorDataAsc();
	}
	
	@Autowired
	private EventoService eventoServ;

}
