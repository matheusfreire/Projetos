package entidades;

public class Vendedores extends Funcionarios{
	private double cargaHoraria;
	private double qtdVendas;
	private int senha = 123;

	public double salarioLiquido() {
		return salarioBruto() - getRecolhimentoImposto();
	}
	
	public double salarioBruto (){
		return (this.getSalario() + (getQtdVendas() * 50));
	}
	
	public String toString (){
		String infoGerais;
		infoGerais = super.toString() + "\nQtd Vendas: " + getQtdVendas() + "\nSalário: " + salarioLiquido() +
				"\nCarga Horária Diária: " + getCargaHoraria() + "\n Acesso: ";
		return infoGerais;
	}
	@Override
	double getRecolhimentoImposto() {
		// TODO Auto-generated method stub
		return salarioBruto() * 0.10;
	}
	
	public double getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(double cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public double getQtdVendas() {
		return qtdVendas;
	}
	public void setQtdVendas(double qtdVendas) {
		this.qtdVendas = qtdVendas;
	}

	public int getSenha() {
		return senha;
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}

}
