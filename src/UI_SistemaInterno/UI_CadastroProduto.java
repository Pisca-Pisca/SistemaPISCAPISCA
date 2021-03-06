/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI_SistemaInterno;

import Model.DAO.Fornecedores;
import Model.DAO.FornecedoresDAO;
import java.awt.image.BufferedImage;
import java.io.File;
import Model.DAO.Produtos;
import Model.DAO.ProdutosDAO;
import static java.lang.Thread.sleep;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;
import sistemainternopisca.ManipularImagem;
import javax.swing.JFileChooser;

/**
 *
 * @author nicol
 */
public class UI_CadastroProduto extends javax.swing.JFrame {

    private BufferedImage imagem;

    Produtos P = new Produtos();
    ProdutosDAO dao = new ProdutosDAO();
    Produtos ProdutoRetorno = new Produtos();

    List<Fornecedores> listaFornecedores;
    FornecedoresDAO fdao = new FornecedoresDAO();

    /**
     * Creates new form UI_CadastroProduto
     */
    public UI_CadastroProduto(Produtos ProdutosRetorno) {
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

        ProdutoRetorno = ProdutosRetorno;

        if (ProdutoRetorno.getIdProduto() != 0) {
            txtCodProd.setText(String.valueOf(ProdutoRetorno.getCodigoProduto()));
            txtDescricao.setText(ProdutoRetorno.getNomeProduto());
            txtNFe.setText(ProdutoRetorno.getNotaFiscal());
            txtQtd.setText(String.valueOf(ProdutoRetorno.getQtdProduto()));
            txtValorCompra.setText(String.valueOf(ProdutoRetorno.getValorCompra()));
            txtVoltagem.setText(String.valueOf(ProdutoRetorno.getVoltagem()));
            txtValorVenda.setText(String.valueOf(ProdutoRetorno.getValorVenda()));
            txtSerie.setText(String.valueOf(ProdutoRetorno.getSerie()));
            selectCategoria.setSelectedIndex(ProdutoRetorno.getCategoria());
            selecionarFornecedor.setSelectedIndex(ProdutosRetorno.getIdFornecedor());
        }

    }

    public UI_CadastroProduto() {
        initComponents();
        listarFornecedores();

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
        
        Random codigoProduto = new Random();
        int codigo = codigoProduto.nextInt(500000) + 1;

        txtCodProd.setText(String.valueOf(codigo));
    }

    private void listarFornecedores() {
        listaFornecedores = fdao.Read();
        selecionarFornecedor.removeAllItems();

        for (int i = 0; i < listaFornecedores.size(); i++) {
            selecionarFornecedor.addItem(listaFornecedores.get(i).getRazaoSocial());
        }
    }

    private void limparCamposProdutos() {

        txtCodProd.setText("");
        txtDescricao.setText("");
        txtQtd.setText("");
        txtValorCompra.setText("");
        txtValorVenda.setText("");
        txtVoltagem.setText("");
        txtNFe.setText("");
        txtSerie.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnFinanceiro = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnCaixa = new javax.swing.JButton();
        btnEncerrar = new javax.swing.JButton();
        btnEnviar = new javax.swing.JButton();
        btnVenda = new javax.swing.JButton();
        btnProdutos = new javax.swing.JButton();
        btnCadastro = new javax.swing.JButton();
        selecionarFornecedor = new javax.swing.JComboBox<>();
        txtValorCompra = new javax.swing.JTextField();
        txtValorVenda = new javax.swing.JTextField();
        txtNFe = new javax.swing.JTextField();
        txtSerie = new javax.swing.JTextField();
        txtDescricao = new javax.swing.JTextField();
        txtQtd = new javax.swing.JTextField();
        txtVoltagem = new javax.swing.JTextField();
        txtCodProd = new javax.swing.JTextField();
        txtData = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnEnviarArquivo = new javax.swing.JButton();
        txtNomeArquivo = new javax.swing.JLabel();
        txtBusca = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        selectCategoria = new javax.swing.JComboBox<>();
        imgTela = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);

