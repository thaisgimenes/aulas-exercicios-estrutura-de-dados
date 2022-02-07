package com.thais.estruturasdados.vetor.teste;

import java.util.ArrayList;

import com.thais.estruturasdados.vetor.Vetor;

public class Aula12 {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<String>();
		
		arrayList.add("A");
		arrayList.add("C");
		arrayList.add("D");
		arrayList.add("E");
		arrayList.add("B");
		
		System.out.println(arrayList);
		
		arrayList.add(1,"B");
		
		System.out.println(arrayList);
		
		boolean existe = arrayList.contains("A");
		if (existe) {
			System.out.println("Elemento existe no array!");
		}else {
			System.out.println("Elemento n�o existe no array!");
		}
		
		int pos = arrayList.indexOf("B");
		if (pos > -1) {
			System.out.println("Elemento existe no array!");
		}else {
			System.out.println("Elemento n�o existe no array!");
		}
		
		System.out.println(arrayList.get(2));
		
		arrayList.remove(0);
		arrayList.remove("B");
		
		System.out.println(arrayList);
		
		System.out.println(arrayList.size());
		
		System.out.println(arrayList.lastIndexOf("C"));
		
		arrayList.clear();
		
		System.out.println(arrayList);

	}

}
