import java.util.ArrayList;
import java.util.List;


public class Main2 {
	public static void main(String[] args) {
		VendaIngresso vd1 = new VendaIngresso();
		vd1.setPreco(240);
		VendaIngresso vd2 = new VendaIngresso();
		vd2.setPreco(120);
		
		List vendas = new ArrayList();
		vendas.add(vd1);
		vendas.add(vd2);
		
		System.out.println("Quantidade de elementos cadastrados: " + vendas.size());
		
		for (int i = 0; i < vendas.size(); i++) {
			VendaIngresso vd = (VendaIngresso) vendas.get(i);
			System.out.println(vd.toString());
			
		}
		
		//vendas.remove(1);
		//asSystem.out.println("\nRemovendo 1 elemento da lista...\n");
		
		System.out.println("Quantidade de elementos cadastrados: " + vendas.size());
		for (int i = 0; i < vendas.size(); i++) {
			VendaIngresso vd = (VendaIngresso) vendas.get(i);
			System.out.println(vd.toString());
			
		}
	}

}
