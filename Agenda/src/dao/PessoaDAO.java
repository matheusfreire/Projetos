package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import pessoa.Pessoa;
import util.FabricaConexao;

public class PessoaDAO {
	
	public final String SALVARPESSOA = "insert into pessoa"+
									    "(nome,tel,email)"+
									    "VALUES (?,?,?)";

	Connection conexao = null;
	public void salvarPessoa(Pessoa p1) {
		try{
			conexao = new FabricaConexao().criarConexao();
			PreparedStatement pst = conexao.prepareStatement(SALVARPESSOA);
			pst.setString(1, p1.getNome());
			pst.setInt(2, p1.getTel());
			pst.setString(3, p1.getEmail());
			
			pst.execute();
			pst.close();
			conexao.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	
	
}
