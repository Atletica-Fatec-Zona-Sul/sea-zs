package br.com.fateczs.seazs.utils;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DataUtils {
	
	private Calendar operacao; 
	private Date retorno;
	
	public Date somaMinutos(Date data, int minutos) {
		operacao = Calendar.getInstance(TimeZone.getTimeZone("America/Sao_Paulo"));
		operacao.setTime(data);
		operacao.add(Calendar.MINUTE, minutos);
		retorno = operacao.getTime();
		return this.retorno;
	}
	
	public Integer verificaSemestre(Calendar data) {
		operacao = Calendar.getInstance(TimeZone.getTimeZone("America/Sao_Paulo"));
		operacao = data;
		int retorno = 0;
		if (operacao.get(Calendar.MONTH) <= 6) {
			retorno = 1;			
		}
		else if (operacao.get(Calendar.MONTH) >= 7) {
			retorno = 2;
		}
		return retorno;
	}
	
	public Calendar getDataAtual () {
		operacao = Calendar.getInstance(TimeZone.getTimeZone("America/Sao_Paulo"));
		return operacao;
	}
	
}
