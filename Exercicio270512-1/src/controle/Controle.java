package controle;

import javax.swing.JOptionPane;

import entidades.Pessoa;

public class Controle {

	int i = 0;
	
	public Pessoa popularPessoa(Pessoa p){
		
		
		i++;
		p.setNome(JOptionPane.showInputDialog("Nome da " +i+" Pessoa:"));
		p.setCpf(JOptionPane.showInputDialog("CPF da " +i+" Pessoa:"));		
		p.setTel(JOptionPane.showInputDialog("Tel da " +i+" Pessoa:"));
		
		return p;
	}

}
