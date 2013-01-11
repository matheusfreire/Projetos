package Main;
import Controladora.Controller;
import Entidades.Gerente;
import Entidades.GuardaRoupa;
import Entidades.Notebook;
import Entidades.Tv;
import Entidades.Vendedor;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Gerente ger = new Gerente();
		Vendedor ven = new Vendedor();
		GuardaRoupa gr = new GuardaRoupa();
		Notebook nt = new Notebook();
		Tv tv = new Tv();
			
		
		Controller ctr = new Controller();
		
		ctr.popularGerente(ger);
		ctr.popularGuarda(gr);
		ctr.popularVendedor(ven);
		ctr.popularTV(tv);
		ctr.popularNotebok(nt);
		
				
		System.out.println(ger.imprime());
		System.out.println(ven.imprime());
		System.out.println(tv.imprime());
		System.out.println(nt.imprime());
		System.out.println(gr.imprime());
		
		
				

	}

}
