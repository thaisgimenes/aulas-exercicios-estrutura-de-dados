package com.thais.estruturasdados.base;

public class EstrututaEstatica<T> {
	protected T[] elementos;
	protected int tamanho;

	public EstrututaEstatica(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}

	public EstrututaEstatica() {
		this(10);
	}

	//Adiciona elementos no final do vetor;
	protected boolean adicionaFinal(T elemento){
		this.aumentaCapacidade();
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}else {
			return false;
		}

	}

	protected boolean adicionaPosicao(int posicao, T elemento) {
		
		if (!(posicao >= 0 && posicao < tamanho) ) {
			throw new IllegalArgumentException("Posi��o inv�lida!");

		}

		this.aumentaCapacidade();

		//Movendo elementos
		for (int i = this.tamanho-1; i >= posicao; i--) {
			this.elementos[i+1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;

		return true;
	}

	//Aumentar capacidade do vetor;
	protected void aumentaCapacidade(){
		if (this.tamanho == this.elementos.length) {
			T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
			for (int i = 0; i < this.elementos.length; i++){
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}

	//Verificando se a pilha est� vazia;
	public boolean estaVazia() {
		return this.tamanho == 0;
	}
	
	public void remove(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho) ) {
			throw new IllegalArgumentException("Posi��o inv�lida!");

		}
		for (int i = posicao; i < this.tamanho-1; i++) {
			this.elementos[i] = this.elementos[i+1];
		}
		this.tamanho--;
	}

	public int tamanho() {
		return this.tamanho;
	}

	@Override
	public String toString() {

		StringBuilder s = new StringBuilder();
		s.append("[");

		for (int i = 0; i < this.tamanho-1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}

		if (this.tamanho > 0) {
			s.append(this.elementos[this.tamanho-1]);
		}

		s.append("]");

		return s.toString();
	}
}
