package com.thais.estruturasdados.vetor.teste;

import com.thais.estruturasdados.vetor.Vetor;

public class Aula5 {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(10);
		
		vetor.adicionaFinal("elemento 1");
		vetor.adicionaFinal("elemento 2");
		vetor.adicionaFinal("elemento 3");
		
		System.out.println(vetor.busca(0));

	}

}
