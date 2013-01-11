


public class MainArquivo {
	public static void main(String[] args) {
		Impressora impressoraTeste = new Impressora();
		impressoraTeste.ligar();
		
		String nome1 = "Java Basico";
		String cont1 = "String, Array";
 		
		String nome2 = "BD - MySql";
		String cont2 = "Clausula Where";
		
		ArquivoWord doc1 = new ArquivoWord(nome1, cont1);
		ArquivoWord doc2 = new ArquivoWord(nome2, cont2);
		
		impressoraTeste.imprimir(doc1);
		impressoraTeste.imprimir(doc2);
	}
}
