/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI_SistemaInterno;

import Model.DAO.Funcionarios;
import static java.lang.Thread.sleep;
import java.text.SimpleDateFormat;
import java.util.Date;
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

        new Thread() {

            public void run() {
                try {
                    while (true) {
                        Date d = new Date();
                        StringBuffer data = new StringBuffer();

                        SimpleDateFormat sdfData = new SimpleDateFormat("dd/MM/yyyy");
                        data.append(sdfData.format(d));
                        sleep(1000);
                    }
                } catch (InterruptedException ex) {
                    System.out.println("Problema na atualização da data/hora");
                    ex.printStackTrace();
                }
            }
        }.start();
    }

    public void enviaDados(UI_Caixa caixa, String entradaSistemaCartao, String entradaSistemaDinheiro, String entradaSistemaBoleto) {
        txtDineiroEntradaSistema.setText(entradaSistemaDinheiro);
        txtCartaoEntradaSistema.setText(entradaSistemaCartao);
        txtBoletoEntradaSistema.setText(entradaSistemaBoleto);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        baseTela = new javax.swing.JPanel();
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
        btnTotais = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        txtUsuario = new javax.swing.JLabel();
        imgTela = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        baseTela.setBackground(new java.awt.Color(37, 37, 37));
        baseTela.setPreferredSize(new java.awt.Dimension(1920, 1080));
        baseTela.setLayout(null);

        txtDinheiroValorGaveta.setBackground(new java.awt.Color(187, 184, 184));
        txtDinheiroValorGaveta.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtDinheiroValorGaveta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDinheiroValorGaveta.setBorder(null);
        baseTela.add(txtDinheiroValorGaveta);
        txtDinheiroValorGaveta.setBounds(880, 612, 190, 128);

        txtCartaoValorGaveta.setBackground(new java.awt.Color(187, 184, 184));
        txtCartaoValorGaveta.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtCartaoValorGaveta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCartaoValorGaveta.setBorder(null);
        baseTela.add(txtCartaoValorGaveta);
        txtCartaoValorGaveta.setBounds(880, 422, 190, 133);

        txtBoletoValorGaveta.setBackground(new java.awt.Color(187, 184, 184));
        txtBoletoValorGaveta.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtBoletoValorGaveta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBoletoValorGaveta.setBorder(null);
        baseTela.add(txtBoletoValorGaveta);
        txtBoletoValorGaveta.setBounds(880, 812, 190, 129);

        txtEntradaSistema.setBackground(new java.awt.Color(255, 184, 0));
        txtEntradaSistema.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        txtEntradaSistema.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEntradaSistema.setBorder(null);
        baseTela.add(txtEntradaSistema);
        txtEntradaSistema.setBounds(1620, 440, 230, 110);

        txtTotalGaveta.setBackground(new java.awt.Color(255, 184, 0));
        txtTotalGaveta.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        txtTotalGaveta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotalGaveta.setBorder(null);
        baseTela.add(txtTotalGaveta);
        txtTotalGaveta.setBounds(1620, 652, 230, 90);

        txtFaltaSobra.setBackground(new java.awt.Color(255, 184, 0));
        txtFaltaSobra.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        txtFaltaSobra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFaltaSobra.setBorder(null);
        baseTela.add(txtFaltaSobra);
        txtFaltaSobra.setBounds(1630, 862, 220, 79);

        txtBoletoFaltaSobra.setBackground(new java.awt.Color(187, 184, 184));
        txtBoletoFaltaSobra.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtBoletoFaltaSobra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBoletoFaltaSobra.setBorder(null);
        baseTela.add(txtBoletoFaltaSobra);
        txtBoletoFaltaSobra.setBounds(1170, 800, 220, 140);

        txtDinheiroFaltaSobra.setBackground(new java.awt.Color(187, 184, 184));
        txtDinheiroFaltaSobra.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtDinheiroFaltaSobra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDinheiroFaltaSobra.setBorder(null);
        baseTela.add(txtDinheiroFaltaSobra);
        txtDinheiroFaltaSobra.setBounds(1160, 600, 230, 140);

        txtCartaoFaltaSobra.setBackground(new java.awt.Color(187, 184, 184));
        txtCartaoFaltaSobra.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtCartaoFaltaSobra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCartaoFaltaSobra.setBorder(null);
        baseTela.add(txtCartaoFaltaSobra);
        txtCartaoFaltaSobra.setBounds(1170, 422, 220, 129);

        txtBoletoEntradaSistema.setBackground(new java.awt.Color(187, 184, 184));
        txtBoletoEntradaSistema.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtBoletoEntradaSistema.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBoletoEntradaSistema.setBorder(null);
        baseTela.add(txtBoletoEntradaSistema);
        txtBoletoEntradaSistema.setBounds(520, 812, 270, 127);

        txtDineiroEntradaSistema.setBackground(new java.awt.Color(187, 184, 184));
        txtDineiroEntradaSistema.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtDineiroEntradaSistema.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDineiroEntradaSistema.setBorder(null);
        baseTela.add(txtDineiroEntradaSistema);
        txtDineiroEntradaSistema.setBounds(510, 600, 280, 140);

        txtCartaoEntradaSistema.setBackground(new java.awt.Color(187, 184, 184));
        txtCartaoEntradaSistema.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtCartaoEntradaSistema.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCartaoEntradaSistema.setBorder(null);
        txtCartaoEntradaSistema.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        baseTela.add(txtCartaoEntradaSistema);
        txtCartaoEntradaSistema.setBounds(490, 422, 300, 128);

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

        btnTotais.setBorderPainted(false);
        btnTotais.setContentAreaFilled(false);
        btnTotais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotaisActionPerformed(evt);
            }
        });
        baseTela.add(btnTotais);
        btnTotais.setBounds(1500, 310, 370, 70);

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

    private void btnTotaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotaisActionPerformed
        double somaTotalSistema = 0, somaTotalgaveta = 200, somaTotalQuebra = 0;
        
        double sistemaBoleto = Double.parseDouble(txtBoletoEntradaSistema.getText());
        double sistemaDinheiro = Double.parseDouble(txtDineiroEntradaSistema.getText());
        double sistemaCartao = Double.parseDouble(txtCartaoEntradaSistema.getText());

        double gavetaBoleto = Double.parseDouble(txtBoletoValorGaveta.getText());
        double gavetaDinheiro = Double.parseDouble(txtDinheiroValorGaveta.getText());
        double gavetaCartao = Double.parseDouble(txtCartaoValorGaveta.getText());

        double quebraBoleto = gavetaBoleto - sistemaBoleto;
        double quebraDinheiro = gavetaDinheiro - sistemaDinheiro;
        double quebraCartao = gavetaCartao - sistemaCartao;
        
       txtBoletoFaltaSobra.setText(String.valueOf(quebraBoleto));
       txtDinheiroFaltaSobra.setText(String.valueOf(quebraDinheiro));
       txtCartaoFaltaSobra.setText(String.valueOf(quebraCartao));

        somaTotalSistema = somaTotalSistema + sistemaBoleto + sistemaCartao + sistemaDinheiro;
        
        somaTotalgaveta = somaTotalgaveta + gavetaBoleto + gavetaCartao + gavetaDinheiro;
        
        somaTotalQuebra = somaTotalQuebra + (quebraBoleto) + (quebraCartao) + (quebraDinheiro);
        
        txtEntradaSistema.setText(String.valueOf(somaTotalSistema));
        txtTotalGaveta.setText(String.valueOf(somaTotalgaveta));
        txtFaltaSobra.setText(String.valueOf(somaTotalQuebra));
    }//GEN-LAST:event_btnTotaisActionPerformed

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
    private javax.swing.JButton btnTotais;
    private javax.swing.JLabel imgTela;
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
