package src.janelas;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import src.controller.ClienteController;

public class SalvarCliente extends JFrame {

	private static final long serialVersionUID = 1L;

	public SalvarCliente() {
		super("Adicionar");
	}

	JPanel panelPrincipal;
	JPanel panelBtn;

	JLabel lblNome;
	JLabel lblTelefone;
	JLabel lblData;

	JTextField tfNome;
	JTextField tfTelefone;
	JTextField tfData;

	JButton btnSalvar;
	JButton btnVoltar;

	public void telaSalvar() {
		panelPrincipal = new JPanel();
		panelBtn = new JPanel();

		lblNome = new JLabel("Nome: ");
		tfNome = new JTextField(30);

		lblTelefone = new JLabel("Telefone: ");
		tfTelefone = new JTextField(10);

		lblData = new JLabel("Data de Nascimento: ");
		tfData = new JTextField(10);

		btnSalvar = new JButton("Salvar");
		btnVoltar = new JButton("Voltar");

		btnSalvar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				ClienteController cont = new ClienteController();
				cont.salvarCliente(tfNome.getText(), tfTelefone.getText(),
						tfData.getText());
			}
		});

		btnSalvar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JanelaInicial inicio = new JanelaInicial();
				inicio.telaInicial();
				setVisible(false);
			}
		});

		panelPrincipal.add(lblNome);
		panelPrincipal.add(tfNome);
		panelPrincipal.add(lblTelefone);
		panelPrincipal.add(tfTelefone);
		panelPrincipal.add(lblData);
		panelPrincipal.add(tfData);

		panelPrincipal.setLayout(new GridLayout(4, 3));

		panelBtn.add(btnSalvar);
		panelBtn.add(btnVoltar);

		getContentPane().add(panelPrincipal, BorderLayout.NORTH);
		getContentPane().add(panelBtn, BorderLayout.SOUTH);

		pack();

		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

}
