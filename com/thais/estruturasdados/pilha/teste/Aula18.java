package com.thais.estruturasdados.pilha.teste;

import java.util.Stack;

import com.thais.estruturasdados.pilha.Pilha;

public class Aula18 {

	public static void main(String[] args) {
		
		Pilha<Integer> pilha = new Pilha<Integer>();
		
		Stack<Integer> stack = new Stack<Integer>();
		
		//Verifica se a pilha está vazia
		System.out.println(stack.isEmpty());
		
		//Empilhando elementos
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		System.out.println(stack.isEmpty());
		
		//Verificando o tamanho da pilha
		System.out.println(stack.size());
		
		//Espiando o topo da pilha, para verificar qual elemento
		System.out.println(stack.peek());
		
		//Removendo/Desempilhando um elemento da pilha
		stack.pop();
		
		System.out.println(stack);
	}

}
