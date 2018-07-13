package br.com.fateczs.seazs.model;

import java.util.Date;

import javax.persistence.Column;

public class Inscricao {

	
	@Column(name = "dtInscricao")
	private Date dtInscricao;
	@Column(name = "checkIn")
	private Boolean checkIn;
	@Column(name = "checkOut")
	private Boolean checkOut;
	@Column(name = "pontuacaoParticipante")
	private Integer pontuacaoRecebida;
}
