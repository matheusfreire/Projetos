package Entidades;

public abstract class Funcionario {

	protected String nome;
	protected double salario;
	protected String matricula;
		
	public Funcionario() {
	
	}
	
	public Funcionario (String nome, double salario, String matricula){
		this.nome = nome;
		this.salario = salario;
		this.matricula = matricula;
	}
	
	abstract double calcularSalario(double salario);

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	@Override
	public String toString() {
		return ("\n"+"Nome: "+this.nome+
				"\n"+"Matricula: "+this.matricula);
	}
	
	
}
