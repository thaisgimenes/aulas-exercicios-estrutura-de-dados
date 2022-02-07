package com.thais.estruturasdados.vetor.teste;

import java.util.ArrayList;

import com.thais.estruturasdados.vetor.Lista;

public class Exercicio05 {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>(5);
		
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		arrayList.add("D");
		arrayList.add("E");
		
		System.out.println(arrayList);
		
		arrayList.clear();
		
		System.out.println(arrayList);
		
		
		Lista<String> lista = new Lista<String>(5);

		lista.adicionaFinal("A");
		lista.adicionaFinal("B");
		lista.adicionaFinal("C");
		lista.adicionaFinal("D");
		lista.adicionaFinal("E");

		System.out.println(lista);
		
		lista.limpar();
		
		System.out.println(lista);

	}

}
