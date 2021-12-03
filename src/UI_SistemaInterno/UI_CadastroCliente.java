/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI_SistemaInterno;

import sistemainternopisca.validar;
import static java.lang.Thread.sleep;
import java.text.SimpleDateFormat;
import java.util.Date;
import Connection.ConnectionFacPisca;
import Model.DAO.Clientes;
import Model.DAO.ClientesDAO;
import Model.DAO.Funcionarios;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author nicol
 */
public class UI_CadastroCliente extends javax.swing.JFrame {

    ConnectionFacPisca conectar = new ConnectionFacPisca(); //acessar os métodos de conexao com o banco
    Clientes NovoCliente = new Clientes(); //acessar os atributos da classe produtos
    Clientes ClienteRetorno = new Clientes();
    ClientesDAO cdao = new ClientesDAO();
    validar Validar = new validar();

    public UI_CadastroCliente(Clientes ClientesRetorno) {
        initComponents();
        ClienteRetorno = ClientesRetorno;

        if (ClienteRetorno.getIdCliente() != 0) {
            if (ClienteRetorno.getCpf() != "") {
                txtCodigoCliente.setText(String.valueOf(ClienteRetorno.getCodigoCliente()));
                txtNomeRazaoSocial.setText(ClienteRetorno.getNomeCliente());
                txtCPF_CNPJ.setText(ClienteRetorno.getCpf());
                txtRGInscricao1.setText(ClienteRetorno.getRg());
                txtDataNascimento.setText(ClienteRetorno.getDateNascimento());
                txtCelTel.setText(ClienteRetorno.getTelefone());
                txtBairro.setText(ClienteRetorno.getBairro());
                txtCidade.setText(ClienteRetorno.getCidade());
                comboEstado.setSelectedIndex(ClienteRetorno.getEstado());
                txtEmail.setText(ClienteRetorno.getEmail());
                txtEndereco.setText(ClienteRetorno.getEndereco());
                txtCEP.setText(ClienteRetorno.getCep());

            }
        }
    }

