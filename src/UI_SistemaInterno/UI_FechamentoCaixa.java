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

        jPanel1.setBackground(new java.awt.Color(37, 37, 37));
        jPanel1.setBorder(null);
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("21/05/2021");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-20, -10, 307, 62);

        txtDinheiroValorGaveta.setBackground(new java.awt.Color(187, 184, 184));
        txtDinheiroValorGaveta.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtDinheiroValorGaveta.setBorder(null);

        txtCartaoValorGaveta.setBackground(new java.awt.Color(187, 184, 184));
        txtCartaoValorGaveta.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtCartaoValorGaveta.setBorder(null);

        txtBoletoValorGaveta.setBackground(new java.awt.Color(187, 184, 184));
        txtBoletoValorGaveta.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtBoletoValorGaveta.setBorder(null);

        txtEntradaSistema.setBackground(new java.awt.Color(255, 184, 0));
        txtEntradaSistema.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtEntradaSistema.setBorder(null);

        txtTotalGaveta.setBackground(new java.awt.Color(255, 184, 0));
        txtTotalGaveta.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtTotalGaveta.setBorder(null);

        txtFaltaSobra.setBackground(new java.awt.Color(255, 184, 0));
        txtFaltaSobra.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtFaltaSobra.setBorder(null);

        txtBoletoFaltaSobra.setBackground(new java.awt.Color(187, 184, 184));
        txtBoletoFaltaSobra.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtBoletoFaltaSobra.setBorder(null);

        txtDinheiroFaltaSobra.setBackground(new java.awt.Color(187, 184, 184));
        txtDinheiroFaltaSobra.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtDinheiroFaltaSobra.setBorder(null);

        txtCartaoFaltaSobra.setBackground(new java.awt.Color(187, 184, 184));
        txtCartaoFaltaSobra.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtCartaoFaltaSobra.setBorder(null);

        txtBoletoEntradaSistema.setBackground(new java.awt.Color(187, 184, 184));
        txtBoletoEntradaSistema.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtBoletoEntradaSistema.setBorder(null);

        txtDineiroEntradaSistema.setBackground(new java.awt.Color(187, 184, 184));
        txtDineiroEntradaSistema.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtDineiroEntradaSistema.setBorder(null);

        txtCartaoEntradaSistema.setBackground(new java.awt.Color(187, 184, 184));
        txtCartaoEntradaSistema.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtCartaoEntradaSistema.setBorder(null);
        txtCartaoEntradaSistema.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnCancelar.setBorderPainted(false);
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnLogout.setBorderPainted(false);
        btnLogout.setContentAreaFilled(false);
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnConfirmar.setBorderPainted(false);
        btnConfirmar.setContentAreaFilled(false);
        btnConfirmar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txtUsuario.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));

        imgTela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/FECHAMENTO DE CAIXA.png"))); // NOI18N

        javax.swing.GroupLayout baseTelaLayout = new javax.swing.GroupLayout(baseTela);
        baseTela.setLayout(baseTelaLayout);
        baseTelaLayout.setHorizontalGroup(
            baseTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(1730, 1730, 1730)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(1770, 1770, 1770)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(1010, 1010, 1010)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(420, 420, 420)
                .addComponent(txtCartaoEntradaSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtCartaoValorGaveta, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtCartaoFaltaSobra, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140)
                .addComponent(txtEntradaSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(420, 420, 420)
                .addComponent(txtDineiroEntradaSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtDinheiroValorGaveta, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtDinheiroFaltaSobra, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140)
                .addComponent(txtTotalGaveta, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(420, 420, 420)
                .addComponent(txtBoletoEntradaSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtBoletoValorGaveta, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtBoletoFaltaSobra, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140)
                .addComponent(txtFaltaSobra, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(1290, 1290, 1290)
                .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(imgTela)
        );
        baseTelaLayout.setVerticalGroup(
            baseTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112)
                .addGroup(baseTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(baseTelaLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtEntradaSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtCartaoFaltaSobra, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCartaoValorGaveta, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCartaoEntradaSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(baseTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDineiroEntradaSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDinheiroFaltaSobra, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(baseTelaLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(txtTotalGaveta, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(baseTelaLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(txtDinheiroValorGaveta, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 58, 58)
                .addGroup(baseTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBoletoFaltaSobra, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(baseTelaLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(txtBoletoEntradaSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(baseTelaLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(txtBoletoValorGaveta, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(baseTelaLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(txtFaltaSobra, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(71, 71, 71)
                .addGroup(baseTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addComponent(imgTela)
        );

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