        btnFinanceiro.setBorderPainted(false);
        btnFinanceiro.setContentAreaFilled(false);
        btnFinanceiro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFinanceiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinanceiroActionPerformed(evt);
            }
        });
        getContentPane().add(btnFinanceiro);
        btnFinanceiro.setBounds(0, 640, 350, 70);

        btnLogout.setBorderPainted(false);
        btnLogout.setContentAreaFilled(false);
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogout);
        btnLogout.setBounds(1790, 148, 110, 30);

        btnCaixa.setBorderPainted(false);
        btnCaixa.setContentAreaFilled(false);
        btnCaixa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaixaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCaixa);
        btnCaixa.setBounds(0, 740, 350, 80);

        btnEncerrar.setBorderPainted(false);
        btnEncerrar.setContentAreaFilled(false);
        btnEncerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEncerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEncerrarMouseClicked(evt);
            }
        });
        btnEncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEncerrar);
        btnEncerrar.setBounds(110, 1010, 150, 50);

        btnEnviar.setBorderPainted(false);
        btnEnviar.setContentAreaFilled(false);
        btnEnviar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEnviar);
        btnEnviar.setBounds(1000, 930, 350, 80);

        btnVenda.setBorderPainted(false);
        btnVenda.setContentAreaFilled(false);
        btnVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendaActionPerformed(evt);
            }
        });
        getContentPane().add(btnVenda);
        btnVenda.setBounds(0, 310, 350, 70);

        btnProdutos.setBorderPainted(false);
        btnProdutos.setContentAreaFilled(false);
        btnProdutos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutosActionPerformed(evt);
            }
        });
        getContentPane().add(btnProdutos);
        btnProdutos.setBounds(0, 420, 340, 70);

        btnCadastro.setBorderPainted(false);
        btnCadastro.setContentAreaFilled(false);
        btnCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastro);
        btnCadastro.setBounds(0, 530, 360, 70);

        selecionarFornecedor.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        selecionarFornecedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(selecionarFornecedor);
        selecionarFornecedor.setBounds(500, 590, 390, 70);

        txtValorCompra.setBackground(new java.awt.Color(187, 184, 184));
        txtValorCompra.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtValorCompra.setBorder(null);
        getContentPane().add(txtValorCompra);
        txtValorCompra.setBounds(520, 720, 270, 60);

        txtValorVenda.setBackground(new java.awt.Color(187, 184, 184));
        txtValorVenda.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtValorVenda.setBorder(null);
        getContentPane().add(txtValorVenda);
        txtValorVenda.setBounds(860, 720, 270, 60);

        txtNFe.setBackground(new java.awt.Color(187, 184, 184));
        txtNFe.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtNFe.setBorder(null);
        getContentPane().add(txtNFe);
        txtNFe.setBounds(1180, 720, 370, 60);

        txtSerie.setBackground(new java.awt.Color(187, 184, 184));
        txtSerie.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtSerie.setBorder(null);
        getContentPane().add(txtSerie);
        txtSerie.setBounds(1610, 730, 240, 50);

        txtDescricao.setBackground(new java.awt.Color(187, 184, 184));
        txtDescricao.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtDescricao.setBorder(null);
        txtDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoActionPerformed(evt);
            }
        });
        getContentPane().add(txtDescricao);
        txtDescricao.setBounds(940, 490, 900, 50);

        txtQtd.setBackground(new java.awt.Color(187, 184, 184));
        txtQtd.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtQtd.setBorder(null);
        getContentPane().add(txtQtd);
        txtQtd.setBounds(1320, 600, 220, 60);

        txtVoltagem.setBackground(new java.awt.Color(187, 184, 184));
        txtVoltagem.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtVoltagem.setBorder(null);
        getContentPane().add(txtVoltagem);
        txtVoltagem.setBounds(1590, 600, 250, 60);

        txtCodProd.setBackground(new java.awt.Color(187, 184, 184));
        txtCodProd.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtCodProd.setBorder(null);
        txtCodProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodProdActionPerformed(evt);
            }
        });
        getContentPane().add(txtCodProd);
        txtCodProd.setBounds(510, 490, 370, 50);

        txtData.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtData.setForeground(new java.awt.Color(255, 255, 255));
        txtData.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(txtData);
        txtData.setBounds(1500, 10, 400, 30);

        txtUsuario.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtUsuario.setToolTipText("");
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(1720, 106, 180, 30);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BTN VISUALIZAÇÃO.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(1771, 330, 60, 60);

        btnEnviarArquivo.setBorderPainted(false);
        btnEnviarArquivo.setContentAreaFilled(false);
        btnEnviarArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarArquivoActionPerformed(evt);
            }
        });
        getContentPane().add(btnEnviarArquivo);
        btnEnviarArquivo.setBounds(500, 830, 130, 50);

        txtNomeArquivo.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        getContentPane().add(txtNomeArquivo);
        txtNomeArquivo.setBounds(660, 830, 1180, 50);

        txtBusca.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtBusca.setBorder(null);
        getContentPane().add(txtBusca);
        txtBusca.setBounds(750, 340, 730, 40);

        btnSearch.setBorderPainted(false);
        btnSearch.setContentAreaFilled(false);
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch);
        btnSearch.setBounds(1483, 328, 80, 60);

        selectCategoria.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        selectCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Automatização residencial", "Iluminação", "Materiais elétricos", "Outros" }));
        selectCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectCategoriaActionPerformed(evt);
            }
        });
        getContentPane().add(selectCategoria);
        selectCategoria.setBounds(920, 590, 360, 70);

        imgTela.setBackground(new java.awt.Color(102, 102, 102));
        imgTela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/PRODUTOCADASTRO.jpg"))); // NOI18N
        imgTela.setToolTipText("");
        imgTela.setMaximumSize(new java.awt.Dimension(1280, 720));
        getContentPane().add(imgTela);
        imgTela.setBounds(0, 0, 1920, 1080);

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(Tabela);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(460, 942, 400, 330);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarArquivoActionPerformed
        JFileChooser fc = new JFileChooser();
        int res = fc.showOpenDialog(null);

        if (res == JFileChooser.APPROVE_OPTION) {
            File arquivo = fc.getSelectedFile();

            try {
                imagem = ManipularImagem.setImagemDimensao(arquivo.getAbsolutePath(), 200, 130);

                txtNomeArquivo.setText("Imagem enviada com sucesso");

                if (ProdutoRetorno.getIdProduto() == 0) {
                    P.setUrl_Img(ManipularImagem.getImgBytes(imagem));
                } else {
                    ProdutoRetorno.setUrl_Img(ManipularImagem.getImgBytes(imagem));
                }

            } catch (Exception ex) {
                // System.out.println(ex.printStackTrace().toString());
            }

        } else {
            txtNomeArquivo.setText("Voce não selecionou nenhum arquivo.");
        }
    }//GEN-LAST:event_btnEnviarArquivoActionPerformed

    private void txtCodProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodProdActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        if (ProdutoRetorno.getIdProduto() == 0) {
            P.setCodigoProduto(Integer.parseInt(txtCodProd.getText()));
            P.setNomeProduto(txtDescricao.getText());
            P.setCodigoProduto(Integer.parseInt(txtCodProd.getText()));
            P.setCategoria(selectCategoria.getSelectedIndex());
            P.setQtdProduto(Integer.parseInt(txtQtd.getText()));
            P.setValorCompra(Double.parseDouble(txtValorCompra.getText()));
            P.setVoltagem(Integer.parseInt(txtVoltagem.getText()));
            P.setValorVenda(Double.parseDouble(txtValorVenda.getText()));
            P.setNotaFiscal(txtNFe.getText());
            P.setSerie(Integer.parseInt(txtSerie.getText()));
            P.setIdFornecedor(selecionarFornecedor.getSelectedIndex());

            dao.Create(P);
        } else {
            ProdutoRetorno.setNomeProduto(txtDescricao.getText());
            ProdutoRetorno.setCodigoProduto(Integer.parseInt(txtCodProd.getText()));
            ProdutoRetorno.setQtdProduto(Integer.parseInt(txtQtd.getText()));
            ProdutoRetorno.setValorCompra(Double.parseDouble(txtValorCompra.getText()));
            ProdutoRetorno.setVoltagem(Integer.parseInt(txtVoltagem.getText()));
            ProdutoRetorno.setValorVenda(Double.parseDouble(txtValorVenda.getText()));
            ProdutoRetorno.setNotaFiscal(txtNFe.getText());
            ProdutoRetorno.setCategoria(selectCategoria.getSelectedIndex());
            ProdutoRetorno.setSerie(Integer.parseInt(txtSerie.getText()));
            ProdutoRetorno.setIdFornecedor(selecionarFornecedor.getSelectedIndex());

            dao.Update(ProdutoRetorno);
        }

        limparCamposProdutos();
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void btnEncerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEncerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnEncerrarMouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        UI_VisualizacaoProduto obj = new UI_VisualizacaoProduto(txtBusca.getText());
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnEncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncerrarActionPerformed

    }//GEN-LAST:event_btnEncerrarActionPerformed

    private void btnFinanceiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinanceiroActionPerformed
        UI_FinanceiroConsulta consulta = new UI_FinanceiroConsulta();
        consulta.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnFinanceiroActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        UI_Login login = new UI_Login();
        login.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaixaActionPerformed
        UI_Caixa caixa = new UI_Caixa();
        caixa.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnCaixaActionPerformed

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

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
        UI_SelecaoCadastros selecao = new UI_SelecaoCadastros();
        selecao.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnCadastroActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        UI_VisualizacaoProduto visuProduto = new UI_VisualizacaoProduto();
        visuProduto.setVisible(true);

        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void txtDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescricaoActionPerformed

    private void selectCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectCategoriaActionPerformed

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
            java.util.logging.Logger.getLogger(UI_CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI_CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI_CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI_CadastroProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabela;
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnCaixa;
    private javax.swing.JButton btnEncerrar;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnEnviarArquivo;
    private javax.swing.JButton btnFinanceiro;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnProdutos;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnVenda;
    private javax.swing.JLabel imgTela;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> selecionarFornecedor;
    private javax.swing.JComboBox<String> selectCategoria;
    private javax.swing.JTextField txtBusca;
    private javax.swing.JTextField txtCodProd;
    private javax.swing.JLabel txtData;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtNFe;
    private javax.swing.JLabel txtNomeArquivo;
    private javax.swing.JTextField txtQtd;
    private javax.swing.JTextField txtSerie;
    private javax.swing.JLabel txtUsuario;
    private javax.swing.JTextField txtValorCompra;
    private javax.swing.JTextField txtValorVenda;
    private javax.swing.JTextField txtVoltagem;
    // End of variables declaration//GEN-END:variables
}
