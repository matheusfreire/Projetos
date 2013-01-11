/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package projeto.dao;
/**
 * Classe usada para acesso ao banco de dados dos clientes
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import projeto.Banco.CriaConexao;
import projeto.Logica.Cliente;

/**
 *
 * @author Alex
 */
public class ClienteDao {

    private Connection conex;
    /**
     * Metodo que tem como função fazer a ponte aplicativo - mysql atraves da classe CriaConexão
     * @throws SQLException
     */
    public ClienteDao() throws SQLException {
    /**
     * Metodo para realizar a conexão com o banco de dados atraves da classe CriaConexão
     * @throws SQLException
     */
        this.conex = CriaConexao.getConectar();
    }

    public void adiciona(Cliente c1) throws SQLException{
        /**
         * Metodo para adicao de clientes
         */
        String sql = "insert into clientes (nome,cpf,telefone,email,endereco)"
                + "values (?,?,?,?,?)";
        PreparedStatement stmt = conex.prepareStatement(sql);

        stmt.setString(1, c1.getNome());
        stmt.setString(2, c1.getCpf());
        stmt.setString(3, c1.getTelefone());
        stmt.setString(4, c1.getEmail());
        stmt.setString(5, c1.getEndereco());

        stmt.execute();
        stmt.close();


    }

    public List<Cliente> getLista() throws SQLException {
        /**
         * Metodo para adiquirir as informacoes dos clientes do banco de clientes
         */
        String sql = "select * from clientes";
        PreparedStatement stmt = this.conex.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();

        List<Cliente> minhaLista = new ArrayList<Cliente>();

        while(rs.next()){
            Cliente c1 = new Cliente();
            c1.setId(rs.getInt("id"));
            c1.setNome(rs.getString("nome"));
            c1.setCpf(rs.getString("cpf"));
            c1.setTelefone(rs.getString("telefone"));
            c1.setEmail(rs.getString("email"));
            c1.setEndereco(rs.getString("endereco"));

            minhaLista.add(c1);
        }
        rs.close();
        stmt.close();
        return minhaLista;

    }


public void altera(Cliente c1) throws SQLException{
    /**
     * Método para alterar informacoes de determinado cliente
     */
    String sql = "update clientes set nome=?,cpf=?,telefone=?,email=?,endereco=? where id=?";
    PreparedStatement stmt = conex.prepareStatement(sql);

        stmt.setString(1, c1.getNome());
        stmt.setString(2, c1.getCpf());
        stmt.setString(3, c1.getTelefone());
        stmt.setString(4, c1.getEmail());
        stmt.setString(5, c1.getEndereco());
        stmt.setInt(6, c1.getId());

        stmt.execute();
        stmt.close();
}

public void remove(Cliente c1) throws SQLException{
    /**
     * Método para remover determinado cliente
     */
    String sql = "delete from clientes where id=?";
    PreparedStatement stmt = conex.prepareStatement(sql);
    stmt.setInt(1, c1.getId());
    stmt.execute();
    stmt.close();

}



}
