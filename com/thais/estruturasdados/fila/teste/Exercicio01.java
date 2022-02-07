package com.thais.estruturasdados.fila.teste;

import com.thais.estruturasdados.fila.Fila;

public class Exercicio01 {

	public static void main(String[] args) {

		Fila<Documento> filaImpressora = new Fila<>();

		filaImpressora.enfileirar(new Documento("A", 1));
		filaImpressora.enfileirar(new Documento("B", 2));
		filaImpressora.enfileirar(new Documento("C", 3));
		filaImpressora.enfileirar(new Documento("D", 7));
		filaImpressora.enfileirar(new Documento("E", 9));

		while (!filaImpressora.estaVazia()) {
			Documento doc = filaImpressora.desenfileirar();
			System.out.println("Imprimindo documento " + doc.getNome());
			try {
				Thread.sleep(200 * doc.getNumFolhas());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Todos os documentos foram impressos.");
	}

}
