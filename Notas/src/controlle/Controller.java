package controlle;

import java.sql.SQLException;

import dao.AlunoDAO;
import entidades.Aluno;

public class Controller {
	
	private AlunoDAO dao;
	private Aluno aluno;

	public void salvarAluno(String nome, Double nota){
		aluno = new Aluno();
		dao = new AlunoDAO();
		
		aluno.setNome(nome);
		aluno.setNota(nota);
		
		dao.salvarAluno(aluno);
	}
	
	public void removerAluno(String nome){
		aluno = new Aluno();
		dao = new AlunoDAO();
		
		aluno.setNome(nome);
		dao.removerAluno(aluno);
	}

}
