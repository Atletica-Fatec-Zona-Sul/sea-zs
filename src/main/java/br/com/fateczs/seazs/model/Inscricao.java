package br.com.fateczs.seazs.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.GenericGenerator;

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
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "id_atividade")
	private Atividade atividade;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "id_papel")
	private Papel papel;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data_Inscricao", nullable = false)
	private Date dtInscricao;
	
	@Column(name = "checkIn")
	@ColumnDefault("0")
	private Boolean checkIn;
	
	@Column(name = "checkOut")
	@ColumnDefault("0")
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
}
