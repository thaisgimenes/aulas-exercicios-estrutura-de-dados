package com.thais.estruturasdados.vetor.teste;

import com.thais.estruturasdados.vetor.Vetor;

public class Aula3 {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(2);
		
		/*try {
			vetor.adiciona("elemento 1");
			vetor.adiciona("elemento 2");
			vetor.adiciona("elemento 3");
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		vetor.adicionaFinal("elemento 1");
		vetor.adicionaFinal("elemento 2");
		vetor.adicionaFinal("elemento 3");
	}

}
