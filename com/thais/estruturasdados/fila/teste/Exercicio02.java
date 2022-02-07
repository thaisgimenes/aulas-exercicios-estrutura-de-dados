package com.thais.estruturasdados.fila.teste;

import com.thais.estruturasdados.fila.Fila;

public class Exercicio02 {

	public static void main(String[] args) {

		Fila<String> regular = new Fila<>();
		Fila<String> prioridade = new Fila<>();

		final int MAX_PRIORIDADE = 3;

		regular.enfileirar("Pessoa 1");
		regular.enfileirar("Pessoa 2");
		regular.enfileirar("Pessoa 3");
		prioridade.enfileirar("Pessoa 1P");
		prioridade.enfileirar("Pessoa 2P");
		prioridade.enfileirar("Pessoa 3P");
		prioridade.enfileirar("Pessoa 4P");
		prioridade.enfileirar("Pessoa 5P");
		regular.enfileirar("Pessoa 4");
		regular.enfileirar("Pessoa 5");
		regular.enfileirar("Pessoa 6");
		regular.enfileirar("Pessoa 7");
		regular.enfileirar("Pessoa 8");

		while (!regular.estaVazia() || !prioridade.estaVazia()) {

			int cont = 0;

			while(!prioridade.estaVazia() && cont < MAX_PRIORIDADE) {
				atendePessoa(prioridade);
				cont++;
			}

			if (!regular.estaVazia()) {
				atendePessoa(regular);
			}

			if (prioridade.estaVazia()) {
				while (!regular.estaVazia()) {
					atendePessoa(regular);
				}
			}
		}
	}

	public static void atendePessoa(Fila<String> fila) {
		String pessoaAtendida = fila.desenfileirar();
		System.out.println(pessoaAtendida + " foi atendida.");
	}


}
