package br.com.prova.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.prova.entidades.Jpeg;
import br.com.prova.entidades.Mpeg;
import br.com.prova.util.FabricaConexao;

public class ArquivoDAO {
	
	public static final String INSERIRJPEG = 
			"insert into jpeg (nome, " +
			"dataCriacao, preco, qtdPixels, " +
			"qtdCores) VALUES (?, ?, ?, ?, ?)";
	public static final String INSERIRMPEG = "insert into mpeg (nome, dataCriacao, preco, duracao) VALUES (?, ?, ?, ?)";
	
	public static final String BUSCARJPEG = "select * from jpeg";
	public static final String BUSCARMPEG = "select * from mpeg";
	
	Connection conn = null;
	private String relatorioFinal = "";
	
	public String getRelatorioFinal() {
		return relatorioFinal;
	}

	public void salvarJpeg (Jpeg jp){
		try {
			conn = new FabricaConexao().criarConexao();
			PreparedStatement pstmt = 
					conn.prepareStatement(INSERIRJPEG);
			pstmt.setString(1, jp.getNome());
			pstmt.setString(2, jp.getDataCriacao());
			pstmt.setDouble(3, jp.precoArquivo());
			pstmt.setDouble(4, jp.getQtdPixel());
			pstmt.setDouble(5, jp.getQtdCores());
			
			pstmt.execute();
			
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void salvarMpeg (Mpeg mp){
		try {
			conn = new FabricaConexao().criarConexao();
			PreparedStatement pst = conn.prepareStatement(INSERIRMPEG);
			pst.setString(1, mp.getNome());
			pst.setString(2, mp.getDataCriacao());
			pst.setDouble(3, mp.precoArquivo());
			pst.setDouble(4, mp.getTempoDuracao());
			
			pst.execute();
			
			pst.close();
			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public void buscarJpeg (){
		List<Jpeg> arqsJpeg = new ArrayList<Jpeg>();
		conn = new FabricaConexao().criarConexao();
		
		try {
			PreparedStatement pst = conn.prepareStatement(BUSCARJPEG);
			ResultSet rs = pst.executeQuery();
			
			while (rs.next()) {
				Jpeg jp = new Jpeg();
				//"nome" - nome da coluna do banco...
				jp.setNome(rs.getString("nome"));
				jp.setDataCriacao(rs.getString("dataCriacao"));
				jp.setPreco(rs.getDouble("preco"));
				jp.setQtdPixel(rs.getDouble("qtdPixels"));
				jp.setQtdCores(rs.getDouble("qtdCores"));
				arqsJpeg.add(jp);
			}
			rs.close();
			pst.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	
		for (Jpeg jpeg : arqsJpeg) {
			relatorioFinal += jpeg.toString();
			System.out.println("JPEG - " + jpeg.toString());
		}
	}
	
	public void buscarMpeg (){
		List<Mpeg> arqsMpeg = new ArrayList<Mpeg>();
		conn = new FabricaConexao().criarConexao();
		
		try {
			PreparedStatement pst = conn.prepareStatement(BUSCARMPEG);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()){
				Mpeg mp = new Mpeg();
				mp.setNome(rs.getString("nome"));
				mp.setDataCriacao(rs.getString("dataCriacao"));
				mp.setPreco(rs.getDouble("preco"));
				mp.setTempoDuracao(rs.getDouble("duracao"));
				arqsMpeg.add(mp);
			}
			rs.close();
			pst.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		for (Mpeg mpeg : arqsMpeg) {
			relatorioFinal += mpeg.toString();
			System.out.println("MPEG - " + mpeg.toString());
		}
	}
}
