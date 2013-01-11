package controle;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import entidades.Pessoa;

public class AdicionarLista {
	
	int adicionar = JOptionPane.YES_OPTION;
	Controle ctr = new Controle();
	
	public void adicionar(List <Pessoa> listaPessoas){
		while(adicionar== JOptionPane.YES_OPTION){
			Pessoa p = new Pessoa();
			ctr.popularPessoa(p);
			listaPessoas.add(p);
			Object[] opcoes = {"Sim", "Nao"};
			 adicionar = JOptionPane.showOptionDialog(null,"Deseja adicionar outra pessoa?", "Adicionar", JOptionPane.YES_OPTION, JOptionPane.NO_OPTION, null, opcoes, null);
			}
	
	}

}
