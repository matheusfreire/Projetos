package br.com.prova.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JanelaAdd extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	public JanelaAdd() {
		// TODO Auto-generated constructor stub
		super ("Janela Add");
	}
	
	JPanel panelPrincipal;
	JPanel panelBotao;
	
	JButton btnJpeg;
	JButton btnMpeg;
	JButton btnVoltar;
	JButton btnSair;
	
	public void criarTela(){
		panelPrincipal = new JPanel();
		panelBotao = new JPanel();
		
		btnJpeg = new JButton("Add Jpeg");
		btnJpeg.addActionListener(this);
		btnMpeg = new JButton("Add Mpeg");
		btnMpeg.addActionListener(this);
		btnVoltar  = new JButton("Voltar");
		btnVoltar.addActionListener(this);
		btnSair  = new JButton("Sair");
		btnSair.addActionListener(this);
		
		panelBotao.add(btnJpeg);
		panelBotao.add(btnMpeg);
		panelBotao.add(btnVoltar);
		panelBotao.add(btnSair);
		
		getContentPane().add(panelPrincipal, BorderLayout.NORTH);
		getContentPane().add(panelBotao, BorderLayout.SOUTH);
		getContentPane().setLayout(new GridLayout(2,2));
		
		pack();
		
		//setSize(250,200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == btnJpeg){
			JanelaJpeg janJpeg = new JanelaJpeg();
			janJpeg.criarTela();
			JanelaAdd.this.dispose();
			System.out.println("add Jpeg");
		}
		if (e.getSource() == btnMpeg){
			System.out.println("add Mpeg");
			JanelaMpeg jan = new JanelaMpeg();
			jan.criarTela();
			JanelaAdd.this.dispose();
		}
		if (e.getSource() == btnVoltar){
			System.out.println("Voltar pra janela anterior");
			JanelaMenu janMenu = new JanelaMenu();
			janMenu.criarTela01();
			JanelaAdd.this.dispose();
		}
		if (e.getSource() == btnSair){
			System.out.println("sair");
			JanelaAdd.this.dispose();
		}
	}
}
