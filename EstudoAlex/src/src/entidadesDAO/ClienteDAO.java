package src.entidadesDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import src.bancoDeDados.CriaConexao;
import src.entidades.Cliente;

public class ClienteDAO {

	String texto = "";

	public String INSERIR = "Insert into clientes (nome, telefone, dataNascimento) VALUES(?, ?, ?)";

	Connection conexao = null;

	public void salvar(Cliente cliente) {
		try {
			conexao = new CriaConexao().criarConexao();

			PreparedStatement stmt = conexao.prepareStatement(INSERIR);
			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getTelefone());
			stmt.setString(3, cliente.getDataNascimento());

			System.out.println("Cliente " + cliente.getNome()
					+ " adicionado com sucesso!");

			stmt.execute();
			stmt.close();
			conexao.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String listar() {
		texto = "";
		List<Cliente> clienteLista = new ArrayList<>();
		Connection conexao = new CriaConexao().criarConexao();
		try {
			PreparedStatement stmt = conexao
					.prepareStatement("select * from clientes");
			ResultSet resultado = stmt.executeQuery();
			while (resultado.next()) {
				Cliente cli = new Cliente();
				cli.setId(resultado.getInt("id"));
				cli.setNome(resultado.getString("nome"));
				cli.setTelefone(resultado.getString("telefone"));
				cli.setDataNascimento(resultado.getString("dataNascimento"));

				clienteLista.add(cli);
			}
			stmt.close();
			conexao.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		for (Cliente cliente : clienteLista) {

			texto = texto + cliente.toString();
		}
		return texto;

	}

}
