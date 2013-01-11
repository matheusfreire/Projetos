import java.util.ArrayList;
import java.util.List;


public class Main {
	public static void main(String[] args) {
		
	//ArrayList lista = new ArrayList();
	List listaList = new ArrayList();

	listaList.add("Joao");
	listaList.add("JOse");
	
	System.out.println("Quantidade de itens na lista: " + listaList.size() + "\n\n");
	
	for (int i = 0; i < listaList.size(); i++) {
		String nomes = (String) listaList.get(i);
		System.out.println(nomes);
	}
	
	
	}
}
