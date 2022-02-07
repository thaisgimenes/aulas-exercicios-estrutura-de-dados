package com.thais.estruturasdados.fila;

import com.thais.estruturasdados.base.EstrututaEstatica;

public class Fila<T> extends EstrututaEstatica<T>{
	
	public Fila() {
		super();
	}
	
	public Fila(int capacidade) {
		super(capacidade);
	}
	
	public void enfileirar(T elemento) {
		this.adicionaFinal(elemento);
	}
	
	public T espiar() {
		if(this.estaVazia()) {
			return null;
		}
		return this.elementos[0];
	}
	
	public T desenfileirar() {
		
		final int posicao = 0;
		
		if(this.estaVazia()) {
			return null;
		}
		
		T elementoRemovido = this.elementos[posicao];
		this.remove(posicao);
		return elementoRemovido;
		
		
	}
}
