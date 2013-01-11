package util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CriarBD {
Connection conexao = null;
	
	String l1 = "CREATE DATABASE IF NOT EXISTS agenda;";
	String l2 = "USE agenda;";
	String l3 = "CREATE TABLE IF NOT EXISTS `pessoa`("+
				"`id` int(2) NOT NULL AUTO_INCREMENT,"+
				"`nome` varchar(30) NOT NULL,"+
				"`tel` int(8) NOT NULL,"+
				"`email` varchar(30) NOT NULL;";
	
	public void criarBanco(){
		try{
			conexao = new FabricaConexao().conexaoInicial();
			PreparedStatement stmt1 = conexao.prepareStatement(l1);
			PreparedStatement stmt2 = conexao.prepareStatement(l2);
			PreparedStatement stmt3 = conexao.prepareStatement(l3);

			
			stmt1.execute();
			stmt2.execute();
			stmt3.execute();
			
			stmt1.close();
			stmt2.close();
			stmt3.close();
			
			conexao.close();
		}
		catch (SQLException e){
			e.printStackTrace();
		}
	}

}
