
public class Impressora implements Eletronico {
	private boolean ligada = false;
	
	public void imprimir (Imprimivel objImprimivel){
		if (this.ligada) {
			objImprimivel.imprimir();
		}else{
			System.out.println("Erro de Impress�o!");
		}
	}
	
	@Override
	public void ligar() {
		// TODO Auto-generated method stub
		this.ligada = true;
		System.out.println("Impressora LIGADA\n");
	}

	@Override
	public void desligar() {
		// TODO Auto-generated method stub
		this.ligada = false;
		System.out.println("Impressora DESLIGADA");
	}

}
