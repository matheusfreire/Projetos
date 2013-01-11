import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class SocioTableModelTest extends JFrame {
	
	private JPanel			pnlBotoes;
	private JTable  		tblSocios;
	private SocioTableModel model;
	private JButton 		btnAddSocio;
	private JButton 		btnAddSocios;
	
	public SocioTableModelTest() {
		super("Teste com Socio Table Model");
		initialize();
	}
	
	private void initialize() {
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().add(new JScrollPane(getTblSocios()));
		getContentPane().add(getPnlBotoes(), BorderLayout.SOUTH);
	}
	
	private JTable getTblSocios() {
		if (tblSocios == null) {
			tblSocios = new JTable();
			tblSocios.setModel(new SocioTableModel());
		}
		return tblSocios;
	}
	
	private SocioTableModel getModel() {
		if (model == null) {
			model = (SocioTableModel) getTblSocios().getModel();
		}
		return model;
	}
	
	private JButton getBtnAddSocio() {
		if (btnAddSocio == null) {
			btnAddSocio = new JButton("Adicionar Sócio");
			btnAddSocio.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					addSocio();
				}
			});
		}
		return btnAddSocio;
	}
	
	private JButton getBtnAddSocios() {
		if (btnAddSocios == null) {
			btnAddSocios = new JButton("Adicionar Sócios");
			btnAddSocios.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					addSocios();
				}
			});
		}
		return btnAddSocios;
	}
	
	private JPanel getPnlBotoes() {
		if (pnlBotoes == null) {
			pnlBotoes = new JPanel();
			pnlBotoes.add(getBtnAddSocio());
			pnlBotoes.add(getBtnAddSocios());
		}
		return pnlBotoes;
	}
	
	private Socio getSocio() {
		Socio socio = new Socio();
		socio.setNome("Nome do cidadão");
		socio.setTelefone("34567890");
		socio.setDataDeCadastro(Calendar.getInstance());
		socio.setMensalidade(15.95);
		return socio;
	}
	
	private List<Socio> getSocios() {
		List<Socio> socios = new ArrayList<Socio>();
		for (int i = 0; i < 5; i++) {
			socios.add(getSocio());
		}
		return socios;
	}
	
	private void addSocio() {
		getModel().addSocio(getSocio());
	}
	
	private void addSocios() {
		getModel().addListaDeSocios(getSocios());
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new SocioTableModelTest().setVisible(true);
			}
		});
	}
	
}