    public UI_CadastroCliente() {
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
        btnVisualizar = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        imgTela = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        baseTala.setBackground(new java.awt.Color(37, 37, 37));
        baseTala.setPreferredSize(new java.awt.Dimension(1980, 1220));
        baseTala.setLayout(null);

        comboEstado.setBackground(new java.awt.Color(102, 102, 102));
        comboEstado.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        comboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        comboEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEstadoActionPerformed(evt);
            }
        });
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
        txtCEP.setBounds(500, 790, 280, 40);

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
        txtDataNascimento.setBounds(980, 470, 360, 40);

        txtBusca.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtBusca.setBorder(null);
        baseTala.add(txtBusca);
        txtBusca.setBounds(770, 340, 660, 40);

        txtEndereco.setBackground(new java.awt.Color(187, 184, 184));
        txtEndereco.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtEndereco.setBorder(null);
        baseTala.add(txtEndereco);
        txtEndereco.setBounds(830, 790, 960, 40);

        txtCPF_CNPJ.setBackground(new java.awt.Color(187, 184, 184));
        txtCPF_CNPJ.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtCPF_CNPJ.setBorder(null);
        txtCPF_CNPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPF_CNPJActionPerformed(evt);
            }
        });
        baseTala.add(txtCPF_CNPJ);
        txtCPF_CNPJ.setBounds(1400, 470, 390, 40);

        txtEmail.setBackground(new java.awt.Color(187, 184, 184));
        txtEmail.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtEmail.setBorder(null);
        baseTala.add(txtEmail);
        txtEmail.setBounds(500, 680, 770, 50);

        txtBairro.setBackground(new java.awt.Color(187, 184, 184));
        txtBairro.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtBairro.setBorder(null);
        baseTala.add(txtBairro);
        txtBairro.setBounds(510, 900, 450, 40);

        txtCodigoCliente.setBackground(new java.awt.Color(187, 184, 184));
        txtCodigoCliente.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtCodigoCliente.setBorder(null);
        baseTala.add(txtCodigoCliente);
        txtCodigoCliente.setBounds(500, 470, 400, 40);

        txtCidade.setBackground(new java.awt.Color(187, 184, 184));
        txtCidade.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtCidade.setBorder(null);
        baseTala.add(txtCidade);
        txtCidade.setBounds(1060, 900, 520, 40);

        txtRGInscricao1.setBackground(new java.awt.Color(187, 184, 184));
        txtRGInscricao1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtRGInscricao1.setBorder(null);
        txtRGInscricao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRGInscricao1ActionPerformed(evt);
            }
        });
        baseTala.add(txtRGInscricao1);
        txtRGInscricao1.setBounds(1400, 580, 390, 50);

        txtNomeRazaoSocial.setBackground(new java.awt.Color(187, 184, 184));
        txtNomeRazaoSocial.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtNomeRazaoSocial.setBorder(null);
        baseTala.add(txtNomeRazaoSocial);
        txtNomeRazaoSocial.setBounds(500, 590, 840, 40);

        txtCelTel.setBackground(new java.awt.Color(187, 184, 184));
        txtCelTel.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtCelTel.setBorder(null);
        baseTala.add(txtCelTel);
        txtCelTel.setBounds(1330, 680, 450, 50);

        btnVenda.setBorderPainted(false);
        btnVenda.setContentAreaFilled(false);
        btnVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendaActionPerformed(evt);
            }
        });
        baseTala.add(btnVenda);
        btnVenda.setBounds(10, 300, 350, 80);

        btnProdutos.setBorderPainted(false);
        btnProdutos.setContentAreaFilled(false);
        btnProdutos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutosActionPerformed(evt);
            }
        });
        baseTala.add(btnProdutos);
        btnProdutos.setBounds(10, 410, 350, 80);

        btnCadastro.setBorderPainted(false);
        btnCadastro.setContentAreaFilled(false);
        btnCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });
        baseTala.add(btnCadastro);
        btnCadastro.setBounds(10, 530, 350, 70);

        btnFinanceiro.setBorderPainted(false);
        btnFinanceiro.setContentAreaFilled(false);
        btnFinanceiro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFinanceiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinanceiroActionPerformed(evt);
            }
        });
        baseTala.add(btnFinanceiro);
        btnFinanceiro.setBounds(10, 640, 350, 70);

        btnCaixa.setBorderPainted(false);
        btnCaixa.setContentAreaFilled(false);
        btnCaixa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaixaActionPerformed(evt);
            }
        });
        baseTala.add(btnCaixa);
        btnCaixa.setBounds(10, 740, 350, 80);

        btnEncerrar.setBorderPainted(false);
        btnEncerrar.setContentAreaFilled(false);
        btnEncerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncerrarActionPerformed(evt);
            }
        });
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
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        baseTala.add(btnLogout);
        btnLogout.setBounds(1790, 150, 110, 30);

        txtUsuario.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        baseTala.add(txtUsuario);
        txtUsuario.setBounds(1720, 100, 200, 30);

        txtData.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtData.setForeground(new java.awt.Color(255, 255, 255));
        txtData.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        baseTala.add(txtData);
        txtData.setBounds(1660, 10, 250, 30);

        btnVisualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnVisualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BTN VISUALIZAÇÃO.png"))); // NOI18N
        btnVisualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVisualizarMouseClicked(evt);
            }
        });
        baseTala.add(btnVisualizar);
        btnVisualizar.setBounds(1740, 320, 60, 60);

        jPanel6.setBackground(new java.awt.Color(228, 228, 228));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        baseTala.add(jPanel6);
        jPanel6.setBounds(1480, 420, 130, 30);

        imgTela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CLIENTE - CADASTRO.jpg"))); // NOI18N
        imgTela.setPreferredSize(new java.awt.Dimension(1920, 1080));
        baseTala.add(imgTela);
        imgTela.setBounds(0, 0, 1920, 1080);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(baseTala, javax.swing.GroupLayout.PREFERRED_SIZE, 1920, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(baseTala, javax.swing.GroupLayout.PREFERRED_SIZE, 1080, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed

        boolean docValido = false;

        docValido = Validar.CPFValido(txtCPF_CNPJ.getText());

        if (docValido) {
            if (ClienteRetorno.getIdCliente() == 0) {
                selecionarCampos();
                cdao.Create(NovoCliente);
                limparCamposClientes();
            }
            if (ClienteRetorno.getIdCliente() != 0) {
                selecionarProdutoRetorno();
                cdao.Update(ClienteRetorno);
                limparCamposClientes();
            }
        } else {
            //MOSTRAR ERRO AQUI
        }
    }//GEN-LAST:event_btnEnviarActionPerformed

    public void selecionarProdutoRetorno() {
        ClienteRetorno.setCodigoCliente(Integer.parseInt(txtCodigoCliente.getText()));
        ClienteRetorno.setNomeCliente(txtNomeRazaoSocial.getText());
        ClienteRetorno.setCpf(txtCPF_CNPJ.getText());
        ClienteRetorno.setRg(txtRGInscricao1.getText());
        ClienteRetorno.setDateNascimento(txtDataNascimento.getText());
        ClienteRetorno.setEmail(txtEmail.getText());
        ClienteRetorno.setTelefone(txtCelTel.getText());
        ClienteRetorno.setCep(txtCEP.getText());
        ClienteRetorno.setEndereco(txtEndereco.getText());
        ClienteRetorno.setBairro(txtBairro.getText());
        ClienteRetorno.setCidade(txtCidade.getText());
        ClienteRetorno.setEstado(comboEstado.getSelectedIndex());
    }
    private void btnVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendaActionPerformed
        UI_Carrinho carrinho = new UI_Carrinho();
        carrinho.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnVendaActionPerformed

    private void txtRGInscricao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRGInscricao1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRGInscricao1ActionPerformed

    private void comboEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboEstadoActionPerformed

    private void btnEncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnEncerrarActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        UI_Login login = new UI_Login();
        login.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

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
        UI_FinanceiroConsulta consulta = new UI_FinanceiroConsulta();
        consulta.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnFinanceiroActionPerformed

    private void btnCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaixaActionPerformed
        UI_Caixa caixa = new UI_Caixa();
        caixa.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnCaixaActionPerformed

    private void btnVisualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVisualizarMouseClicked
        UI_VisualizacaoClientes visuClientes = new UI_VisualizacaoClientes();
        visuClientes.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnVisualizarMouseClicked

    private void txtCPF_CNPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPF_CNPJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPF_CNPJActionPerformed

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

    private void selecionarCampos() {

        NovoCliente.setCodigoCliente(Integer.parseInt(txtCodigoCliente.getText()));
        NovoCliente.setNomeCliente(txtNomeRazaoSocial.getText());
        NovoCliente.setCpf(txtCPF_CNPJ.getText());
        NovoCliente.setRg(txtRGInscricao1.getText());
        NovoCliente.setDateNascimento(txtDataNascimento.getText());
        NovoCliente.setEmail(txtEmail.getText());
        NovoCliente.setTelefone(txtCelTel.getText());
        NovoCliente.setCep(txtCEP.getText());
        NovoCliente.setEndereco(txtEndereco.getText());
        NovoCliente.setBairro(txtBairro.getText());
        NovoCliente.setCidade(txtCidade.getText());
        NovoCliente.setEstado(comboEstado.getSelectedIndex());

    }

    private void limparCamposClientes() {

        txtBairro.setText("");
        txtCEP.setText("");
        txtCPF_CNPJ.setText("");
        txtCelTel.setText("");
        txtCidade.setText("");
        txtCodigoCliente.setText("");
        txtDataNascimento.setText("");
        txtEmail.setText("");
        txtEndereco.setText("");
        txtNomeRazaoSocial.setText("");
        txtRGInscricao1.setText("");

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
    private javax.swing.JLabel btnVisualizar;
    private javax.swing.JComboBox<String> comboEstado;
    private javax.swing.ButtonGroup grupoSelectCadastroCliente;
    private javax.swing.JLabel imgTela;
    private javax.swing.JPanel jPanel6;
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
