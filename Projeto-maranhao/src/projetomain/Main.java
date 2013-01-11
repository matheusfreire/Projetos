package projetomain;
import javax.swing.*;
import java.sql.*;
import projeto.Banco.CriaConexao;
import projeto.Banco.criarBanco;
import projeto.IntGraf.JPrincipal;
/**
 *
 * @author Alex
 */

public class Main {

   /**
    * Método "main" que executará o aplicativo. Aqui será pedido login e senha do banco de dados para que seja a criado o banco, caso ele nao exista e o conecte ao aplicativo.
    * @param args
    */
    public static void main(String[] args) {

        CriaConexao conect = new CriaConexao();
        criarBanco bd;

        conect.setUSER(JOptionPane.showInputDialog(null,"Entre com o USER do banco de dados","USER",JOptionPane.QUESTION_MESSAGE));
        conect.setPW(JOptionPane.showInputDialog(null,"Entre com o PASSWORD do banco de dados","PASSWORD",JOptionPane.QUESTION_MESSAGE));

        try
        {
            bd = new criarBanco();
            conect.getConectarInicial();
            bd.criarBd();
            new JPrincipal().setVisible(true);
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"O programa será fechado!\nUSER e/ou PASSWORD são invalidos tente outra vez!","ERRO!!!",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }
}
