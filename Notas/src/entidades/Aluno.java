package entidades;

public class Aluno {
	
	private String nome;
	private Double nota;
	private Integer id;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getNota() {
		return nota;
	}
	public void setNota(Double nota) {
		this.nota = nota;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return ("Nome: "+this.nome+ "\n"+
				"Nota: "+this.nota+"\n\n");
	}
	

}
