package br.com.db1.start.exerciciosString.teste;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.start.exerciciosString.classe.MetodosString;

public class MetodosStringTeste {
	
	@Test
	public void deveTransformarEmMaisculo() {
		String palavra = "Hoje o dia est� maravilhoso";
		String palavraEsperada = "HOJE O DIA EST� MARAVILHOSO";
		
		MetodosString classeString = new MetodosString();		 		
		Assert.assertEquals(palavraEsperada.toString(), classeString.transformaPalavraMaiscula(palavra));		
	}
	
	@Test
	public void deveTransformarEmMinusculo() {
		String palavra = "HOJE O DIA EST� MARAVILHOSO";		
		String palavraEsperada = "hoje o dia est� maravilhoso";
		
		MetodosString classeString = new MetodosString();		 		
		Assert.assertEquals(palavraEsperada.toString(), classeString.transformaPalavraMinuscula(palavra));		
	}
	
	@Test
	public void deveRetornarQuantidadeDeCaracteres() {
		String palavra = "DB1START";
		String palavra2 = " DB1START ";
		
		MetodosString classeString = new MetodosString();		
		Assert.assertEquals(8, classeString.contaQuantidadeDeCaracter(palavra).intValue());
		Assert.assertEquals(10, classeString.contaQuantidadeDeCaracter(palavra2).intValue());
		
		Assert.assertEquals(8, classeString.contaQuantidadeDeCaracterSemEspaco(palavra2).intValue());
	}
	
	@Test
	public void deveExibirPrimeirasLetras() {
		String nome = "Juliano Murakami Seleguim";
		
		MetodosString classeString = new MetodosString();		
		Assert.assertEquals("Juli", classeString.exibePrimeirasLetrasNome(nome));	
		
		Assert.assertEquals("ano Murakami Seleguim", classeString.exibeApartirDasQuatroPrimeirasLetras(nome));
		
		Assert.assertEquals("guim", classeString.exibeQuatroUltimasLetras(nome));
		
		Assert.assertEquals("ALUNO/ALUNA Murakami Seleguim", classeString.substituiPrimeiroNome(nome));
		
	}
	
	@Test
	public void deveExibirTextoSeparado() {
		
		MetodosString classeString = new MetodosString();
		String[] textoQuebrado = classeString.exibirTextoSeparado("banana,ma��,melancia"); 
		
		Assert.assertEquals("banana", textoQuebrado[0]);
		Assert.assertEquals("ma��", textoQuebrado[1]);
		Assert.assertEquals("melancia", textoQuebrado[2]);
	}
	
	@Test
	public void exercicio11Test() {
		
		MetodosString classeString = new MetodosString();
		
		Assert.assertTrue(4 == classeString.exibaVogaisDeUmTexto("juliano"));
		Assert.assertTrue(3 == classeString.exibaVogaisDeUmTexto("Amanda"));
		Assert.assertTrue(2 == classeString.exibaVogaisDeUmTexto("AnA"));
	}
	
	@Test 
	public void deveRetornarTextoInvertido() {
		
		MetodosString classeString = new MetodosString();
		
		Assert.assertEquals("ONAILUJ".toString(), classeString.retornaTextoInvertido("JULIANO"));
		Assert.assertEquals("ONURB".toString(), classeString.retornaTextoInvertido("BRUNO"));		
	}
	
}
