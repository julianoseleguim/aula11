package br.com.db1.start.exerciciosData.classe;

import java.util.Calendar;
import java.util.Date;

public class MetodosData {
	
	
	public Boolean verifcaDiaUtil(Date dataParametro) {
		Calendar calendario = Calendar.getInstance();
		calendario.setTime(dataParametro);
		if ((calendario.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY)
				|| (calendario.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)) {
			return false;
		}

		return true;
	}

}
