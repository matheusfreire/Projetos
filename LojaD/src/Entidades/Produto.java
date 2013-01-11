package Entidades;

public abstract class Produto {

	protected String nome;
	protected String marca;
	protected double preco;
	static final double imposto = 0.05;
	
	
	public Produto() {
	}
	
	public Produto(String nome, String marca, double preco){
		this.nome = nome;
		this.marca = marca;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco+(preco*imposto);
	}
	
	@Override
	public String toString() {
		return ("\n"+"Nome: "+this.nome+
				"\n"+"Marca: "+this.marca);
	}
	
	
	
}
