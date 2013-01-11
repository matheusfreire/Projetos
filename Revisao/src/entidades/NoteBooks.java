package entidades;

public class NoteBooks extends Eletronicos {
	private double polegadas;
	private String SistemaOperacional;
	
	public String toString (){
		String infoGeral;
		infoGeral = super.toString() + "\nPolegadas: " + getPolegadas() + "\nSistema Operacional: " + getSistemaOperacional() +
				"\nPreço: " + precoFinal();
		return infoGeral;
	}
	public double getPolegadas() {
		return polegadas;
	}
	public void setPolegadas(double polegadas) {
		this.polegadas = polegadas;
	}
	public String getSistemaOperacional() {
		return SistemaOperacional;
	}
	public void setSistemaOperacional(String sistemaOperacional) {
		SistemaOperacional = sistemaOperacional;
	}
}
