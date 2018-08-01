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

@Entity(name = "StaffAgendamento")
@Table(name = "tb_Staff_Agendamento",
uniqueConstraints = @UniqueConstraint(columnNames = {"id_agendamento", "id_usuario"})
		)
public class StaffAgendamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator="native")
	@GenericGenerator(
			name = "native",
			strategy = "native"
			)
	@Column(name = "sq_staff")
	private Integer sequencialStaff;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "id_agendamento")
	private Agendamento agendamento;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data_Inscricao", nullable = false)
	private Date dtInscricao;
	
	@Column(name = "checkIn")
	@ColumnDefault("0")
	private Boolean checkIn;
	
	@Column(name = "checkOut")
	private Boolean checkOut;
	
	@Column(name = "pontuacaoParticipante")
	private Integer pontuacaoRecebida;

	public Integer getSequencialStaff() {
		return sequencialStaff;
	}

	public void setSequencialStaff(Integer sequencialStaff) {
		this.sequencialStaff = sequencialStaff;
	}

	public Agendamento getAgendamento() {
		return agendamento;
	}

	public void setAgendamento(Agendamento agendamento) {
		this.agendamento = agendamento;
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
