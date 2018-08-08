package br.com.fateczs.seazs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.fateczs.seazs.model.Inscricao;

public interface InscricaoRepository extends JpaRepository<Inscricao, Integer> {
	
	public List<Inscricao> findByAtividadeId(Integer idAtividade);
	
	public List<Inscricao> findByUsuarioId(Integer idUsuario);
	
	@Query("select sum(i.pontuacaoRecebida) from Inscricao i where i.usuario.id = ?1")
	public Integer somaPontuacaoRecebida(Integer idUsuario);
	
	@Query("select sum(i.pontuacaoRecebida) from Inscricao i where i.usuario.id = ?1 and MONTH(i.atividade.inicioAtividade) between ?2 and ?3")
	public Integer somaPontuacaoRecebidaNoSemestre(Integer idUsuario, int mesIni, int mesFim);
	
}
