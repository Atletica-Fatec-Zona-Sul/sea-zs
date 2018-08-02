package br.com.fateczs.seazs.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "tb_Agendamento")
public class Agendamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator="native")
	@GenericGenerator(
			name = "native",
			strategy = "native"
			)
	@Column(name = "id_Agendamento")
	private Integer id;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name = "id_evento")
	private Evento evento;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name = "id_usuario_organizador")
	private Usuario usuarioOrganizador;
	
	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data_inicio", nullable = false)
	private Date inicio;
	
	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data_fim", nullable = false)
	private Date fim;
	
	@NotNull
	@Column(name = "pontuacaoStaff", nullable = false)
	private Integer pontuacaoStaff;
	
	//@OneToMany(mappedBy = "agendamento")
	//private List<Atividade> atividades;
	
	public Agendamento () { }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public Usuario getUsuarioOrganizador() {
		return usuarioOrganizador;
	}

	public void setUsuarioOrganizador(Usuario usuarioOrganizador) {
		this.usuarioOrganizador = usuarioOrganizador;
	}

	public Date getInicio() {
		return inicio;
	}

	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	public Date getFim() {
		return fim;
	}

	public void setFim(Date fim) {
		this.fim = fim;
	}

	public Integer getPontuacaoStaff() {
		return pontuacaoStaff;
	}

	public void setPontuacaoStaff(Integer pontuacaoStaff) {
		this.pontuacaoStaff = pontuacaoStaff;
	}

//	public List<Atividade> getAtividades() {
//		return atividades;
//	}

//	public void setAtividades(List<Atividade> atividades) {
//		this.atividades = atividades;
//	}
	
	
}
