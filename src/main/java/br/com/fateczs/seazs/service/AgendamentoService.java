package br.com.fateczs.seazs.service;

import java.util.List;

import br.com.fateczs.seazs.model.Agendamento;
import br.com.fateczs.seazs.model.Evento;

/**
 * Métodos da camada de Serviço do projeto, recebe os parametros para processar as regras de um agendamento e acessar o DAO
 * da tabela de Agendamentos do BD.
 * @author Gustavo Santos Valverde
 *
 */
public interface AgendamentoService {
	
	/**
	 * Busca Agendamento pelo Id
	 * @param agendamento Objeto Agendamento preenchido somente com o Id
	 * @return Objeto Agendamento preenchido
	 */
	public Agendamento buscar(Agendamento agendamento);
	
	/**
	 * Salva o Agendamento no Banco de Dados, necessário preencher todos os atributos do Agendamento,
	 *  se não os mesmos serão salvos com null. 
	 * @param agendamento Objeto Agendamento preenchido com todos os dados
	 */
	public void inserir(Agendamento agendamento);

	/**
	 * Realiza o Update do Agendamento no Banco de Dados, necessário preencher todos os atributos do Agendamento,
	 *  se não os mesmos serão sobreescritos com null. 
	 * @param agendamento Objeto Agendamento preenchido com todos os dados
	 */
	public void alterar(Agendamento agendamento);
	
	/**
	 * Realiza o Delete do Agendamento no Banco de Dados, enviar objeto preenchido apenas com o Id
	 * @param agendamento Objeto Agendamento preenchido com o Id para o delete.
	 */
	public void excluir(Agendamento agendamento);
	
	/**
	 * *****Select sem where ***** Retorna todos os Agendamentos da tabela do BD.
	 * @return Lista dos Objetos Agendamento populados no BD
	 */
	public List<Agendamento> listar();
	
	/**
	 * *****Select sem where ***** Retorna todos os Agendamentos da tabela do BD
	 * ordenados crescentemente pela Data de Inicio
	 * @return Lista de objetos Agendamento populados no BD ordenados pela data de Inicio
	 */
	public List<Agendamento> listarPorDataAsc();
	
	/**
	 * Retorna os Agendamentos de um Evento
	 * @param evento Objeto Evento preenchido com o Id dele
	 * @return Lista de objetos Agendamento relacionados a um Evento
	 */
	public List<Agendamento> listarPorEvento(Evento evento);
	
}
