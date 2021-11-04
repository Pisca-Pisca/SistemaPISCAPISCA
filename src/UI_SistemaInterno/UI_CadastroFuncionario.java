/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI_SistemaInterno;

import Model.DAO.Funcionarios;
import java.awt.image.BufferedImage;
import java.io.File;
import static java.lang.Thread.sleep;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author nicol
 */
public class UI_CadastroFuncionario extends javax.swing.JFrame {

    private final JFileChooser abrirEscolhaArquivo;
    private BufferedImage originalBI;

    /**
     * Creates new form UI_CadastroFuncionario
     */
    public UI_CadastroFuncionario() {
        initComponents();

        setExtendedState(JFrame.MAXIMIZED_BOTH);

        new Thread() {

            public void run() {
                try {
                    while (true) {
                        Date d = new Date();
                        String dataHora;
                        StringBuffer data = new StringBuffer();

                        SimpleDateFormat sdfData = new SimpleDateFormat("dd/MM/yyyy");
                        data.append(sdfData.format(d));
                        data.append(" - ");

                        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                        dataHora = "" + data.toString() + sdf.format(d);
                        txtData.setText(dataHora);
                        sleep(1000);
                    }
                } catch (InterruptedException ex) {
                    System.out.println("Problema na atualização da data/hora");
                    ex.printStackTrace();
                }
            }
        }.start();

        abrirEscolhaArquivo = new JFileChooser();
        abrirEscolhaArquivo.setCurrentDirectory(new File("c:\\images"));
        abrirEscolhaArquivo.setFileFilter(new FileNameExtensionFilter("PNG images", "png"));
    }

    public void enviaDados(UI_Login login, Funcionarios funcionarios) {
        String email = funcionarios.getEmail();
        txtUsuario.setText(email);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gupoSelectTelCel = new javax.swing.ButtonGroup();
        baseTela = new javax.swing.JPanel();
        txtDataDesligamento = new javax.swing.JFormattedTextField();
        txtDataAdimissao = new javax.swing.JFormattedTextField();
        txtDataNascimento = new javax.swing.JFormattedTextField();
        txtCEP = new javax.swing.JFormattedTextField();
        txtCPF = new javax.swing.JFormattedTextField();
        txtRG = new javax.swing.JFormattedTextField();
        txtCodigoCliente = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtNomeCompleto = new javax.swing.JTextField();
        txtBusca = new javax.swing.JTextField();
        txtTelefoneCelular = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        btnSearch1 = new javax.swing.JButton();
        btnVenda = new javax.swing.JButton();
        btnProdutos = new javax.swing.JButton();
        btnCadastro = new javax.swing.JButton();
        btnFinanceiro = new javax.swing.JButton();
        btnEncerrar = new javax.swing.JButton();
        btnCaixa = new javax.swing.JButton();
        btnEnviar = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnEnviarArquivo = new javax.swing.JButton();
        comboTipoAcesso = new javax.swing.JComboBox<>();
        comboEstado = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        txtNomeArquivo = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JLabel();
        txtData = new javax.swing.JLabel();
        imgTela = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        baseTela.setBackground(new java.awt.Color(37, 37, 37));
        baseTela.setPreferredSize(new java.awt.Dimension(1920, 1080));
        baseTela.setLayout(null);

        txtDataDesligamento.setBackground(new java.awt.Color(187, 184, 184));
        txtDataDesligamento.setBorder(null);
        try {
            txtDataDesligamento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataDesligamento.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtDataDesligamento.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        baseTela.add(txtDataDesligamento);
        txtDataDesligamento.setBounds(1600, 560, 210, 60);

        txtDataAdimissao.setBackground(new java.awt.Color(187, 184, 184));
        txtDataAdimissao.setBorder(null);
        try {
            txtDataAdimissao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataAdimissao.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtDataAdimissao.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        baseTela.add(txtDataAdimissao);
        txtDataAdimissao.setBounds(1340, 560, 200, 60);

        txtDataNascimento.setBackground(new java.awt.Color(187, 184, 184));
        txtDataNascimento.setBorder(null);
        try {
            txtDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataNascimento.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtDataNascimento.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        baseTela.add(txtDataNascimento);
        txtDataNascimento.setBounds(1590, 460, 220, 50);

        txtCEP.setBackground(new java.awt.Color(187, 184, 184));
        txtCEP.setBorder(null);
        try {
            txtCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCEP.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCEP.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        baseTela.add(txtCEP);
        txtCEP.setBounds(510, 790, 240, 60);

        txtCPF.setBackground(new java.awt.Color(187, 184, 184));
        txtCPF.setBorder(null);
        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFActionPerformed(evt);
            }
        });
        baseTela.add(txtCPF);
        txtCPF.setBounds(940, 560, 350, 60);

        txtRG.setBackground(new java.awt.Color(187, 184, 184));
        txtRG.setBorder(null);
        try {
            txtRG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtRG.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtRG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRGActionPerformed(evt);
            }
        });
        baseTela.add(txtRG);
        txtRG.setBounds(510, 560, 360, 60);

