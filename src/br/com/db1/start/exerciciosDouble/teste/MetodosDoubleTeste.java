package br.com.db1.start.exerciciosDouble.teste;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.start.exerciciosDouble.classe.MetodosDouble;

public class MetodosDoubleTeste {
	
	@Test
	public void deveRetornarNumeroMenor() {
		MetodosDouble calculaDouble  = new MetodosDouble();		
		Assert.assertTrue(5.00 == calculaDouble.verificaNumeroMenor(7.00, 5.00));
	}
	
	@Test
	public void deveRetornarMenorEntreTresNumeros() {
		MetodosDouble calculaDouble  = new MetodosDouble();		
		Assert.assertTrue(2.00 == calculaDouble.verifcaMenorDeTresNumeros(5.00, 7.00, 2.00));
	}	
	
	@Test
	public void deveRetornarMediaEntreTresNumeros() {
		MetodosDouble calculaDouble  = new MetodosDouble();		
		Assert.assertTrue(2.00 == calculaDouble.retornaMediaEntreTresNumeros(2.00, 2.00, 2.00));
	}
	
	@Test
	public void deveRetornarAreaDeUmTriangulo() {
		MetodosDouble calculaDouble  = new MetodosDouble();		
		Assert.assertTrue(8.00 == calculaDouble.calculaAreaDeUmTriangulo(4.00, 4.00));
	}
	
}
