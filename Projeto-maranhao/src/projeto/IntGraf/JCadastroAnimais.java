
package projeto.IntGraf;                                                       

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import projeto.Logica.Animais;
import projeto.dao.AnimaisDao;
import java.util.*;

/**
 *
 * @author Alex
 */
public class JCadastroAnimais extends javax.swing.JFrame {

     /** Classe que apresentara uma tabela com os produtos cadastrado e, as opções
     * para adicionar, remover e alterar algum produto
     */

    public JCadastroAnimais() throws SQLException {
        initComponents();
        atualizar();                                                            
        jButton6.hide();                                                           
        jButton7.hide();
        setTitle("Menu Animais");
    }
    /** Método que esconderá os botões que só virão a serem utilizados
     * no método de criar nova venda.
     */

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Numero", "Animal", "Pai", "Mae"
            }
        ) {
            /**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			
			boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(15);

        jButton1.setText("Adicionar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Remover");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Alterar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Pesquisar:");

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

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ID", "Nome", "Pai", "Mae", "Numero" }));
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

        jButton5.setText("Mostrar detalhes");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel2.setText("Animais");

        jButton6.setText("Escolher Animal");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Cancelar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton4.setText("Voltar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(18, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(184, 184, 184))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton3, 0, 0, Short.MAX_VALUE)
                                        .addGap(22, 22, 22))
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton5)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60))
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2, jButton3, jButton5});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton2)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton3)
                                    .addComponent(jButton5)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jButton6)))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jButton7)
                        .addGap(69, 69, 69)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton2, jButton3, jButton5, jButton6, jButton7});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        try {                                 
            setVisible(false);                                                     
            JPrincipal tabela = new JPrincipal();
            tabela.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(JCadastroClientes.class.getName()).log(Level.SEVERE, null, ex);
        }

         /** Método que voltará o programa para janela principal e fechara
         * a janela de produtos.
         */
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JAnimal jAnimal = new JAnimal();
        jAnimal.setVisible(true);
        setVisible(false);

         /** Método que hamará a janela JProdutos para que seja
         * adicionado um novo produto.
         */
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
    }//GEN-LAST:event_jComboBox1ActionPerformed

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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                                                                              
        int linhaSelecionada = jTable1.getSelectedRow();                     
        if (linhaSelecionada == -1) {                                                       
            JOptionPane.showMessageDialog(null, "Selecione o animal a ser removido!");

        } else {
            int idselecionada = (Integer) jTable1.getModel().getValueAt(linhaSelecionada, 0);
            int confirm = JOptionPane.showConfirmDialog(null, "Tem certeza de que deseja remover o animal: " + jTable1.getModel().getValueAt(linhaSelecionada, 1));
            if (confirm == 0) {

                try {
                    AnimaisDao dao = new AnimaisDao();
                    Animais animal = new Animais();
                    animal.setId(idselecionada);
                    dao.remove(animal);
                } catch (SQLException ex) {
                    Logger.getLogger(JCadastroAnimais.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    atualizar();
                } catch (SQLException ex) {
                    Logger.getLogger(JCadastroAnimais.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

         /** Método que apagara o produto da linha selecionada,
         * e removerá também do banco de dados
         */

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int linhaSelecionada = jTable1.getSelectedRow();
        if (linhaSelecionada == -1) {                                                      
            JOptionPane.showMessageDialog(null, "Selecione o animal a ser Alterado!");

        } else {

            JAnimal jAnimal = new JAnimal();
            jAnimal.jLabel1.setText("Alterar dados do animal");
            int idselecionada = (Integer) jTable1.getModel().getValueAt(linhaSelecionada, 0);    
            jAnimal.mercadoria = idselecionada;
            jAnimal.alterar = 1;

            AnimaisDao dao;
            try {
                dao = new AnimaisDao();
                List<Animais> minhalista = dao.getLista();
                for (Animais animal : minhalista) {
                    if (idselecionada == animal.getId()) {

                        jAnimal.jNomeAnimal.setText(animal.getNome());
                        jAnimal.jNumero.setText(String.valueOf(animal.getNumero()));
                        jAnimal.jPai.setText(animal.getPai());
                        jAnimal.jMae.setText(animal.getMae());
                        jAnimal.jLactacao.setText(String.valueOf(animal.getLactacao()));
                        jAnimal.jPeso.setText(String.valueOf(animal.getPeso()));
                        jAnimal.jNascimento.setText(animal.getNascimento());
                        jAnimal.jDescricao.setText(animal.getDescricao());


                        jAnimal.jTextField9.setText(String.valueOf(idselecionada));

                        jAnimal.jButton1.setLabel("Alterar Animal");

                    }
                }
                dispose();                                                       
                                                                                                  
                jAnimal.setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(JCadastroAnimais.class.getName()).log(Level.SEVERE, null, ex);
            }

        }


         /** Método que alterará os dados do produto, o programa verifica o id do
         * produto selecionado e abre na tela suas informações em campos editaveis
         * que o usuario do programa podera alterar, e clicando em alterar
         * o programa substituirá os valores antigos pelos novos digitados
         *
         * Método também valida o telefone, restringindo dois digtos ao primeiro campo
         * e oito digitos para o segundo
         */
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        int linhaSelecionada = jTable1.getSelectedRow();                   
        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(null, "Selecione o animal a ser Detalhado!");

        } else {

            JAnimal jAnimal = new JAnimal();
            jAnimal.jLabel1.setText("Detalhes do Animal");
            int idselecionada = (Integer) jTable1.getModel().getValueAt(linhaSelecionada, 0);
            jAnimal.mercadoria = idselecionada;
            jAnimal.alterar = 1;

            AnimaisDao dao;
            try {
                dao = new AnimaisDao();
                List<Animais> minhalista = dao.getLista();
                for (Animais animal : minhalista) {
                    if (idselecionada == animal.getId()) {

                        jAnimal.jNomeAnimal.setText(animal.getNome());
                        jAnimal.jNumero.setText(String.valueOf(animal.getNumero()));
                        jAnimal.jPai.setText(animal.getPai());
                        jAnimal.jMae.setText(animal.getMae());
                        jAnimal.jPeso.setText(String.valueOf(animal.getPeso()));
                        jAnimal.jLactacao.setText(String.valueOf(animal.getLactacao()));
                        jAnimal.jNascimento.setText(animal.getNascimento());
                        jAnimal.jDescricao.setText(animal.getDescricao());


                        jAnimal.jTextField9.setText(String.valueOf(idselecionada));

                        jAnimal.jNomeAnimal.setEditable(false);
                        jAnimal.jPai.setEditable(false);
                        jAnimal.jNumero.setEditable(false);
                        jAnimal.jMae.setEditable(false);
                        jAnimal.jLactacao.setEditable(false);
                        jAnimal.jPeso.setEditable(false);
                        jAnimal.jNascimento.setEditable(false);
                        jAnimal.jDescricao.setEditable(false);

                        dispose();


                        jAnimal.jButton1.hide();

                    }
                }
                jAnimal.setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(JCadastroAnimais.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        /**Método que mostrara os detalhes do produto selecionado
         * não sendo possivel editar os campos da nova janela.
         */
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try {
                                                                               
            JVendas jVendas = new JVendas();                                    
            jVendas.setVisible(true);
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(JCadastroClientes.class.getName()).log(Level.SEVERE, null, ex);
        }

        /** Método que retornará o programa para a janela de vendas.
         */

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    new JCadastroAnimais().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(JCadastroAnimais.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

        /**Método que acionara a janela de produtos
         */

    public void adicionaLinha() {     
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.addRow(new String[]{"", ""});
    }
        /** Adiciona uma nova linha à tabela
         */

    public void atualizar(String pesquisa, String categoria) throws SQLException {

        AnimaisDao dao = new AnimaisDao();
        int numMaxLinha = jTable1.getRowCount();

        for (int contador = 0; contador <
                numMaxLinha; contador++) {
            removeLinha(0);
        }

        List<Animais> minhalista = dao.getLista();
        int i = 0;

        for (Animais animal : minhalista) {
            String var = "";
            if (categoria.equals("ID")) {
                String id = String.valueOf(animal.getId());
                for (int j = 0; j < pesquisa.length(); j++) {
                    if (id.length() > j) {
                        var = var + String.valueOf(id.charAt(j));
                    }

                }

                if (var.equals(pesquisa)) {
                    adicionaLinha();
                    jTable1.getModel().setValueAt(animal.getId(), i, 0);
                    jTable1.getModel().setValueAt(animal.getNumero(), i, 1);
                    jTable1.getModel().setValueAt(animal.getNome(), i, 2);
                    jTable1.getModel().setValueAt(animal.getPai(), i, 3);
                    jTable1.getModel().setValueAt(animal.getMae(), i, 4);

                    i++;
                }



            }

            if (categoria.equals("Nome")) {
                String id = String.valueOf(animal.getNome());
                for (int j = 0; j < pesquisa.length(); j++) {
                    if (id.length() > j) {
                        var = var + String.valueOf(id.charAt(j));
                    }

                }

                if (var.equalsIgnoreCase(pesquisa)) {
                    adicionaLinha();
                    jTable1.getModel().setValueAt(animal.getId(), i, 0);
                    jTable1.getModel().setValueAt(animal.getNumero(), i, 1);
                    jTable1.getModel().setValueAt(animal.getNome(), i, 2);
                    jTable1.getModel().setValueAt(animal.getPai(), i, 3);
                    jTable1.getModel().setValueAt(animal.getMae(), i, 4);
                    i++;
                }



            }

            if (categoria.equals("Pai")) {
                String id = String.valueOf(animal.getPai());
                for (int j = 0; j < pesquisa.length(); j++) {
                    if (id.length() > j) {
                        var = var + String.valueOf(id.charAt(j));
                    }

                }
                if (var.equalsIgnoreCase(pesquisa)) {
                    adicionaLinha();
                    jTable1.getModel().setValueAt(animal.getId(), i, 0);
                    jTable1.getModel().setValueAt(animal.getNumero(), i, 1);
                    jTable1.getModel().setValueAt(animal.getNome(), i, 2);
                    jTable1.getModel().setValueAt(animal.getPai(), i, 3);
                    jTable1.getModel().setValueAt(animal.getMae(), i, 4);
                    i++;
                }



            }
             if (categoria.equals("Mae")) {
                String id = String.valueOf(animal.getPai());
                for (int j = 0; j < pesquisa.length(); j++) {
                    if (id.length() > j) {
                        var = var + String.valueOf(id.charAt(j));
                    }

                }
                if (var.equalsIgnoreCase(pesquisa)) {
                    adicionaLinha();
                    jTable1.getModel().setValueAt(animal.getId(), i, 0);
                    jTable1.getModel().setValueAt(animal.getNumero(), i, 1);
                    jTable1.getModel().setValueAt(animal.getNome(), i, 2);
                    jTable1.getModel().setValueAt(animal.getPai(), i, 3);
                    jTable1.getModel().setValueAt(animal.getMae(), i, 4);
                    i++;
                }

             }
            if (categoria.equals("Numero")) {
                String id = String.valueOf(animal.getPai());
                for (int j = 0; j < pesquisa.length(); j++) {
                    if (id.length() > j) {
                        var = var + String.valueOf(id.charAt(j));
                    }

                }
                if (var.equalsIgnoreCase(pesquisa)) {
                    adicionaLinha();
                    jTable1.getModel().setValueAt(animal.getId(), i, 0);
                    jTable1.getModel().setValueAt(animal.getNumero(), i, 1);
                    jTable1.getModel().setValueAt(animal.getNome(), i, 2);
                    jTable1.getModel().setValueAt(animal.getPai(), i, 3);
                    jTable1.getModel().setValueAt(animal.getMae(), i, 4);
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

        AnimaisDao dao = new AnimaisDao();
        int numMaxLinha = jTable1.getRowCount();

        for (int contador = 0; contador <
                numMaxLinha; contador++) {
            removeLinha(0);
        }

        List<Animais> minhalista = dao.getLista();
        int i = 0;
        for (Animais animal : minhalista) {
            adicionaLinha();
            jTable1.getModel().setValueAt(animal.getId(), i, 0);
            jTable1.getModel().setValueAt(animal.getNumero(), i, 1);
            jTable1.getModel().setValueAt(animal.getNome(), i, 2);
            jTable1.getModel().setValueAt(animal.getPai(), i, 3);
            jTable1.getModel().setValueAt(animal.getMae(), i, 4);
            i++;

        }
    }

         /**Método que atualizará a tabela com os produtos cadastrados
         */

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
    public javax.swing.JButton jButton7;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
