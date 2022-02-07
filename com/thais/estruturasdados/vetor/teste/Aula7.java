package com.thais.estruturasdados.vetor.teste;

import com.thais.estruturasdados.vetor.Vetor;

public class Aula7 {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(10);
		
		vetor.adicionaFinal("B");
		vetor.adicionaFinal("C");
		vetor.adicionaFinal("E");
		vetor.adicionaFinal("F");
		vetor.adicionaFinal("G");
		
		System.out.println(vetor);
		
		vetor.adicionaPosicao(0, "A");
		
		System.out.println(vetor);
		
		vetor.adicionaPosicao(3, "D");
		
		System.out.println(vetor);
		
		

	}

}
