package src.bancoDeDados;

import java.sql.Connection;
import java.sql.DriverManager;

public class CriaConexao {

	Connection conexao = null;

	public Connection conexaoInicial() {
		try {
			conexao = DriverManager.getConnection("jdbc:mysql://localhost/",
					"root", "root");
			System.out.println("Conexao bem sucedida!");

		} catch (Exception e) {
			System.out.println("Falha na conexão!");
			e.printStackTrace();
		}
		return conexao;
	}

	public Connection criarConexao() {
		try {
			conexao = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/cadastrosTeste", "root",
					"root");
			System.out.println("Conexao bem sucedida!");

		} catch (Exception e) {
			System.out.println("Falha na conexão!");
			e.printStackTrace();
		}
		return conexao;
	}

}
