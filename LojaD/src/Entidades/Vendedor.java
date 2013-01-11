package Entidades;

public class Vendedor extends Funcionario{

	private int qtdVendas;
	private double jornadaTrabalho;
	
	public Vendedor() {
	}
	
	public Vendedor (String nome, double salario, String matricula, double jornadaTrabalho, int qtdVendas){
		super(nome,salario,matricula);
		this.jornadaTrabalho = jornadaTrabalho;
		this.qtdVendas = qtdVendas;
	}
	
	public double calcularSalario(double salario) {
		salario = salario-(salario*0.1)+(qtdVendas*50);
		return salario;
	}

	public int getQtdVendas() {
		return qtdVendas;
	}

	public void setQtdVendas(int qtdVendas) {
		this.qtdVendas = qtdVendas;
	}

	public double getJornadaTrabalho() {
		return jornadaTrabalho;
	}

	public void setJornadaTrabalho(double jornadaTrabalho) {
		this.jornadaTrabalho = jornadaTrabalho;
	}
	
	public String imprime() {
		return (super.toString()+
				"\n"+"Jornada de Trabalho Diária(horas): "+jornadaTrabalho+
				"\n"+"Quantidade de vendas no mês: "+qtdVendas+
				"\n"+"Salário bruto: "+calcularSalario(salario));
	}

}
