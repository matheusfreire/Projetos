package entidades;

public class Televisores extends Eletronicos {
	private String tipo;
	private double polegadas;
	
	public String toString (){
		String infoGeral;
		infoGeral = super.toString() + "\nTipo: " + getTipo() + "\nPolegadas: " + getPolegadas() + 
				"\nPreço: " + precoFinal();
		return infoGeral;
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

}
