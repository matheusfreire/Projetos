package br.com.prova.entidades;

public class Mpeg extends Arquivos implements Transferiveis{
	private Double tempoDuracao;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\nTempo de Dura��o: " + getTempoDuracao() + 
				"\nPre�o do Arquivo: R$" + precoArquivo() + "\nPre�o de Transfer�ncia: R$ " + precoTransferencia() + "\n";
	}
	
	@Override
	public double precoArquivo() {
		// TODO Auto-generated method stub
		Double precoArq;
		if (tempoDuracao / 20 > 1) {
			precoArq = 2.50 + ((tempoDuracao - 20)*0.10);
		}else{
			precoArq = 2.50;
		}
		return precoArq;
	}

	@Override
	public double precoTransferencia() {
		// TODO Auto-generated method stub
		return precoArquivo() + taxa;
	}
	
	public Double getTempoDuracao() {
		return tempoDuracao;
	}
	
	public void setTempoDuracao(Double tempoDuracao) {
		this.tempoDuracao = tempoDuracao;
	}
}
