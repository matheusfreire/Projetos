package bancoDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CriarBd {

	Connection conexao = null;
	
	String l1 = "CREATE DATABASE IF NOT EXISTS alunonota;";
	String l2 = "USE alunonota;";
	String l3 = "CREATE TABLE IF NOT EXISTS `aluno`("+
				"`id` int(2) NOT NULL AUTO_INCREMENT,"+
				"`nome` varchar(30) NOT NULL,"+
				"`nota` double(10,00),"+
				"PRIMARY KEY(`id`));";
	
	
	
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
