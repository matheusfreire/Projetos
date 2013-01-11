package main;

import bancoDados.CriarBd;
import janelas.JanelaInicio;

public class MainAluno {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		CriarBd bd = new CriarBd();
		bd.criarBanco();
		
		JanelaInicio j1 = new JanelaInicio();
		j1.telaInicial();

	}

}
