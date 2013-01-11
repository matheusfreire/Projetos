package janelas;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JanelaInicial extends JFrame {

	private static final long serialVersionUID = 1L;

	public JanelaInicial(){
		super("Inicio");
	}
	
	JPanel panel1;
	JPanel panel2;
	
	JButton btnCadastrar;
	JButton btnListar;
	
	public void telaInicial(){
		panel1 = new JPanel();
		panel2 = new JPanel();
		btnCadastrar = new JButton("Cadastrar");
		btnListar = new JButton("Listar");
		
		
		panel1.add(btnCadastrar);
		panel2.add(btnListar);
		
		
		getContentPane().add(panel1, BorderLayout.NORTH);
		getContentPane().add(panel2, BorderLayout.SOUTH);
	
		pack();
		
		setSize(200, 110);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		btnCadastrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JanelaAdicionar add = new JanelaAdicionar();
				add.janelaAdd();
				
				JanelaInicial.this.dispose();
				
			}
		});
		
		btnListar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JanelaListar lista = new JanelaListar();
				lista.janelaLista();
				
				JanelaInicial.this.dispose();				
			}
		});
		
	
	}	
	
}
