package com.thais.estruturasdados.vetor.teste;

import java.util.ArrayList;

import com.thais.estruturasdados.vetor.Lista;

public class Exercicio02 {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>(5);
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("A");
		
		System.out.println(arrayList.lastIndexOf("A"));
		
		Lista<String> lista = new Lista<String>(5);
		lista.adicionaFinal("A");
		lista.adicionaFinal("B");
		lista.adicionaFinal("A");
		
		System.out.println(lista.ultimoItem("A"));

	}

}
