package br.com.fateczs.seazs.util;

public enum Turno {
	MANHA('M'), TARDE('T'), NOITE('N');
	
	private	char valor;
	Turno(char valorEnt) {
		valor = valorEnt;
	}
	
	public char getTurno() {
		return valor;
	}
	
}
