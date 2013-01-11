package main;

import controle.Controller;
import entidades.Gerentes;
import entidades.GuardaRoupas;
import entidades.NoteBooks;
import entidades.Televisores;
import entidades.Vendedores;



public class Main {
	public static void main(String[] args) {
		Vendedores vde = new Vendedores();
		Gerentes ger = new Gerentes();
		
		GuardaRoupas gr = new GuardaRoupas();
		NoteBooks nb = new NoteBooks();
		Televisores tv = new Televisores();
		
		Controller ctr = new Controller();
		ctr.popularVendedor(vde);
		ctr.popularGerentes(ger);
		ctr.popularGuardaRoupas(gr);
		ctr.popularNotebooks(nb);
		ctr.popularTelevisores(tv);
		
		System.out.println("----- RELATÓRIO GERAL -----");
		System.out.println("");
		System.out.println(vde.toString());
		System.out.println("");
		System.out.println(ger.toString());
		
		System.out.println("");
		System.out.println("");
		System.out.println(" === PRODUTOS ===");
		System.out.println("");
		System.out.println(tv.toString());
		System.out.println("");
		System.out.println(nb.toString());
		System.out.println("");
		System.out.println(gr.toString());
		System.out.println("");
		
	}
}
