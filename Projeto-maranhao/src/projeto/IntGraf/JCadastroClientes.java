/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package projeto.IntGraf;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import projeto.Logica.Cliente;
import projeto.dao.ClienteDao;
import projeto.temporario.Variaveis;
/**
 *
 * @author Alex
 */
public class JCadastroClientes extends javax.swing.JFrame {

    /** Classe que apresentara uma tabela com os clientes cadastrado e, as opções 
     * para adicionar, remover e alterar algum cliente
     */
    public JCadastroClientes() throws SQLException {
        initComponents();
        jButton5.hide();
        jButton6.hide();
        atualizar();
        setTitle("Menu Clientes");
    }

    /** Método que esconderá os botões que só virão a serem utilizados
     * no método de criar nova venda.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButton2.setText("Remover");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("Adicionar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Clientes");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "CPF", "Telefone", "Email", "Endereço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jTable1ComponentAdded(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(15);

        jButton3.setText("Alterar Cadastro");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Voltar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel2.setText("Pesquisar:");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ID", "Nome", "CPF", "Email" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton5.setText("Escolher cliente");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Cancelar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 637, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 301, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2, jButton3, jButton5, jButton6});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jButton6))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton2, jButton3, jButton5, jButton6});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        JCliente jcliente = new JCliente();                                      
        jcliente.jLabel1.setText("Adicionar Cliente");
        jcliente.alterar = 0;
        dispose();
        jcliente.setVisible(true);
        
        /** Método que chamará a janela JCliente para que seja 
         * adicionado um novo cliente
         */

}//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jTable1ComponentAdded
        
}//GEN-LAST:event_jTable1ComponentAdded

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
                                                                                    
        try {
            setVisible(false);
            JPrincipal tabela = new JPrincipal();
            tabela.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(JCadastroClientes.class.getName()).log(Level.SEVERE, null, ex);
        }

        /** Método que voltará o programa para janela principal e fechara
         * a janela de clientes.
         */
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        int linhaSelecionada = jTable1.getSelectedRow();                      
        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(null, "Selecione o usuario a ser removido!");

        } else {
            int idselecionada = (Integer) jTable1.getModel().getValueAt(linhaSelecionada, 0);
            int confirm = JOptionPane.showConfirmDialog(null, "Tem certeza de que deseja remover o usuario: " + jTable1.getModel().getValueAt(linhaSelecionada, 1));
            if (confirm == 0) {

                try {
                    ClienteDao dao = new ClienteDao();
                    Cliente cliente = new Cliente();
                    cliente.setId(idselecionada);
                    dao.remove(cliente);
                } catch (SQLException ex) {
                    Logger.getLogger(JCadastroClientes.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    atualizar();
                } catch (SQLException ex) {
                    Logger.getLogger(JCadastroClientes.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        
        /** Método que apagara o cliente da linha selecionada, 
         * e removerá também do banco de dados
         */

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        int linhaSelecionada = jTable1.getSelectedRow();                   
        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(null, "Selecione o usuario a ser Alterado!");

        } else {                                                                    
                                                                                  

            JCliente jCliente = new JCliente();
            jCliente.jLabel1.setText("Alterar dados do cliente");
            int idselecionada = (Integer) jTable1.getModel().getValueAt(linhaSelecionada, 0);
            jCliente.usuario = idselecionada;
            jCliente.alterar = 1;
            String telef = (String) jTable1.getModel().getValueAt(linhaSelecionada, 3);
            String tel = "", prefix = "";
            if (!(telef.equals(""))) {
                for (int i = 0; i < 2; i++) {
                    prefix = prefix + telef.charAt(i);
                }
                for (int i = 3; i < telef.length(); i++) {
                    tel = tel + telef.charAt(i);
                }
            }

            jCliente.jTextField1.setText((String) jTable1.getModel().getValueAt(linhaSelecionada, 1));          //Grava as novas informacoes no banco de
            jCliente.jTextField2.setText((String) jTable1.getModel().getValueAt(linhaSelecionada, 2));          //clientes
            jCliente.jTextField3.setText(tel);
            jCliente.jTextField4.setText((String) jTable1.getModel().getValueAt(linhaSelecionada, 4));
            jCliente.jTextField5.setText((String) jTable1.getModel().getValueAt(linhaSelecionada, 5));
            jCliente.jTextField6.setText(prefix);
            jCliente.jTextField9.setText(String.valueOf(idselecionada));

            jCliente.jButton1.setLabel("Alterar Usuario");

            dispose();
            jCliente.setVisible(true);
        }
        
        /** Método que alterará os dados do cliente, o programa verifica o id do
         * cliente selecionado e abre na tela suas informações em campos editaveis
         * que o usuario do programa podera alterar, e clicando em alterar
         * o programa substituirá os valores antigos pelos novos digitados
         * 
         * Método também valida o telefone, restringindo dois digtos ao primeiro campo
         * e oito digitos para o segundo
         */
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
      
}//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed

    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased

        String texto = jTextField1.getText();                                       
        try {
            if (texto.equals("")) {
                atualizar();
            } else {
                atualizar(texto, jComboBox1.getSelectedItem().toString());
            }
        } catch (SQLException ex) {
            Logger.getLogger(JCadastroClientes.class.getName()).log(Level.SEVERE, null, ex);
        }

         /** Método que realizara uma pesquisa a cada letra digitada,
          * conforme o atributo selecionado pelo usuario
          */

    }//GEN-LAST:event_jTextField1KeyReleased

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged

        jTextField1.setText("");
        try {
            atualizar();
        } catch (SQLException ex) {
            Logger.getLogger(JCadastroClientes.class.getName()).log(Level.SEVERE, null, ex);
        }

        /** Método em que o usuario selecionará qual atributo que deseja
         * fazer a busca.
         *
         * Método também limpa a caixa de texto quando o usuario seleciona
         * outro atributo.
         */
    }//GEN-LAST:event_jComboBox1ItemStateChanged


    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
          int linhaSelecionada = jTable1.getSelectedRow();

        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(null, "Escolha um cliente!");

        }
        else
        {

             int idselecionada = (Integer) jTable1.getModel().getValueAt(linhaSelecionada, 0);
             Variaveis.idcliente = idselecionada;
             JCadastroAnimais jCadastroProdutos;
            try {
                jCadastroProdutos = new JCadastroAnimais();

             jCadastroProdutos.jButton1.hide();
             jCadastroProdutos.jButton2.hide();
             jCadastroProdutos.jButton3.hide();
             jCadastroProdutos.jButton4.hide();
             jCadastroProdutos.jButton5.hide();
             jCadastroProdutos.jButton6.show();
             jCadastroProdutos.jButton7.show();
             jCadastroProdutos.jLabel2.setText("Produto a ser vendido:");

             jCadastroProdutos.setVisible(true);
             dispose();




            } catch (SQLException ex) {
                Logger.getLogger(JCadastroClientes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

          /** Método que esconderá os botões que não terão utilidade
           * E selecionará o cliente na opção de venda.
           */

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {                                                                       
            JVendas jVendas = new JVendas();
            jVendas.setVisible(true);
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(JCadastroClientes.class.getName()).log(Level.SEVERE, null, ex);
        }

        /** Método que, quando acionado, retornara a janela de clientes
         */


    }//GEN-LAST:event_jButton6ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    new JCadastroClientes().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(JCadastroClientes.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    
        /**Método que acionara a janela de clientes
         */
        
    }



    public void adicionaLinha() {                   
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.addRow(new String[]{"", ""});
    }



    public void atualizar(String pesquisa, String categoria) throws SQLException {  

        ClienteDao dao = new ClienteDao();
        int numMaxLinha = jTable1.getRowCount();

        for (int contador = 0; contador <
                numMaxLinha; contador++) {
            removeLinha(0);
        }


        List<Cliente> minhalista = dao.getLista();
        int i = 0;

        for (Cliente cliente : minhalista) {
            String var = "";
            if (categoria.equals("ID")) {
                String id = String.valueOf(cliente.getId());
                for (int j = 0; j < pesquisa.length(); j++) {
                    if(id.length() > j)
                        var = var + String.valueOf(id.charAt(j));
                    
                }
                if (var.equals(pesquisa)) {
                    adicionaLinha();
                    jTable1.getModel().setValueAt(cliente.getId(), i, 0);
                    jTable1.getModel().setValueAt(cliente.getNome(), i, 1);
                    jTable1.getModel().setValueAt(cliente.getCpf(), i, 2);
                    jTable1.getModel().setValueAt(cliente.getTelefone(), i, 3);
                    jTable1.getModel().setValueAt(cliente.getEmail(), i, 4);
                    jTable1.getModel().setValueAt(cliente.getEndereco(), i, 5);

                    i++;
                }



            }
            if (categoria.equals("Nome")) {
                String nome = cliente.getNome();
                for (int j = 0; j < pesquisa.length(); j++) {
                    if(nome.length() > j)
                        var = var + String.valueOf(nome.charAt(j));

                }
                if (var.equalsIgnoreCase(pesquisa)) {
                    adicionaLinha();
                    jTable1.getModel().setValueAt(cliente.getId(), i, 0);
                    jTable1.getModel().setValueAt(cliente.getNome(), i, 1);
                    jTable1.getModel().setValueAt(cliente.getCpf(), i, 2);
                    jTable1.getModel().setValueAt(cliente.getTelefone(), i, 3);
                    jTable1.getModel().setValueAt(cliente.getEmail(), i, 4);
                    jTable1.getModel().setValueAt(cliente.getEndereco(), i, 5);

                    i++;
                }



            }

            if (categoria.equals("CPF")) {
                String texto = cliente.getCpf();
                for (int j = 0; j < pesquisa.length(); j++) {
                    if(texto.length() > j)
                        var = var + String.valueOf(texto.charAt(j));

                }

                if (var.equalsIgnoreCase(pesquisa)) {
                    adicionaLinha();
                    jTable1.getModel().setValueAt(cliente.getId(), i, 0);
                    jTable1.getModel().setValueAt(cliente.getNome(), i, 1);
                    jTable1.getModel().setValueAt(cliente.getCpf(), i, 2);
                    jTable1.getModel().setValueAt(cliente.getTelefone(), i, 3);
                    jTable1.getModel().setValueAt(cliente.getEmail(), i, 4);
                    jTable1.getModel().setValueAt(cliente.getEndereco(), i, 5);

                    i++;
                }





            }

            if (categoria.equals("Email")) {
                String texto = cliente.getEmail();
                for (int j = 0; j < pesquisa.length(); j++) {
                    if(texto.length() > j)
                        var = var + String.valueOf(texto.charAt(j));

                }

                if (var.equalsIgnoreCase(pesquisa)) {
                    adicionaLinha();
                    jTable1.getModel().setValueAt(cliente.getId(), i, 0);
                    jTable1.getModel().setValueAt(cliente.getNome(), i, 1);
                    jTable1.getModel().setValueAt(cliente.getCpf(), i, 2);
                    jTable1.getModel().setValueAt(cliente.getTelefone(), i, 3);
                    jTable1.getModel().setValueAt(cliente.getEmail(), i, 4);
                    jTable1.getModel().setValueAt(cliente.getEndereco(), i, 5);

                    i++;
                }
            }
         }
        /** Método que fara a busca na tabela, de acordo com o atributo
         * selecionado pelo usuario, atualizando a tabela conforme o usuario
         * digita.
         */

    }

    public void atualizar() throws SQLException {                                   

        ClienteDao dao = new ClienteDao();
        int numMaxLinha = jTable1.getRowCount();

        for (int contador = 0; contador <
                numMaxLinha; contador++) {
            removeLinha(0);
        }

        List<Cliente> minhalista = dao.getLista();
        int i = 0;
        for (Cliente cliente : minhalista) {
            adicionaLinha();
            jTable1.getModel().setValueAt(cliente.getId(), i, 0);
            jTable1.getModel().setValueAt(cliente.getNome(), i, 1);
            jTable1.getModel().setValueAt(cliente.getCpf(), i, 2);
            jTable1.getModel().setValueAt(cliente.getTelefone(), i, 3);
            jTable1.getModel().setValueAt(cliente.getEmail(), i, 4);
            jTable1.getModel().setValueAt(cliente.getEndereco(), i, 5);
            i++;

        }

        /**Método que atualizará a tabela com os clientes cadastrados
         */


    }

    public void removeLinha(int linha) {                                                

        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.removeRow(linha);
    }

    /**
     * Obtem a linha selecionada e chama o método para remover
     * do modelo
     */
    public void removeLinha() {                                                    

        int linhaSelecionada = jTable1.getSelectedRow();

        if (linhaSelecionada < 0) {
            return;
        } else {
            removeLinha(linhaSelecionada);
        }
        /**Método que identificara a linha selecionada e chamará o método
         * para remove-la do banco de dados
         */

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    public javax.swing.JButton jButton3;
    public javax.swing.JButton jButton4;
    public javax.swing.JButton jButton5;
    public javax.swing.JButton jButton6;
    private javax.swing.JComboBox jComboBox1;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
