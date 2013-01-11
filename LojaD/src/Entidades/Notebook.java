package Entidades;

public class Notebook extends Produto implements Imposto {

	private double polegadas;
	private String sistema;
	
	public Notebook() {
	}
	
	public Notebook(String sistema, double polegadas, String nome, String marca, double preco) {
		super(nome, marca, preco);
		this.sistema = sistema;
		this.polegadas = polegadas;
		
	}
	
	
	@Override
	public double calcularPreco(double preco) {
		preco = preco+(preco*impostoEletronico);
		return preco;
	}

	public double getPolegadas() {
		return polegadas;
	}

	public void setPolegadas(double polegadas) {
		this.polegadas = polegadas;
	}

	public String getSistema() {
		return sistema;
	}

	public void setSistema(String sistema) {
		this.sistema = sistema;
	}

	public String imprime(){
	
		return (super.toString()+
				"\n"+"Sistema Operacional: "+sistema+
				"\n"+"Polegadas: "+polegadas+
				"\n"+"Preco: "+calcularPreco(this.preco));
	}
	
	
	
	
}
