package controlle;

import javax.swing.JOptionPane;

import entidades.ArquivoJpeg;
import entidades.ArquivoMpeg;

public class Controlle {
	
	public ArquivoJpeg popularJpeg(ArquivoJpeg jp){
		jp.setNome(JOptionPane.showInputDialog("Nome do arquivo: "));
		jp.setDataCriacao(JOptionPane.showInputDialog("Data de cria��o do arquivo: "));
		jp.setQtdCores(JOptionPane.showInputDialog("Quantidade de cores do arquivo: "));
		jp.setQtdePixel(JOptionPane.showInputDialog("Quantidade de pixel do arquivo: "));
		jp.calcularPreco();
		return jp;
	}
	
	public ArquivoMpeg popularMpeg(ArquivoMpeg mp){
		mp.setNome(JOptionPane.showInputDialog("Nome do video: "));
		mp.setDataCriacao(JOptionPane.showInputDialog("Data de cria��o do video: "));
		mp.setTempoDuracao((JOptionPane.showInputDialog("Tempo de Dura��o do video: ")));
		mp.calcularPreco();		
		return mp;
	}

}
