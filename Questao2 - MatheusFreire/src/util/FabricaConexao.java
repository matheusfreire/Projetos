package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class FabricaConexao {

	Connection conexao = null;
	
	public Connection criarConexao(){
		try{
			conexao = DriverManager.getConnection("jdbc:mysql://localhost/tentativa", "root", "root");
			System.out.println("Sucesso");
		}
		catch (Exception e){
			e.printStackTrace();
			System.out.println("Falhou");
		}
		
		return conexao;
	}
	
	
}
