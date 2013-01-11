package src.janelas;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import src.entidadesDAO.ClienteDAO;

public class ListaCliente extends JFrame {

	private static final long serialVersionUID = 1L;

	JPanel panelPrincipal;
	JPanel panelBotao;

	JTextArea panelTexto;

	JButton btnVoltar;

	JScrollPane scroll;

	public void telaListar() {

		panelPrincipal = new JPanel();
		panelBotao = new JPanel();

		btnVoltar = new JButton("Voltar");

		btnVoltar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				JanelaInicial inicio = new JanelaInicial();
				inicio.telaInicial();
				setVisible(false);
			}
		});

		ClienteDAO cliente = new ClienteDAO();

		panelTexto = new JTextArea(cliente.listar(), 20, 20);
		panelTexto.setEditable(false);

		scroll = new JScrollPane(panelTexto);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

		panelPrincipal.add(scroll);
		panelBotao.add(btnVoltar);

		getContentPane().add(panelPrincipal, BorderLayout.CENTER);
		getContentPane().add(panelBotao, BorderLayout.SOUTH);

		pack();

		setSize(300, 400);
		setLocationRelativeTo(null);
		setVisible(true);

	}

}
