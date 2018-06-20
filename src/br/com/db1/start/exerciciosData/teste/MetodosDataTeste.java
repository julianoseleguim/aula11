package br.com.db1.start.exerciciosData.teste;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.junit.Assert;
import org.junit.Test;

import br.com.db1.start.exerciciosData.classe.MetodosData;

public class MetodosDataTeste {

	DateTimeFormatter sdf = DateTimeFormat.forPattern("dd/MM/yyyy");
	DateTimeFormatter dtf = DateTimeFormat.forPattern("dd/MM/yyyy HH:mm");
	
	DateTimeFormatter tmf = DateTimeFormat.forPattern("HH:mm");
	
	@Test
	public void deveVerificarAnoBissexto() {				
		MetodosData data = new MetodosData();			
		LocalDate dataBissexto = LocalDate.parse("16/01/2017", sdf);
		Assert.assertTrue(true == data.verificaAnoBissexto(dataBissexto));
	}
		
	@Test
	public void deveVerificarDiaUtil() {
		MetodosData data = new MetodosData();		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date dataQualquer;
		
		try {
			dataQualquer = sdf.parse("04/06/2018");
			Assert.assertTrue(data.verifcaDiaUtil(dataQualquer));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void deveVerificarDiaUtilJoda() {		
		MetodosData data = new MetodosData();		
		LocalDate dataQualquer = LocalDate.parse("25/06/2018", sdf);
		Assert.assertTrue(data.verifcaDiaUtilJoda(dataQualquer));			
	}
	
	@Test
	public void deveRetornarIdade() {				
		MetodosData data = new MetodosData();		
		LocalDate dataNascimento = LocalDate.parse("27/10/1995", sdf);
		Assert.assertTrue(22 == data.retornaIdade(dataNascimento));	
	}
	
	@Test
	public void deveRetornarDiasEntreDuasData() {	
		MetodosData data = new MetodosData();
		Assert.assertTrue(27 == data.quantidadeDiasEntreDuasDatas("18/05/2018", "14/06/2018"));		
	}
	
	@Test
	public void deveRetornarDiasEntreDuasDataJoda() {	
		MetodosData data = new MetodosData();
		LocalDate data1 = LocalDate.parse("18/05/2015", sdf);
		LocalDate data2 = LocalDate.parse("18/05/2016", sdf);		
		Assert.assertTrue(366 == data.quantidadeDiasEntreDuasDatasJoda(data1, data2));				
	}
	
	@Test
	public void deveRetornarMesEntreDuasDataJoda() {	
		MetodosData data = new MetodosData();
		LocalDate data1 = LocalDate.parse("18/05/2018", sdf);
		LocalDate data2 = LocalDate.parse("18/07/2018", sdf);		
		Assert.assertTrue(2 == data.quantidadeMesEntreDuasDatasJoda(data1, data2));				
	}
	
	@Test
	public void deveRetornarAnoEntreDuasDataJoda() {	
		MetodosData data = new MetodosData();
		LocalDate data1 = LocalDate.parse("18/05/2018", sdf);
		LocalDate data2 = LocalDate.parse("18/07/2019", sdf);		
		Assert.assertTrue(1 == data.quantidadeAnoEntreDuasDatasJoda(data1, data2));				
	}
	
	@Test
	public void deveRetornarQuantidadeHoraJoda() {	
		MetodosData data = new MetodosData();
		LocalTime relogio1 = LocalTime.parse("12:00", tmf);
		LocalTime relogio2 = LocalTime.parse("14:00", tmf);
		Assert.assertTrue(2 == data.quantidadeHoraJoda(relogio1, relogio2));				
	}

}
