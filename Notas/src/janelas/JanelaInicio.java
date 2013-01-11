package janelas;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class JanelaInicio extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;

	public JanelaInicio() {
		super("Janela Inicial");
	}
	
	JPanel inicio;
	JPanel botoes;
	
	JButton adicionar;
	JButton listar;
	JButton remover;
	
	public void telaInicial(){
		
		inicio = new JPanel();
		botoes = new JPanel();
				
		adicionar = new JButton("Adicionar");
		listar = new JButton("Listar");
		remover = new JButton("Remover Aluno");
		
		adicionar.addActionListener(this);
		listar.addActionListener(this);
		remover.addActionListener(this);
		
		inicio.add(adicionar);
		botoes.add(listar);
		botoes.add(remover);
		
		getContentPane().add(inicio, BorderLayout.NORTH);
		getContentPane().add(botoes, BorderLayout.SOUTH);
		
		pack();
		
		setSize(300, 110);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent botoes) {
		
		if (botoes.getSource() == adicionar) {
			System.out.println("Adicionar Novo Aluno");
			JanelaAluno a1 = new JanelaAluno();
			a1.telaAluno();
			JanelaInicio.this.dispose();
		} else if(botoes.getSource() == listar){
			System.out.println("Listando");
			JanelaListar j1 = new JanelaListar();
			j1.listAluno();
			JanelaInicio.this.dispose();
		}
		else if(botoes.getSource() == remover){
			System.out.println("Removendo");
			JanelaRemover jR = new JanelaRemover();
			jR.removerAlunoPorNome();
			JanelaInicio.this.dispose();
		}
		
		
	}

}
