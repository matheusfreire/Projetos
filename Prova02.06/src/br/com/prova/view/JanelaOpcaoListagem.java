package br.com.prova.view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import br.com.prova.DAO.ArquivoDAO;

public class JanelaOpcaoListagem extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	public JanelaOpcaoListagem() {
		// TODO Auto-generated constructor stub
		super ("Janela Opção");
	}
	
	JPanel panelPrincipal;
	JPanel panelBotao;
	JPanel panelOpcoes;
	
	JButton btnDecrescente;
	JButton btnMaisCaro;
	JButton btnMaisBarato;
	JButton btnCancelar;
	JButton btnAdd;
	
	public void criarTela (){
		panelPrincipal = new JPanel();
		panelBotao = new JPanel();
		panelOpcoes = new JPanel();
		
		btnDecrescente = new JButton("Ordenar Decrescente");
		btnDecrescente.addActionListener(this);
		btnMaisBarato = new JButton("Mais Barato");
		btnMaisBarato.addActionListener(this);
		btnMaisCaro = new JButton("Mais Caro");
		btnMaisCaro.addActionListener(this);
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		btnAdd = new JButton("Add mais arquivos");
		btnAdd.addActionListener(this);
		
		
		panelOpcoes.add(btnDecrescente);
		panelOpcoes.add(btnMaisCaro);
		panelOpcoes.add(btnMaisBarato);
		panelBotao.add(btnCancelar);
		panelBotao.add(btnAdd);
		
		getContentPane().add(panelPrincipal, BorderLayout.NORTH);
		getContentPane().add(panelOpcoes, BorderLayout.CENTER);
		getContentPane().add(panelBotao, BorderLayout.SOUTH);
		
		pack();
		
		setSize(400,200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == btnDecrescente){
			System.out.println("listar decrescente");
			ArquivoDAO arqDAO = new ArquivoDAO();
			arqDAO.buscarJpeg();
			arqDAO.buscarMpeg();
			JOptionPane.showMessageDialog(null, "Relatorio final" + arqDAO.getRelatorioFinal());
			
		}
		if (e.getSource() == btnMaisBarato){
			System.out.println("Mais Barato");
		}
		if (e.getSource() == btnMaisCaro){
			System.out.println("Mais Caro");
		}
		if (e.getSource() == btnCancelar){
			System.out.println("Cancelar");
			JanelaMenu jan = new JanelaMenu();
			jan.criarTela01();
			JanelaOpcaoListagem.this.dispose();
		}
		if (e.getSource() == btnAdd){
			System.out.println("add");
			JanelaAdd jan = new JanelaAdd();
			jan.criarTela();
			JanelaOpcaoListagem.this.dispose();
		}
	}
}
