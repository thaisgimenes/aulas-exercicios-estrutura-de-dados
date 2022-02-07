package com.thais.estruturasdados.vetor.teste;

import com.thais.estruturasdados.vetor.Lista;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Lista<String> lista = new Lista<String>(5);

		lista.adicionaFinal("A");
		lista.adicionaFinal("B");
		lista.adicionaFinal("C");
		lista.adicionaFinal("D");
		lista.adicionaFinal("E");

		System.out.println(lista.obtem(0));
		System.out.println(lista.obtem(2));
		System.out.println(lista.obtem(4));

	}

}
