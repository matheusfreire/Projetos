package Entidades;

public class Gerente extends Funcionario {

	private String codAcesso;
	private int qtdFuncionarios;
	static final double gratificacao = 1000;
	
	public Gerente() {
		// TODO Auto-generated constructor stub
	}
	
	public Gerente (String nome, double salario, String matricula, String codAcesso, int qtdFuncionarios){
		super(nome,salario,matricula);
		this.matricula = matricula;
		this.qtdFuncionarios = qtdFuncionarios;
	}
	
	public double calcularSalario(double salario) {
		salario = salario-(salario*0.15)+(qtdFuncionarios*250)+gratificacao;
		return salario;
	}

	public String getCodAcesso() {
		return codAcesso;
	}

	public void setCodAcesso(String codAcesso) {
		this.codAcesso = codAcesso;
	}

	public int getQtdFuncionarios() {
		return qtdFuncionarios;
	}

	public void setQtdFuncionarios(int qtdFuncionarios) {
		this.qtdFuncionarios = qtdFuncionarios;
	}

	public String imprime(){
		return (super.toString()+
				"\n"+"Código de Acesso ao Estacionamento: "+codAcesso+
				"\n"+"Quantidade de Funcionários gerenciados: "+qtdFuncionarios+
				"\n"+"Salário bruto: "+calcularSalario(salario));
	}
}
