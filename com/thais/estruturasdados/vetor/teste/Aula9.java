package com.thais.estruturasdados.vetor.teste;

import com.thais.estruturasdados.vetor.Vetor;

public class Aula9 {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(3);
		
		vetor.adicionaFinal("B");
		vetor.adicionaFinal("C");
		vetor.adicionaFinal("E");
		vetor.adicionaFinal("F");
		vetor.adicionaFinal("G");
		
		System.out.println(vetor);
		
		vetor.remove(1);
		
		System.out.println(vetor);
		
		System.out.println("Remover o elemento E");
		
		int pos = vetor.buscaElemento("E");
		if (pos > -1) {
			vetor.remove(pos);
		}else {
			System.out.println("Elemento não existe nno vetor!");
		}
		
		System.out.println(vetor);
	}

}
