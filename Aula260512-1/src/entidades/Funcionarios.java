package entidades;

abstract class Funcionarios {
	private String nome;
	private double salarioFixo;
	private String matricula;

	abstract double getRecolhimentoImposto();

	/*public String getInfo (){
		return "Nome: " + this.nome + "\nMatricula: " + this.matricula;
	}*/ //Substituimos o getInfo pelo toString () 
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//return super.toString();
		return "Nome: " + this.nome + "\nMatricula: " + this.matricula;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salarioFixo;
	}
	public void setSalario(double salario) {
		this.salarioFixo = salario;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
}
