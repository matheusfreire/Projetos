

package projeto.IntGraf;


import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import projeto.Logica.Animais;
import projeto.Logica.Venda;
import projeto.dao.AnimaisDao;
import projeto.dao.VendaDao;

/**
 *
 * @author Alex
 */
public class JVendas extends javax.swing.JFrame {


    public JVendas() throws SQLException {
        initComponents();
        atualizar();                                                                
    /**Atualiza a tabela de vandas
     */

    }

    public void atualizar(String pesquisa, String categoria) throws SQLException {      
        VendaDao dao = new VendaDao();
        int numMaxLinha = jTable1.getRowCount();

        for (int contador = 0; contador <
                numMaxLinha; contador++) {
            removeLinha(0);
        }

        List<Venda> minhalista = dao.getLista();
        int i = 0;

        for (Venda produto: minhalista) {
            String var = "";
            if (categoria.equals("ID de Venda")) {
                String id = String.valueOf(produto.getId());
                for (int j = 0; j < pesquisa.length(); j++) {
                    if (id.length() > j) {
                        var = var + String.valueOf(id.charAt(j));
                    }

                }
                if (var.equals(pesquisa)) {
                    adicionaLinha();
                    jTable1.getModel().setValueAt(produto.getId(), i, 0);
                    jTable1.getModel().setValueAt(produto.getIdcliente(), i, 1);
                    jTable1.getModel().setValueAt(produto.getCliente(), i, 2);
                    jTable1.getModel().setValueAt(produto.getIdproduto(), i, 3);
                    jTable1.getModel().setValueAt(produto.getProduto(), i, 4);
                    jTable1.getModel().setValueAt(produto.getQuantidade(), i, 5);
                    jTable1.getModel().setValueAt(produto.getData(), i, 6);
                    jTable1.getModel().setValueAt(produto.getHora(), i, 7);

                    i++;
                }



            }
            if (categoria.equals("IdCliente")) {
                String id = String.valueOf(produto.getIdcliente());
                for (int j = 0; j < pesquisa.length(); j++) {
                    if (id.length() > j) {
                        var = var + String.valueOf(id.charAt(j));
                    }

                }
                if (var.equals(pesquisa)) {
                    adicionaLinha();
                    jTable1.getModel().setValueAt(produto.getId(), i, 0);
                    jTable1.getModel().setValueAt(produto.getIdcliente(), i, 1);
                    jTable1.getModel().setValueAt(produto.getCliente(), i, 2);
                    jTable1.getModel().setValueAt(produto.getIdproduto(), i, 3);
                    jTable1.getModel().setValueAt(produto.getProduto(), i, 4);
                    jTable1.getModel().setValueAt(produto.getQuantidade(), i, 5);
                    jTable1.getModel().setValueAt(produto.getData(), i, 6);
                    jTable1.getModel().setValueAt(produto.getHora(), i, 7);

                    i++;
                }



            }
            if (categoria.equals("Nome Cliente")) {
                String id = produto.getCliente();
                for (int j = 0; j < pesquisa.length(); j++) {
                    if (id.length() > j) {
                        var = var + String.valueOf(id.charAt(j));
                    }

                }

                if (var.equalsIgnoreCase(pesquisa)) {
                    adicionaLinha();
                    jTable1.getModel().setValueAt(produto.getId(), i, 0);
                    jTable1.getModel().setValueAt(produto.getIdcliente(), i, 1);
                    jTable1.getModel().setValueAt(produto.getCliente(), i, 2);
                    jTable1.getModel().setValueAt(produto.getIdproduto(), i, 3);
                    jTable1.getModel().setValueAt(produto.getProduto(), i, 4);
                    jTable1.getModel().setValueAt(produto.getQuantidade(), i, 5);
                    jTable1.getModel().setValueAt(produto.getData(), i, 6);
                    jTable1.getModel().setValueAt(produto.getHora(), i, 7);

                    i++;
                }



            }
            if (categoria.equals("IdProduto")) {
                String id = String.valueOf(produto.getIdproduto());
                for (int j = 0; j < pesquisa.length(); j++) {
                    if (id.length() > j) {
                        var = var + String.valueOf(id.charAt(j));
                    }

                }

                if (var.equals(pesquisa)) {
                    adicionaLinha();
                    jTable1.getModel().setValueAt(produto.getId(), i, 0);
                    jTable1.getModel().setValueAt(produto.getIdcliente(), i, 1);
                    jTable1.getModel().setValueAt(produto.getCliente(), i, 2);
                    jTable1.getModel().setValueAt(produto.getIdproduto(), i, 3);
                    jTable1.getModel().setValueAt(produto.getProduto(), i, 4);
                    jTable1.getModel().setValueAt(produto.getQuantidade(), i, 5);
                    jTable1.getModel().setValueAt(produto.getData(), i, 6);
                    jTable1.getModel().setValueAt(produto.getHora(), i, 7);

                    i++;
                }



            }
            if (categoria.equals("Nome Produto")) {
                String id = produto.getProduto();
                for (int j = 0; j < pesquisa.length(); j++) {
                    if (id.length() > j) {
                        var = var + String.valueOf(id.charAt(j));
                    }

                }

                if (var.equalsIgnoreCase(pesquisa)) {
                    adicionaLinha();
                    jTable1.getModel().setValueAt(produto.getId(), i, 0);
                    jTable1.getModel().setValueAt(produto.getIdcliente(), i, 1);
                    jTable1.getModel().setValueAt(produto.getCliente(), i, 2);
                    jTable1.getModel().setValueAt(produto.getIdproduto(), i, 3);
                    jTable1.getModel().setValueAt(produto.getProduto(), i, 4);
                    jTable1.getModel().setValueAt(produto.getQuantidade(), i, 5);
                    jTable1.getModel().setValueAt(produto.getData(), i, 6);
                    jTable1.getModel().setValueAt(produto.getHora(), i, 7);

                    i++;
                }



            }

            if (categoria.equals("Quantidade")) {
                String id = String.valueOf(produto.getQuantidade());
                for (int j = 0; j < pesquisa.length(); j++) {
                    if (id.length() > j) {
                        var = var + String.valueOf(id.charAt(j));
                    }

                }

                if (var.equals(pesquisa)) {
                    adicionaLinha();
                    jTable1.getModel().setValueAt(produto.getId(), i, 0);
                    jTable1.getModel().setValueAt(produto.getIdcliente(), i, 1);
                    jTable1.getModel().setValueAt(produto.getCliente(), i, 2);
                    jTable1.getModel().setValueAt(produto.getIdproduto(), i, 3);
                    jTable1.getModel().setValueAt(produto.getProduto(), i, 4);
                    jTable1.getModel().setValueAt(produto.getQuantidade(), i, 5);
                    jTable1.getModel().setValueAt(produto.getData(), i, 6);
                    jTable1.getModel().setValueAt(produto.getHora(), i, 7);

                    i++;
                }



            }

            if (categoria.equals("Data de Venda")) {
                String id = String.valueOf(produto.getData());
                for (int j = 0; j < pesquisa.length(); j++) {
                    if (id.length() > j) {
                        var = var + String.valueOf(id.charAt(j));
                    }

                }

                if (var.equals(pesquisa)) {
                    adicionaLinha();
                    jTable1.getModel().setValueAt(produto.getId(), i, 0);
                    jTable1.getModel().setValueAt(produto.getIdcliente(), i, 1);
                    jTable1.getModel().setValueAt(produto.getCliente(), i, 2);
                    jTable1.getModel().setValueAt(produto.getIdproduto(), i, 3);
                    jTable1.getModel().setValueAt(produto.getProduto(), i, 4);
                    jTable1.getModel().setValueAt(produto.getQuantidade(), i, 5);
                    jTable1.getModel().setValueAt(produto.getData(), i, 6);
                    jTable1.getModel().setValueAt(produto.getHora(), i, 7);

                    i++;
                }



            }

        }

        /** Método para realização de pesquisa
         */
    }


