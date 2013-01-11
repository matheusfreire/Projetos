package src.bancoDeDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CriaBD {

	Connection conexao = null;

	String linha1 = "CREATE DATABASE IF NOT EXISTS cadastrosTeste;";
	String linha2 = "USE cadastrosTeste;";
	String linha3 = "CREATE TABLE IF NOT EXISTS `clientes` ("
			+ "`id` int(2) NOT NULL AUTO_INCREMENT,"
			+ "`nome` varchar(30) NOT NULL," 
			+ "`telefone` varchar(9),"
			+ "`dataNascimento` varchar(10),"
			+ "PRIMARY KEY (`id`));";

	public void criarBanco() {
		try {
			conexao = new CriaConexao().conexaoInicial();
			PreparedStatement stmt1 = conexao.prepareStatement(linha1);
			PreparedStatement stmt2 = conexao.prepareStatement(linha2);
			PreparedStatement stmt3 = conexao.prepareStatement(linha3);

			stmt1.execute();
			stmt2.execute();
			stmt3.execute();

			stmt1.close();
			stmt2.close();
			stmt3.close();

			conexao.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
