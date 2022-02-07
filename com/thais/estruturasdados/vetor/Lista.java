package com.thais.estruturasdados.vetor;

import java.lang.reflect.Array;

public class Lista<T> {
	
	private T[] elementos;
	private int tamanho;
	
	public Lista(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}
	
	//Exercicio 1
	public boolean contem(T elemento) {
		return buscaElemento(elemento) > -1;
	}
	
	//Exercicio 2
	public int ultimoItem(T elemento) {
		
		int indice = -1;
		for (int i = this.tamanho-1; i >= 0; i--) {
			if (this.elementos[i].equals(elemento)) {
				indice = i;
			}
		}
		
		return indice;
	}
	
	//Exercicio 3
	public void removeElemento(T elemento) {
		int busca = buscaElemento(elemento);
		
		if(busca != -1) {
			remove(busca);
		}
	}
	
	//Exercicio 4
	public T obtem(int posicao) {
		return busca(posicao);
	}
	
	//Exercicio 5
	public void limpar() {

		for (int i = 0; i < this.tamanho; i++) {
			this.elementos[i] = null;
		}
		this.tamanho = 0;
	}
	
	
	//Adiciona elementos no final do vetor;
	public boolean adicionaFinal(T elemento){
		this.aumentaCapacidade();
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}else {
			return false;
		}
		
	}
	
	public boolean adicionaPosicao(int posicao, T elemento) {
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
	private void aumentaCapacidade(){
		if (this.tamanho == this.elementos.length) {
			T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
			for (int i = 0; i < this.elementos.length; i++){
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}
	
	//Busca por posi��o do array, retorna o elemento;
	public T busca(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho) ) {
			throw new IllegalArgumentException("Posi��o inv�lida!");
			
		}
		return this.elementos[posicao];
	}
	
	//Busca por elemento do array, retorna a posi��o;
	public int buscaElemento(T elemento) {
		for (int i = 0; i < this.tamanho; i++) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}
	
	//Remover elemento do vetor;
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
