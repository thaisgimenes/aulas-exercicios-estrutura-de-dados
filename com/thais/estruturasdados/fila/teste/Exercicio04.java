package com.thais.estruturasdados.fila.teste;

import java.util.Random;

import com.thais.estruturasdados.fila.Fila;

public class Exercicio04 {

	public static void main(String[] args) {

		Fila<Integer> fila = new Fila<>();

		for (int i=0; i<10; i++) {
			fila.enfileirar(i);
		}

		Random aleatorio = new Random();
		int num = 0;
		while (num == 0) {
			num = aleatorio.nextInt(10);
		}

		System.out.println("N�mero = " + num);

		while (fila.tamanho() > 1) {
			for (int i=0; i<num; i++) {
				fila.enfileirar(fila.desenfileirar());
			}
			System.out.println("Eliminado = " + fila.desenfileirar());
		}

		System.out.println("Ganhador: " + fila.desenfileirar());
	}

}
