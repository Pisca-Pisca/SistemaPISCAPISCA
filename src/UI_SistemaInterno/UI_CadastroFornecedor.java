/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI_SistemaInterno;

import sistemainternopisca.validar;
import Model.DAO.Fornecedores;
import Model.DAO.FornecedoresDAO;
import Model.DAO.Funcionarios;
import Model.DAO.Produtos;
import static java.lang.Thread.sleep;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;

/**
 *
 * @author nicol
 */
public class UI_CadastroFornecedor extends javax.swing.JFrame {

    Fornecedores Fornecedor = new Fornecedores();
    Fornecedores FornecedorRetorno = new Fornecedores();
    FornecedoresDAO fdao = new FornecedoresDAO();
    validar Validar = new validar();

    public UI_CadastroFornecedor(Fornecedores fornecedorRetorno) {
        initComponents();
        FornecedorRetorno = fornecedorRetorno;
        if (FornecedorRetorno.getIdFornecedores() != 0) {
            txtCEP.setText(FornecedorRetorno.getCep());
            txtCNPJ.setText(FornecedorRetorno.getCnpj());
            txtEmail.setText(FornecedorRetorno.getEmail());
            txtEndereco.setText(FornecedorRetorno.getEndereco());
            txtInscricaoEstadual.setText(FornecedorRetorno.getInscricaoEstadual());
            txtRazaoSocial.setText(FornecedorRetorno.getRazaoSocial());
            txtTelefone.setText(FornecedorRetorno.getTelefone());
            txtCidade.setText(FornecedorRetorno.getCidade());
            comboEstado.setSelectedItem(FornecedorRetorno.getEstado());
            txtBairro.setText(FornecedorRetorno.getBairro());
        }

    }

    public void limparDados() {
        txtCEP.setText("");
        txtCNPJ.setText("");
        txtEmail.setText("");
        txtEndereco.setText("");
        txtInscricaoEstadual.setText("");
        txtRazaoSocial.setText("");
        txtTelefone.setText("");
        txtCidade.setText("");
        txtBairro.setText("");
    }

    public UI_CadastroFornecedor() {
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
    }

