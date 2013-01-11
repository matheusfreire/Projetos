package bancoDados;

import java.sql.Connection;
import java.sql.DriverManager;


import entidades.Aluno;

public class FabricaConexao {
	
	Connection conexao = null;
		
	public Connection conexaoInicial(){
		try{
			conexao = DriverManager.getConnection("jdbc:mysql://localhost", "root", "root");
			System.out.println("Conectado");
		}
		catch (Exception e){
			System.out.println("Falhou");
			e.printStackTrace();
		}
		
		return conexao;
	}
	
	public Connection conexaoBD(){
		try{
			conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/alunonota", "root", "root");
			System.out.println("Conectado ao BD do projeto");
		}
		catch (Exception e){
			System.out.println("Falhou no BD do projeto");
			e.printStackTrace();
		}
		
		return conexao;
	}

}
