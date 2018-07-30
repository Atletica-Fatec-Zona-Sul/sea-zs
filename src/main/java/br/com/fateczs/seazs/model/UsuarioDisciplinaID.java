package br.com.fateczs.seazs.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Embeddable
public class UsuarioDisciplinaID implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private Disciplina disciplina;
	private Usuario usuario;
	private Date dtInicio;
	
	public UsuarioDisciplinaID() {
		// TODO Auto-generated constructor stub
	}


	@ManyToOne(optional = false)
	public Disciplina getDisciplina() {
		return disciplina;
	}



	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	@ManyToOne(optional = false)
	public Usuario getUsuario() {
		return usuario;
	}



	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	@Temporal(TemporalType.DATE)
	@Column(name = "data_inicioDisciplina", nullable = false)
	public Date getDtInicio() {
		return dtInicio;
	}


	public void setDtInicio(Date dtInicio) {
		this.dtInicio = dtInicio;
	}
	
}