    public void atualizar() throws SQLException {                                   

        VendaDao dao = new VendaDao();
        int numMaxLinha = jTable1.getRowCount();

        for (int contador = 0; contador <
                numMaxLinha; contador++) {
            removeLinha(0);
        }

        List<Venda> minhalista = dao.getLista();
        int i = 0;
        for (Venda venda : minhalista) {
           if(!(venda.getStatus().equals("Cancelado"))){
            adicionaLinha();
            jTable1.getModel().setValueAt(venda.getId(), i, 0);
            jTable1.getModel().setValueAt(venda.getIdcliente(), i, 1);
            jTable1.getModel().setValueAt(venda.getCliente(), i, 2);
            jTable1.getModel().setValueAt(venda.getIdproduto(), i, 3);
            jTable1.getModel().setValueAt(venda.getProduto(), i, 4);
            jTable1.getModel().setValueAt(venda.getQuantidade(), i, 5);
            jTable1.getModel().setValueAt(venda.getData(), i, 6);
            jTable1.getModel().setValueAt(venda.getHora(), i, 7);

            i++;
           
        /** Método cancela venda, e passa para tabela de vendas canceladas
         */
           }
        }

           /**Metodo utilizado para atualizar a tabela com as informacoes de vendas
           *realizadas
           */
    }

    public void adicionaLinha() {                                            
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.addRow(new String[]{"", ""});

        /** Método para adição de linhas
         */

    }

    public void removeLinha(int linha) {
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.removeRow(linha);

        /**Método para remoção de linhas
         */
    }


