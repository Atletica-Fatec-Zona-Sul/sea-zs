package br.com.fateczs.seazs.util;

public enum ModalidadeCurso {
	PRESENCIAL(1), EAD(2), SEMIPRESENCIAL(3);
	
	private int modalidade;
	ModalidadeCurso(int modalidadeEntrada){
		modalidade = modalidadeEntrada;
	}
	
	public int getTipoUsuario() {
		return modalidade;
	}
}
