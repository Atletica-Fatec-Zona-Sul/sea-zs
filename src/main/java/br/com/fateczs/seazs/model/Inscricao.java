package br.com.fateczs.seazs.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;


@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity(name = "Inscricao")
@Table(name = "tb_Inscricao",
uniqueConstraints = @UniqueConstraint(columnNames = {"id_atividade", "id_usuario"})
		)
public class Inscricao {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator="native")
	@GenericGenerator(
			name = "native",
			strategy = "native"
			)
	@Column(name = "sq_Inscricao")
	private Integer sequencialInscricao;
	
	@NotNull
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "id_atividade")
	private Atividade atividade;
	
	@NotNull
	@ManyToOne(optional = false)
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;
	
	@NotNull
	@ManyToOne(optional = false)
	@JoinColumn(name = "id_papel")
	private Papel papel;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data_Inscricao", nullable = false)
	private Date dtInscricao;
	
	@Column(name = "checkIn")
	private Boolean checkIn;
	
	@Column(name = "checkOut")
	private Boolean checkOut;
	
	@Column(name = "pontuacaoParticipante")
	private Integer pontuacaoRecebida;

	public Integer getSequencialInscricao() {
		return sequencialInscricao;
	}

	public void setSequencialInscricao(Integer sequencialInscricao) {
		this.sequencialInscricao = sequencialInscricao;
	}

	public Atividade getAtividade() {
		return atividade;
	}

	public void setAtividade(Atividade atividade) {
		this.atividade = atividade;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Date getDtInscricao() {
		return dtInscricao;
	}

	public void setDtInscricao(Date dtInscricao) {
		this.dtInscricao = dtInscricao;
	}

	public Papel getPapel() {
		return papel;
	}

	public void setPapel(Papel papel) {
		this.papel = papel;
	}

	public Boolean getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(Boolean checkIn) {
		this.checkIn = checkIn;
	}

	public Boolean getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(Boolean checkOut) {
		this.checkOut = checkOut;
	}

	public Integer getPontuacaoRecebida() {
		return pontuacaoRecebida;
	}

	public void setPontuacaoRecebida(Integer pontuacaoRecebida) {
		this.pontuacaoRecebida = pontuacaoRecebida;
	}
	public boolean validouPresenca(){
		if (this.atividade.getFlagContinua()) {
			return (checkIn || checkOut);
		}
		else {
			return (checkIn && checkOut);
		}
	}
}
