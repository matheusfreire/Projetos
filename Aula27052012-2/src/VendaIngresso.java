
public class VendaIngresso {
	private double preco;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Preço do ingresso: " + getPreco();
	}
	
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
}
