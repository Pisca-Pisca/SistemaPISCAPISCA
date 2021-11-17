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
public class UI_FechamentoCaixa extends javax.swing.JFrame {

    /**
     * Creates new form UI_FechamentoCaixa
     */
    public UI_FechamentoCaixa() {
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

        baseTela = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtDinheiroValorGaveta = new javax.swing.JTextField();
        txtCartaoValorGaveta = new javax.swing.JTextField();
        txtBoletoValorGaveta = new javax.swing.JTextField();
        txtEntradaSistema = new javax.swing.JTextField();
        txtTotalGaveta = new javax.swing.JTextField();
        txtFaltaSobra = new javax.swing.JTextField();
        txtBoletoFaltaSobra = new javax.swing.JTextField();
        txtDinheiroFaltaSobra = new javax.swing.JTextField();
        txtCartaoFaltaSobra = new javax.swing.JTextField();
        txtBoletoEntradaSistema = new javax.swing.JTextField();
        txtDineiroEntradaSistema = new javax.swing.JTextField();
        txtCartaoEntradaSistema = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        txtUsuario = new javax.swing.JLabel();
        imgTela = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        baseTela.setBackground(new java.awt.Color(37, 37, 37));
        baseTela.setPreferredSize(new java.awt.Dimension(1920, 1080));
        baseTela.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(37, 37, 37));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("21/05/2021");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-20, -10, 307, 62);

        baseTela.add(jPanel1);
        jPanel1.setBounds(1010, 260, 340, 50);

        txtDinheiroValorGaveta.setBackground(new java.awt.Color(187, 184, 184));
        txtDinheiroValorGaveta.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtDinheiroValorGaveta.setBorder(null);
        baseTela.add(txtDinheiroValorGaveta);
        txtDinheiroValorGaveta.setBounds(800, 612, 270, 128);

        txtCartaoValorGaveta.setBackground(new java.awt.Color(187, 184, 184));
        txtCartaoValorGaveta.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtCartaoValorGaveta.setBorder(null);
        baseTela.add(txtCartaoValorGaveta);
        txtCartaoValorGaveta.setBounds(800, 422, 270, 133);

        txtBoletoValorGaveta.setBackground(new java.awt.Color(187, 184, 184));
        txtBoletoValorGaveta.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtBoletoValorGaveta.setBorder(null);
        baseTela.add(txtBoletoValorGaveta);
        txtBoletoValorGaveta.setBounds(800, 812, 270, 129);

        txtEntradaSistema.setBackground(new java.awt.Color(255, 184, 0));
        txtEntradaSistema.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtEntradaSistema.setBorder(null);
        baseTela.add(txtEntradaSistema);
        txtEntradaSistema.setBounds(1530, 440, 320, 110);

        txtTotalGaveta.setBackground(new java.awt.Color(255, 184, 0));
        txtTotalGaveta.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtTotalGaveta.setBorder(null);
        baseTela.add(txtTotalGaveta);
        txtTotalGaveta.setBounds(1530, 652, 320, 90);

        txtFaltaSobra.setBackground(new java.awt.Color(255, 184, 0));
        txtFaltaSobra.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtFaltaSobra.setBorder(null);
        baseTela.add(txtFaltaSobra);
        txtFaltaSobra.setBounds(1530, 862, 320, 79);

        txtBoletoFaltaSobra.setBackground(new java.awt.Color(187, 184, 184));
        txtBoletoFaltaSobra.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtBoletoFaltaSobra.setBorder(null);
        baseTela.add(txtBoletoFaltaSobra);
        txtBoletoFaltaSobra.setBounds(1080, 800, 310, 140);

        txtDinheiroFaltaSobra.setBackground(new java.awt.Color(187, 184, 184));
        txtDinheiroFaltaSobra.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtDinheiroFaltaSobra.setBorder(null);
        baseTela.add(txtDinheiroFaltaSobra);
        txtDinheiroFaltaSobra.setBounds(1080, 600, 310, 140);

        txtCartaoFaltaSobra.setBackground(new java.awt.Color(187, 184, 184));
        txtCartaoFaltaSobra.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtCartaoFaltaSobra.setBorder(null);
        baseTela.add(txtCartaoFaltaSobra);
        txtCartaoFaltaSobra.setBounds(1080, 422, 310, 129);

        txtBoletoEntradaSistema.setBackground(new java.awt.Color(187, 184, 184));
        txtBoletoEntradaSistema.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtBoletoEntradaSistema.setBorder(null);
        baseTela.add(txtBoletoEntradaSistema);
        txtBoletoEntradaSistema.setBounds(420, 812, 370, 127);

        txtDineiroEntradaSistema.setBackground(new java.awt.Color(187, 184, 184));
        txtDineiroEntradaSistema.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtDineiroEntradaSistema.setBorder(null);
        baseTela.add(txtDineiroEntradaSistema);
        txtDineiroEntradaSistema.setBounds(420, 600, 370, 140);

        txtCartaoEntradaSistema.setBackground(new java.awt.Color(187, 184, 184));
        txtCartaoEntradaSistema.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtCartaoEntradaSistema.setBorder(null);
        txtCartaoEntradaSistema.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        baseTela.add(txtCartaoEntradaSistema);
        txtCartaoEntradaSistema.setBounds(420, 422, 370, 128);

        btnCancelar.setBorderPainted(false);
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        baseTela.add(btnCancelar);
        btnCancelar.setBounds(1600, 1000, 290, 60);

        btnLogout.setBorderPainted(false);
        btnLogout.setContentAreaFilled(false);
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        baseTela.add(btnLogout);
        btnLogout.setBounds(1770, 110, 110, 30);

        btnConfirmar.setBorderPainted(false);
        btnConfirmar.setContentAreaFilled(false);
        btnConfirmar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        baseTela.add(btnConfirmar);
        btnConfirmar.setBounds(1290, 1000, 290, 60);

        txtUsuario.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        baseTela.add(txtUsuario);
        txtUsuario.setBounds(1730, 60, 156, 30);

        imgTela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/FECHAMENTO DE CAIXA.png"))); // NOI18N
        baseTela.add(imgTela);
        imgTela.setBounds(0, 0, 1920, 1080);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(baseTela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(baseTela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        UI_ModalFechamentoCaixa dialog = new UI_ModalFechamentoCaixa(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnConfirmarActionPerformed

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
            java.util.logging.Logger.getLogger(UI_FechamentoCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI_FechamentoCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI_FechamentoCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_FechamentoCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI_FechamentoCaixa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel baseTela;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel imgTela;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtBoletoEntradaSistema;
    private javax.swing.JTextField txtBoletoFaltaSobra;
    private javax.swing.JTextField txtBoletoValorGaveta;
    private javax.swing.JTextField txtCartaoEntradaSistema;
    private javax.swing.JTextField txtCartaoFaltaSobra;
    private javax.swing.JTextField txtCartaoValorGaveta;
    private javax.swing.JTextField txtDineiroEntradaSistema;
    private javax.swing.JTextField txtDinheiroFaltaSobra;
    private javax.swing.JTextField txtDinheiroValorGaveta;
    private javax.swing.JTextField txtEntradaSistema;
    private javax.swing.JTextField txtFaltaSobra;
    private javax.swing.JTextField txtTotalGaveta;
    private javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables
}
