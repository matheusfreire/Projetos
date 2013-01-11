import java.util.Calendar;


public class Socio {

	private String		nome;
	private String		telefone;
	private Calendar	dataDeCadastro;
	private double		mensalidade;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public Calendar getDataDeCadastro() {
		return dataDeCadastro;
	}
	public void setDataDeCadastro(Calendar dataDeCadastro) {
		this.dataDeCadastro = dataDeCadastro;
	}
	
	public double getMensalidade() {
		return mensalidade;
	}
	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
	}

}
