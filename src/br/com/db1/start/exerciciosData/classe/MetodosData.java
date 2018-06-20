package br.com.db1.start.exerciciosData.classe;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Hours;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.Months;
import org.joda.time.Years;

public class MetodosData {
		
	public Boolean verificaAnoBissexto(LocalDate data) {
		DateTime dateTime = new DateTime();
		return dateTime.withYear(data.getYear()).year().isLeap();		
	}
	
	public Boolean verifcaDiaUtil(Date dataParametro) {
		Calendar calendario = Calendar.getInstance();
		calendario.setTime(dataParametro);
		if ((calendario.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY)
				|| (calendario.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)) {
			return false;
		}
			return true;
	}
		
	public Boolean verifcaDiaUtilJoda(LocalDate dataParametro) {		
		if ((dataParametro.getDayOfWeek() == DayOfWeek.SATURDAY.getValue()) 
				|| dataParametro.getDayOfWeek() == DayOfWeek.SUNDAY.getValue()) {
			return false;			
		}
			return true;
	}
	
	public Integer retornaIdade(LocalDate dataNascimento) {		
		LocalDate dataAtual = LocalDate.now();		
		Integer idade = dataAtual.getYear() - dataNascimento.getYear();
		
		if (dataAtual.getMonthOfYear() < dataNascimento.getMonthOfYear()) {
			idade--;
		} else {
			if (dataAtual.getMonthOfYear() == dataNascimento.getMonthOfYear()
					&& dataAtual.getDayOfMonth() < dataNascimento.getDayOfMonth()) {
				idade--;
			}
		}
		return idade;				
	}
	
	public long quantidadeDiasEntreDuasDatas(String data1, String data2) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	    long diff=0;		
		
	    try {
			Date primeiraData = sdf.parse(data1); 
		    Date segundaData  = sdf.parse(data2);
		
		    long diffInMillies = Math.abs(segundaData.getTime() - primeiraData.getTime());
		    diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);		    
		} catch (ParseException e) {
			e.printStackTrace();
		}		
		return diff;		
	}
	
	public Integer quantidadeDiasEntreDuasDatasJoda(LocalDate data1, LocalDate data2) {	
	   Days d = Days.daysBetween(data1, data2);
	   return d.getDays();		
	}

	public Integer quantidadeMesEntreDuasDatasJoda(LocalDate data1, LocalDate data2) {	
		Months m = Months.monthsBetween(data1, data2);
		return m.getMonths();		
	}
	
	public Integer quantidadeAnoEntreDuasDatasJoda(LocalDate data1, LocalDate data2) {	
		Years y = Years.yearsBetween(data1, data2);		
		return y.getYears();		
	}
	
	public Integer quantidadeHoraJoda(LocalTime relogio1, LocalTime relogio2) {		
		Hours h = Hours.hoursBetween(relogio1, relogio2);
		return h.getHours();		
	}
}
