package Controladora;

import Entidades.Gerente;
import Entidades.GuardaRoupa;
import Entidades.Notebook;
import Entidades.Tv;
import Entidades.Vendedor;


public class Controller {

	public Gerente popularGerente(Gerente gerente){
		
		gerente.setNome("João");
		gerente.setCodAcesso("1234gr");
		gerente.setMatricula("ab1234gr");
		gerente.setQtdFuncionarios(30);
		gerente.setSalario(1500);
		
		return gerente;
	}
	
	public Vendedor popularVendedor(Vendedor vendedor){
		
		vendedor.setNome("Romulo");
		vendedor.setMatricula("ab1234vd");
		vendedor.setQtdVendas(30);
		vendedor.setJornadaTrabalho(8);
		vendedor.setSalario(1000);
		
		return vendedor;
	}
	
	public Tv popularTV(Tv tv){
		
		tv.setMarca("LG");
		tv.setNome("TV de LED");
		tv.setPolegadas(50.0);
		tv.setPreco(3000);
		tv.setTipo("LED");
		
		return tv;
	}
	
	public GuardaRoupa popularGuarda(GuardaRoupa gr){
		gr.setCor("branca");
		gr.setMarca("Moveis");
		gr.setNome("Guarda Roupa");
		gr.setQtdPorta(5);
		gr.setPreco(200);
		
		return gr;
	}
	
	public Notebook popularNotebok(Notebook nt){
		
		nt.setMarca("HP");
		nt.setNome("Notebook G142");
		nt.setPolegadas(14.5);
		nt.setPreco(1000);
		nt.setSistema("Windows");
		
		return nt;
	}
	
	
	
}
