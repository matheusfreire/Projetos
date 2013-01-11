package janelas;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.AlunoController;

public class JanelaAdicionar extends JFrame {

	private static final long serialVersionUID = 1L;
	
	public JanelaAdicionar(){
		super("ALUNO");
	}
	
	JPanel panelPrincipal;
	JPanel panelBotao;
	
	JLabel lblNome;
	JLabel lblNota;
	
	JTextField tfNome;
	JTextField tfNota;
	
	JButton btnSalvar;
	JButton btnLimpar;
	JButton btnVoltar;
	
	public void janelaAdd(){
		panelPrincipal = new JPanel();
		panelBotao = new JPanel();
		
		lblNome = new JLabel("Nome: ");
		lblNota = new JLabel("Nota: ");
		
		tfNome = new JTextField();
		tfNota = new JTextField();
		
		btnSalvar = new JButton("Salvar");
		btnLimpar = new JButton("Limpar");
		btnVoltar = new JButton("Voltar");
		
		panelPrincipal.add(lblNome);
		panelPrincipal.add(tfNome);
		
		panelPrincipal.add(lblNota);
		panelPrincipal.add(tfNota);
		
		panelPrincipal.setLayout(new GridLayout(2,2));
		
		panelBotao.add(btnSalvar);
		panelBotao.add(btnLimpar);
		panelBotao.add(btnVoltar);
		
		panelBotao.setLayout(new GridLayout(1, 3));
		
		getContentPane().add(panelPrincipal, BorderLayout.NORTH);
		getContentPane().add(panelBotao, BorderLayout.SOUTH);
		
		pack();
		
		setSize(400,110);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		btnSalvar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				AlunoController cont = new AlunoController();
				cont.salvar(tfNome.getText(), Double.parseDouble(tfNota.getText()));
				
				JanelaInicial inicio = new JanelaInicial();
				inicio.telaInicial();
				
				JanelaAdicionar.this.dispose();				
			}
		});
		
		btnVoltar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JanelaInicial inicio = new JanelaInicial();
				inicio.telaInicial();
				
				JanelaAdicionar.this.dispose();
			}
		});
		
		btnLimpar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				tfNome.setText("");
				tfNota.setText("");
			}
		});
	}


}
