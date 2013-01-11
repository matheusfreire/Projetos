package listaComGenerics;

import javax.swing.JOptionPane;

public class Controller {
	
	public VendaIngressoEx02 popularIngresso (VendaIngressoEx02 ing){
		try {
			ing.setNome(JOptionPane.showInputDialog("Nome: "));
			ing.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Preco:")));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Tipo não valido!!");
		}
		return ing;
	}
}
