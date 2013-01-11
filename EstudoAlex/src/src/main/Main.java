package src.main;

import src.bancoDeDados.CriaBD;
import src.janelas.JanelaInicial;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CriaBD novo = new CriaBD();
		novo.criarBanco();

		JanelaInicial inicio = new JanelaInicial();
		inicio.telaInicial();

	}

}
