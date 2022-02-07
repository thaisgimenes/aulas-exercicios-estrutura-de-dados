package com.thais.estruturasdados.vetor.teste;

import com.thais.estruturasdados.vetor.Lista;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Lista<String> vetor = new Lista<String>(2);
		
		System.out.println(vetor);
		
		vetor.adicionaFinal("A");
		vetor.adicionaFinal("B");
		vetor.adicionaFinal("C");
		vetor.adicionaFinal("B");
		
		boolean existe = vetor.contem("B");
		
		if (existe) {
			System.out.println("Elemento existe no array!");
		}else {
			System.out.println("Elemento não existe no array!");
		}
		
		vetor.ultimoItem("B");
		System.out.println(vetor.ultimoItem("B"));
		
		vetor.removeElemento("A");
		System.out.println(vetor);
		
		System.out.println(vetor.obtem(0));
		
		vetor.limpar();
		
		System.out.println(vetor);
	}

}
