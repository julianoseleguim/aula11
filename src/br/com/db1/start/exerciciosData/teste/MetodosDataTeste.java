package br.com.db1.start.exerciciosData.teste;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.start.exerciciosData.classe.MetodosData;

public class MetodosDataTeste {

	@Test
	public void deveVerificarDiaUtil() {
		MetodosData data = new MetodosData();
		
		Assert.assertTrue(data.verifcaDiaUtil(new Date()));
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date sabado;
		
		try {
			sabado = sdf.parse("02/06/2018");
			Assert.assertFalse(data.verifcaDiaUtil(sabado));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
	}
}
