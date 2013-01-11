package br.com.prova.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class FabricaConexao {

	Connection conn = null;
	
	public Connection criarConexao (){
		try {
			conn = DriverManager.getConnection("" +
					"jdbc:mysql://localhost:3306/etb2012",
					"root", "root");
			System.out.println("sucesso");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return conn;
	}
}
