package com.thais.estruturasdados.fila.teste;

import com.thais.estruturasdados.fila.Fila;

public class Aula20 {

	public static void main(String[] args) {
		
		Fila<Integer> fila = new Fila<Integer>();
		
		fila.enfileirar(1);
		fila.enfileirar(2);
		fila.enfileirar(3);
		
		System.out.println(fila.estaVazia());
		System.out.println(fila.tamanho());
		
		System.out.println(fila.toString());

	}

}
