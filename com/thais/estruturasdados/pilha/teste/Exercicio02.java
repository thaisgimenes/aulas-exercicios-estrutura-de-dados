package com.thais.estruturasdados.pilha.teste;

import java.util.Scanner;

import com.thais.estruturasdados.pilha.Pilha;

public class Exercicio02 {

	public static void main(String[] args) {

		Pilha<Integer> par = new Pilha<Integer>();
		Pilha<Integer> impar = new Pilha<Integer>();

		Scanner scan = new Scanner(System.in);

		for (int i=1; i<=10; i++){

			System.out.println("Entre com um n�mero: ");

			int num = scan.nextInt();

			if (num == 0){

				//pilha par

				Integer desempilhado = par.desempilha();

				if (desempilhado == null){
					System.out.println("Pilha par vazia");
				} else {
					System.out.println("Desempilhando da pilha par: " + desempilhado);
				}

				//pilha impar

				desempilhado = impar.desempilha();

				if (desempilhado == null){
					System.out.println("Pilha impar vazia");
				} else {
					System.out.println("Desempilhando da pilha impar: " + desempilhado);
				}


			} else if (num % 2 == 0){
				System.out.println("N�mero par, empilhando na pilha par: " + num);
				par.empilha(num);
			} else {
				System.out.println("N�mero �mpar, empilhando na pilha �mpar: " + num);
				impar.empilha(num);
			}
		}

		System.out.println("Desempilhando todos os n�meros da pilhar par");

		while (!par.estaVazia()){
			System.out.println("Desempilhando da pilha par: " + par.desempilha());
		}

		System.out.println("Desempilhando todos os n�meros da pilhar �mpar");

		while (!impar.estaVazia()){
			System.out.println("Desempilhando da pilha impar: " + impar.desempilha());
		}

	}

}
