package br.com.fateczs.seazs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "curso")
public class Curso {
	
	@Id
	private Integer id;
	@Column(name = "nome")
	private String nome;
	@Column(name = "modalidade")
	private String modalidade;
	@Column(name = "qtdSemestres")
	private Integer qtdSemestres;
	
	
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
	public String getModalidade() {
		return modalidade;
	}
	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}
	public Integer getQtdSemestres() {
		return qtdSemestres;
	}
	public void setQtdSemestres(Integer qtdSemestres) {
		this.qtdSemestres = qtdSemestres;
	}

}
