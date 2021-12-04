package UI_SistemaInterno;

import Model.DAO.Funcionarios;
import static java.lang.Thread.sleep;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author jessi
 */
public class UI_Boleto extends javax.swing.JFrame {

    /**
     * Creates new form UI_Boleto
     */
    public UI_Boleto() {
        initComponents();

    }

    public void enviaDados(UI_FinanceiroDadosBoleto financeiro, String dataVencimento, String numeroDocumento, String valor, String nome, String cpf) {
        txtCpfCliente.setText(cpf);
        txtVencimento.setText(dataVencimento);
        txtVencimento1.setText(dataVencimento);
        txtNumeroDocumento.setText(numeroDocumento);
        txtNumeroDocumento1.setText(numeroDocumento);
        txtNomeCliente.setText(nome);
        txtValor.setText(valor);
        txtValor1.setText(valor);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        baseTela = new javax.swing.JPanel();
        btnEncerrar = new javax.swing.JButton();
        btnCaixa = new javax.swing.JButton();
        btnFinanceiro = new javax.swing.JButton();
        btnCadastro = new javax.swing.JButton();
        btnProdutos = new javax.swing.JButton();
        btnVenda = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        txtUsuario = new javax.swing.JLabel();
        txtAgencia = new javax.swing.JLabel();
        txtNumeroDocumento = new javax.swing.JLabel();
        txtNumeroDocumento1 = new javax.swing.JLabel();
        txtCpfBeneficiario = new javax.swing.JLabel();
        txtVencimento = new javax.swing.JLabel();
        txtValor = new javax.swing.JLabel();
        txtVencimento1 = new javax.swing.JLabel();
        txtValor1 = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JLabel();
        txtCpfCliente = new javax.swing.JLabel();
        txtAgencia1 = new javax.swing.JLabel();
        imgTela = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        baseTela.setBackground(new java.awt.Color(57, 57, 57));
        baseTela.setLayout(null);

        btnEncerrar.setBorderPainted(false);
        btnEncerrar.setContentAreaFilled(false);
        btnEncerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncerrarActionPerformed(evt);
            }
        });
        baseTela.add(btnEncerrar);
        btnEncerrar.setBounds(100, 1010, 170, 50);

        btnCaixa.setBorderPainted(false);
        btnCaixa.setContentAreaFilled(false);
        btnCaixa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaixaActionPerformed(evt);
            }
        });
        baseTela.add(btnCaixa);
        btnCaixa.setBounds(0, 760, 370, 50);

        btnFinanceiro.setBorderPainted(false);
        btnFinanceiro.setContentAreaFilled(false);
        btnFinanceiro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFinanceiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinanceiroActionPerformed(evt);
            }
        });
        baseTela.add(btnFinanceiro);
        btnFinanceiro.setBounds(0, 650, 370, 60);

        btnCadastro.setBorderPainted(false);
        btnCadastro.setContentAreaFilled(false);
        btnCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });
        baseTela.add(btnCadastro);
        btnCadastro.setBounds(0, 540, 360, 50);

        btnProdutos.setBorderPainted(false);
        btnProdutos.setContentAreaFilled(false);
        btnProdutos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutosActionPerformed(evt);
            }
        });
        baseTela.add(btnProdutos);
        btnProdutos.setBounds(0, 430, 360, 60);

        btnVenda.setBorderPainted(false);
        btnVenda.setContentAreaFilled(false);
        btnVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendaActionPerformed(evt);
            }
        });
        baseTela.add(btnVenda);
        btnVenda.setBounds(0, 310, 370, 70);

        btnLogout.setBorderPainted(false);
        btnLogout.setContentAreaFilled(false);
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        baseTela.add(btnLogout);
        btnLogout.setBounds(1780, 150, 130, 30);

        btnImprimir.setBorderPainted(false);
        btnImprimir.setContentAreaFilled(false);
        btnImprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        baseTela.add(btnImprimir);
        btnImprimir.setBounds(1530, 990, 170, 70);

        btnSair.setBorderPainted(false);
        btnSair.setContentAreaFilled(false);
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        baseTela.add(btnSair);
        btnSair.setBounds(1730, 990, 170, 70);

        txtUsuario.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        baseTela.add(txtUsuario);
        txtUsuario.setBounds(1710, 100, 190, 30);

        txtAgencia.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtAgencia.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtAgencia.setText("22252-99");
        baseTela.add(txtAgencia);
        txtAgencia.setBounds(1310, 680, 150, 40);

        txtNumeroDocumento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        baseTela.add(txtNumeroDocumento);
        txtNumeroDocumento.setBounds(920, 730, 60, 20);

        txtNumeroDocumento1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        baseTela.add(txtNumeroDocumento1);
        txtNumeroDocumento1.setBounds(800, 440, 130, 20);

        txtCpfBeneficiario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        baseTela.add(txtCpfBeneficiario);
        txtCpfBeneficiario.setBounds(980, 440, 120, 20);

        txtVencimento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        baseTela.add(txtVencimento);
        txtVencimento.setBounds(1330, 630, 140, 20);

        txtValor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        baseTela.add(txtValor);
        txtValor.setBounds(1340, 900, 130, 20);

        txtVencimento1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        baseTela.add(txtVencimento1);
        txtVencimento1.setBounds(1160, 440, 90, 20);

        txtValor1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        baseTela.add(txtValor1);
        txtValor1.setBounds(1340, 470, 130, 20);

        txtNomeCliente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        baseTela.add(txtNomeCliente);
        txtNomeCliente.setBounds(740, 930, 370, 20);

        txtCpfCliente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        baseTela.add(txtCpfCliente);
        txtCpfCliente.setBounds(740, 960, 350, 20);

        txtAgencia1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtAgencia1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtAgencia1.setText("22252-99");
        baseTela.add(txtAgencia1);
        txtAgencia1.setBounds(1040, 390, 150, 40);

        imgTela.setForeground(new java.awt.Color(255, 255, 255));
        imgTela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Boleto (2).png"))); // NOI18N
        baseTela.add(imgTela);
        imgTela.setBounds(0, 0, 1921, 1080);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(baseTela, javax.swing.GroupLayout.PREFERRED_SIZE, 1920, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(baseTela, javax.swing.GroupLayout.PREFERRED_SIZE, 1080, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnEncerrarActionPerformed

    private void btnCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaixaActionPerformed
        UI_Caixa caixa = new UI_Caixa();
        caixa.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnCaixaActionPerformed

    private void btnFinanceiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinanceiroActionPerformed
        UI_FinanceiroConsulta financeiro = new UI_FinanceiroConsulta();
        financeiro.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnFinanceiroActionPerformed

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
        UI_SelecaoCadastros selecao = new UI_SelecaoCadastros();
        selecao.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnCadastroActionPerformed

    private void btnProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutosActionPerformed
        UI_Catalogo catalogo = new UI_Catalogo();
        catalogo.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnProdutosActionPerformed

    private void btnVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendaActionPerformed
        UI_Carrinho carrinho = new UI_Carrinho();
        carrinho.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnVendaActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        UI_Login login = new UI_Login();
        login.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        UI_ModalImpressaoDocumento impressao = new UI_ModalImpressaoDocumento(new javax.swing.JFrame(), true);
        impressao.setVisible(true);
        dispose();

    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        UI_FinanceiroConsulta consulta = new UI_FinanceiroConsulta();
        consulta.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

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
            java.util.logging.Logger.getLogger(UI_Boleto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI_Boleto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI_Boleto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_Boleto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI_Boleto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel baseTela;
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnCaixa;
    private javax.swing.JButton btnEncerrar;
    private javax.swing.JButton btnFinanceiro;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnProdutos;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnVenda;
    private javax.swing.JLabel imgTela;
    private javax.swing.JLabel txtAgencia;
    private javax.swing.JLabel txtAgencia1;
    private javax.swing.JLabel txtCpfBeneficiario;
    private javax.swing.JLabel txtCpfCliente;
    private javax.swing.JLabel txtNomeCliente;
    private javax.swing.JLabel txtNumeroDocumento;
    private javax.swing.JLabel txtNumeroDocumento1;
    private javax.swing.JLabel txtUsuario;
    private javax.swing.JLabel txtValor;
    private javax.swing.JLabel txtValor1;
    private javax.swing.JLabel txtVencimento;
    private javax.swing.JLabel txtVencimento1;
    // End of variables declaration//GEN-END:variables
}
