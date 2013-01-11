package br.com.prova.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.com.prova.controller.Controle;

public class JanelaMpeg extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;

	public JanelaMpeg() {
		// TODO Auto-generated constructor stub
		super ("Janela MPEG");
	}
	
	JPanel panelPrincipal;
	JPanel panelBotao;
	
	JLabel lbNome;
	JLabel lbData;
	JLabel lbDuracao;
	
	JTextField txtNome;
	JTextField txtData;
	JTextField txtDuracao;
	
	JButton btnCadastrar;
	JButton btnLimpar;
	JButton btnCancelar;
	
	public void criarTela (){
		panelPrincipal = new JPanel();
		panelBotao = new JPanel();
		
		lbNome = new JLabel("Nome");
		txtNome = new JTextField(30);
		lbData = new JLabel("Data");
		txtData = new JTextField(10);
		lbDuracao = new JLabel("Duração");
		txtDuracao = new JTextField(20);
		
		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(this);
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(this);
		
		panelPrincipal.add(lbNome);
		panelPrincipal.add(txtNome);
		panelPrincipal.add(lbData);
		panelPrincipal.add(txtData);
		panelPrincipal.add(lbDuracao);
		panelPrincipal.add(txtDuracao);
		
		panelPrincipal.setLayout(new GridLayout(6,3));
		
		panelBotao.add(btnCadastrar);
		panelBotao.add(btnLimpar);
		panelBotao.add(btnCancelar);
		
		getContentPane().add(panelPrincipal, BorderLayout.NORTH);
		getContentPane().add(panelBotao, BorderLayout.SOUTH);
		
		pack();
		
		setSize(300,200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == btnCadastrar){
			System.out.println("Cadastrar Mpeg");
			Controle ctr = new Controle();
			ctr.salvarMpeg(txtNome.getText(), txtData.getText(), Double.parseDouble(txtDuracao.getText()));
			JanelaAdd jan = new JanelaAdd();
			jan.criarTela();
			System.out.println("Cadastrado com Sucesso");
			JanelaMpeg.this.dispose();
		}
		if (e.getSource() == btnCancelar){
			System.out.println("Cancelar");
			JanelaMenu janMenu = new JanelaMenu();
			janMenu.criarTela01();
			JanelaMpeg.this.dispose();
		}
		if (e.getSource() == btnLimpar){
			System.out.println("Limpar");
			txtNome.setText("");
			txtData.setText("");
			txtDuracao.setText("");
		}
	}
}
