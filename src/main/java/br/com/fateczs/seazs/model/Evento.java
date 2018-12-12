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
import javax.validation.constraints.NotNull;
import org.hibernate.annotations.GenericGenerator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "tb_Evento")
public class Evento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator="native")
	@GenericGenerator(
			name = "native",
			strategy = "native"
			)
	@Column(name = "id_evento")
	private Integer id;
	
	@NotNull
	@Column(name = "nome_evento", nullable = false)
	private String nome;
	
	@Column(name = "descricao_evento", nullable = true)
	private String descricao;
	
	@ManyToOne(optional = true)
	@JoinColumn(name = "id_curso")
	private Curso cursoEvento;
	
	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data_inicio", nullable = false)
	private Date inicio;
	
	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data_fim", nullable = false)
	private Date fim;
	
//	@NotNull
	@Temporal(TemporalType.DATE)
	@Column(name = "data_inclusao", nullable = false)
	private Date dataInclusao;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "id_usuario_criador")
	private Usuario usuarioCriador;
	
	public Evento () {	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Curso getCursoEvento() {
		return cursoEvento;
	}

	public void setCursoEvento(Curso cursoEvento) {
		this.cursoEvento = cursoEvento;
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

	public Date getDataInclusao() {
		return dataInclusao;
	}

	public void setDataInclusao(Date dataInclusao) {
		this.dataInclusao = dataInclusao;
	}

	public Usuario getUsuarioCriador() {
		return usuarioCriador;
	}

	public void setUsuarioCriador(Usuario usuarioCriador) {
		this.usuarioCriador = usuarioCriador;
	}
	
	
}
