package janelas;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import DAO.AlunoDAO;

public class JanelaListar extends JFrame {

	private static final long serialVersionUID = 1L;
	
	public JanelaListar(){
		super("Lista");
	}
	
	JPanel panelPrincipal;
	JPanel botao;
	JTable tabela;
	JScrollPane scroll;
	JButton btnVoltar;
	
	public void janelaLista(){
		panelPrincipal = new JPanel();
		botao = new JPanel();
		btnVoltar = new JButton("Voltar");
		tabela = new JTable();
		
		AlunoDAO aluno = new AlunoDAO();
				
		tabela.setModel(new AlunoTableModel(aluno.listar()));
		
		scroll = new JScrollPane(tabela);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		
		panelPrincipal.add(scroll);
		botao.add(btnVoltar);
		
		getContentPane().add(panelPrincipal, BorderLayout.NORTH);
		getContentPane().add(botao, BorderLayout.SOUTH);
		
	
		pack();
		
		setSize(500,505);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);		
		
		btnVoltar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JanelaInicial inicio = new JanelaInicial();
				inicio.telaInicial();
				
				JanelaListar.this.dispose();
			}
		});
		
	}

}
