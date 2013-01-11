/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.Banco;
/**
 * Classe utilizada para acesso ao banco de dados MYSQL que estao armazenadas as tabelas usadas no programa
 */

import java.sql.*;
/**
 *
 * @author Alex
 */
public class CriaConexao {

    private static String DRIVER = "com.mysql.jdbc.Driver";
    /**
     * DRIVER - variável para realizar a conexao com o banco de dados
     */
    private static String URL    = "jdbc:mysql://localhost/fazendaDB";
    /**
     * URL - variável que indica o caminho para o banco projetoOO
     */
    private static String URL1   = "jdbc:mysql://localhost";
    /**
     * URL1 - variável que indica o caminho para o mySQL
     */
    private static String USER;
    /**
     * USER - variável usada para indicar o usuário que dá acesso ao banco de dados
     */
    private static String PW;
    /**
     * PW - variável usada para indicar a senha que dá acesso ao banco de dados
     */
    public static String getPW() {
     /**
     * Retorna o valor da senha do banco de dados
     * @return PW Senha do usuario para o banco de dados
     */
        return PW;
    }
    public static void setPW(String PW) {
        CriaConexao.PW = PW;
    }
    public static String getUSER() {
     /**
     * Retorna o valor do usuário do banco de dados
     * @return USER Senha do usuario para o banco de dados
     */
        return USER;
    }
    public static void setUSER(String USER) {
        CriaConexao.USER = USER;
    }

    public static Connection getConectarInicial() throws SQLException
    {
     /**
     * Metodo que cria a primeira conexão do aplicativo com o mysql quando os bancos de dados do programa ainda não existem
     * @return
     * @throws SQLException
     */
        try
        {
            Class.forName(DRIVER);
            System.out.println("Conectado com o mysql!");
            return DriverManager.getConnection(URL1, USER, PW);
        } catch (ClassNotFoundException e) {
            throw new SQLException(e.getMessage());
        }
    }
    public static Connection getConectar() throws SQLException {
     /**
     * Metodo usado para fazer a conexãodo banco de dados previamente criado com o aplicativo
     * @return
     * @throws SQLException
     */
        try {
            Class.forName(DRIVER);
            System.out.println("Conectado com o banco!");
            return DriverManager.getConnection(URL, USER, PW);
        } catch (ClassNotFoundException e) {
            throw new SQLException(e.getMessage());
        }
    }
}
