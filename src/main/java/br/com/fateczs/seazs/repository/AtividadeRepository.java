package br.com.fateczs.seazs.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.fateczs.seazs.model.Atividade;

/**
 * DAO de acesso ao Banco de Dados para a Entidade Atividade
 * @author Gustavo Santos Valverde
 *
 */
public interface AtividadeRepository extends JpaRepository<Atividade, Integer> {
	
	/**
	 * Procura as Atividades de um Agendamento
	 * @param idAgendamento id Do Agendamento desejado
	 * @return Lista de Objetos Atividade relacionados ao Agendamento informado
	 */
	public List<Atividade> findByAgendamentoId(Integer idAgendamento);
	
	/**
	 * Procura as Atividades que ainda estão disponíveis para inscrição, onde a atividade ainda não acabou e o usuário ainda não se inscreveu.
	 * @param idLogado Id do Usuário Logado
	 * @param ordem Parametros de Ordenação, objeto do tipo Sort
	 * @return Lista de Atividades com DtFim maior ou igual a data atual (data e hora) e que não possuem inscrição para o usuário informado
	 */
	@Query("select a from Atividade a where a.fimAtividade >= CURRENT_TIMESTAMP and a.id not in "
			+ "( select i.atividade.id from Inscricao i "
			+ "where i.usuario.id = ?1 )")
	public List<Atividade> findAtividadeDisponivelParaInscricao(Integer idLogado, Sort ordem);
	
	/**
	 * Procura as Atividades que já acabaram.
	 * @param ordem Parametros de Ordenação, Objeto do Tipo Sort
	 * @return Lista de Atividades cujo DtFim é menor que a data atual (data e hora)
	 */
	@Query("select a from Atividade a where a.fimAtividade < CURRENT_TIMESTAMP")
	public List<Atividade> findAtividadesPassadas(Sort ordem);
}
