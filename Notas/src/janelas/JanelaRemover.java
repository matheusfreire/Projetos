package janelas;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controlle.Controller;

import dao.AlunoDAO;

public class JanelaRemover extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;

	JPanel p1;
	JPanel p2;
	
	JButton remover;
	JButton voltar;
	
	JLabel nome;
	JTextField txtNome;
	
	public void removerAlunoPorNome(){
		p1 = new JPanel();
		p2 = new JPanel();
		
		remover = new JButton("Remover");
		remover.addActionListener(this);
		voltar = new JButton("Voltar");
		voltar.addActionListener(this);
		
		nome = new JLabel("Nome: ");
		txtNome = new JTextField(30);
		
		
		p1.setLayout(new GridLayout(2, 2));
		p2.setLayout(new GridLayout(1,2));
		
		p1.add(nome);
		p1.add(txtNome);
		
		p2.add(remover);
		p2.add(voltar);
		
		getContentPane().add(p1,BorderLayout.NORTH);
		getContentPane().add(p2,BorderLayout.SOUTH);
		
		pack();
		
		setSize(200,100);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== voltar){
			JanelaInicio p = new JanelaInicio();
			p.telaInicial();
			JanelaRemover.this.dispose();
		}
		else if(e.getSource() == remover){
			System.out.println("Removendo");
			AlunoDAO dao = new AlunoDAO();
			Controller ctr = new Controller();
			ctr.removerAluno(txtNome.getText());
			JanelaInicio jI = new JanelaInicio();
			jI.telaInicial();
			JanelaRemover.this.dispose();
		}
	}

}
