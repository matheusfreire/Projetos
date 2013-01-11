/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package projeto.Logica;

import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import projeto.dao.ClienteDao;
import projeto.dao.AnimaisDao;
import projeto.dao.VendaDao;

/**
 *
 * @author Alex
 */
public class GerarNota {
public static void gerarnota(int idcliente,int idproduto,int idvenda) throws SQLException{
    /**
     * Metodo estatico para geracao de nota de venda
     */



    ClienteDao clienteDao = new ClienteDao();
    Cliente cliente = new Cliente();
    List<Cliente> listacliente = clienteDao.getLista();
    for(Cliente cliente1 : listacliente){
        if(idcliente == cliente1.getId()){
            cliente.setId(cliente1.getId());
            cliente.setNome(cliente1.getNome());
            cliente.setCpf(cliente1.getCpf());
            cliente.setTelefone(cliente1.getTelefone());
            cliente.setEmail(cliente1.getEmail());
            cliente.setEndereco(cliente1.getEndereco());


        }

    }

    AnimaisDao produtoDao = new AnimaisDao();
    Animais produto = new Animais();
    List<Animais> listaproduto = produtoDao.getLista();
    for(Animais produto1 : listaproduto){
        if(idproduto == produto1.getId()){
            produto.setId(produto1.getId());
            produto.setNome(produto1.getNome());
            produto.setNumero(produto1.getNumero());
            produto.setPai(produto1.getPai());
            produto.setMae(produto1.getMae());
            produto.setLactacao(produto1.getLactacao());
            produto.setDescricao(produto1.getDescricao());
            produto.setPeso(produto1.getPeso());
            produto.setNascimento(produto1.getNascimento());
        }

    }

    VendaDao vendaDao = new VendaDao();
    List<Venda> listavenda = vendaDao.getLista();
    for(Venda venda : listavenda){
        if(idvenda == venda.getId()){
//            JOptionPane.showMessageDialog(null, "foi uai");
    venda.setNota("Data: "+venda.getData()+"" +  "\n" +
                                    "Hora: "+venda.getHora()+"" + "\n\n" +
                                    "Cliente: "+cliente.getNome()+"       Id: "+cliente.getId()+"" + "\n" +
                                    "CPF: "+cliente.getCpf()+"" +  "\n" +
                                    "Telefone: "+cliente.getTelefone()+"" + "\n" +
                                    "Email: "+cliente.getEmail()+"" + "\n"+
                                    "Endereço: "+cliente.getEndereco()+"" + "\n\n"+
                                    "Nome: "+produto.getNome()+"              Id: "+produto.getId()+"" + "\n" +
                                    "Numero do brinco: "+produto.getNumero()+ "\n"+
                                    "Pai: "+produto.getPai()+"" + "\n" +
                                    "Mae: "+produto.getMae()+"" + "\n" +
                                    "Lactação: "+produto.getLactacao()+""+"\n" +
                                    "Peso: "+produto.getPeso()+" g"+
                                    "Nascimento: "+produto.getNascimento()+"") ;
//
    vendaDao.altera(venda);

              }

        }
     }
}
