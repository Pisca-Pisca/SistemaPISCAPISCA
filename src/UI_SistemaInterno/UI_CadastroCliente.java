/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI_SistemaInterno;

import javax.swing.JFrame;

/**
 *
 * @author nicol
 */
public class UI_CadastroCliente extends javax.swing.JFrame {

    /**
     * Creates new form UI_CdastroCliente
     */
    public UI_CadastroCliente() {
        initComponents();
        
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoSelectCadastroCliente = new javax.swing.ButtonGroup();
        baseTala = new javax.swing.JPanel();
        comboEstado = new javax.swing.JComboBox<>();
        txtCEP = new javax.swing.JFormattedTextField();
        txtDataNascimento = new javax.swing.JFormattedTextField();
        txtBusca = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtCPF_CNPJ = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        txtCodigoCliente = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        txtRGInscricao1 = new javax.swing.JTextField();
        txtNomeRazaoSocial = new javax.swing.JTextField();
        txtCelTel = new javax.swing.JTextField();
        btnVenda = new javax.swing.JButton();
        btnProdutos = new javax.swing.JButton();
        btnCadastro = new javax.swing.JButton();
        btnFinanceiro = new javax.swing.JButton();
        btnCaixa = new javax.swing.JButton();
        btnEncerrar = new javax.swing.JButton();
        btnEnviar = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        txtUsuario = new javax.swing.JLabel();
        txtData = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jRadioButton6 = new javax.swing.JRadioButton();
        jPanel7 = new javax.swing.JPanel();
        jRadioButton8 = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        jRadioButton7 = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jRadioButton5 = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jRadioButton4 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        imgTela = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        baseTala.setBackground(new java.awt.Color(37, 37, 37));
        baseTala.setPreferredSize(new java.awt.Dimension(1980, 1220));
        baseTala.setLayout(null);

        comboEstado.setBackground(new java.awt.Color(102, 102, 102));
        comboEstado.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        comboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        comboEstado.setBorder(null);
        baseTala.add(comboEstado);
        comboEstado.setBounds(1664, 886, 140, 70);

        txtCEP.setBackground(new java.awt.Color(187, 184, 184));
        txtCEP.setBorder(null);
        try {
            txtCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCEP.setText("  /  /    ");
        txtCEP.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCEP.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        baseTala.add(txtCEP);
        txtCEP.setBounds(500, 780, 280, 60);

        txtDataNascimento.setBackground(new java.awt.Color(187, 184, 184));
        txtDataNascimento.setBorder(null);
        try {
            txtDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataNascimento.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtDataNascimento.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        baseTala.add(txtDataNascimento);
        txtDataNascimento.setBounds(980, 460, 360, 60);

        txtBusca.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtBusca.setBorder(null);
        baseTala.add(txtBusca);
        txtBusca.setBounds(770, 340, 660, 40);

        txtEndereco.setBackground(new java.awt.Color(187, 184, 184));
        txtEndereco.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtEndereco.setBorder(null);
        baseTala.add(txtEndereco);
        txtEndereco.setBounds(830, 780, 960, 60);

        txtCPF_CNPJ.setBackground(new java.awt.Color(187, 184, 184));
        txtCPF_CNPJ.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtCPF_CNPJ.setBorder(null);
        baseTala.add(txtCPF_CNPJ);
        txtCPF_CNPJ.setBounds(1400, 460, 390, 60);

        txtEmail.setBackground(new java.awt.Color(187, 184, 184));
        txtEmail.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtEmail.setBorder(null);
        baseTala.add(txtEmail);
        txtEmail.setBounds(500, 680, 770, 50);

        txtBairro.setBackground(new java.awt.Color(187, 184, 184));
        txtBairro.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtBairro.setBorder(null);
        baseTala.add(txtBairro);
        txtBairro.setBounds(510, 890, 450, 60);

        txtCodigoCliente.setBackground(new java.awt.Color(187, 184, 184));
        txtCodigoCliente.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtCodigoCliente.setBorder(null);
        baseTala.add(txtCodigoCliente);
        txtCodigoCliente.setBounds(500, 460, 400, 60);

        txtCidade.setBackground(new java.awt.Color(187, 184, 184));
        txtCidade.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtCidade.setBorder(null);
        baseTala.add(txtCidade);
        txtCidade.setBounds(1060, 890, 520, 60);

        txtRGInscricao1.setBackground(new java.awt.Color(187, 184, 184));
        txtRGInscricao1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtRGInscricao1.setBorder(null);
        baseTala.add(txtRGInscricao1);
        txtRGInscricao1.setBounds(1400, 580, 390, 50);

        txtNomeRazaoSocial.setBackground(new java.awt.Color(187, 184, 184));
        txtNomeRazaoSocial.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtNomeRazaoSocial.setBorder(null);
        baseTala.add(txtNomeRazaoSocial);
        txtNomeRazaoSocial.setBounds(500, 580, 840, 60);

        txtCelTel.setBackground(new java.awt.Color(187, 184, 184));
        txtCelTel.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtCelTel.setBorder(null);
        baseTala.add(txtCelTel);
        txtCelTel.setBounds(1330, 680, 450, 60);

        btnVenda.setBorderPainted(false);
        btnVenda.setContentAreaFilled(false);
        btnVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendaActionPerformed(evt);
            }
        });
        baseTala.add(btnVenda);
        btnVenda.setBounds(10, 300, 360, 100);

