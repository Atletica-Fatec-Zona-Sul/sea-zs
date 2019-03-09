package br.com.fateczs.seazs.utils;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DataUtils {

	public static final TimeZone TIME_ZONE = TimeZone.getTimeZone("America/Sao_Paulo");
	private Calendar operacao;
	private Date retorno;
	
	public Date somaMinutos(Date data, int minutos) {
		operacao = Calendar.getInstance(TIME_ZONE);
		operacao.setTime(data);
		operacao.add(Calendar.MINUTE, minutos);
		retorno = operacao.getTime();
		return this.retorno;
	}
	
	public Integer verificaSemestre(Calendar data) {
		operacao = Calendar.getInstance(TIME_ZONE);
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
		operacao = Calendar.getInstance(TIME_ZONE);
		return operacao;
	}

	public String formataDataDiaMesAno(Date data){
		operacao = Calendar.getInstance(TIME_ZONE);
		operacao.setTime(data);

		return operacao.get(Calendar.DAY_OF_MONTH)+"/"+(operacao.get(Calendar.MONTH)+1)+"/"+operacao.get(Calendar.YEAR);
	}

	public int calculaCargaHoraria(Date inicio, Date fim) {
		LocalDateTime horarioInicio = LocalDateTime.ofInstant(inicio.toInstant(), TIME_ZONE.toZoneId());
		LocalDateTime horarioFim = LocalDateTime.ofInstant(fim.toInstant(), TIME_ZONE.toZoneId());
		Duration duracao = Duration.between(horarioFim, horarioInicio);
		long diff = Math.abs(duracao.toHours());
		return Math.toIntExact(diff);
	}
}
