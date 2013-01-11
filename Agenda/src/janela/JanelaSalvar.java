package janela;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.Controle;

public class JanelaSalvar extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;

	public JanelaSalvar(){
		super("Janela 1");
	}
	
	JPanel painel1;
	JPanel painel2;
	
	JButton buttonSalvar;
	JButton buttonSair;
	
	JLabel lbNome;
	JLabel lbEmail;
	JLabel lbTel;
	
	JTextField txtNome;
	JTextField txtEmail;
	JTextField txtTel;
	
	public void salvarPessoa(){
		painel1 = new JPanel();
		painel2 = new JPanel();
		
		lbNome = new JLabel("Nome");
		txtNome = new JTextField(30);
		lbTel = new JLabel("Telefone");
		txtTel = new JTextField(8);
		lbEmail = new JLabel("Email");
		txtEmail = new JTextField(30);
		
		buttonSalvar = new JButton("Salvar");
		buttonSalvar.addActionListener(this);
		
		painel1.add(lbNome);
		painel1.add(txtNome);
		painel1.add(lbTel);
		painel1.add(txtTel);
		painel1.add(lbEmail);
		painel1.add(txtEmail);
		
		painel2.add(buttonSalvar);
		
		painel1.setLayout(new GridLayout(3,2));
		painel2.setLayout(new GridLayout(1,2));
		
		getContentPane().add(painel1,BorderLayout.NORTH);
		getContentPane().add(painel2,BorderLayout.SOUTH);
		
		pack();
		
		setSize(400,200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == buttonSalvar){
			Controle ctr = new Controle();
			ctr.salvarPessoa(txtNome.getText(), Integer.parseInt(txtTel.getText()), txtEmail.getText());
		}
	}

}
