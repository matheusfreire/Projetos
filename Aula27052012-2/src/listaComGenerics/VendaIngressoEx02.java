package listaComGenerics;

public class VendaIngressoEx02 implements Comparable<VendaIngressoEx02> {
	private Double preco;
	private String nome;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome: " + getNome() + "\nPreço do ingresso: " + getPreco() + "\n\n";
	}
	@Override
	public int compareTo(VendaIngressoEx02 ingresso) {
		// TODO Auto-generated method stub
		//Aqui usamos uma variável INT para receber o retorno do método compareTo da classe String, que pode ser:
		//1 - se for maior, -1 se for melhor e 0 se forem iguais. Sendo assim podemos fazer a nossa condição (if's) 
		// e passar uma reposta pro nosso Sort, da classe Collections que estamos usando...
		
		  int comp = this.nome.compareTo(ingresso.nome);
		if(comp < 0) {  
		  return -1;  
		} else if(comp > 0) {  
		  return 1;  
		} 
		return 0;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public double getPreco() {
		return preco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
