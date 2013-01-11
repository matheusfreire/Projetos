package Entidades;

public interface Imposto {

	double impostoEletronico = 0.1;
	public abstract double calcularPreco(double preco);
}
