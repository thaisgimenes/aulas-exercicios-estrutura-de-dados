package com.thais.estruturasdados.vetor.teste;

import com.thais.estruturasdados.vetor.VetorObjeto;

public class Aula10 {

	public static void main(String[] args) {
		
		VetorObjeto vetor = new VetorObjeto(3);
		
		Contato c1 = new Contato("Contato 1", "1234-5678", "contato1@email.com");
		Contato c2 = new Contato("Contato 2", "1234-5678", "contato2@email.com");
		Contato c3 = new Contato("Contato 3", "1234-5678", "contato3@email.com");
		
		vetor.adicionaFinal(c1);
		vetor.adicionaFinal(c2);
		vetor.adicionaFinal(c3);
		
		System.out.println("Tamanho = " + vetor.tamanho());
		
		int pos = vetor.buscaElemento(c1);
		if (pos > -1) {
			System.out.println("Elemento existe no vetor!");
		}else {
			System.out.println("Elemento não existe no vetor!");
		}
		
		System.out.println(vetor);

	}

}
