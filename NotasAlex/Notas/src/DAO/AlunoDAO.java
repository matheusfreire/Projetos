package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entidades.Aluno;

import util.FabricaConexao;

public class AlunoDAO {
	
	private static final String INSERIR = "Insert into aluno (nome, nota) values (?, ?)";
	
	Connection conn = null;
	
	public void salvar(Aluno aluno){
		try{
			conn = new FabricaConexao().criaConexao();
			PreparedStatement stmt = conn.prepareStatement(INSERIR);
			stmt.setString(1, aluno.getNome());
			stmt.setDouble(2, aluno.getNota());
			System.out.println("Aluno "+aluno.getNome()+" Inserido com sucesso");
			stmt.execute();
			stmt.close();
			conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public List<Aluno> listar(){
		List <Aluno> listaAluno = new ArrayList<>();
		conn = new FabricaConexao().criaConexao();
		
		try{
			PreparedStatement stmt = conn.prepareStatement("Select * from aluno");
			ResultSet rs =stmt.executeQuery();
			while(rs.next()){
				Aluno alun = new Aluno();
				alun.setId(rs.getInt("id"));
				alun.setNome(rs.getString("nome"));
				alun.setNota(rs.getDouble("nota"));
				listaAluno.add(alun);
			}
			rs.close();
			stmt.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		//for(Aluno aluno : listaAluno){
			//todos = todos + aluno.toString();			
		//}
		return listaAluno;
	}

}
