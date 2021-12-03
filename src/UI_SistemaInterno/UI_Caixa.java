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
        qrCode = new javax.swing.JLabel();
        imgTela = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        baseTela.setBackground(new java.awt.Color(37, 37, 37));
        baseTela.setLayout(null);

        grupoSelectPagamento.add(selectBoleto);
        selectBoleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectBoletoActionPerformed(evt);
            }
        });
        baseTela.add(selectBoleto);
        selectBoleto.setBounds(930, 430, 100, 90);

        grupoSelectPagamento.add(selectDinheiro);
        baseTela.add(selectDinheiro);
        selectDinheiro.setBounds(800, 430, 120, 90);

        grupoSelectPagamento.add(selectCartão);
        baseTela.add(selectCartão);
        selectCartão.setBounds(660, 430, 120, 90);

        btnLogout.setBorderPainted(false);
        btnLogout.setContentAreaFilled(false);
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        baseTela.add(btnLogout);
        btnLogout.setBounds(1752, 97, 137, 51);

        btnSearch.setBorderPainted(false);
        btnSearch.setContentAreaFilled(false);
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        baseTela.add(btnSearch);
        btnSearch.setBounds(970, 300, 90, 60);

        btnFinalizar.setBorderPainted(false);
        btnFinalizar.setContentAreaFilled(false);
        btnFinalizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        baseTela.add(btnFinalizar);
        btnFinalizar.setBounds(720, 900, 290, 90);

        btnCancelar.setBorderPainted(false);
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        baseTela.add(btnCancelar);
        btnCancelar.setBounds(730, 1010, 270, 50);

        btnFechamentoCaixa.setBorderPainted(false);
        btnFechamentoCaixa.setContentAreaFilled(false);
        btnFechamentoCaixa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFechamentoCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFechamentoCaixaActionPerformed(evt);
            }
        });
        baseTela.add(btnFechamentoCaixa);
        btnFechamentoCaixa.setBounds(190, 960, 350, 60);

        txtTotal.setEditable(false);
        txtTotal.setBackground(new java.awt.Color(255, 255, 255));
        txtTotal.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotal.setBorder(null);
        baseTela.add(txtTotal);
        txtTotal.setBounds(120, 460, 485, 58);

        txtTroco.setEditable(false);
        txtTroco.setBackground(new java.awt.Color(255, 255, 255));
        txtTroco.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtTroco.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTroco.setBorder(null);
        baseTela.add(txtTroco);
        txtTroco.setBounds(680, 800, 364, 65);

        txtSubtotal.setEditable(false);
        txtSubtotal.setBackground(new java.awt.Color(196, 196, 196));
        txtSubtotal.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtSubtotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSubtotal.setBorder(null);
        baseTela.add(txtSubtotal);
        txtSubtotal.setBounds(680, 600, 364, 75);

        txtDesconto.setEditable(false);
        txtDesconto.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtDesconto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDesconto.setBorder(null);
        baseTela.add(txtDesconto);
        txtDesconto.setBounds(120, 600, 490, 90);

        txtPesquisa1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtPesquisa1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPesquisa1.setBorder(null);
        baseTela.add(txtPesquisa1);
        txtPesquisa1.setBounds(119, 305, 841, 55);

        txtValorRecebido.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtValorRecebido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValorRecebido.setBorder(null);
        baseTela.add(txtValorRecebido);
        txtValorRecebido.setBounds(130, 790, 470, 80);

        txtUsuario.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        baseTela.add(txtUsuario);
        txtUsuario.setBounds(1730, 60, 160, 30);

        txtCPF.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        baseTela.add(txtCPF);
        txtCPF.setBounds(1220, 550, 530, 40);

        txtPedido.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        baseTela.add(txtPedido);
        txtPedido.setBounds(1260, 400, 470, 30);

        txtData.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        baseTela.add(txtData);
        txtData.setBounds(1230, 430, 530, 30);

        txtNomeVendedor.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        baseTela.add(txtNomeVendedor);
        txtNomeVendedor.setBounds(1290, 470, 460, 30);

        txtNome.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        baseTela.add(txtNome);
        txtNome.setBounds(1250, 510, 530, 40);

        qrCode.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        qrCode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/frame.png"))); // NOI18N
        baseTela.add(qrCode);
        qrCode.setBounds(1300, 630, 390, 380);

        imgTela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CAIXA.jpg"))); // NOI18N
        baseTela.add(imgTela);
        imgTela.setBounds(0, 0, 1920, 1080);

        getContentPane().add(baseTela);
        baseTela.setBounds(0, 0, 1920, 1226);

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
    private javax.swing.JLabel qrCode;
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
