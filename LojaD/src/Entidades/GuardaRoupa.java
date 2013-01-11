package Entidades;

public class GuardaRoupa extends Produto{
	
	private int qtdPorta;
	private String cor;
	
	public GuardaRoupa(){
		
	}
	
	
	public GuardaRoupa(int qtdPorta, String cor, String nome, String marca, double preco){
		super(nome,marca,preco);
		this.qtdPorta = qtdPorta;
		this.cor = cor;
	}


	public int getQtdPorta() {
		return qtdPorta;
	}


	public void setQtdPorta(int qtdPorta) {
		this.qtdPorta = qtdPorta;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String imprime(){
		
		return (super.toString()+
				"\n"+"Quantidade de Porta: "+this.qtdPorta+
				"\n"+"Cor: "+ this.preco);

	}
	
	

}
