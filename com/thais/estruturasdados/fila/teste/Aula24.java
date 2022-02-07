package com.thais.estruturasdados.fila.teste;

import com.thais.estruturasdados.fila.FilaComPrioridade;

public class Aula24 {

	public static void main(String[] args) {
		
		FilaComPrioridade<Integer> fila = new FilaComPrioridade<Integer>();
		
		fila.enfileirarPrioridade(3);
		fila.enfileirarPrioridade(1);
		fila.enfileirarPrioridade(2);

		System.out.println(fila);

	}

}
