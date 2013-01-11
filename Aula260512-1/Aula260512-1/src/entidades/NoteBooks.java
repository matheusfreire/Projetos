package entidades;

public class NoteBooks extends Eletronicos {
	private double polegadas;
	private String SistemaOperacional;
	
	public String toString (){
		String infoGeral;
		infoGeral = super.toString() + "\nPolegadas: " + getPolegadas() + "\nSistema Operacional: " + getSistemaOperacional() +
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
