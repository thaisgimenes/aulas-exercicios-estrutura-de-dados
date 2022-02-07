package com.thais.estruturasdados.pilha;

import com.thais.estruturasdados.base.EstrututaEstatica;

public class Pilha<T> extends EstrututaEstatica<T> {

	public Pilha() {
		super();
	}

	public Pilha(int capacidade) {
		super(capacidade);
	}

	public void empilha(T elemento) {
		this.aumentaCapacidade();
		super.adicionaFinal(elemento);
	}

	//Espiando o último elemento da pilha;
	public T topo() {

		if(this.estaVazia()) {
			return null;
		}
		return this.elementos[tamanho-1];
	}

	public T desempilha() {

		if(this.estaVazia()) {
			return null;
		}

		/* T elemento = this.elementos[tamanho-1];
		 tamanho--;
		 return elemento;*/

		return this.elementos[--tamanho];
	}
}
