package util;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CriaBanco {
	
	Connection conn = null;
	
	String linha1 = "CREATE DATABASE IF NOT EXISTS aluno;";
	String linha2 = "Use aluno";
	String linha3 = "CREATE TABLE IF NOT EXISTS `aluno`("+
					"`id` int(2) NOT NULL AUTO_INCREMENT,"+
					"`nome` varchar(30) NOT NULL,"+
					"`nota` double(10,00),"+
					"PRIMARY KEY(`id`));";
	
	public void CriarBanco() {
		try{
		conn = new FabricaConexao().conexaoInicial();
		PreparedStatement stmt1 = conn.prepareStatement(linha1);
		PreparedStatement stmt2 = conn.prepareStatement(linha2);
		PreparedStatement stmt3 = conn.prepareStatement(linha3);
		
		stmt1.execute();
		stmt2.execute();
		stmt3.execute();
		
		stmt1.close();
		stmt2.close();
		stmt2.close();
		
		conn.close();
		}catch(Exception e){
			e.printStackTrace();			
		}
	}
}
