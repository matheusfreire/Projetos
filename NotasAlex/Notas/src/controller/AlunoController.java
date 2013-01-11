package controller;

import DAO.AlunoDAO;
import entidades.Aluno;

public class AlunoController {
	
	public void salvar(String nome, double nota){
		Aluno aluno = new Aluno();
		aluno.setNome(nome);
		aluno.setNota(nota);
		
		AlunoDAO dao = new AlunoDAO();
		dao.salvar(aluno);
	}

}
