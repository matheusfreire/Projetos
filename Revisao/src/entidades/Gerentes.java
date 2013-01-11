package entidades;

public class Gerentes extends Funcionarios {
	private String AcessoEstacionamento;
	private double QtdFuncGerenciados;
	private double gratificacao;
	

	public double salarioBruto (){
		return (getSalario() + (this.QtdFuncGerenciados * 250) + getGratificacao());
	}
	
	public double salarioLiquido (){
		return salarioBruto() - getRecolhimentoImposto() ;
	}
	

	
	/*public String InfoGerais (){
		//String infoBasicas = super.getInfo();
		String infoBasicas = super.toString();
		String infoGerais = infoBasicas + "\nGratificacao: " + getGratificacao()+ "\nQtd Funcionarios Gerenciados: " + getQtdFuncGerenciados() +	
				"\nSalário: " + salarioLiquido() + "\nAcesso ao Estacionamento: " + getAcessoEstacionamento();
		return infoGerais;
	}*/
	
	public String toString (){
		String infoGeral = super.toString() + "\nGratificacao: " + getGratificacao()+ "\nQtd Funcionarios Gerenciados: " + getQtdFuncGerenciados() +	
				"\nSalário: " + salarioLiquido() + "\nAcesso ao Estacionamento: " + getAcessoEstacionamento();
		return infoGeral;
	}
	
	public String getAcessoEstacionamento() {
		return AcessoEstacionamento;
	}
	public void setAcessoEstacionamento(String acessoEstacionamento) {
		AcessoEstacionamento = acessoEstacionamento;
	}
	public double getQtdFuncGerenciados() {
		return QtdFuncGerenciados;
	}
	public void setQtdFuncGerenciados(double qtdFuncGerenciados) {
		QtdFuncGerenciados = qtdFuncGerenciados;
	}
	public double getGratificacao() {
		return gratificacao;
	}
	public void setGratificacao(double gratificacao) {
		this.gratificacao = gratificacao;
	}

	@Override
	double getRecolhimentoImposto() {
		return salarioBruto() * 0.15;

	}

}
