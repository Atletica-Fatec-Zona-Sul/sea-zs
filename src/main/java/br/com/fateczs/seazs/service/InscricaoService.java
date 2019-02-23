package br.com.fateczs.seazs.service;

import java.util.List;
import br.com.fateczs.seazs.model.Atividade;
import br.com.fateczs.seazs.model.Inscricao;
import br.com.fateczs.seazs.model.Usuario;

public interface InscricaoService {
	public Inscricao buscar(Inscricao inscricao);
	
	public void inserir(Inscricao inscricao);
	
	public void alterar(Inscricao inscricao);
	
	public void excluir(Inscricao inscricao);
	
	public List<Inscricao> listar();

	public List<Inscricao> listarPorDataAsc();
	
	public List<Atividade> listarAtividadesInscrito(Usuario usuario);
	
	public List<Atividade> listarAtividadesInscritoPassado(Usuario usuario);
	
	/**
	 * Realiza a validação de presença do usuário em uma atividade, serve para os três tipos de atividades (Comum, Continua e Contínua e Cumulativa)
	 * @param inscricao inscrição para validar.
	 */
	public Inscricao validaPresenca(Inscricao inscricao);
	
	public List<Inscricao> listarPorAtividade(Atividade atividade);
	
	public List<Inscricao> listarPorUsuario(Usuario usuario);
	
	public Integer somaTotalDePontos(Usuario usuario);
	
	public Integer somaTotalDePontosNoSemestre(Usuario usuario);
}
