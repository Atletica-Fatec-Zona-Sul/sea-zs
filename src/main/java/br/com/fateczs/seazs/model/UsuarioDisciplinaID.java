package br.com.fateczs.seazs.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

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


	@ManyToOne
	public Disciplina getDisciplina() {
		return disciplina;
	}



	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}


	@ManyToOne
	public Usuario getUsuario() {
		return usuario;
	}



	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Date getDtInicio() {
		return dtInicio;
	}


	public void setDtInicio(Date dtInicio) {
		this.dtInicio = dtInicio;
	}
	
}
