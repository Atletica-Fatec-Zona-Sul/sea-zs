package br.com.fateczs.seazs.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.fateczs.seazs.model.Atividade;
import br.com.fateczs.seazs.model.Inscricao;

public interface InscricaoRepository extends JpaRepository<Inscricao, Integer> {
	
	public List<Inscricao> findByAtividadeId(Integer idAtividade);
	
	public List<Inscricao> findByUsuarioId(Integer idUsuario);
	
	@Query("select i.atividade from Inscricao i where i.atividade.fimAtividade >= CURRENT_TIMESTAMP "
			+ "and i.usuario.id = ?1")
	public List<Atividade> findAtividadesInscrito(Integer idUsuario, Sort ordem);
	
	@Query("select i.atividade from Inscricao i where i.atividade.fimAtividade < CURRENT_TIMESTAMP "
			+ "and i.usuario.id = ?1 and i.checkIn = true and i.checkOut = true")
	public List<Atividade> findAtividadesInscritoPassado(Integer idUsuario, Sort ordem);
	
	@Query("select sum(i.pontuacaoRecebida) from Inscricao i where i.usuario.id = ?1")
	public Integer somaPontuacaoRecebida(Integer idUsuario);
	
	@Query("select sum(i.pontuacaoRecebida) from Inscricao i where i.usuario.id = ?1 and YEAR(i.atividade.inicioAtividade) = ?4 and (MONTH(i.atividade.inicioAtividade) between ?2 and ?3)")
	public Integer somaPontuacaoRecebidaNoSemestre(Integer idUsuario, int mesIni, int mesFim, int ano);
	
}
