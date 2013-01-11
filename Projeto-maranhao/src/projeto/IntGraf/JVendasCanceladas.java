

package projeto.IntGraf;                      
/**
 * Classe para mostrar as vendas canceladas
 */

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import projeto.Logica.Venda;
import projeto.dao.VendaDao;

/**
 *
 * @author Alex
 */
public class JVendasCanceladas extends javax.swing.JFrame {

    public JVendasCanceladas() throws SQLException {
    	/**
    	 * Atualiza tabela de vendas
    	 */
        initComponents();
        atualizar();
      
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
/**
 * M�todo para atualizar campo de pesquisa ID das vendas
 */
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

                /**
                 * M�todo para atualizar campo de pesquisa ID dos clientes
                 */

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


                /**
                 * M�todo para atualizar campo de pesquisa nome dos clientes
                 */


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



                /**
                 * M�todo para atualizar campo de pesquisa ID dos produtos
                 */

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



                /**
                 * M�todo para atualizar campo de pesquisa nome dos produtos
                 */

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


                /**
                 * M�todo para atualizar campo de pesquisa quantidade dos produtos
                 */


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


                /**
                 * M�todo para atualizar campo de pesquisa data da venda
                 */

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
    }


    public void atualizar() throws SQLException {

        VendaDao dao = new VendaDao();
        int numMaxLinha = jTable1.getRowCount();

        /**
         * M�todo para viabilizar o cancelamento de venda
         */
        for (int contador = 0; contador <
                numMaxLinha; contador++) {
            removeLinha(0);
        }

        List<Venda> minhalista = dao.getLista();
        int i = 0;
        for (Venda venda : minhalista) {
            if(venda.getStatus().equals("Cancelado")){
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

        }}

    }

    public void adicionaLinha() {
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.addRow(new String[]{"", ""});
    }

    public void removeLinha(int linha) {
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.removeRow(linha);

    }

    public void removeLinha() {
        int linhaSelecionada = jTable1.getSelectedRow();
        if (linhaSelecionada < 0) {
            return;
        } else {
            removeLinha(linhaSelecionada);
        }

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
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

        jLabel1.setText("Vendas Canceladas");

        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jLabel2.setText("Pesquisar:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ID de venda", "IdCliente", "Nome Cliente", "IdProduto", "Nome Produto", "Quantidade", "Data de Venda" }));
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

        jButton1.setText("Motivo do Cancelamento");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                .addGap(10, 10, 10)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 228, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(365, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(529, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton5});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton5});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            JVendas jVendas = new JVendas();
            jVendas.setVisible(true);
        dispose();
        } catch (SQLException ex) {
            Logger.getLogger(JVendas.class.getName()).log(Level.SEVERE, null, ex);
        }

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
}//GEN-LAST:event_jTextField1KeyReleased

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        jTextField1.setText("");
        try {
            atualizar();
        } catch (SQLException ex) {
            Logger.getLogger(JCadastroClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
}//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         int linhaSelecionada = jTable1.getSelectedRow();
        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(null, "Selecione a venda cancelada!");

        } else {
            int idselecionada = (Integer) jTable1.getModel().getValueAt(linhaSelecionada, 0);
          String motivo = "";
                try {
                    VendaDao dao = new VendaDao();
                    List<Venda> minhalista = dao.getLista();
                    for (Venda venda : minhalista) {
                         motivo = venda.getMotivo();
                    }
                    JOptionPane.showMessageDialog(null, motivo);
                } catch (SQLException ex) {
                    Logger.getLogger(JCadastroClientes.class.getName()).log(Level.SEVERE, null, ex);
                }




    }
    }//GEN-LAST:event_jButton1ActionPerformed

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
    }//GEN-LAST:event_jButton5ActionPerformed

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
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}
