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
	
	public Inscricao validaPresença(Inscricao inscricao);
	
	public List<Inscricao> listarPorAtividade(Atividade atividade);
	
	public List<Inscricao> listarPorUsuario(Usuario usuario);
	
	public Integer somaTotalDePontos(Usuario usuario);
	
	public Integer somaTotalDePontosNoSemestre(Usuario usuario);
}
