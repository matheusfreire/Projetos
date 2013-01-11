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

public class JanelaJpeg extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;

	public JanelaJpeg() {
		// TODO Auto-generated constructor stub
		super ("Cadastro JPEG");
	}
	
	JPanel panelPrincipal;
	JPanel panelBotao;
	
	JLabel lbNome;
	JLabel lbData;
	JLabel lbCores;
	JLabel lbPixels;
	
	JTextField txtNome;
	JTextField txtData;
	JTextField txtCores;
	JTextField txtPixels;
	
	JButton btnCadastrar;
	JButton btnLimpar;
	JButton btnCancelar;

	public void criarTela (){
		panelPrincipal = new JPanel();
		panelBotao = new JPanel();
		
		lbNome = new JLabel("Nome ");
		txtNome = new JTextField(30);
		lbData = new JLabel("Data ");
		txtData = new JTextField(10);
		lbCores = new JLabel("Cores ");
		txtCores = new JTextField(30);
		lbPixels = new JLabel("Pixels ");
		txtPixels = new JTextField(30);
		
		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(this);
		btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(this);
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		
		panelPrincipal.add(lbNome);
		panelPrincipal.add(txtNome);
		panelPrincipal.add(lbData);
		panelPrincipal.add(txtData);
		panelPrincipal.add(lbCores);
		panelPrincipal.add(txtCores);
		panelPrincipal.add(lbPixels);
		panelPrincipal.add(txtPixels);
		
		panelPrincipal.setLayout(new GridLayout (8,3));
		
		panelBotao.add(btnCadastrar);
		panelBotao.add(btnLimpar);
		panelBotao.add(btnCancelar);
		
		getContentPane().add(panelPrincipal, BorderLayout.NORTH);
		getContentPane().add(panelBotao, BorderLayout.SOUTH);
		
		pack();
		
		setSize(300, 250);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == btnCadastrar){
			System.out.println("Cadastrar Arquivo");
			Controle ctr = new Controle();
			ctr.salvarJpeg(txtNome.getText(), txtData.getText(), Double.parseDouble(txtCores.getText()), 
					Double.parseDouble(txtPixels.getText()));
			JanelaAdd jan = new JanelaAdd();
			jan.criarTela();
			System.out.println("Cadastrado com Sucesso");
			JanelaJpeg.this.dispose();
		}
		if (e.getSource() == btnCancelar){
			JanelaMenu janMenu = new JanelaMenu();
			janMenu.criarTela01();
			System.out.println("Operacao cancelada");
			JanelaJpeg.this.dispose();
		}
		if (e.getSource() == btnLimpar){
			System.out.println("limpar campos");
			txtNome.setText("");
			txtData.setText("");
			txtCores.setText("");
			txtPixels.setText("");
		}
	}
}
