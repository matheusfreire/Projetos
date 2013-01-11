package listaComGenerics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

public class Main3 {
	public static void main(String[] args) {
		Controller ctr = new Controller();
		String verif = "sim";
		String RelatorioGeral = "";

		//Repare no uso de um parâmetro ao lado de List e ArrayList: ele 
		//indica que nossa lista foi criada para
		//trabalhar exclusivamente com objetos do tipo VendaIngressoEx02.		
		List<VendaIngressoEx02> vendas = new ArrayList<VendaIngressoEx02>();
		
		while (verif.equalsIgnoreCase("sim")) {
			VendaIngressoEx02 ingresso = new VendaIngressoEx02();
			ctr.popularIngresso(ingresso);
			vendas.add(ingresso);
			verif = JOptionPane.showInputDialog("Deseja add outro ingresso? \n Sim ou Não?" );
		}
		
		Collections.sort(vendas);
		for (int i = 0; i < vendas.size(); i++) {
			VendaIngressoEx02 vds = vendas.get(i);
			RelatorioGeral += vds.toString();
			//System.out.println(vds.toString());
		}
		
		JOptionPane.showMessageDialog(null, "Relatório Geral\n\n"+ RelatorioGeral);
		
	
	//System.out.println("ELementos " + vendas.toString());
	
	//Ordena de forma crescente
	//Collections.sort(vendas);
	
	//Ordena de forma inversa a inserção de dados
	//Collections.reverse(vendas);
	
	//System.out.println("Maior Preço: " + Collections.max(vendas));
	//System.out.println("Menor Preço: " + Collections.min(vendas));

	//Traz os dados de forma aleatoria
	//Collections.shuffle(vendas);
	
	//Imprime e numeração do nosso array
	//System.out.println( Collections.enumeration(vendas));
	
	//Não aceita outro tipo, a não ser VendaIngresso...
	//vendas.add("QualquerOutraCoisa");

	}
}

/* Maneira deselegante de ser feito...
	VendaIngressoEx02 vd1 = new VendaIngressoEx02();
	vd1.setPreco(240);
	vd1.setNome("cvenda");
	VendaIngressoEx02 vd2 = new VendaIngressoEx02();
	vd2.setPreco(120);
	vd2.setNome("dvenda");
	VendaIngressoEx02 vd3 = new VendaIngressoEx02();
	vd3.setPreco(1200);
	vd3.setNome("bvenda");
	VendaIngressoEx02 vd4 = new VendaIngressoEx02();
	vd4.setPreco(2400);
	vd4.setNome("avenda");
	
	Controller ctr = new Controller();
	vendas.add(vd1);
	vendas.add(vd2);
	vendas.add(vd3);
	vendas.add(vd4);
 */