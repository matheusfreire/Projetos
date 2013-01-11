


public class ArquivoWord implements Imprimivel, ArquivoEditavel {
	private String nome;
	private String conteudo;
	
	public ArquivoWord(String nome, String conteudo) {
		// TODO Auto-generated constructor stub
		this.nome = nome;
		this.conteudo = conteudo;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome: " + getNome() + "  Conteúdo: " + getConteudo() + "\n";
	}

	@Override
	public void editarNome(String nome) {
		// TODO Auto-generated method stub
		this.nome = nome;
	}

	@Override
	public void editarConteudo(String conteudo) {
		// TODO Auto-generated method stub
		this.conteudo = conteudo;
	}

	@Override
	public void imprimir() {
		// TODO Auto-generated method stub
		System.out.println(toString());
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}


}