    public void enviaDados(UI_Login login, Funcionarios funcionarios) {
        String email = funcionarios.getEmail();
        txtUsuario.setText(email);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        baseTela = new javax.swing.JPanel();
        comboEstado = new javax.swing.JComboBox<>();
        txtTelefone = new javax.swing.JFormattedTextField();
        txtCNPJ = new javax.swing.JFormattedTextField();
        txtCEP = new javax.swing.JFormattedTextField();
        txtInscricaoEstadual = new javax.swing.JFormattedTextField();
        txtRazaoSocial = new javax.swing.JTextField();
        txtBusca = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        btnVenda = new javax.swing.JButton();
        btnProdutos = new javax.swing.JButton();
        btnCadastro = new javax.swing.JButton();
        btnFinanceiro = new javax.swing.JButton();
        btnCaixa = new javax.swing.JButton();
        btnEncerrar = new javax.swing.JButton();
        btnEnviar = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnVisualizar = new javax.swing.JLabel();
        txtData = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JLabel();
        imgTela = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        baseTela.setBackground(new java.awt.Color(37, 37, 37));
        baseTela.setPreferredSize(new java.awt.Dimension(1920, 1080));
        baseTela.setLayout(null);

        comboEstado.setBackground(new java.awt.Color(102, 102, 102));
        comboEstado.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        comboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        baseTela.add(comboEstado);
        comboEstado.setBounds(510, 812, 250, 70);

        txtTelefone.setBackground(new java.awt.Color(187, 184, 184));
        txtTelefone.setBorder(null);
        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        baseTela.add(txtTelefone);
        txtTelefone.setBounds(1420, 600, 350, 60);

        txtCNPJ.setBackground(new java.awt.Color(187, 184, 184));
        txtCNPJ.setBorder(null);
        try {
            txtCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCNPJ.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        baseTela.add(txtCNPJ);
        txtCNPJ.setBounds(1420, 490, 350, 60);

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
        txtCEP.setBounds(520, 710, 240, 60);

        txtInscricaoEstadual.setBackground(new java.awt.Color(187, 184, 184));
        txtInscricaoEstadual.setBorder(null);
        txtInscricaoEstadual.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        baseTela.add(txtInscricaoEstadual);
        txtInscricaoEstadual.setBounds(520, 600, 360, 50);

        txtRazaoSocial.setBackground(new java.awt.Color(187, 184, 184));
        txtRazaoSocial.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtRazaoSocial.setBorder(null);
        baseTela.add(txtRazaoSocial);
        txtRazaoSocial.setBounds(520, 492, 840, 50);

        txtBusca.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtBusca.setBorder(null);
        baseTela.add(txtBusca);
        txtBusca.setBounds(780, 340, 650, 40);

        txtEndereco.setBackground(new java.awt.Color(187, 184, 184));
        txtEndereco.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtEndereco.setBorder(null);
        baseTela.add(txtEndereco);
        txtEndereco.setBounds(830, 710, 940, 60);

        txtEmail.setBackground(new java.awt.Color(187, 184, 184));
        txtEmail.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtEmail.setBorder(null);
        baseTela.add(txtEmail);
        txtEmail.setBounds(940, 600, 420, 60);

        txtBairro.setBackground(new java.awt.Color(187, 184, 184));
        txtBairro.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtBairro.setBorder(null);
        baseTela.add(txtBairro);
        txtBairro.setBounds(1350, 820, 420, 50);

        txtCidade.setBackground(new java.awt.Color(187, 184, 184));
        txtCidade.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtCidade.setBorder(null);
        baseTela.add(txtCidade);
        txtCidade.setBounds(830, 820, 450, 50);

        btnVenda.setBorderPainted(false);
        btnVenda.setContentAreaFilled(false);
        btnVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendaActionPerformed(evt);
            }
        });
        baseTela.add(btnVenda);
        btnVenda.setBounds(10, 300, 350, 90);

        btnProdutos.setBorderPainted(false);
        btnProdutos.setContentAreaFilled(false);
        btnProdutos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutosActionPerformed(evt);
            }
        });
        baseTela.add(btnProdutos);
        btnProdutos.setBounds(10, 410, 350, 100);

        btnCadastro.setBorderPainted(false);
        btnCadastro.setContentAreaFilled(false);
        btnCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });
        baseTela.add(btnCadastro);
        btnCadastro.setBounds(10, 520, 350, 100);

        btnFinanceiro.setBorderPainted(false);
        btnFinanceiro.setContentAreaFilled(false);
        btnFinanceiro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFinanceiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinanceiroActionPerformed(evt);
            }
        });
        baseTela.add(btnFinanceiro);
        btnFinanceiro.setBounds(10, 630, 350, 100);

        btnCaixa.setBorderPainted(false);
        btnCaixa.setContentAreaFilled(false);
        btnCaixa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaixaActionPerformed(evt);
            }
        });
        baseTela.add(btnCaixa);
        btnCaixa.setBounds(10, 730, 350, 100);

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

        btnEnviar.setBorderPainted(false);
        btnEnviar.setContentAreaFilled(false);
        btnEnviar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        baseTela.add(btnEnviar);
        btnEnviar.setBounds(970, 960, 350, 80);

        btnSearch.setBorderPainted(false);
        btnSearch.setContentAreaFilled(false);
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        baseTela.add(btnSearch);
        btnSearch.setBounds(1440, 330, 80, 60);

        btnLogout.setBorderPainted(false);
        btnLogout.setContentAreaFilled(false);
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        baseTela.add(btnLogout);
        btnLogout.setBounds(1780, 150, 120, 30);

        btnVisualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnVisualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BTN VISUALIZAÇÃO.png"))); // NOI18N
        btnVisualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVisualizarMouseClicked(evt);
            }
        });
        baseTela.add(btnVisualizar);
        btnVisualizar.setBounds(1720, 320, 60, 60);

        txtData.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtData.setForeground(new java.awt.Color(255, 255, 255));
        txtData.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        baseTela.add(txtData);
        txtData.setBounds(1670, 10, 230, 30);

        txtUsuario.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        baseTela.add(txtUsuario);
        txtUsuario.setBounds(1720, 100, 180, 30);

        imgTela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/FORNECEDOR - CADASTRO.png"))); // NOI18N
        baseTela.add(imgTela);
        imgTela.setBounds(0, 0, 1921, 1080);

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
        UI_Carrinho carrinho = new UI_Carrinho();
        carrinho.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnVendaActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed

        boolean docValido = false;

        docValido = Validar.CNPJValido(txtCNPJ.getText());

        if (docValido) {
            if (FornecedorRetorno.getIdFornecedores() == 0) {
                selecionarCamposFornecedores();
                fdao.Create(Fornecedor);
                limparDados();
            }
            if (FornecedorRetorno.getIdFornecedores() != 0) {
                selecionarCamposFornecedoresUpdate();
                fdao.Update(FornecedorRetorno);
                limparDados();
            }
        } else {
            //MOSTRAR O ERRO
        }
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void btnProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutosActionPerformed
        UI_Catalogo catalogo = new UI_Catalogo();
        catalogo.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnProdutosActionPerformed

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
        UI_SelecaoCadastros selecao = new UI_SelecaoCadastros();
        selecao.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnCadastroActionPerformed

    private void btnFinanceiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinanceiroActionPerformed
        UI_FinanceiroConsulta financeiro = new UI_FinanceiroConsulta();
        financeiro.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnFinanceiroActionPerformed

    private void btnCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaixaActionPerformed
        UI_Caixa caixa = new UI_Caixa();
        caixa.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnCaixaActionPerformed

    private void btnEncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnEncerrarActionPerformed

    private void btnVisualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVisualizarMouseClicked
        UI_VisualizacaoFornecedores visuFornecedor = new UI_VisualizacaoFornecedores();
        visuFornecedor.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnVisualizarMouseClicked

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        UI_Login login = new UI_Login();
        login.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    public void selecionarCamposFornecedores() {
        Fornecedor.setRazaoSocial(txtRazaoSocial.getText());
        Fornecedor.setCnpj(txtCNPJ.getText());
        Fornecedor.setInscricaoEstadual(txtInscricaoEstadual.getText());
        Fornecedor.setEmail(txtEmail.getText());
        Fornecedor.setTelefone(txtTelefone.getText());
        Fornecedor.setCep(txtCEP.getText());
        Fornecedor.setEndereco(txtEndereco.getText());
        Fornecedor.setEstado((String) comboEstado.getSelectedItem());
        Fornecedor.setCidade(txtCidade.getText());
        Fornecedor.setBairro(txtBairro.getText());
    }

    public void selecionarCamposFornecedoresUpdate() {
        FornecedorRetorno.setRazaoSocial(txtRazaoSocial.getText());
        FornecedorRetorno.setCnpj(txtCNPJ.getText());
        FornecedorRetorno.setInscricaoEstadual(txtInscricaoEstadual.getText());
        FornecedorRetorno.setEmail(txtEmail.getText());
        FornecedorRetorno.setTelefone(txtTelefone.getText());
        FornecedorRetorno.setCep(txtCEP.getText());
        FornecedorRetorno.setEndereco(txtEndereco.getText());
        FornecedorRetorno.setEstado((String) comboEstado.getSelectedItem());
        FornecedorRetorno.setCidade(txtCidade.getText());
        FornecedorRetorno.setBairro(txtBairro.getText());
    }

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
            java.util.logging.Logger.getLogger(UI_CadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI_CadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI_CadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_CadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI_CadastroFornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel baseTela;
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnCaixa;
    private javax.swing.JButton btnEncerrar;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnFinanceiro;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnProdutos;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnVenda;
    private javax.swing.JLabel btnVisualizar;
    private javax.swing.JComboBox<String> comboEstado;
    private javax.swing.JLabel imgTela;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtBusca;
    private javax.swing.JFormattedTextField txtCEP;
    private javax.swing.JFormattedTextField txtCNPJ;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JLabel txtData;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JFormattedTextField txtInscricaoEstadual;
    private javax.swing.JTextField txtRazaoSocial;
    private javax.swing.JFormattedTextField txtTelefone;
    private javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables
}
