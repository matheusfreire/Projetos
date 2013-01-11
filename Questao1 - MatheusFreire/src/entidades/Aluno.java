package entidades;

public class Aluno implements Comparable<Aluno>{
	
	private String nome;
	private Double nota1;
	private Double nota2;
	private Double media;
	private String tipoOrdenacao;
		
	public String getTipoOrdenacao() {
		return tipoOrdenacao;
	}
	public void setTipoOrdenacao(String tipoOrdenacao) {
		this.tipoOrdenacao = tipoOrdenacao;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Double getNota1() {
		return nota1;
	}
	public void setNota1(Double nota1) {
		this.nota1 = nota1;
	}
	
	public Double getNota2() {
		return nota2;
	}
	public void setNota2(Double nota2) {
		this.nota2 = nota2;
	}
	
	public Double getMedia() {
		return media;
	}
	public void setMedia(Double media) {
		this.media = media;
	}
	
	public Double calcularMedia(){
		Double mediaAluno;
			mediaAluno = (nota1+nota2)/2;
		return mediaAluno;
	}
	
	@Override
	public String toString() {
		return ("\n\n"+"Nome: " +getNome()+ "\n" +
				"Nota 1: " +getNota1()+ "\n"+
				"Nota 2: "+getNota2()+ "\n" +
				"Média : "+getMedia());
	}

	
	@Override
	public int compareTo(Aluno aluno) {
		int comp = 0;
		if(tipoOrdenacao.equalsIgnoreCase("Nome"))
			comp= this.nome.compareTo(aluno.getNome());
		
		else if(tipoOrdenacao.equalsIgnoreCase("Media"))
			comp = this.media.compareTo(aluno.media);
		
		return comp;
	}

	
}
