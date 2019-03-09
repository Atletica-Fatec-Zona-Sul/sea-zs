package br.com.fateczs.seazs.repository;

import br.com.fateczs.seazs.model.Atividade;
import br.com.fateczs.seazs.model.Inscricao;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Calendar;
import java.util.List;

public interface InscricaoRepository extends JpaRepository<Inscricao, Integer> {
	
	List<Inscricao> findByAtividadeId(Integer idAtividade);
	
	List<Inscricao> findByUsuarioId(Integer idUsuario);
	
	@Query("select i.atividade from Inscricao i where i.atividade.fimAtividade >= CURRENT_TIMESTAMP "
			+ "and i.usuario.id = ?1")
	List<Atividade> findAtividadesInscrito(Integer idUsuario, Sort ordem);
	
	@Query("select i.atividade from Inscricao i where i.atividade.fimAtividade < CURRENT_TIMESTAMP "
			+ "and i.usuario.id = ?1 and i.checkIn = true and i.checkOut = true")
	List<Atividade> findAtividadesInscritoPassado(Integer idUsuario, Sort ordem);
	
	@Query(value = "select sum(pontuacao_participante) from ("
			+ "select id_usuario, pontuacao_participante from tb_inscricao where id_usuario = ?1 "
			+ "union all "
			+ "select id_usuario, pontuacao_participante from tb_staff_agendamento where id_usuario = ?1) total "
			+ "group by id_usuario;",
			nativeQuery = true)
	Integer somaPontuacaoRecebida(Integer idUsuario);
	
	@Query(value = "select sum(pontuacao_participante) from ("
			+ "select id_usuario, pontuacao_participante from tb_inscricao where id_usuario = ?1 and (data_inscricao between ?2 and ?3) "
			+ "union all "
			+ "select id_usuario, pontuacao_participante from tb_staff_agendamento where id_usuario = ?1 and (data_inscricao between ?2 and ?3)) total "
			+ "group by id_usuario;",
			nativeQuery = true)
	Integer somaPontuacaoRecebidaNoSemestre(Integer idUsuario, Calendar dataIni, Calendar dataFim);

	@Query(value =	"select i from Inscricao i where i.usuario.id = ?1 and  i.atividade.id = ?2")
	Inscricao findByUsuarioIdAndAtividadeId(Integer usuarioId, Integer atividadeId);

}
