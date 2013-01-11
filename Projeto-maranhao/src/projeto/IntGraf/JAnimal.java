
package projeto.IntGraf;                                                           
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import projeto.Logica.Animais;
import projeto.dao.AnimaisDao;

/**
 *
 * @author Alex
 */
public class JAnimal extends javax.swing.JFrame {
    int mercadoria;                                                                 
    int alterar;
/**Cria variaveis que sao definidas por outras classes, quando a jenela
 *é usada para alteracao ou visualizacao
 */



    public JAnimal() {
        initComponents();
    }
    public boolean ehInteiroeponto(String s) {             
        char[] c = s.toCharArray();
        boolean d = true;

        for (int i = 0; i < c.length; i++)
        {
            if ((!Character.isDigit(c[i])) && ((c[i] != '.'))  ) {
                d = false;
                break;
            }
        }
        return d;
    }

    public boolean ehInteiro(String s) {
        char[] c = s.toCharArray();
        boolean d = true;

        for (int i = 0; i < c.length; i++)
        {
            if ((!Character.isDigit(c[i]))  ) {
                d = false;
                break;
            }
        }
        return d;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jNomeAnimal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPai = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPeso = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jDescricao = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jMae = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLactacao = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jNascimento = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jNumero = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setText("Cadastro de Produto");

        jLabel2.setText("Nome do animal:");

        jNomeAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNomeAnimalActionPerformed(evt);
            }
        });

        jLabel3.setText("Pai:");

        jPai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPaiActionPerformed(evt);
            }
        });

        jLabel4.setText("Descricao:");

        jLabel8.setText("Peso:");

        jPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPesoActionPerformed(evt);
            }
        });
        jPeso.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPesoFocusLost(evt);
            }
        });
        jPeso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPesoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPesoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPesoKeyTyped(evt);
            }
        });

        jLabel9.setText("Kg");

        jButton1.setText("Adicionar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jDescricao.setColumns(20);
        jDescricao.setRows(5);
        jScrollPane1.setViewportView(jDescricao);

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel16.setText("ID:");

        jTextField9.setEditable(false);

        jLabel5.setText("Mae:");

        jLabel6.setText("Lactação");

        jLactacao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jLactacaoFocusLost(evt);
            }
        });
        jLactacao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jLactacaoKeyReleased(evt);
            }
        });

        jLabel7.setText("Kg");

        jLabel10.setText("Data de Nascimento:");

        jLabel11.setText("Numero:");

        jNumero.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jNumeroFocusLost(evt);
            }
        });
        jNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jNumeroKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(339, 339, 339)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jPai, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jNomeAnimal, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(jLactacao, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jPeso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel7)
                                                        .addComponent(jLabel9))))
                                            .addGap(74, 74, 74))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jMae)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel11)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(766, 766, 766)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel1))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jNomeAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jPai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jMae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLactacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(43, 43, 43))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jNomeAnimal, jPai});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton2});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jNomeAnimal.getText().equals("")) {
        JOptionPane.showMessageDialog(null, "Informe um nome valido!!");
        } else {
        Animais produto = new Animais();

        produto.setNome(jNomeAnimal.getText());
        produto.setNumero(jNumero.getText().equals("") ? 0 : Float.parseFloat(jNumero.getText()));
        produto.setPai(jPai.getText());
        produto.setMae(jMae.getText());
        produto.setLactacao(jLactacao.getText().equals("") ? 0 : Float.parseFloat(jLactacao.getText()));
        produto.setPeso(jPeso.getText().equals("") ? 0 : Float.parseFloat(jPeso.getText()));
        produto.setNascimento(jNascimento.getText());
        produto.setDescricao(jDescricao.getText());
        try {
            AnimaisDao dao = new AnimaisDao();
            if(alterar == 1){
                produto.setId(mercadoria);
                dao.altera(produto);
            }
            else
                dao.adiciona(produto);
        } catch (SQLException ex) {
            Logger.getLogger(JAnimal.class.getName()).log(Level.SEVERE, null, ex);
        }
            JCadastroAnimais jCadastroAnimais;
            try {
                jCadastroAnimais = new JCadastroAnimais();
                jCadastroAnimais.setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(JAnimal.class.getName()).log(Level.SEVERE, null, ex);
            }

            dispose();

        }

        /** Método para receber o que foi digitado nos campos, e atribui esses
         * valores às variaveis
         * 
         * O programa não aceitara que o campo nome fique vazio.
         */

}//GEN-LAST:event_jButton1ActionPerformed

    private void jPaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPaiActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jPaiActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JCadastroAnimais jCadastroAnimais;
        try {
            jCadastroAnimais = new JCadastroAnimais();
            jCadastroAnimais.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(JAnimal.class.getName()).log(Level.SEVERE, null, ex);
        }

        dispose();

        /** Volta para janela principal de produtos.
         */
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jPesoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPesoKeyReleased

        int j=0;
        for(int i =0;i<jPeso.getText().length();i++)
            if(jPeso.getText().charAt(i) == '.')
                j++;
        if(j>1){
            JOptionPane.showMessageDialog(null, "Digite somente um ponto.");
            jPeso.setText("");
        }

        /** Verifica se o usuario digitou apenas um ponto
         * no campo do peso
         */

    }//GEN-LAST:event_jPesoKeyReleased

    private void jPesoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPesoKeyPressed
        
    }//GEN-LAST:event_jPesoKeyPressed

    private void jPesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPesoKeyTyped

    }//GEN-LAST:event_jPesoKeyTyped

    private void jPesoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPesoFocusLost
       if(ehInteiroeponto(jPeso.getText()) == false){
            JOptionPane.showMessageDialog(null, "Digite somente numeros");
            jPeso.setText("");
        }

       /** Verifica se o usuario não digitou letras ou outros
        * caracteres no campo "peso".
        */
    }//GEN-LAST:event_jPesoFocusLost

    private void jNumeroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jNumeroFocusLost

       if(ehInteiroeponto(jNumero.getText()) == false){
            JOptionPane.showMessageDialog(null, "Digite somente numeros");
            jNumero.setText("");
        }

    }//GEN-LAST:event_jNumeroFocusLost

    private void jNumeroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jNumeroKeyReleased
        int j=0;
        for(int i =0;i<jNumero.getText().length();i++)
            if(jNumero.getText().charAt(i) == '.')
                j++;
        if(j>1){
            JOptionPane.showMessageDialog(null, "Digite somente um ponto.");
            jNumero.setText("");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jNumeroKeyReleased

    private void jLactacaoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLactacaoKeyReleased
        int j=0;
        for(int i =0;i<jLactacao.getText().length();i++)
            if(jLactacao.getText().charAt(i) == '.')
                j++;
        if(j>1){
            JOptionPane.showMessageDialog(null, "Digite somente um ponto.");
            jLactacao.setText("");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jLactacaoKeyReleased

    private void jLactacaoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLactacaoFocusLost

       if(ehInteiroeponto(jLactacao.getText()) == false){
            JOptionPane.showMessageDialog(null, "Digite somente numeros");
            jLactacao.setText("");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jLactacaoFocusLost

    private void jNomeAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNomeAnimalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNomeAnimalActionPerformed

    private void jPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPesoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new JAnimal().setVisible(true);
            }
        });
    }
    /**Volta a janela principal de produtos
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    public javax.swing.JTextArea jDescricao;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JTextField jLactacao;
    public javax.swing.JTextField jMae;
    public javax.swing.JTextField jNascimento;
    public javax.swing.JTextField jNomeAnimal;
    public javax.swing.JTextField jNumero;
    public javax.swing.JTextField jPai;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField jPeso;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}

