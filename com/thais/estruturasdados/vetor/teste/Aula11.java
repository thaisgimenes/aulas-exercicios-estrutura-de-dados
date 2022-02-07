package com.thais.estruturasdados.vetor.teste;

import com.thais.estruturasdados.vetor.Lista;
import com.thais.estruturasdados.vetor.VetorObjeto;

public class Aula11 {

	public static void main(String[] args) {
		
		//Um vetor é composto por elementos de um mesmo tipo
		//O que causa um problema na definição do tipo OBJETO
		Lista<String> vetor = new Lista<String>(2);
		
		//Erro ao inserir um numero inteiro
		//vetor.adicionaFinal(1);
		vetor.adicionaFinal("Elemento do tipo string");
		
		System.out.println(vetor);

	}

}
