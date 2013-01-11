package br.com.prova.controller;

import br.com.prova.DAO.ArquivoDAO;
import br.com.prova.entidades.Jpeg;
import br.com.prova.entidades.Mpeg;

public class Controle {
	ArquivoDAO arqs = new ArquivoDAO();

	public void salvarJpeg (String nome, String dataCriacao, Double qtdCores, Double qtdPixels){
		Jpeg jp = new Jpeg();
		jp.setNome(nome);
		jp.setDataCriacao(dataCriacao);
		jp.setQtdCores(qtdCores);
		jp.setQtdPixel(qtdPixels);
		jp.setPreco(jp.precoArquivo());
		
		arqs.salvarJpeg(jp);
	}
	
	public void salvarMpeg (String nome, String dataCriacao, Double duracao){
		Mpeg mp = new Mpeg();
		mp.setNome(nome);
		mp.setDataCriacao(dataCriacao);
		mp.setTempoDuracao(duracao);
		mp.setPreco(mp.precoArquivo());

		arqs.salvarMpeg(mp);
	}
}
