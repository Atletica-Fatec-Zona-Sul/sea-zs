package br.com.fateczs.seazs.utils;

public enum TipoUsuario {
	
	VISITANTE(1),
	PROFESSOR(2),
	FUNCIONARIO(3),
	ALUNO(4);
	
	private Integer tipoUsuario;
	
	TipoUsuario(Integer tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	
	public static TipoUsuario getTipoUsuario(Integer id) {
		if (id == null) {
			return null;
		}
		for (TipoUsuario tipo : TipoUsuario.values()) {
			if(id.equals(tipo.getIdTipoUsuario())) {
				return tipo;
			}
		}
		throw new IllegalArgumentException("Esse tipo de usuário não existe" + id);
	}
	public Integer getIdTipoUsuario() {
		return tipoUsuario;
	}

}