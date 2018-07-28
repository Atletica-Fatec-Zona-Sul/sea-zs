package br.com.fateczs.seazs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity(name = "Disciplina")
@Table(name = "tb_Disciplina")
public class Disciplina {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator="native")
	@GenericGenerator(
			name = "native",
			strategy = "native"
			)
	@Column(name = "id_disciplina")
	private Integer id;
	
	@NotNull
	@Column(name = "codigo_siga", nullable = false)
	private String codigoSiga;
	
	@NotNull
	@Column(name = "nome_disciplina", nullable = false)
	private String nome;
	
	@ManyToOne
	private Curso curso;
	
	public Disciplina() {}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodigoSiga() {
		return codigoSiga;
	}

	public void setCodigoSiga(String codigoSiga) {
		this.codigoSiga = codigoSiga;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	
	
}
