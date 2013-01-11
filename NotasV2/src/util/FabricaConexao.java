package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class FabricaConexao {
	
	Connection conn = null;
	
	public Connection conexaoInicial(){
		try{
			conn = DriverManager.getConnection("jdbc:mysql://localhost", "root", "root");
			System.out.println("Conexao bem sucedida!");
			
		}catch(Exception e){
			System.out.println("Falha na conexão!");
			e.printStackTrace();
		}
		return conn;		
	}
	
	public Connection criaConexao(){
		try{
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/aluno", "root", "root");
			System.out.println("Conexao bem sucedida!");
			
		}catch(Exception e){
			System.out.println("Falha na conexão!");
			e.printStackTrace();
		}
		return conn;		
	}
	
	
}
