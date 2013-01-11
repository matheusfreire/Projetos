package entidades;

abstract class Produtos {
	private String nome;
	private String marca;
	private double preco;
	
	public double precoLiquido (){
		return getPreco() * 1.05;
	}
	
	public String toString (){
		return "nome: " + getNome() + "\nmarca: " + getMarca();
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
		this.preco = preco;
	}
	
}
