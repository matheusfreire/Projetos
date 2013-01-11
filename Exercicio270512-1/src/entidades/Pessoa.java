package entidades;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa>{

	private String nome;
	private String cpf;
	private String tel;
	
	//Get and Set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String string) {
		this.tel = string;
	}

	@Override
	public String toString() {
	
		String infoGeral ="\n"+ 
				"Nome:" +this.nome+"\n"+
				"CPF:" +this.cpf+ "\n"+
				"Tel: "+this.tel;
		
		return infoGeral;

	}

	@Override
	public int compareTo(Pessoa p) {
		int comp = this.nome.compareTo(p.nome);
		if(comp<0){
			return -1;
		}
		else if(comp>0){
			return 1;
		}
		else
			return 0;
	}

	
}
