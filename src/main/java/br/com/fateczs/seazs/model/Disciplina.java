package br.com.fateczs.seazs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity(name = "Disciplina")
@Table(name = "tb_Disciplina" )
public class Disciplina {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_disciplina")
	private int idDisciplina;
	
	@NotNull
	@Column(name = "codigo_siga", nullable = false)
	private String codigoSiga;
	
	@NotNull
	@Column(name = "nome_disciplina", nullable = false)
	private String nome;
	
	@ManyToOne
	private Curso curso;
	
	public Disciplina() {
		// TODO Auto-generated constructor stub
	}
	

	public int getIdDisciplina() {
		return idDisciplina;
	}

	public void setIdDisciplina(int idDisciplina) {
		this.idDisciplina = idDisciplina;
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
