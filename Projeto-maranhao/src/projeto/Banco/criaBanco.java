/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


package projeto.Banco;

import java.sql.*;

/**
 *
 * @author Alex
 */
public class criaBanco {

    private Connection conexao;

    public criaBanco() throws SQLException
    {
        this.conexao = CriaConexao.getConectar();
    }

    /**
     * Metodo com os scripts usados para a criação do banco de dados
     * e de suas respectivas tabelas e que realiza a execução do mesmo.
     * Criando o banco de dados e as tabelas necessarias para
     * a execução do aplicativo
     * @throws SQLException
     */
    public void criarBd() throws SQLException
    {
        String sql1 = "CREATE DATABASE IF NOT EXISTS fazendaDB;";
        String sql2 = "USE fazendaDB;";
        String sql3 = "CREATE TABLE IF NOT EXISTS `clientes` ("+
                      "`id` int(2) NOT NULL AUTO_INCREMENT,"+
                      "`nome` varchar(50) NOT NULL,"+
                      "`cpf` varchar(50) DEFAULT NULL,"+
                      "`telefone` varchar(20) DEFAULT NULL,"+
                      "`email` varchar(30) DEFAULT NULL,"+
                      "`endereco` varchar(50) DEFAULT NULL,"+
                      "PRIMARY KEY (`id`)"+
                      ") ENGINE=InnoDB DEFAULT CHARSET=latin1";

        String sql4 = "CREATE TABLE IF NOT EXISTS `animais` ("+
                      "`id` int(2) NOT NULL AUTO_INCREMENT,"+
                      "`numero` varchar(5) DEFAULT NULL,"+
                      "`nome` varchar(50) DEFAULT NULL,"+
                      "`pai` varchar(50) DEFAULT NULL,"+
                      "`mae` varchar(50) DEFAULT NULL,"+
                      "`lactacao` float DEFAULT NULL,"+
                      "`descricao` varchar(400) DEFAULT NULL,"+
                      "`peso` float DEFAULT NULL,"+
                      "`nascimento` varchar(10) DEFAULT NULL,"+
                      "PRIMARY KEY (`id`)"+
                      ") ENGINE=InnoDB DEFAULT CHARSET=latin1;";
        
        String sql5 = "CREATE TABLE IF NOT EXISTS `vendas` ("+
                      "`id` int(10) unsigned NOT NULL,"+
                      "`idcliente` int(10) unsigned NOT NULL,"+
                      "`cliente` varchar(50) NOT NULL,"+
                      "`idproduto` int(10) unsigned NOT NULL,"+
                      "`produto` varchar(50) NOT NULL,"+
                      "`quantidade` int(10) unsigned NOT NULL,"+
                      "`data` varchar(45) NOT NULL,"+
                      "`hora` varchar(45) NOT NULL,"+
                      "`nota` varchar(500) DEFAULT NULL,"+
                      "`status` varchar(25) DEFAULT NULL,"+
                      "`motivo` varchar(100) DEFAULT NULL,"+
                      "PRIMARY KEY (`id`)"+
                      ") ENGINE=InnoDB DEFAULT CHARSET=latin1;";


        PreparedStatement stmt1 = conexao.prepareStatement(sql1);
        PreparedStatement stmt2 = conexao.prepareStatement(sql2);
        PreparedStatement stmt3 = conexao.prepareStatement(sql3);
        PreparedStatement stmt4 = conexao.prepareStatement(sql4);
        PreparedStatement stmt5 = conexao.prepareStatement(sql5);

        stmt1.execute();
        stmt2.execute();
        stmt3.execute();
        stmt4.execute();
        stmt5.execute();

        stmt1.close();
        stmt2.close();
        stmt3.close();
        stmt4.close();
        stmt5.close();
    }

}
