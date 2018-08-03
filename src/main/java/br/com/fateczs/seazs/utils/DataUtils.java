package br.com.fateczs.seazs.utils;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DataUtils {
	
	private Calendar operacao = Calendar.getInstance(TimeZone.getTimeZone("America/Sao_Paulo"));
	private Date retorno;
	
	public Date somaMinutos(Date data, int minutos) {
		operacao.setTime(data);
		operacao.add(Calendar.MINUTE, minutos);
		retorno = operacao.getTime();
		return this.retorno;
	}
	
}
