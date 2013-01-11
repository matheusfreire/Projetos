package main;

import janelas.JanelaInicial;
import util.CriaBanco;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		CriaBanco novo = new CriaBanco();
		novo.CriarBanco();
		
		JanelaInicial inicio = new JanelaInicial();
		inicio.telaInicial();
		

	}

}
