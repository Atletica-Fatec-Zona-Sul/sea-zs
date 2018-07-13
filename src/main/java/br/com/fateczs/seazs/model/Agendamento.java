package br.com.fateczs.seazs.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "agendamento")
public class Agendamento {
	
	@Id
	private Integer id;
	@Column(name = "dataNasc")
	private Date inicio;
	@Column(name = "dataNasc")
	private Date fim;
	@Column(name = "pontuacaoStaff")
	private Integer pontuacaoStaff;
	
}
