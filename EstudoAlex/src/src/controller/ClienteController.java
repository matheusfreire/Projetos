package src.controller;

import src.entidades.Cliente;
import src.entidadesDAO.ClienteDAO;

public class ClienteController {

	public void salvarCliente(String nome, String telefone,
			String dataNascimento) {

		Cliente cliente = new Cliente();
		cliente.setNome(nome);
		cliente.setTelefone(telefone);
		cliente.setDataNascimento(dataNascimento);

		ClienteDAO dao = new ClienteDAO();
		dao.salvar(cliente);

	}

}
