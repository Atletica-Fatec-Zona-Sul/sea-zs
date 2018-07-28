package br.com.fateczs.seazs.utils;

public enum ModalidadeCurso {
	PRESENCIAL(1), EAD(2), SEMIPRESENCIAL(3);
	
	private Integer modalidade;
	ModalidadeCurso(int modalidadeEntrada){
		modalidade = modalidadeEntrada;
	}
	
	public static ModalidadeCurso getModalidadeCurso(Integer id) {
		if (id == null) {
			return null;
		}
		for (ModalidadeCurso tipo : ModalidadeCurso.values()) {
			if(id.equals(tipo.getIdModalidadeCurso())) {
				return tipo;
			}
		}
		throw new IllegalArgumentException("Esse tipo de usuário não existe" + id);
	}
	public Integer getIdModalidadeCurso() {
		return modalidade;
	}

}
