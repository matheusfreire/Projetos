package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import bancoDados.FabricaConexao;

import entidades.Aluno;

public class AlunoDAO {

	private static final String INSERIR = "Insert into aluno(nome, nota) VALUES (?, ?)";
	private static final String SELECT = "Select * from aluno";
	private static final String DELETE = "delete from aluno where nome=?";
	
	Connection conexao = null;
	String relatorio = "";
	
	
	public void salvarAluno(Aluno aluno){
		try{
			conexao = new FabricaConexao().conexaoBD();
			PreparedStatement save = conexao.prepareStatement(INSERIR);
			save.setString(1, aluno.getNome());
			save.setDouble(2, aluno.getNota());
					
			save.execute();
			save.close();
			conexao.close();
			System.out.println("Aluno "+ aluno.getNome()+" inserido com sucesso");		
			
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
	
	public List<Aluno> listarAluno(){
		List<Aluno> listaAlunos = new ArrayList<Aluno>();
		conexao = new FabricaConexao().conexaoBD();
		
		try {
			
				PreparedStatement select = conexao.prepareStatement(SELECT);
				ResultSet rs = select.executeQuery();
			
			while(rs.next()){
				Aluno aluno = new Aluno();
				aluno.setId(rs.getInt("id"));
				aluno.setNome(rs.getString("nome"));
				aluno.setNota(rs.getDouble("nota"));
				listaAlunos.add(aluno);
			}
			rs.close();
			select.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//for(Aluno aluno : listaAlunos)
			//relatorio = relatorio + aluno.toString();
		return listaAlunos;
	
	}
	
	public void removerAluno(Aluno aluno){
		conexao = new FabricaConexao().conexaoBD();
		
		try{
			PreparedStatement stmt = conexao.prepareStatement(DELETE);
			stmt.setString(1, aluno.getNome());
				
			stmt.execute();
			stmt.close();
			System.out.println("Aluno " +aluno.getNome()+" removido do bd");
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
}
