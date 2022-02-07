package com.thais.estruturasdados.fila.teste;

import com.thais.estruturasdados.fila.Fila;

public class Aula21 {

	public static void main(String[] args) {
		
		Fila<Integer> fila = new Fila<Integer>();
		
		fila.enfileirar(3);
		fila.enfileirar(1);
		fila.enfileirar(2);
		
		System.out.println(fila.espiar());

	}

}
