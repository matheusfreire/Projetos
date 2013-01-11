/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package projeto.dao;
/**
 *Classe para o acesso de informacoes do banco de dados das vendas
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import projeto.Banco.CriaConexao;
import projeto.Logica.Cliente;
import projeto.Logica.Venda;


public class VendaDao {

    private Connection conex;
    /**
     * Metodo que tem como função fazer a ponte aplicativo - mysql atraves da classe CriaConexão
     * @throws SQLException
     */

    public VendaDao() throws SQLException {
     /**
     * Metodo para realizar a conexão com o banco de dados atraves da classe CriaConexão
     * @throws SQLException
     */
        this.conex = CriaConexao.getConectar();
    }

    public void adiciona(Venda c1) throws SQLException{                                 
        /**
         * Metodo para criacao de nova venda usando a primeira ID disponível para vendas
         */
        String sql = "insert into vendas (idcliente,cliente,idproduto,produto,quantidade,data,hora,nota,status,motivo)"
                + "values (?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement stmt = conex.prepareStatement(sql);

        stmt.setString(1, String.valueOf(c1.getIdcliente()));
        stmt.setString(2, c1.getCliente());
        stmt.setString(3, String.valueOf(c1.getIdproduto()));
        stmt.setString(4, c1.getProduto());
        stmt.setString(5, String.valueOf(c1.getQuantidade()));
        stmt.setString(6, c1.getData());
        stmt.setString(7, c1.getHora());
        stmt.setString(8, c1.getNota());
        stmt.setString(9, c1.getStatus());
        stmt.setString(10, c1.getMotivo());


        stmt.execute();
        stmt.close();


    }

    public List<Venda> getLista() throws SQLException {
        /**
         *Método para chamar os valores das vendas do banco de dados
         */
        String sql = "select * from vendas";
        PreparedStatement stmt = this.conex.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();

        List<Venda> minhaLista = new ArrayList<Venda>();

        while(rs.next()){
            Venda c1 = new Venda();
            c1.setId(rs.getInt("id"));
            c1.setIdcliente(rs.getInt("idcliente"));
            c1.setCliente(rs.getString("cliente"));
            c1.setIdproduto(rs.getInt("idproduto"));
            c1.setProduto(rs.getString("produto"));
            c1.setQuantidade(rs.getInt("quantidade"));
            c1.setData(rs.getString("data"));
            c1.setHora(rs.getString("hora"));
            c1.setNota(rs.getString("nota"));
            c1.setStatus(rs.getString("status"));
            c1.setMotivo(rs.getString("motivo"));

            minhaLista.add(c1);
        }
        rs.close();
        stmt.close();
        return minhaLista;

    }


public void altera(Venda c1) throws SQLException{                                   
    /**
     * Método que altera determinada venda no banco de vendas
     */
    String sql = "update vendas set idcliente=?,cliente=?,idproduto=?,produto=?,quantidade=?,data=?,hora=?,nota=?,status=?,motivo=? where id=?";
    PreparedStatement stmt = conex.prepareStatement(sql);

        stmt.setInt(1, c1.getIdcliente());
        stmt.setString(2, c1.getCliente());
        stmt.setInt(3, c1.getIdproduto());
        stmt.setString(4, c1.getProduto());
        stmt.setInt(5, c1.getQuantidade());
        stmt.setString(6, c1.getData());
        stmt.setString(7, c1.getHora());
        stmt.setString(8, c1.getNota());
        stmt.setString(9, c1.getStatus());
        stmt.setString(10, c1.getMotivo());
        stmt.setInt(11, c1.getId());

        stmt.execute();
        stmt.close();
}

public void remove(Venda c1) throws SQLException{                                       
    /**
     * Método utilizado para remover determinada venda no banco de vendas
     */
    String sql = "delete from vendas where id=?";
    PreparedStatement stmt = conex.prepareStatement(sql);
    stmt.setInt(1, c1.getId());
    stmt.execute();
    stmt.close();

}



}
