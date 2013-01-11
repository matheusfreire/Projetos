package janelas;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;


import dao.AlunoDAO;

public class JanelaListar extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;

	JPanel  principal;
	JPanel 	soBotao;
	JButton voltar;
	JTable table;
	JScrollPane rolagem;
	
	public void listAluno(){
		
		principal = new JPanel();
		soBotao = new JPanel();
		table = new JTable();
		
		voltar = new JButton("Voltar");
				
		voltar.addActionListener(this);
		AlunoDAO dao = new AlunoDAO();
	
		table.setModel(new TabelaAluno(dao.listarAluno()));
		
		rolagem = new JScrollPane(table);
		rolagem.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
				
		principal.add(rolagem);
		soBotao.add(voltar);
		
		getContentPane().add(principal, BorderLayout.CENTER);
		getContentPane().add(soBotao, BorderLayout.SOUTH);
		
		pack();
			
		setSize(500, 300);
		setLocationRelativeTo(null);
		setVisible(true);
		}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == voltar){
				JanelaInicio p = new JanelaInicio();
				p.telaInicial();
				JanelaListar.this.dispose();
	
		}
	}
	
}
