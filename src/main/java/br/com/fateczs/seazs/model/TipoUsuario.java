package br.com.fateczs.seazs.model;

public enum TipoUsuario {
	
	VISITANTE(1),
	PROFESSOR(2),
	FUNCIONARIO(3),
	ALUNO(4);
	
	private Integer tipoUsuario;
	
	TipoUsuario(Integer tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public Integer getTipoUsuario() {
		return tipoUsuario;
	}

}
