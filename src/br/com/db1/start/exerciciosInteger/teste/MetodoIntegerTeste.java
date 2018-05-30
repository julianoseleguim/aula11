package br.com.db1.start.exerciciosInteger.teste;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.start.exerciciosInteger.classe.MetodoInteger;

public class MetodoIntegerTeste {
	
	@Test
	public void deveSomarDoisNumeros () {
		int valor1 = 3, valor2 = 5, resultado = 0;
		
		MetodoInteger calculaInteger = new MetodoInteger();
		resultado = calculaInteger.somaDoisNumeros(valor1, valor2);
		
		Assert.assertEquals(8, resultado);	
	}
	
	@Test
	public void deveSubtrairDoisNumeros () {
		int valor1 = 5, valor2 = 3, resultado = 0;
		
		MetodoInteger calculaInteger = new MetodoInteger();
		resultado = calculaInteger.subtraiDoisNumeros(valor1, valor2);
		
		Assert.assertEquals(2, resultado);
	}
	
	@Test
	public void deveMultiplicarDoisNumeros () {
		int valor1 = 5, valor2 = 3, resultado = 0;
		
		MetodoInteger calculaInteger = new MetodoInteger();
		resultado = calculaInteger.multiplicaDoisNumeros(valor1, valor2);
		
		Assert.assertEquals(15, resultado);	
	}
	
	@Test
	public void deveDividirDoisNumeros () {
		int valor1 = 10, valor2 = 2, resultado = 0;
		
		MetodoInteger calculaInteger = new MetodoInteger();
		resultado = calculaInteger.divideDoisNumeros(valor1, valor2);
		
		Assert.assertEquals(5, resultado);
	}
	
	@Test
	public void deveVerifcarNumeroPar() {
		int valor = 4;
		Boolean resultado;
		
		MetodoInteger calculaInteger = new MetodoInteger();
		resultado = calculaInteger.verifcaNumeroPar(valor);
		
		Assert.assertTrue(resultado);
	}
	
	@Test
	public void deveVerifcarMaiorNumero() {
		int valor1 = 4, valor2 =5, resultado = 0;
		
		MetodoInteger calculaInteger = new MetodoInteger();
		resultado = calculaInteger.verificaNumeroMaior(valor1, valor2);
		
		Assert.assertEquals(5, resultado);
	}
	
	@Test 
	public void DeveVerificarListaNumeroImpares() {
		Integer numero = 90;
		List<Integer> resultado;
		
		MetodoInteger calculaInteger = new MetodoInteger();
		resultado = calculaInteger.listaNumerosImparesAteCem(numero);
		
		Assert.assertTrue(resultado.size() == 5);
	}
	
	
	

}
