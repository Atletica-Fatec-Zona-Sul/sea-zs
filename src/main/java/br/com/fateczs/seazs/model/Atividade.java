package br.com.fateczs.seazs.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "atividade")
public class Atividade {
	
	@Id
	private Integer id;
	@Column(name = "nome")
	private String nome;
	@Column(name = "descricao")
	private String descricao;
	@Column(name = "categoria")
	private String categoria;
	@Column(name = "nomePalestrante")
	private String nomePalestrante;
	@Column(name = "inicioAtividade")
	private Date inicioAtividade;
	@Column(name = "fimAtividade")
	private Date fimAtividade;
	@Column(name = "cargaHoraria")
	private Integer cargaHoraria;
	@Column(name = "qtdVagas")
	private Integer qtdVagas;
	@Column(name = "localAtividade")
	private String localAtividade;
	@Column(name = "pontuacaoParticipante")
	private Integer pontuacaoParticipante;
	@Column(name = "flagContinua")
	private Boolean flagContinua;
	@Column(name = "flagCumulativa")
	private Boolean flagCumulativa;
	@Column(name = "qtdCheckIn")
	private Integer qtdCheckIn;
}
