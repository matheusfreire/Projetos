package entidades;

public class Aluno {
	public Double nota;
	public String nome;
	public Integer id;
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getNota() {
		return nota;
	}
	public void setNota(Double nota) {
		this.nota = nota;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Aluno: "+nome+"\nNota: "+nota+"\n\n";
	}
	
	

}
