
public class NotaFiscal implements Imprimivel {
	private int numero;
	private double valor;
	
	public NotaFiscal(int numero, double valor) {
		// TODO Auto-generated constructor stub
		this.numero = numero;
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Número da nota: " + getNumero() + "   Valor : " + getValor();
	}
	@Override
	public void imprimir() {
		// TODO Auto-generated method stub
		System.out.println(toString());
	}

	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
}
