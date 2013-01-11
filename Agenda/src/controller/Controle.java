package controller;

import pessoa.Pessoa;
import dao.PessoaDAO;

public class Controle {

	PessoaDAO dao = new PessoaDAO();
	
	public void salvarPessoa(String nome, Integer tel, String email){
		
		Pessoa p1 = new Pessoa();
		
		p1.setNome(nome);
		p1.setTel(tel);
		p1.setEmail(email);
		
		dao.salvarPessoa(p1);
	}
	
}
