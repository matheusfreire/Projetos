
public class Main {
	public static void main(String[] args) {
		Impressora impressoraTeste = new Impressora();
		impressoraTeste.ligar();

		for (int i = 1; i < 5; i++) {
			int numeroNota = (i);
			double valorNota = (double) (100*3*i);
			
			NotaFiscal nota = new NotaFiscal(numeroNota, valorNota);
			
			impressoraTeste.imprimir(nota);
			System.out.println("");
			
		}
		
	}
}