        txtCodigoCliente.setBackground(new java.awt.Color(187, 184, 184));
        txtCodigoCliente.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtCodigoCliente.setBorder(null);
        baseTela.add(txtCodigoCliente);
        txtCodigoCliente.setBounds(510, 460, 220, 50);

        txtCidade.setBackground(new java.awt.Color(187, 184, 184));
        txtCidade.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtCidade.setBorder(null);
        baseTela.add(txtCidade);
        txtCidade.setBounds(510, 910, 260, 50);

        txtEmail.setBackground(new java.awt.Color(187, 184, 184));
        txtEmail.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtEmail.setBorder(null);
        baseTela.add(txtEmail);
        txtEmail.setBounds(510, 680, 470, 60);

        txtBairro.setBackground(new java.awt.Color(187, 184, 184));
        txtBairro.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtBairro.setBorder(null);
        baseTela.add(txtBairro);
        txtBairro.setBounds(1520, 790, 290, 60);

        txtEndereco.setBackground(new java.awt.Color(187, 184, 184));
        txtEndereco.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtEndereco.setBorder(null);
        baseTela.add(txtEndereco);
        txtEndereco.setBounds(810, 790, 650, 60);

        txtNomeCompleto.setBackground(new java.awt.Color(187, 184, 184));
        txtNomeCompleto.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtNomeCompleto.setBorder(null);
        baseTela.add(txtNomeCompleto);
        txtNomeCompleto.setBounds(1460, 680, 350, 60);

        txtBusca.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtBusca.setBorder(null);
        baseTela.add(txtBusca);
        txtBusca.setBounds(780, 340, 660, 40);

        txtTelefoneCelular.setBackground(new java.awt.Color(187, 184, 184));
        txtTelefoneCelular.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtTelefoneCelular.setBorder(null);
        baseTela.add(txtTelefoneCelular);
        txtTelefoneCelular.setBounds(1040, 460, 480, 50);

        jPasswordField1.setBackground(new java.awt.Color(187, 184, 184));
        jPasswordField1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jPasswordField1.setBorder(null);
        baseTela.add(jPasswordField1);
        jPasswordField1.setBounds(1040, 690, 360, 50);

        btnSearch1.setBorderPainted(false);
        btnSearch1.setContentAreaFilled(false);
        btnSearch1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        baseTela.add(btnSearch1);
        btnSearch1.setBounds(1450, 330, 80, 60);

