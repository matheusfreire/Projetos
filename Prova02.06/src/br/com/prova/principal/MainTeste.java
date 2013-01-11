package br.com.prova.principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.prova.controller.Controle;
import br.com.prova.entidades.Arquivos;
import br.com.prova.entidades.Jpeg;
import br.com.prova.entidades.Mpeg;
import br.com.prova.impressora.Impressora;

public class MainTeste {
	public static void main(String[] args) {
		Controle ctr = new Controle();
		Impressora imp = new Impressora();
		List<Arquivos> arqs = new ArrayList<Arquivos>();

		//addArquivo(ctr, arqs, imp);
	}
	//Chave que fecha o bloco main
	/*
	public static String opcaoOrdenar() {
		return JOptionPane.showInputDialog("-- Opções de listagem -- \n\n"
				+ "[1] - Listar todos por ordem decrescente de custo \n"
				+ "[2] - Mostrar o mais caro\n"
				+ "[3] - Mostrar o mais barato\n");
	}

	public static void ordenar(List<Arquivos> arqs) {
		String ordem = opcaoOrdenar();
		String relatorioFinal = "";

		if (ordem.equalsIgnoreCase("1")) {
			
			Collections.sort(arqs);
			Collections.reverse(arqs);
			
			for (Arquivos arquivos : arqs) {
				relatorioFinal += arquivos.toString();
			}

			JOptionPane.showMessageDialog(null, "-- Relatório Final -- \n\n"
					+ relatorioFinal);
		}
		if (ordem.equalsIgnoreCase("2")) {
			JOptionPane.showMessageDialog(null,
					"Maior preco" + Collections.max(arqs));
		}
		if (ordem.equalsIgnoreCase("3")) {
			JOptionPane.showMessageDialog(null,
					"Menor preco" + Collections.min(arqs));
		}
	}

	/*
	public static void addArquivo(Controle ctr, List<Arquivos> arqs,
			Impressora imp) {
		String tipo;
		String add = "sim";
		while (add.equalsIgnoreCase("sim")) {
			tipo = JOptionPane.showInputDialog("Deseja add um JPEG ou um MPEG?");
			if (tipo.equalsIgnoreCase("jpeg")) {
				Jpeg jpAdd = new Jpeg();
				ctr.popularJpeg(jpAdd);
				arqs.add(jpAdd);
				imp.imprimir(jpAdd);
			}
			if (tipo.equalsIgnoreCase("Mpeg")) {
				Mpeg mp = new Mpeg();
				ctr.popularMpeg(mp);
				arqs.add(mp);
			}
			add = JOptionPane
					.showInputDialog("Deseja add outro arquivo? Sim ou Nao");
			if (add.equalsIgnoreCase("nao")) {
				ordenar(arqs);
			}
		}
	}
	*/
}

