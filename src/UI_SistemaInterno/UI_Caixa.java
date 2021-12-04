/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI_SistemaInterno;

import Model.DAO.Funcionarios;
import javax.swing.JFrame;

/**
 *
 * @author nicol
 */
public class UI_Caixa extends javax.swing.JFrame {

    /**
     * Creates new form UI_Caixa
     */
    public UI_Caixa() {
        initComponents();

        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    public void enviaDados(UI_Login login, Funcionarios funcionarios) {
        String email = funcionarios.getEmail();
        txtUsuario.setText(email);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoSelectPagamento = new javax.swing.ButtonGroup();
        baseTela = new javax.swing.JPanel();
        selectBoleto = new javax.swing.JRadioButton();
        selectDinheiro = new javax.swing.JRadioButton();
        selectCartão = new javax.swing.JRadioButton();
        btnLogout = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnFinalizar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnFechamentoCaixa = new javax.swing.JButton();
        txtTotal = new javax.swing.JTextField();
        txtTroco = new javax.swing.JTextField();
        txtSubtotal = new javax.swing.JTextField();
        txtDesconto = new javax.swing.JTextField();
        txtPesquisa1 = new javax.swing.JTextField();
        txtValorRecebido = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JLabel();
        txtCPF = new javax.swing.JLabel();
        txtPedido = new javax.swing.JLabel();
        txtData = new javax.swing.JLabel();
        txtNomeVendedor = new javax.swing.JLabel();
        txtNome = new javax.swing.JLabel();
        imgTela = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        baseTela.setBackground(new java.awt.Color(37, 37, 37));

        grupoSelectPagamento.add(selectBoleto);
        selectBoleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectBoletoActionPerformed(evt);
            }
        });

        grupoSelectPagamento.add(selectDinheiro);

        grupoSelectPagamento.add(selectCartão);

        btnLogout.setBorderPainted(false);
        btnLogout.setContentAreaFilled(false);
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnSearch.setBorderPainted(false);
        btnSearch.setContentAreaFilled(false);
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnFinalizar.setBorderPainted(false);
        btnFinalizar.setContentAreaFilled(false);
        btnFinalizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnCancelar.setBorderPainted(false);
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnFechamentoCaixa.setBorderPainted(false);
        btnFechamentoCaixa.setContentAreaFilled(false);
        btnFechamentoCaixa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFechamentoCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFechamentoCaixaActionPerformed(evt);
            }
        });

        txtTotal.setEditable(false);
        txtTotal.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotal.setBorder(null);

        txtTroco.setEditable(false);
        txtTroco.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtTroco.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTroco.setBorder(null);

        txtSubtotal.setEditable(false);
        txtSubtotal.setBackground(new java.awt.Color(196, 196, 196));
        txtSubtotal.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtSubtotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSubtotal.setBorder(null);

        txtDesconto.setEditable(false);
        txtDesconto.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtDesconto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDesconto.setBorder(null);

        txtPesquisa1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtPesquisa1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPesquisa1.setBorder(null);

        txtValorRecebido.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtValorRecebido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValorRecebido.setBorder(null);

        txtUsuario.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        txtCPF.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        txtPedido.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        txtData.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        txtNomeVendedor.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        txtNome.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        imgTela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CAIXA.jpg"))); // NOI18N

        javax.swing.GroupLayout baseTelaLayout = new javax.swing.GroupLayout(baseTela);
        baseTela.setLayout(baseTelaLayout);
        baseTelaLayout.setHorizontalGroup(
            baseTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(1730, 1730, 1730)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(txtPesquisa1, javax.swing.GroupLayout.PREFERRED_SIZE, 841, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(1260, 1260, 1260)
                .addComponent(txtPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(660, 660, 660)
                .addComponent(selectCartão, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(selectDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(selectBoleto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200)
                .addGroup(baseTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(baseTelaLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(txtNomeVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(1220, 1220, 1220)
                .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(baseTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(baseTelaLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtValorRecebido, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(baseTelaLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(btnFechamentoCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(70, 70, 70)
                .addGroup(baseTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTroco, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(baseTelaLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(1250, 1250, 1250)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(1752, 1752, 1752)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(730, 730, 730)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(970, 970, 970)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(imgTela)
        );
        baseTelaLayout.setVerticalGroup(
            baseTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(215, 215, 215)
                .addComponent(txtPesquisa1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(txtPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(baseTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectCartão, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectBoleto, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(baseTelaLayout.createSequentialGroup()
                        .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtNomeVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(baseTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(baseTelaLayout.createSequentialGroup()
                        .addComponent(txtDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(txtValorRecebido, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(btnFechamentoCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(baseTelaLayout.createSequentialGroup()
                        .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125)
                        .addComponent(txtTroco, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(510, 510, 510)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(1010, 1010, 1010)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(460, 460, 460)
                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(imgTela)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(baseTela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(baseTela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFechamentoCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFechamentoCaixaActionPerformed
        UI_FechamentoCaixa fechamento = new UI_FechamentoCaixa();
        fechamento.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnFechamentoCaixaActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        UI_Login login = new UI_Login();
        login.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        UI_Caixa caixa = new UI_Caixa();
        caixa.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void selectBoletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectBoletoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectBoletoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UI_Caixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI_Caixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI_Caixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_Caixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI_Caixa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel baseTela;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnFechamentoCaixa;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnSearch;
    private javax.swing.ButtonGroup grupoSelectPagamento;
    private javax.swing.JLabel imgTela;
    private javax.swing.JRadioButton selectBoleto;
    private javax.swing.JRadioButton selectCartão;
    private javax.swing.JRadioButton selectDinheiro;
    private javax.swing.JLabel txtCPF;
    private javax.swing.JLabel txtData;
    private javax.swing.JTextField txtDesconto;
    private javax.swing.JLabel txtNome;
    private javax.swing.JLabel txtNomeVendedor;
    private javax.swing.JLabel txtPedido;
    private javax.swing.JTextField txtPesquisa1;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtTroco;
    private javax.swing.JLabel txtUsuario;
    private javax.swing.JTextField txtValorRecebido;
    // End of variables declaration//GEN-END:variables
}
