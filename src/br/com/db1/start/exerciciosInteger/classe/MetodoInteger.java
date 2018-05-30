package br.com.db1.start.exerciciosInteger.classe;

import java.util.ArrayList;
import java.util.List;

public class MetodoInteger {
	
	public Integer somaDoisNumeros(Integer valor1, Integer valor2) {
		return valor1+valor2;
	}
	
	public Integer subtraiDoisNumeros(Integer valor1, Integer valor2) {
		return valor1-valor2;
	}
	
	public Integer multiplicaDoisNumeros(Integer valor1, Integer valor2) {
		return valor1*valor2;
	}
	
	public Integer divideDoisNumeros(Integer valor1, Integer valor2) {
		return valor1/valor2;
	}
	
	public Boolean verifcaNumeroPar(Integer numero) {
		if (numero % 2 == 0) {
			return true;
		}
			return false;
	}
	
	public Boolean verifcaNumeroImpar(Integer numero) {
		if (numero % 2 == 1) {
			return true;
		}
			return false;			
	}
	
	public Integer verificaNumeroMaior(Integer valor1, Integer valor2) {
		if (valor1 > valor2) {
			return valor1;
		}
			return valor2;
	}
	
	public List<Integer> listaNumerosImparesAteCem(Integer numero){
		List<Integer> listaNumerosImpares = new ArrayList<>();
		for (Integer contador=numero; contador <=100 ; contador++) {
			if (verifcaNumeroImpar(contador)) {
				listaNumerosImpares.add(contador);
			}			
		}		
		return listaNumerosImpares;		
	}	
}
