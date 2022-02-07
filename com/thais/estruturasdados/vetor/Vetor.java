package com.thais.estruturasdados.vetor;

public class Vetor {
	
	private String[] elementos;
	private int tamanho;
	
	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}
	
	/*public void adiciona(String elemento) {
		for (int i = 0; i < this.elementos.length; i++) {
			if (this.elementos[i] == null) {
				this.elementos[i] = elemento;
				break;
			}
		}
	}*/
	
	/*public void adiciona(String elemento) throws Exception {
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
		}else {
			throw new Exception("Vetor j� est� cheio!"); 
		}
		
	}*/
	
	//Adiciona elementos no final do vetor;
	public boolean adicionaFinal(String elemento){
		this.aumentaCapacidade();
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}else {
			return false;
		}
		
	}
	
	public boolean adicionaPosicao(int posicao, String elemento) {
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
			String[] elementosNovos = new String[this.elementos.length * 2];
			for (int i = 0; i < this.elementos.length; i++){
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}
	
	//Busca por posi��o do array, retorna o elemento;
	public String busca(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho) ) {
			throw new IllegalArgumentException("Posi��o inv�lida!");
			
		}
		return this.elementos[posicao];
	}
	
	//Busca por elemento do array, retorna a posi��o;
	public int buscaElemento(String elemento) {
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
