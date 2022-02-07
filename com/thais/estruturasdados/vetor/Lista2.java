package com.thais.estruturasdados.vetor;

import com.thais.estruturasdados.base.EstrututaEstatica;

public class Lista2<T> extends EstrututaEstatica<T>{

	public Lista2(int capacidade) {
		super(capacidade);
	}
	
	public Lista2() {
		super();
	}
	
	public boolean adicionaFinal(T elemento){
		return super.adicionaFinal(elemento);
	}
	
	public boolean adicionaPosicao(int posicao, T elemento) {
		return super.adicionaPosicao(posicao, elemento);
	}
	

}
