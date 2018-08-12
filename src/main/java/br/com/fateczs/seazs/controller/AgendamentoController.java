package br.com.fateczs.seazs.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.fateczs.seazs.model.Agendamento;
import br.com.fateczs.seazs.model.Evento;
import br.com.fateczs.seazs.service.AgendamentoService;

/**
 * Controlador de Requisições aos Serviços do sistema. (HTTP e Local)
 * @author Gustavo Santos Valverde
 *
 */
@RestController
@RequestMapping("/agendamento")
public class AgendamentoController {
	
	/**
	 * Acessa o serviço de inserção de Agendamento
	 * @param agendamento Objeto Agendamento totalmente Preenchido* para Inserts. 
	 * Atributos de Relacionamento requerem apenas o ID preenchido (exemplo: Id do usuárioOrganizador).
	 */
	@PostMapping("/inserir")
	@ResponseBody
	public void inserirAgendamento(@Valid @RequestBody Agendamento agendamento) {
		agendamentoServ.inserir(agendamento);
	}
	
	/**
	 * Acessa o serviço que busca um Agendamento específico
	 * @param agendamento Objeto preenchido apenas com o atributo Id
	 * @return Objeto Agendamento preenchido com as informações preenchidas no BD
	 */
	@PostMapping("/buscar")
	@ResponseBody
	public Agendamento buscarAgendamento(@Valid @RequestBody Agendamento agendamento) {
		return agendamentoServ.buscar(agendamento);
	}
	
	/**
	 * Acessa o serviço que altera um Agendamento
	 * @param agendamento Objeto totalmente preenchido para o Update no BD*
	 * Atributos de Relacionamento requerem apenas o ID. 
	 * Qualquer atributo da Entidade não preenchido será salvo como null no BD.
	 */
	@PostMapping("/alterar")
	@ResponseBody
	public void alterarAgendamento(@Valid @RequestBody Agendamento agendamento) {
		agendamentoServ.alterar(agendamento);
	}
	
	/**
	 * Acessa o Serviço que exclui o Agendamento informado
	 * @param agendamento Objeto preenchido apenas com o ID.
	 */
	@PostMapping("/excluir")
	@ResponseBody
	public void excluirAgendamento(@Valid @RequestBody Agendamento agendamento) {
		agendamentoServ.excluir(agendamento);
	}
	
	/**
	 * Acessa o Serviço que Lista todos os Agendamentos
	 * @return Lista de Objetos agendamento persistidos no BD.
	 */
	@PostMapping("/listar")
	@ResponseBody
	public List<Agendamento> listarAgendamento(){
		return agendamentoServ.listar();
	}
	/**
	 * Acessa o Serviço que Lista todos os Agendamentos ordenados pela Data de Inicio (Asc)
	 * @return Lista de Objetos agendamento persistidos no BD em ordem da Data de Inicio (Asc).
	 */
	@PostMapping("/listarData")
	@ResponseBody
	public List<Agendamento> lsitarAgendamentoPorDtinicio() {
		return agendamentoServ.listarPorDataAsc();
	}
	/**
	 * Acessa o Serviço que lista os Agendamentos de um Evento
	 * @param evento Evento desejado
	 * @return Lista de Agendamentos relacionados ao Evento informado.ç
	 */
    @CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/listarEvento")
	@ResponseBody
	public List<Agendamento> listarAgendamentoDoEvento(@RequestBody Evento evento){
		return agendamentoServ.listarPorEvento(evento);
	}
	
    /**
     * Instância da Classe de Serviços da Entidade Agendamento
     */
	@Autowired
	private AgendamentoService agendamentoServ;
	
}
