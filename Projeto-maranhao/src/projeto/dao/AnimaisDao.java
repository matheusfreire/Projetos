/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package projeto.dao;
/**
 * Classe usada para acesso ao banco de dados dos produtos
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import projeto.Banco.CriaConexao;
import projeto.Logica.Animais;

/**
 *
 * @author Alex
 */
public class AnimaisDao {

    private Connection conex;
    /**
     * Metodo que tem como função fazer a ponte aplicativo - mysql atraves da classe CriaConexão
     * @throws SQLException
     */

    public AnimaisDao() throws SQLException {
     /**
     * Metodo para realizar a conexão com o banco de dados atraves da classe CriaConexão
     * @throws SQLException
     */
        this.conex = CriaConexao.getConectar();
    }


    public void adiciona(Animais p1) throws SQLException{                                                       //Metodo para adicao de um produto
        String sql = "insert into animais (nome,numero,pai,mae,lactacao,descricao,peso,nascimento)"
                + "values (?,?,?,?,?,?,?,?)";
        PreparedStatement stmt = conex.prepareStatement(sql);

        stmt.setString(1, p1.getNome());
        stmt.setFloat(2, p1.getNumero());
        stmt.setString(3, p1.getPai());
        stmt.setString(4, p1.getMae());
        stmt.setFloat(5, p1.getLactacao());
        stmt.setString(6, p1.getDescricao());
        stmt.setFloat(7, p1.getPeso());
        stmt.setString(8, p1.getNascimento());
        

        stmt.execute();
        stmt.close();


    }

    public List<Animais> getLista() throws SQLException {
        /**
         * Metodo para aquisicao das informacoes dos produtos
         */
        String sql = "select * from animais";
        PreparedStatement stmt = this.conex.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();

        List<Animais> minhaLista = new ArrayList<Animais>();

        while(rs.next()){
            Animais p1 = new Animais();
            p1.setId(rs.getInt("id"));
            p1.setNome(rs.getString("nome"));
            p1.setNumero(rs.getInt("numero"));
            p1.setPai(rs.getString("pai"));
            p1.setMae(rs.getString("mae"));
            p1.setLactacao(rs.getFloat("lactacao"));
            p1.setDescricao(rs.getString("descricao"));
            p1.setPeso(rs.getFloat("peso"));
            p1.setNascimento(rs.getString("nascimento"));

            minhaLista.add(p1);
        }
        rs.close();
        stmt.close();
        return minhaLista;

    }


public void altera(Animais p1) throws SQLException{
    /**
     * Metodo usado para alterar determinado produto
     */
    String sql = "update animais set nome=?,numero=?,pai=?,mae=?,lactacao=?,descricao=?,peso=?,nascimento=? where id=?";
    PreparedStatement stmt = conex.prepareStatement(sql);

        stmt.setString(1, p1.getNome());
        stmt.setFloat(2, p1.getNumero());
        stmt.setString(3, p1.getPai());
        stmt.setString(4, p1.getMae());
        stmt.setFloat(5, p1.getLactacao());
        stmt.setString(6, p1.getDescricao());
        stmt.setFloat(7, p1.getPeso());
        stmt.setString(8, p1.getNascimento());
        stmt.setInt(9, p1.getId());

        stmt.execute();
        stmt.close();
}

public void remove(Animais p1) throws SQLException{
    /**
     * Metodo para remocao de detrminado produto
     */
    String sql = "delete from animais where id=?";
    PreparedStatement stmt = conex.prepareStatement(sql);
    stmt.setInt(1, p1.getId());
    stmt.execute();
    stmt.close();

}



}
