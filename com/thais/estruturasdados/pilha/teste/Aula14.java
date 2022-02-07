package com.thais.estruturasdados.pilha.teste;

import com.thais.estruturasdados.pilha.Pilha;

public class Aula14 {

	public static void main(String[] args) {

		//Empilhando elementos na pilha;
		
		Pilha<Integer> pilha = new Pilha<Integer>();
		
		for (int i = 1; i <= 10; i++) {
			pilha.empilha(i);
		}
		
		System.out.println(pilha);
		System.out.println(pilha.tamanho());

	}

}
