package br.com.db1.start.exerciciosString.classe;

import java.util.ArrayList;
import java.util.List;

public class MetodosString {
	
	public String transformaPalavraMaiscula(String palavra) {
		return palavra.toUpperCase();
	}
	
	public String transformaPalavraMinuscula(String palavra) {
		return palavra.toLowerCase();
	}
	
	public Integer contaQuantidadeDeCaracter(String palavra) {
		return palavra.length();
	}
	
	public Integer contaQuantidadeDeCaracterSemEspaco(String palavra) {
		return (palavra.trim().length());
	}
	
	public String exibePrimeirasLetrasNome(String nome) {
		return nome.substring(0, 4);
	}
	
	public String exibeApartirDasQuatroPrimeirasLetras(String nome) {
		return nome.substring(4, nome.length());
	}
	
	public String exibeQuatroUltimasLetras(String nome) {
		return nome.substring(nome.length()-4, nome.length());
	}
	
	public String substituiPrimeiroNome(String nome) {
		return nome = nome.replaceAll(nome.substring(0, 7), "ALUNO/ALUNA");
	}
	
	public String[] exibirTextoSeparado(String texto) {
		return texto.split(",");
	}
	
	public Integer exibaVogaisDeUmTexto(String texto) {
		return contaVogais(texto.toLowerCase(), iniciaVogais());
	}
	
	private Integer contaVogais(String texto, List<String> vogais) {
		Integer contadorDeVogais = 0;
		for(Integer contador = 0 ; contador < texto.length() ; contador++) {
			String umaPosicao = texto.substring(contador, contador+1); 
			if (vogais.contains(umaPosicao)) {
				contadorDeVogais++;
			}
		}
		return contadorDeVogais;
	}

	private List<String> iniciaVogais() {
		List<String> vogais = new ArrayList<>();
		vogais.add("a");
		vogais.add("e");
		vogais.add("i");
		vogais.add("o");
		vogais.add("u");
		return vogais;
	}
	
	public String retornaTextoInvertido(String texto) {
		
		StringBuilder textoinvertido = new StringBuilder(texto.toString());		
		return textoinvertido.reverse().toString();
	}
}
