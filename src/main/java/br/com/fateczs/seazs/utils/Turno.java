package br.com.fateczs.seazs.utils;

public enum Turno {
	MANHA('M'), TARDE('T'), NOITE('N');
	
	private Character valor;
	Turno(char valorEnt) {
		valor = valorEnt;
	}
	
	public static Turno getTurno(Character id) {
		if (id == null) {
			return null;
		}
		for (Turno turno : Turno.values()) {
			if(id.equals(turno.getIdTurno())) {
				return turno;
			}
		}
		throw new IllegalArgumentException("Esse tipo de usuário não existe" + id);
	}
	public Character getIdTurno() {
		return valor;
	}
}
