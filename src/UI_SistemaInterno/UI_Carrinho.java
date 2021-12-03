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
import java.util.Random;


/**
 *
 * @author jessi
 */
public class UI_Carrinho extends javax.swing.JFrame {

    
    public UI_Carrinho() {
        initComponents();

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
        btnVenda = new javax.swing.JButton();
        btnProdutos = new javax.swing.JButton();
        btnCadastros = new javax.swing.JButton();
        btnEncerrar = new javax.swing.JButton();
        btnCaixa = new javax.swing.JButton();
        btnFinanceiro = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtCodigo = new javax.swing.JLabel();
        txtDataHora = new javax.swing.JLabel();
        txtVendedor = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        btnPesquisaCliente = new javax.swing.JButton();
        txtBuscaProduto = new javax.swing.JTextField();
        txtCPF = new javax.swing.JLabel();
        txtEmail = new javax.swing.JLabel();
        txtCelular = new javax.swing.JLabel();
        txtEndereço = new javax.swing.JLabel();
        btnPesquisaProduto = new javax.swing.JButton();
        txtQtdItens = new javax.swing.JLabel();
        txtValorTotal = new javax.swing.JLabel();
        btnCartao = new javax.swing.JButton();
        btnDinheiro = new javax.swing.JButton();
        btnBoleto = new javax.swing.JButton();
        btnEnviar = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        txtData = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JLabel();
        imgTela = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        baseTela.setBackground(new java.awt.Color(57, 57, 57));

        btnVenda.setBorderPainted(false);
        btnVenda.setContentAreaFilled(false);
        btnVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendaActionPerformed(evt);
            }
        });

        btnProdutos.setBorderPainted(false);
        btnProdutos.setContentAreaFilled(false);
        btnProdutos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutosActionPerformed(evt);
            }
        });

        btnCadastros.setBorderPainted(false);
        btnCadastros.setContentAreaFilled(false);
        btnCadastros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrosActionPerformed(evt);
            }
        });

        btnEncerrar.setBorderPainted(false);
        btnEncerrar.setContentAreaFilled(false);
        btnEncerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncerrarActionPerformed(evt);
            }
        });

        btnCaixa.setBorderPainted(false);
        btnCaixa.setContentAreaFilled(false);
        btnCaixa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaixaActionPerformed(evt);
            }
        });

        btnFinanceiro.setBorderPainted(false);
        btnFinanceiro.setContentAreaFilled(false);
        btnFinanceiro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFinanceiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinanceiroActionPerformed(evt);
            }
        });

        btnCancelar.setBorderPainted(false);
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtCodigo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(153, 153, 153));

        txtDataHora.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txtDataHora.setForeground(new java.awt.Color(153, 153, 153));

        txtVendedor.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txtVendedor.setForeground(new java.awt.Color(153, 153, 153));

        txtCliente.setBackground(new java.awt.Color(187, 184, 184));
        txtCliente.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtCliente.setBorder(null);

        btnPesquisaCliente.setBorderPainted(false);
        btnPesquisaCliente.setContentAreaFilled(false);

        txtBuscaProduto.setBackground(new java.awt.Color(187, 184, 184));
        txtBuscaProduto.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtBuscaProduto.setBorder(null);

        txtCPF.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N

        txtEmail.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N

        txtCelular.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N

        txtEndereço.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N

        btnPesquisaProduto.setBorderPainted(false);
        btnPesquisaProduto.setContentAreaFilled(false);
        btnPesquisaProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txtQtdItens.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N

        txtValorTotal.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N

        btnCartao.setBorderPainted(false);
        btnCartao.setContentAreaFilled(false);
        btnCartao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnDinheiro.setBorderPainted(false);
        btnDinheiro.setContentAreaFilled(false);
        btnDinheiro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnBoleto.setBorderPainted(false);
        btnBoleto.setContentAreaFilled(false);
        btnBoleto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnEnviar.setBorderPainted(false);
        btnEnviar.setContentAreaFilled(false);
        btnEnviar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnLogout.setBorderPainted(false);
        btnLogout.setContentAreaFilled(false);
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        txtData.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtData.setForeground(new java.awt.Color(255, 255, 255));
        txtData.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        txtUsuario.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        imgTela.setForeground(new java.awt.Color(187, 184, 184));
        imgTela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CARRINHO CLIENTE.png"))); // NOI18N

        javax.swing.GroupLayout baseTelaLayout = new javax.swing.GroupLayout(baseTela);
        baseTela.setLayout(baseTelaLayout);
        baseTelaLayout.setHorizontalGroup(
            baseTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(1420, 1420, 1420)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(720, 720, 720)
                .addComponent(txtBuscaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(btnCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(1240, 1240, 1240)
                .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(1300, 1300, 1300)
                .addComponent(btnPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(1130, 1130, 1130)
                .addComponent(txtQtdItens, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(btnVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(1670, 1670, 1670)
                .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(960, 960, 960)
                .addComponent(btnDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(980, 980, 980)
                .addComponent(txtVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(1510, 1510, 1510)
                .addComponent(btnPesquisaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(1120, 1120, 1120)
                .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(480, 480, 480)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(680, 680, 680)
                .addComponent(txtDataHora, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(480, 480, 480)
                .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(btnEncerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(btnFinanceiro, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(900, 900, 900)
                .addComponent(btnCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(1780, 1780, 1780)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(1670, 1670, 1670)
                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(440, 440, 440)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(btnCadastros, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(1720, 1720, 1720)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(480, 480, 480)
                .addComponent(txtEndereço, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(imgTela)
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(1420, 1420, 1420)
                .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(1020, 1020, 1020)
                .addComponent(btnBoleto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        baseTelaLayout.setVerticalGroup(
            baseTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(430, 430, 430)
                .addComponent(btnProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(txtBuscaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(btnCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(214, 214, 214)
                .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(476, 476, 476)
                .addComponent(btnPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(1030, 1030, 1030)
                .addComponent(txtQtdItens, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(326, 326, 326)
                .addComponent(btnVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(1016, 1016, 1016)
                .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(1026, 1026, 1026)
                .addComponent(btnDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(400, 400, 400)
                .addComponent(txtVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(656, 656, 656)
                .addComponent(btnPesquisaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(570, 570, 570)
                .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(410, 410, 410)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(410, 410, 410)
                .addComponent(txtDataHora, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(480, 480, 480)
                .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(1016, 1016, 1016)
                .addComponent(btnEncerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(656, 656, 656)
                .addComponent(btnFinanceiro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(1036, 1036, 1036)
                .addComponent(btnCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(1016, 1016, 1016)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(546, 546, 546)
                .addComponent(btnCadastros, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(570, 570, 570)
                .addComponent(txtEndereço, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(imgTela)
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(490, 490, 490)
                .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(1026, 1026, 1026)
                .addComponent(btnBoleto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void btnEncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnEncerrarActionPerformed

    private void btnVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendaActionPerformed
        UI_Carrinho carrinho = new UI_Carrinho();
        carrinho.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnVendaActionPerformed

    private void btnProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutosActionPerformed
        UI_Catalogo catalogo = new UI_Catalogo();
        catalogo.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnProdutosActionPerformed

    private void btnCadastrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrosActionPerformed
        UI_SelecaoCadastros selecao = new UI_SelecaoCadastros();
        selecao.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnCadastrosActionPerformed

    private void btnCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaixaActionPerformed
        UI_Caixa caixa = new UI_Caixa();
        caixa.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnCaixaActionPerformed

    private void btnFinanceiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinanceiroActionPerformed
        UI_FinanceiroConsulta consulta = new UI_FinanceiroConsulta();
        consulta.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnFinanceiroActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        UI_Carrinho cancelar = new UI_Carrinho();
        cancelar.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        UI_Login login = new UI_Login();
        login.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(UI_Carrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI_Carrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI_Carrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_Carrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI_Carrinho().setVisible(true);
            }
        });
    }
    
    //Lógica do carrinho
    public static class itemDeInteresse {

        public String nomeItem;
        public int precoItem;
        public int qntdItem;

        //valores fake, dps será integrado com o BD
        public itemDeInteresse() {
            nomeItem = "n/a";
            precoItem = 0;
            qntdItem = 1;
        }
      public String getNome() {
            return nomeItem;
        }

        public void setNome(String nome) {
            nome = nomeItem;
        }
        
         public int getQntd() {
            return qntdItem;
        }
         
         public void setQntd(int quantidade) {
            quantidade = qntdItem;
            
         }
            //precoItem
           
         public int getPreco() {
             return precoItem;
         }
        
         public void setPreco(int preco) {
            preco = precoItem;
            
         }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel baseTela;
    private javax.swing.JButton btnBoleto;
    private javax.swing.JButton btnCadastros;
    private javax.swing.JButton btnCaixa;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCartao;
    private javax.swing.JButton btnDinheiro;
    private javax.swing.JButton btnEncerrar;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnFinanceiro;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnPesquisaCliente;
    private javax.swing.JButton btnPesquisaProduto;
    private javax.swing.JButton btnProdutos;
    private javax.swing.JButton btnVenda;
    private javax.swing.JLabel imgTela;
    private javax.swing.JTextField txtBuscaProduto;
    private javax.swing.JLabel txtCPF;
    private javax.swing.JLabel txtCelular;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JLabel txtCodigo;
    private javax.swing.JLabel txtData;
    private javax.swing.JLabel txtDataHora;
    private javax.swing.JLabel txtEmail;
    private javax.swing.JLabel txtEndereço;
    private javax.swing.JLabel txtQtdItens;
    private javax.swing.JLabel txtUsuario;
    private javax.swing.JLabel txtValorTotal;
    private javax.swing.JLabel txtVendedor;
    // End of variables declaration//GEN-END:variables

    }
}
