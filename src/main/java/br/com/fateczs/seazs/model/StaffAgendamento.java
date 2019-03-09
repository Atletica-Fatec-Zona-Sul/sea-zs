package br.com.fateczs.seazs.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;


@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
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
	@JsonIgnoreProperties("atividades")
	@JoinColumn(name = "id_agendamento")
	private Agendamento agendamento;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data_Inscricao", nullable = false)
	private Date dtInscricao;
	
	@Column(name = "checkIn", nullable = false)
	@ColumnDefault("0")
	private Boolean checkIn;
	
	@Column(name = "checkOut", nullable = false)
	@ColumnDefault("0")
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

	public boolean validouPresenca(){
		return (checkIn && checkOut);
	}
	
}
