package janelas;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

import controlle.Controller;

public class JanelaAluno extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	
	public JanelaAluno() {
		super("Aluno");
	}
	
	
	JPanel jPrincipal;
	JPanel jBotoes;
	
	//Botões
	JButton botCadastrar;
	JButton botLimpar;
	JButton botVoltar;
	
	//Label
	JLabel lbNome;
	JLabel lbNota;
	
	//Txtfield
	JTextField txtNome;
	JTextField txtNota;
	
	
	public void telaAluno(){
		jPrincipal = new JPanel();
		jBotoes = new JPanel();
		
		lbNome = new JLabel("Nome: ");
		lbNota = new JLabel("Nota: ");
		txtNome = new JTextField(30);
		txtNota = new JTextField(4);
		
		jPrincipal.add(lbNome);
		jPrincipal.add(txtNome);
		
		jPrincipal.add(lbNota);
		jPrincipal.add(txtNota);
		
		botCadastrar = new JButton("Cadastrar");
		botCadastrar.addActionListener(this);
		botLimpar = new JButton("Limpar");
		botLimpar.addActionListener(this);
		botVoltar = new JButton("Voltar");
		botVoltar.addActionListener(this);
		
		jPrincipal.setLayout(new GridLayout(2, 2));
			
		jBotoes.add(botCadastrar);
		jBotoes.add(botLimpar);
		jBotoes.add(botVoltar);
		
		
		jBotoes.setLayout(new GridLayout(1,3));
		
		getContentPane().add(jPrincipal,BorderLayout.NORTH);
		getContentPane().add(jBotoes,BorderLayout.SOUTH);
		
		pack();
		
		setSize(400,200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		JanelaInicio jI = new JanelaInicio();
		if(e.getSource() == botCadastrar){
			System.out.println("Cadastro");
			Controller ctr = new Controller();
			ctr.salvarAluno(txtNome.getText(), Double.parseDouble(txtNota.getText()));
			jI.telaInicial();
			JanelaAluno.this.dispose();
		}
		
		if(e.getSource() == botLimpar){
			System.out.println("Limpando");
			txtNome.setText("");
			txtNota.setText("");
		}
		
		if(e.getSource() == botVoltar){
			System.out.println("Saindo");
			
			jI.telaInicial();
			JanelaAluno.this.dispose();
		}
		
	}
	

}
