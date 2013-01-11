package src.janelas;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JanelaInicial extends JFrame {

	private static final long serialVersionUID = 1L;

	public JanelaInicial() {
		super("Inicio");
	}

	JPanel panelPrincipal;
	JButton btnAdicionar;
	JButton btnListar;

	public void telaInicial() {
		panelPrincipal = new JPanel();

		btnAdicionar = new JButton("Adicionar");

		btnAdicionar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				SalvarCliente salve = new SalvarCliente();
				salve.telaSalvar();
				setVisible(false);
			}
		});

		btnListar = new JButton("Lista");

		btnListar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				ListaCliente lista = new ListaCliente();
				lista.telaListar();
				setVisible(false);
			}
		});

		panelPrincipal.add(btnAdicionar);
		panelPrincipal.add(btnListar);

		panelPrincipal.setLayout(new GridLayout(2, 1));

		getContentPane().add(panelPrincipal);

		pack();

		setSize(300, 200);
		setLocationRelativeTo(null);
		setVisible(true);

	}

}
