package entidades;

abstract class Arquivos {
	
	private String nome;
	private String dataCriacao;
	protected Double preco = 0.0 ;
	static final Double taxaTransferencia = 3.00;
	
	abstract Double calcularPreco();

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