        btnProdutos.setBorderPainted(false);
        btnProdutos.setContentAreaFilled(false);
        btnProdutos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        baseTala.add(btnProdutos);
        btnProdutos.setBounds(10, 400, 360, 110);

        btnCadastro.setBorderPainted(false);
        btnCadastro.setContentAreaFilled(false);
        btnCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        baseTala.add(btnCadastro);
        btnCadastro.setBounds(10, 520, 360, 100);

        btnFinanceiro.setBorderPainted(false);
        btnFinanceiro.setContentAreaFilled(false);
        btnFinanceiro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        baseTala.add(btnFinanceiro);
        btnFinanceiro.setBounds(10, 630, 360, 100);

        btnCaixa.setBorderPainted(false);
        btnCaixa.setContentAreaFilled(false);
        btnCaixa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        baseTala.add(btnCaixa);
        btnCaixa.setBounds(10, 740, 360, 100);

        btnEncerrar.setBorderPainted(false);
        btnEncerrar.setContentAreaFilled(false);
        btnEncerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        baseTala.add(btnEncerrar);
        btnEncerrar.setBounds(110, 1010, 150, 50);

        btnEnviar.setBorderPainted(false);
        btnEnviar.setContentAreaFilled(false);
        btnEnviar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        baseTala.add(btnEnviar);
        btnEnviar.setBounds(970, 990, 350, 80);

        btnSearch.setBorderPainted(false);
        btnSearch.setContentAreaFilled(false);
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        baseTala.add(btnSearch);
        btnSearch.setBounds(1430, 330, 80, 60);

        btnLogout.setBorderPainted(false);
        btnLogout.setContentAreaFilled(false);
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        baseTala.add(btnLogout);
        btnLogout.setBounds(1790, 150, 110, 30);

        txtUsuario.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        baseTala.add(txtUsuario);
        txtUsuario.setBounds(1720, 100, 200, 30);

        txtData.setForeground(new java.awt.Color(255, 255, 255));
        baseTala.add(txtData);
        txtData.setBounds(1660, 10, 250, 30);

        jPanel8.setBackground(new java.awt.Color(228, 228, 228));

        grupoSelectCadastroCliente.add(jRadioButton6);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        baseTala.add(jPanel8);
        jPanel8.setBounds(1330, 650, 24, 30);

        jPanel7.setBackground(new java.awt.Color(228, 228, 228));

        grupoSelectCadastroCliente.add(jRadioButton8);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jRadioButton8)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        baseTala.add(jPanel7);
        jPanel7.setBounds(1480, 650, 20, 30);

        jPanel6.setBackground(new java.awt.Color(228, 228, 228));

        grupoSelectCadastroCliente.add(jRadioButton3);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jRadioButton3))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        baseTala.add(jPanel6);
        jPanel6.setBounds(1480, 420, 30, 30);

        jPanel5.setBackground(new java.awt.Color(228, 228, 228));

        grupoSelectCadastroCliente.add(jRadioButton7);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        baseTala.add(jPanel5);
        jPanel5.setBounds(1390, 420, 30, 30);

        jPanel4.setBackground(new java.awt.Color(228, 228, 228));

        grupoSelectCadastroCliente.add(jRadioButton5);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jRadioButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jRadioButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        baseTala.add(jPanel4);
        jPanel4.setBounds(1490, 550, 30, 30);

        jPanel3.setBackground(new java.awt.Color(228, 228, 228));

        grupoSelectCadastroCliente.add(jRadioButton4);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButton4)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        baseTala.add(jPanel3);
        jPanel3.setBounds(1390, 550, 30, 30);

        jPanel2.setBackground(new java.awt.Color(228, 228, 228));

        grupoSelectCadastroCliente.add(jRadioButton2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jRadioButton2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jRadioButton2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        baseTala.add(jPanel2);
        jPanel2.setBounds(730, 540, 20, 30);

        jPanel1.setBackground(new java.awt.Color(228, 228, 228));

        grupoSelectCadastroCliente.add(jRadioButton1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jRadioButton1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jRadioButton1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        baseTala.add(jPanel1);
        jPanel1.setBounds(490, 540, 20, 30);

        imgTela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CLIENTE - CADASTRO.jpg"))); // NOI18N
        imgTela.setPreferredSize(new java.awt.Dimension(1920, 1080));
        baseTala.add(imgTela);
        imgTela.setBounds(0, 0, 1920, 1080);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(baseTala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(baseTala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void btnVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVendaActionPerformed

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
            java.util.logging.Logger.getLogger(UI_CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI_CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI_CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI_CadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel baseTala;
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnCaixa;
    private javax.swing.JButton btnEncerrar;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnFinanceiro;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnProdutos;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnVenda;
    private javax.swing.JComboBox<String> comboEstado;
    private javax.swing.ButtonGroup grupoSelectCadastroCliente;
    private javax.swing.JLabel imgTela;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtBusca;
    private javax.swing.JFormattedTextField txtCEP;
    private javax.swing.JTextField txtCPF_CNPJ;
    private javax.swing.JTextField txtCelTel;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCodigoCliente;
    private javax.swing.JLabel txtData;
    private javax.swing.JFormattedTextField txtDataNascimento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNomeRazaoSocial;
    private javax.swing.JTextField txtRGInscricao1;
    private javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables
}
