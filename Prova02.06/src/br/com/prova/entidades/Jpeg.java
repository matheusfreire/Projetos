package br.com.prova.entidades;


public class Jpeg extends Arquivos implements Transferiveis, Imprimiveis {
	private Double qtdCores;
	private Double qtdPixel;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\nQuantidade de Cores: " + getQtdCores() + "\nQuantidade do Pixel: " 
				+ getQtdPixel() + "\nPreço Arquivo: R$" + precoArquivo() + "\nPreço Transferência: R$" + precoTransferencia()+ "\n";
	}
	
	@Override
	public double precoTransferencia() {
		// TODO Auto-generated method stub
		return precoArquivo() + taxa;
	}

	@Override
	public double precoArquivo() {
		// TODO Auto-generated method stub
		Double precoArq;
		if (qtdPixel >= 10) {
			precoArq = (((qtdPixel - 10) * 1) + (qtdCores * 0.2) + 3.50);
		}else{
			precoArq = 3.5 + (qtdCores * 0.2);
		}
		return precoArq;
	}

	/*
	@Override
	public void imprimir() {
		// TODO Auto-generated method stub
		System.out.println(toString());
	}
	*/

	public Double getQtdCores() {
		return qtdCores;
	}
	public void setQtdCores(Double qtdCores) {
		this.qtdCores = qtdCores;
	}
	public Double getQtdPixel() {
		return qtdPixel;
	}
	public void setQtdPixel(Double qtdPixel) {
		this.qtdPixel = qtdPixel;
	}

}
