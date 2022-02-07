package com.thais.estruturasdados.fila.teste;

import com.thais.estruturasdados.fila.FilaComPrioridade;

public class Exercicio03 {

	public static final int VERDE = 2;
	public static final int AMARELO = 1;
	public static final int VERMELHO = 0;

	public static void main(String[] args) {


		FilaComPrioridade<Pessoa> fila = new FilaComPrioridade<>();
		fila.enfileirar(new Pessoa("1", VERDE));
		fila.enfileirar(new Pessoa("2", AMARELO));
		fila.enfileirar(new Pessoa("3", VERMELHO));
		fila.enfileirar(new Pessoa("4", VERDE));
		fila.enfileirar(new Pessoa("5", VERDE));
		fila.enfileirar(new Pessoa("6", VERMELHO));

		PSAtendimento atendimento = new PSAtendimento(fila);
		PSNovosPacientes pacientes = new PSNovosPacientes(fila);

		Thread t1 = new Thread(atendimento);
		Thread t2 = new Thread(pacientes);

		t1.start();
		t2.start();
	}

}
