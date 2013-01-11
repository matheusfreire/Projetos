package Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

import controlle.Controlle;
import entidades.ArquivoJpeg;
import entidades.ArquivoMpeg;
import entidades.Impressora;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Impressora imp = new Impressora();
		Controlle ctr = new Controlle();
		List <ArquivoJpeg> listaJpeg = new ArrayList<ArquivoJpeg>();
		List <ArquivoMpeg> listaMpeg = new ArrayList <ArquivoMpeg>();
		
		int cadastro = 0;
		int arquivo = 0;
		int i;
			
		Object[] opçoes = {"Jpeg", "Mpeg"};
		
		cadastro = adicionarArquivo(imp, ctr, listaJpeg, listaMpeg, cadastro,
				opçoes);
		
		Object [] listaPreco = {"Mais Caro", "Mais Barato"};
		
		impressao(listaJpeg, listaMpeg, cadastro, listaPreco);
		}

	private static void impressao(List<ArquivoJpeg> listaJpeg, List<ArquivoMpeg> listaMpeg, int cadastro, Object[] listaPreco) {
		int i;
		if (cadastro == JOptionPane.NO_OPTION){
			Object [] impressao = {"Lista Decrescente", "Lista de Preço"};
			int imprimir = JOptionPane.showOptionDialog(null,"Tipo de Impressão?", "Impressão", JOptionPane.YES_OPTION, JOptionPane.NO_OPTION, null, impressao, null);
			
			tipoDeImpressao(listaJpeg, listaMpeg, listaPreco, imprimir);
		}
	}

	private static void tipoDeImpressao(List<ArquivoJpeg> listaJpeg,
			List<ArquivoMpeg> listaMpeg, Object[] listaPreco, int imprimir) {
		int i;
		if(imprimir == JOptionPane.NO_OPTION){
			int listagemPreco = JOptionPane.showOptionDialog(null, "Lista de Preço","Impressão", JOptionPane.YES_OPTION, JOptionPane.NO_OPTION, null, listaPreco, null);
			impressaoValores(listaJpeg, listaMpeg, imprimir);
		}
		else if( imprimir == JOptionPane.YES_OPTION){
			Collections.sort(listaJpeg);
			Collections.reverse(listaJpeg);
			Collections.sort(listaMpeg);
			Collections.reverse(listaMpeg);
			
			for(i=0; i<listaJpeg.size();i++){
				JOptionPane.showMessageDialog(null, listaJpeg.get(i).toString());
			}
			for(i=0; i<listaMpeg.size();i++){
				JOptionPane.showMessageDialog(null, listaMpeg.get(i).toString());
			}
			}
	}

	private static void impressaoValores(List<ArquivoJpeg> listaJpeg,
			List<ArquivoMpeg> listaMpeg, int imprimir) {
		switch (imprimir){
			case JOptionPane.YES_OPTION:
				Collections.sort(listaJpeg);
				Collections.max(listaJpeg);
				
				Collections.sort(listaMpeg);
				//Collections.max(listaMpeg);
				JOptionPane.showMessageDialog(null, Collections.max(listaJpeg));
				JOptionPane.showMessageDialog(null, Collections.max(listaMpeg));
				break;
			case JOptionPane.NO_OPTION:
				Collections.sort(listaJpeg);
				Collections.min(listaJpeg);
				
				Collections.sort(listaMpeg);
				Collections.min(listaMpeg);
				JOptionPane.showMessageDialog(null, listaJpeg);
				JOptionPane.showMessageDialog(null, listaMpeg);
				
		}
	}

	private static int adicionarArquivo(Impressora imp, Controlle ctr,	List<ArquivoJpeg> listaJpeg, List<ArquivoMpeg> listaMpeg, int cadastro, Object[] opçoes) {
		int arquivo;
		while(cadastro == JOptionPane.YES_OPTION){
			
			arquivo = JOptionPane.showOptionDialog(null,"Qual tipo de arquivo que você deseja cadastrar?", "Cadastro", JOptionPane.YES_OPTION, JOptionPane.NO_OPTION, null, opçoes, null);
					
			if(arquivo == JOptionPane.YES_OPTION){
				ArquivoJpeg jpeg = new ArquivoJpeg();
				ctr.popularJpeg(jpeg);
				listaJpeg.add(jpeg);
				imp.imprimir(jpeg);
				
			}
			
			else if(arquivo == JOptionPane.NO_OPTION){
				ArquivoMpeg mpeg = new ArquivoMpeg();			
				ctr.popularMpeg(mpeg);			
				
				listaMpeg.add(mpeg);
				
			}
			
		
		 cadastro = JOptionPane.showConfirmDialog(null, "Deseja cadastrar outros arquivos?");
		}
		return cadastro;
	}
}
