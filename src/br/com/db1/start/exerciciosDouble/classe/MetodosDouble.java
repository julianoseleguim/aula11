package br.com.db1.start.exerciciosDouble.classe;

public class MetodosDouble {

	public Double verificaNumeroMenor(Double valor1, Double valor2) {
		if (valor1 < valor2) {
			return valor1;
		}
			return valor2;
	}
	
	public Double verifcaMenorDeTresNumeros(Double valor1, Double valor2, Double valor3) {
		Double menor;		
		if (valor1 <= valor2) 
			menor = valor1;
		else
			menor = valor2;
		
		if (menor <= valor3) {
			return menor;
		}
			return valor3;
	}
	
	public Double retornaMediaEntreTresNumeros(Double valor1, Double valor2, Double valor3) {
		Double media;		
		media = (valor1+valor2+valor3)/3;
		return media;
		
	}
	
	public Double calculaAreaDeUmTriangulo(Double base, Double altura) {
		Double area;
		area = (base*altura)/2;		
		return area;
	}
}
