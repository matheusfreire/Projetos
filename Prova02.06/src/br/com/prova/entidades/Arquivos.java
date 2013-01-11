package br.com.prova.entidades;

public abstract class Arquivos implements Comparable<Arquivos>  {
	private String nome;
	private String dataCriacao;
	private Double preco;

	public abstract double precoArquivo();
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nNome: "+getNome() + "\nData de Criação " + getDataCriacao();
	}
	
	
	@Override
	public int compareTo(Arquivos arqvs) {
		// TODO Auto-generated method stub
		return this.preco.compareTo(arqvs.preco);
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(String dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
}
