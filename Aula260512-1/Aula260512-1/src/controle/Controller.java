package controle;

import entidades.Gerentes;
import entidades.GuardaRoupas;
import entidades.NoteBooks;
import entidades.Televisores;
import entidades.Vendedores;

public class Controller {
	
	public Vendedores popularVendedor (Vendedores vd){
		vd.setNome("Jao");
		vd.setSalario(1000);
		vd.setMatricula("123");
		vd.setCargaHoraria(8);
		vd.setQtdVendas(5);
		vd.setSenha(321);
		return vd;
	}
	
	public Gerentes popularGerentes (Gerentes ger){
		ger.setNome("Boss");
		ger.setSalario(ger.getSalario());
		ger.setMatricula("777");
		ger.setAcessoEstacionamento("JHK 0878");
		ger.setQtdFuncGerenciados(10);
		ger.setGratificacao(2000);
		ger.setSalario(1000);
		return ger;
	}
	
	public GuardaRoupas popularGuardaRoupas (GuardaRoupas gr){
		gr.setNome("Guarda- Roupa Genova");
		gr.setCorPredominante("Café");
		gr.setMarca("Atlantic");
		gr.setQtdPortas(6);
		gr.setPreco(600);
		return gr;
	}
	
	public Televisores popularTelevisores (Televisores tv){
		tv.setNome("FullHD-TV");
		tv.setMarca("SONY");
		tv.setPolegadas(60);
		tv.setTipo("LED");
		tv.setPreco(5000);
		return tv;
	}
	
	public NoteBooks popularNotebooks (NoteBooks note){
		note.setNome("UltraMasterBOOK");
		note.setMarca("Apple");
		note.setPolegadas(14);
		note.setPreco(2000);
		note.setSistemaOperacional("OS X Lion");
		return note;
	}
	
}