    public void removeLinha() {
        int linhaSelecionada = jTable1.getSelectedRow();
        if (linhaSelecionada < 0) {
            return;
        } else {
            removeLinha(linhaSelecionada);
        }

         /**Obtem a linha selecionada na tabela e chama o método
          *para excluir a linha
          */
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID(Venda)", "ID(Cliente)", "Cliente", "ID(Produto)", "Produto", "Quantidade", "Data de venda", "Horario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Vendas");

        jButton1.setText("Nova Venda");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jLabel2.setText("Pesquisar:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ID de Venda", "IdCliente", "Nome Cliente", "IdProduto", "Nome Produto", "Quantidade", "Data de Venda" }));
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

        jButton3.setText("Cancelar Venda");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Vendas Canceladas");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Relatorio de Venda");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 735, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 629, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                        .addGap(35, 35, 35)
                        .addComponent(jButton5)
                        .addGap(43, 43, 43)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton3, jButton4, jButton5});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton3))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton3, jButton4, jButton5});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JCadastroClientes jCadastroClientes;
        try {
            jCadastroClientes = new JCadastroClientes();
            jCadastroClientes.jButton1.hide();
            jCadastroClientes.jButton2.hide();
            jCadastroClientes.jButton3.hide();
            jCadastroClientes.jButton4.hide();
            jCadastroClientes.jButton5.show();
            jCadastroClientes.jButton6.show();
            jCadastroClientes.jLabel1.setText("Vender para o cliente:");
            

            jCadastroClientes.setVisible(true);
            dispose();
                   

        } catch (SQLException ex) {
            Logger.getLogger(JVendas.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            JPrincipal jPrincipal = new JPrincipal();
            jPrincipal.setVisible(true);
        dispose();
        } catch (SQLException ex) {
            Logger.getLogger(JVendas.class.getName()).log(Level.SEVERE, null, ex);
        }

        /** Volta para janela principal do programa
         */

    }//GEN-LAST:event_jButton2ActionPerformed

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
        /**Pesquisa a cada novo digito inserido no campo pesquisar
         */

}//GEN-LAST:event_jTextField1KeyReleased

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        jTextField1.setText("");
        try {
            atualizar();
        } catch (SQLException ex) {
            Logger.getLogger(JCadastroClientes.class.getName()).log(Level.SEVERE, null, ex);
        }

        /**Seleciona a opção na qual o usuario deseja fazer a pesquisa
         */

}//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

}//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         int linhaSelecionada = jTable1.getSelectedRow();                           
       if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(null, "Selecione a venda a ser cancelada!");

        } else {
            int idselecionada = (Integer) jTable1.getModel().getValueAt(linhaSelecionada, 0);
            int quantidade = 0;
            int idproduto = 0;
            String motivo = JOptionPane.showInputDialog(null,"Motivo do Cancelamento");
            if(motivo != null){
            int confirm = JOptionPane.showConfirmDialog(null, "Tem certeza de que deseja Cancelar a venda: " + jTable1.getModel().getValueAt(linhaSelecionada, 0));
            if (confirm == 0) {

                try {
                    VendaDao dao = new VendaDao();
                    List<Venda> minhalista = dao.getLista();
                    for (Venda venda : minhalista) {
                        if(idselecionada == venda.getId()){
                        venda.setStatus("Cancelado");
                        quantidade = venda.getQuantidade();
                        idproduto = venda.getIdproduto();
                        venda.setMotivo(motivo);
                        dao.altera(venda);

                        }
                    }
                JOptionPane.showMessageDialog(null, "Venda Cancelada");
                } catch (SQLException ex) {
                    Logger.getLogger(JCadastroClientes.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
            }
    }

         /**Cancela venda feita mas nao remove do banco de dados por ter valores
         *de futura relevancia
          */
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        JVendasCanceladas jVendasCanceladas;
        try {
            jVendasCanceladas = new JVendasCanceladas();
            jVendasCanceladas.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(JVendas.class.getName()).log(Level.SEVERE, null, ex);
        }

        dispose();

        /** Chama a janela de vendas canceladas
         */
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int linhaSelecionada = jTable1.getSelectedRow();
        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(null, "Selecione a venda!");

        } else {
            int idselecionada = (Integer) jTable1.getModel().getValueAt(linhaSelecionada, 0);
            String nota = "";
            VendaDao vendaDao;
            try {
                vendaDao = new VendaDao();
                List<Venda> minhalista = vendaDao.getLista();
            for (Venda venda : minhalista) {
                if(idselecionada == venda.getId())
                {
                    nota = venda.getNota();

                }
            }
                JNota jNota = new JNota();
                jNota.jTextArea1.setText(nota);
                jNota.setVisible(true);

            
            } catch (SQLException ex) {
                Logger.getLogger(JVendas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        /**Chama uma nova janela com as informacoes da nota de vvenda da venda
        *selecionada
        */
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
    }//GEN-LAST:event_jTextField1ActionPerformed
     public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new JVendas().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(JVendas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}
