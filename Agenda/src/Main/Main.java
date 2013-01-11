package Main;

import janela.JanelaSalvar;
import util.CriarBD;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CriarBD bd = new CriarBD();
		bd.criarBanco();
		
		JanelaSalvar jS = new JanelaSalvar();
		jS.salvarPessoa();
		
	}

}
