package entidades;

public class GuardaRoupas extends Produtos {
	private double qtdPortas;
	private String corPredominante;
	
	public String toString (){
		String infoGeral;
		infoGeral = super.toString() + "\nQuantidade de portas: " + getQtdPortas() + "\nCor Predominante: " + getCorPredominante() + 
				"\nPreço: " + precoLiquido();
		return infoGeral;
	}
	public double getQtdPortas() {
		return qtdPortas;
	}
	public void setQtdPortas(double qtdPortas) {
		this.qtdPortas = qtdPortas;
	}

	public String getCorPredominante() {
		return corPredominante;
	}

	public void setCorPredominante(String corPredominante) {
		this.corPredominante = corPredominante;
	}
}
