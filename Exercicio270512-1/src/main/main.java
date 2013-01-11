package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

import controle.Controle;
import controle.AdicionarLista;

import entidades.Pessoa;

public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		AdicionarLista ad = new AdicionarLista();
		int i;
		
		List <Pessoa> listaPessoas = new ArrayList<Pessoa>();
				/*List <Pessoa> listaPessoas = new ArrayList<Pessoa>();
		while(adicionar== JOptionPane.YES_OPTION){
			Pessoa p = new Pessoa();
			ctr.popularPessoa(p);
			listaPessoas.add(p);
			Object[] opcoes = {"Sim", "Nao"};
			 adicionar = JOptionPane.showOptionDialog(null,"Deseja adicionar outra pessoa?", "Adicionar", JOptionPane.YES_OPTION, JOptionPane.NO_OPTION, null, opcoes, null);
		}*/
		
		
		//mostrar +=p.toString();
		
		ad.adicionar(listaPessoas);
		Collections.sort(listaPessoas);
		//Collections.reverse(listaPessoas);
		//Collections.max(listaPessoas);
				
		for(i=0; i<listaPessoas.size();i++){
			JOptionPane.showMessageDialog(null,listaPessoas.get(i).toString());
			
		}
		
		
			
	}
		
	
}
