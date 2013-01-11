package projeto.Banco;
import java.sql.*;
/**
 *
 * @author Alex
 */
public class criarBanco {

    private Connection conex;
    /**
     * Metodo que tem como função fazer a ponte aplicativo - mysql atraves da classe CriaConexão
     * @throws SQLException
     */

    public criarBanco() throws SQLException
    {
        this.conex = CriaConexao.getConectarInicial();
    }

    public void criarBd() throws SQLException
    {
     /**
     * Metodo com os scripts utilizados na criação do banco de dados e de suas respectivas tabelas e realiza a execução do mesmo. Cria o banco de dados e as tabelas necessarias para a execução do softare
     * @throws SQLException
     */
        String sql1 = "CREATE DATABASE IF NOT EXISTS fazendaDB;";
        String sql2 = "USE fazendaDB;";
        String sql3 = "CREATE TABLE IF NOT EXISTS `clientes` ("+
                      "`id` int(2) NOT NULL AUTO_INCREMENT,"+
                      "`nome` varchar(50) NOT NULL,"+
                      "`cpf` varchar(50),"+
                      "`telefone` varchar(20),"+
                      "`email` varchar(30),"+
                      "`endereco` varchar(50),"+
                      "PRIMARY KEY (`id`)"+
                      ") ENGINE=InnoDB DEFAULT CHARSET=latin1";
        String sql4 = "CREATE TABLE IF NOT EXISTS `animais` ("+
                      "`id` int(2) NOT NULL AUTO_INCREMENT,"+
                      "`numero` varchar(5) DEFAULT NULL,"+
                      "`nome` varchar(50) DEFAULT NULL,"+
                      "`pai` varchar(50),"+
                      "`mae` varchar(50),"+
                      "`lactacao` float DEFAULT NULL,"+
                      "`descricao` varchar(400) DEFAULT NULL,"+
                      "`peso` float DEFAULT NULL,"+
                      "`nascimento` varchar(10) DEFAULT NULL,"+
                      "PRIMARY KEY (`id`)"+
                      ") ENGINE=InnoDB DEFAULT CHARSET=latin1;";

                String sql5 = "CREATE TABLE IF NOT EXISTS `vendas` ("+
                      "`id` int(10) NOT NULL AUTO_INCREMENT,"+
                      "`idcliente` int(10) unsigned NOT NULL,"+
                      "`cliente` varchar(50) NOT NULL,"+
                      "`idproduto` int(10) unsigned NOT NULL,"+
                      "`produto` varchar(50) NOT NULL,"+
                      "`quantidade` int(10) unsigned NOT NULL,"+
                      "`data` varchar(45) NOT NULL,"+
                      "`hora` varchar(45) NOT NULL,"+
                      "`nota` varchar(500),"+
                      "`status` varchar(25),"+
                      "`motivo` varchar(100),"+
                      "PRIMARY KEY (`id`)"+
                      ") ENGINE=InnoDB DEFAULT CHARSET=latin1;";


        PreparedStatement stmt1 = conex.prepareStatement(sql1);
        PreparedStatement stmt2 = conex.prepareStatement(sql2);
        PreparedStatement stmt3 = conex.prepareStatement(sql3);
        PreparedStatement stmt4 = conex.prepareStatement(sql4);
        PreparedStatement stmt5 = conex.prepareStatement(sql5);

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
