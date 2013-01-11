package entidades;

public class Televisores extends Eletronicos {
	private String tipo;
	private double polegadas;
	
	public String toString (){
		String infoGeral;
		infoGeral = super.toString() + "\nTipo: " + getTipo() + "\nPolegadas: " + getPolegadas() + 
				"\nPreço: " + precoFinal() + "\n5x - " + parcelamento5Vezes() + "\n10x - " + parcelamento10vezes();
		return infoGeral;
	}
	@Override
	public double parcelamento5Vezes() {
		// TODO Auto-generated method stub
		double opcaoParcelamento = ((precoFinal() + VendaParcelada.taxaEmissaoCarne)/5);
		return opcaoParcelamento;
	}
	@Override
	public double parcelamento10vezes() {
		// TODO Auto-generated method stub
		double opcaoParcelamento = ((precoFinal() + VendaParcelada.taxaEmissaoCarne) /10);
		return opcaoParcelamento;
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
