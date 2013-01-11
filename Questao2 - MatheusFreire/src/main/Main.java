package main;

import java.sql.SQLException;

import util.FabricaConexao;

public class Main {

	public static void main(String[] args) throws SQLException {
		
		FabricaConexao tentativa = new FabricaConexao();
		
		tentativa.criarConexao();
		tentativa.criarConexao().close();
	}

}
