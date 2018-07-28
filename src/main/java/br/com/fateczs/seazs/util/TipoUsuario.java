package br.com.fateczs.seazs.util;

public enum TipoUsuario {
	VISITANTE(1), PROFESSOR(2), FUNCIONARIO(3), ALUNO(4);
	
	private int tipo;
	TipoUsuario(int tipoEntrada){
		tipo = tipoEntrada;
	}
	
	public int getTipoUsuario() {
		return tipo;
	}
}
