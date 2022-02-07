package com.thais.estruturasdados.fila;

public class FilaComPrioridade<T> extends Fila<T>{
	
	public void enfileirarPrioridade(T elemento) {
		
		Comparable<T> chave = (Comparable<T>)elemento;
		
		int i;
		for(i = 0; i < this.tamanho; i++) {
			if(chave.compareTo(this.elementos[i]) < 0) {
				break;
			}
		}
		this.adicionaPosicao(i, elemento);
	}
}
