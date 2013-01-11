package src.entidades;

public class Cliente {

	public Integer id;
	public String nome;
	public String telefone;
	public String dataNascimento;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		return "Id: " + id + "\nNome: " + nome + "\nTelefone: " + telefone
				+ "\nData de Nascimento: " + dataNascimento + "\n\n";
	}

}
