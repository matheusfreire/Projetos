package br.com.prova.view;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JanelaMenu extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	public JanelaMenu() {
		super ("Menu Principal");
	}
	
	JPanel panelPrincipal;
	JPanel panelBotao;
	
	JButton botaoAdd;
	JButton botaoSair;
	JButton botaoImprimir;
	
	public void criarTela01 (){
		panelPrincipal = new JPanel();
		panelBotao = new JPanel();
		
		botaoAdd = new JButton("Add Arquivos");
		botaoAdd.addActionListener(this);
		botaoSair = new JButton("Sair");
		botaoSair.addActionListener(this);
		botaoImprimir = new JButton("Imprimir");
		botaoImprimir.addActionListener(this);
		
		
		panelBotao.add(botaoAdd);
		panelBotao.add(botaoImprimir);
		panelBotao.add(botaoSair);
		
		getContentPane().add(panelPrincipal, BorderLayout.NORTH);
		getContentPane().add(panelBotao, BorderLayout.SOUTH);
		getContentPane().setLayout(new GridLayout(3,3));
		
		pack();
		
		setSize(300,200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == botaoAdd){
			System.out.println("botao add");
			JanelaAdd janAdd = new JanelaAdd();
			janAdd.criarTela();
			JanelaMenu.this.dispose();
		}
		if (e.getSource() == botaoSair){
			System.out.println("botao sair");
			JanelaMenu.this.dispose();
		}
		if (e.getSource() == botaoImprimir){
			System.out.println("Imprimir");
			JanelaOpcaoListagem jan = new JanelaOpcaoListagem();
			jan.criarTela();
			JanelaMenu.this.dispose();
		}
	}
}
