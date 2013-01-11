package Entidades;

public class Tv extends Produto implements Imposto {
	
	private String tipo;
	private double polegadas;

	public Tv() {
		// TODO Auto-generated constructor stub
	}
	
	public Tv(String tipo, double polegadas, String nome, String marca, double preco) {
		super(nome, marca, preco);
		this.tipo = tipo;
		this.polegadas = polegadas;
		
	}

	@Override
	public double calcularPreco(double preco) {
		preco = preco+(preco*impostoEletronico);
		return preco;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPolegadas() {
		return polegadas;
	}

	public void setPolegadas(double polegadas) {
		this.polegadas = polegadas;
	}
	
	public String imprime(){
		
		
		return (super.toString()+
				"\n"+"Tipo: "+tipo+
				"\n"+"Polegadas:"+polegadas+
				"\n"+ "Preco:"+calcularPreco(preco));
				
	}
	
}
