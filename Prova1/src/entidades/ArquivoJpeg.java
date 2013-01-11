package entidades;

public class ArquivoJpeg extends Arquivos implements Comparable<ArquivoJpeg>{

	private String qtdCores;
	private String qtdePixel;
	
	@Override
	
	public Double calcularPreco() {
		Integer cores = Integer.parseInt(qtdCores);
		Double pixels = Double.parseDouble(qtdePixel);
		
		if(pixels % 10 == 0 ){
			preco = pixels*3.50 + cores*0.2 + taxaTransferencia;
		}
		
		else if(pixels % 10 != 0){
			double pixelExcedido;
			pixelExcedido = pixels - ((pixels/10)*10);
			preco = pixels*3.50 + cores*0.2 + pixelExcedido*1 + taxaTransferencia;
		}
		
		return preco;
	}

	
	public String getQtdCores() {
		return qtdCores;
	}

	public void setQtdCores(String qtdCores) {
		this.qtdCores = qtdCores;
	}

	public String getQtdePixel() {
		return qtdePixel;
	}

	public void setQtdePixel(String qtdePixel) {
		this.qtdePixel = qtdePixel;
	}



	@Override
	public String toString() {
		return 	("\n"+ "Nome:" +getNome()+
				"\n"+ "Data de Criacao: "+getDataCriacao()+
				"\n"+ "Quantidade de Cores: "+ getQtdCores()+
				"\n"+ "Quantidade de Pixels: "+getQtdePixel()+
				"\n"+ "Preço:" +getPreco());
	}


	@Override
	public int compareTo(ArquivoJpeg jp) {
		return this.preco.compareTo(jp.preco);
	}


	public void imprimir() {
		System.out.println(toString());
		
	}
	
	
	

}
