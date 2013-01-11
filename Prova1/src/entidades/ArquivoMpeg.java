package entidades;

public class ArquivoMpeg extends Arquivos implements Comparable<ArquivoMpeg>{

	private String tempoDuracao;
	
	public ArquivoMpeg() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double calcularPreco() {
		
		Double duracao = Double.parseDouble(tempoDuracao);
		
		if(duracao % 20 == 0){
			preco = duracao*2.50+taxaTransferencia;
		}
		else if(duracao % 20 != 0){
			Double tempoMais = duracao-20;
			preco = duracao*2.50 + tempoMais*0.1+taxaTransferencia;
		}
			
		return preco;
	}


	public String getTempoDuracao() {
		return tempoDuracao;
	}

	public void setTempoDuracao(String tempoDuracao) {
		this.tempoDuracao = tempoDuracao;
	}

	@Override
	public String toString() {
		return ("\n"+ "Nome:" +getNome()+
				"\n"+ "Data de Criacao: "+getDataCriacao()+
				"\n"+ "Tempo de Duracao: "+ getTempoDuracao()+
				"\n"+"Preço:"+getPreco());
	}

	@Override
	public int compareTo(ArquivoMpeg mp) {
		return this.preco.compareTo(preco);
	}


}
