package br.com.fateczs.seazs.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "evento")
public class Evento {
	
	@Id
	private Integer id;
	@Column(name = "nome")
	private String nome;
	@Column(name = "descricao")
	private String descricao;
	@Column(name = "inicio")
	private Date inicio;
	@Column(name = "fim")
	private Date fim;
	@Column(name = "dataInclusao")
	private Date dataInclusao;
	
}
