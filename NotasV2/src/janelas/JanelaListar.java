package janelas;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import entidades.Aluno;
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
	JButton remover;
	
	public void janelaLista(){
		panelPrincipal = new JPanel();
		botao = new JPanel();
		btnVoltar = new JButton("Voltar");
		tabela = new JTable();
		remover= new JButton("Remover");
		
		AlunoDAO aluno = new AlunoDAO();
				
		tabela.setModel(new AlunoTableModel(aluno.listar()));
		
		scroll = new JScrollPane(tabela);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		
		panelPrincipal.add(scroll);
		botao.add(btnVoltar);
		botao.add(remover);
		
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
		
		remover.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int linhaSelecionada = tabela.getSelectedRow();
				if (linhaSelecionada == -1){
					JOptionPane.showMessageDialog(null, "Selecione uma linha");
				}else{
					int idSelecionada = (Integer) tabela.getModel().getValueAt(linhaSelecionada, 0);
					try{
						AlunoDAO dao = new AlunoDAO();
						Aluno aluno = new Aluno();
						aluno.setId(idSelecionada);
						dao.removeAluno(aluno);
					}catch (SQLException e){
						e.printStackTrace();
					}try{
						JanelaInicial inicio = new JanelaInicial();
						inicio.telaInicial();
						
						JanelaListar.this.dispose();			
					}catch (Exception e){
						e.printStackTrace();
					}
				}
				
			}
		});
		
	}

}