        btnVenda.setBorderPainted(false);
        btnVenda.setContentAreaFilled(false);
        btnVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendaActionPerformed(evt);
            }
        });
        baseTela.add(btnVenda);
        btnVenda.setBounds(9, 300, 360, 100);

        btnProdutos.setBorderPainted(false);
        btnProdutos.setContentAreaFilled(false);
        btnProdutos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        baseTela.add(btnProdutos);
        btnProdutos.setBounds(9, 400, 360, 110);

        btnCadastro.setBorderPainted(false);
        btnCadastro.setContentAreaFilled(false);
        btnCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        baseTela.add(btnCadastro);
        btnCadastro.setBounds(9, 520, 360, 100);

        btnFinanceiro.setBorderPainted(false);
        btnFinanceiro.setContentAreaFilled(false);
        btnFinanceiro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        baseTela.add(btnFinanceiro);
        btnFinanceiro.setBounds(9, 620, 360, 110);

        btnEncerrar.setBorderPainted(false);
        btnEncerrar.setContentAreaFilled(false);
        btnEncerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        baseTela.add(btnEncerrar);
        btnEncerrar.setBounds(109, 1010, 150, 50);

        btnCaixa.setBorderPainted(false);
        btnCaixa.setContentAreaFilled(false);
        btnCaixa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        baseTela.add(btnCaixa);
        btnCaixa.setBounds(9, 730, 360, 110);

        btnEnviar.setBorderPainted(false);
        btnEnviar.setContentAreaFilled(false);
        btnEnviar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        baseTela.add(btnEnviar);
        btnEnviar.setBounds(1010, 990, 350, 80);

        btnSearch.setBorderPainted(false);
        btnSearch.setContentAreaFilled(false);
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        baseTela.add(btnSearch);
        btnSearch.setBounds(1429, 330, 80, 60);

        btnLogout.setBorderPainted(false);
        btnLogout.setContentAreaFilled(false);
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        baseTela.add(btnLogout);
        btnLogout.setBounds(1789, 150, 110, 30);

        btnEnviarArquivo.setBorderPainted(false);
        btnEnviarArquivo.setContentAreaFilled(false);
        btnEnviarArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarArquivoActionPerformed(evt);
            }
        });
        baseTela.add(btnEnviarArquivo);
        btnEnviarArquivo.setBounds(970, 910, 130, 50);

        comboTipoAcesso.setBackground(new java.awt.Color(102, 102, 102));
        comboTipoAcesso.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        comboTipoAcesso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Operador de caixa", "Funcionário" }));
        baseTela.add(comboTipoAcesso);
        comboTipoAcesso.setBounds(770, 450, 230, 70);

        comboEstado.setBackground(new java.awt.Color(102, 102, 102));
        comboEstado.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        comboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        comboEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEstadoActionPerformed(evt);
            }
        });
        baseTela.add(comboEstado);
        comboEstado.setBounds(820, 900, 100, 70);

        jPanel1.setBackground(new java.awt.Color(228, 228, 228));

        gupoSelectTelCel.add(jRadioButton2);
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButton2)
                .addContainerGap())
        );

        baseTela.add(jPanel1);
        jPanel1.setBounds(1440, 640, 30, 30);

        jPanel2.setBackground(new java.awt.Color(228, 228, 228));

        gupoSelectTelCel.add(jRadioButton1);
        jRadioButton1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jRadioButton1.setPreferredSize(new java.awt.Dimension(120, 18));
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        baseTela.add(jPanel2);
        jPanel2.setBounds(1590, 640, 30, 30);

        txtNomeArquivo.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        baseTela.add(txtNomeArquivo);
        txtNomeArquivo.setBounds(1110, 910, 700, 50);

        txtUsuario.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        baseTela.add(txtUsuario);
        txtUsuario.setBounds(1719, 100, 200, 30);

        txtData.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtData.setForeground(new java.awt.Color(255, 255, 255));
        txtData.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        baseTela.add(txtData);
        txtData.setBounds(1659, 10, 250, 30);

        imgTela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/FUNCIONÁRIO - CADASTRO.png"))); // NOI18N
        baseTela.add(imgTela);
        imgTela.setBounds(0, 0, 1928, 1080);

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

    private void btnVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVendaActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void comboEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboEstadoActionPerformed

    private void txtCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPFActionPerformed

    private void btnEnviarArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarArquivoActionPerformed
        int retornaValor = abrirEscolhaArquivo.showOpenDialog(this);

        if (retornaValor == JFileChooser.APPROVE_OPTION) {
            try {
                originalBI = ImageIO.read(abrirEscolhaArquivo.getSelectedFile());
                txtNomeArquivo.setText("Imagem importada com sucesso !");
            } catch (Exception e) {
                txtNomeArquivo.setText("Falha ao importar a imagem !");
            }
        } else {
            txtNomeArquivo.setText("Nenhum arquivo escolhido !");
        }
    }//GEN-LAST:event_btnEnviarArquivoActionPerformed

    private void txtRGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRGActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(UI_CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI_CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI_CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI_CadastroFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel baseTela;
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnCaixa;
    private javax.swing.JButton btnEncerrar;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnEnviarArquivo;
    private javax.swing.JButton btnFinanceiro;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnProdutos;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSearch1;
    private javax.swing.JButton btnVenda;
    private javax.swing.JComboBox<String> comboEstado;
    private javax.swing.JComboBox<String> comboTipoAcesso;
    private javax.swing.ButtonGroup gupoSelectTelCel;
    private javax.swing.JLabel imgTela;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtBusca;
    private javax.swing.JFormattedTextField txtCEP;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCodigoCliente;
    private javax.swing.JLabel txtData;
    private javax.swing.JFormattedTextField txtDataAdimissao;
    private javax.swing.JFormattedTextField txtDataDesligamento;
    private javax.swing.JFormattedTextField txtDataNascimento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JLabel txtNomeArquivo;
    private javax.swing.JTextField txtNomeCompleto;
    private javax.swing.JFormattedTextField txtRG;
    private javax.swing.JTextField txtTelefoneCelular;
    private javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables
}
