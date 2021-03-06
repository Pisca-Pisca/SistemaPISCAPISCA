/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI_SistemaInterno;

import Model.DAO.Produtos;
import Model.DAO.ProdutosDAO;
import javax.swing.ImageIcon;
import UI_SistemaInterno.UI_CadastroProduto;
import static java.lang.Thread.sleep;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import sistemainternopisca.ModeloTabela;

/**
 *
 * @author nicol
 */
public class UI_VisualizacaoProduto extends javax.swing.JFrame {

    /**
     * Creates new form UI_visualizacaoProduto
     */
    Produtos P = new Produtos();
    ProdutosDAO dao = new ProdutosDAO();

    public UI_VisualizacaoProduto() {
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

        readTabela();
    }

    public UI_VisualizacaoProduto(String nome) {
        initComponents();

        txtBusca.setText(nome);
        readTabelaByName(nome);
    }

    public void readTabela() {
        ProdutosDAO pdao = new ProdutosDAO();
        List<Produtos> list = pdao.Read();

        String[] columnName = {"Imagem", "Código", "Descrição", "Estoque", "Preço R$"};
        Object[][] rows = new Object[list.size()][5];

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getUrl_Img() != null) {
                ImageIcon image = new ImageIcon(new ImageIcon(list.get(i).getUrl_Img()).getImage()
                        .getScaledInstance(200, 130, 0));

                rows[i][0] = image;
            } else {
                rows[i][0] = null;
            }

            rows[i][1] = list.get(i).getCodigoProduto();
            rows[i][2] = list.get(i).getNomeProduto();
            rows[i][3] = list.get(i).getQtdProduto();
            rows[i][4] = list.get(i).getValorVenda();
        }

        ModeloTabela model = new ModeloTabela(rows, columnName);
        Tabela.setModel(model);
        Tabela.setRowHeight(130);

        if (!TabelaScroll.isVisible()) {
            Tabela.setAutoResizeMode(Tabela.AUTO_RESIZE_OFF);
            Tabela.getColumnModel().getColumn(0).setPreferredWidth(200);
            Tabela.getColumnModel().getColumn(1).setPreferredWidth(130);
            Tabela.getColumnModel().getColumn(2).setPreferredWidth(950);
            Tabela.getColumnModel().getColumn(3).setPreferredWidth(70);
            Tabela.getColumnModel().getColumn(4).setPreferredWidth(100);
        } else {
            Tabela.setAutoResizeMode(Tabela.AUTO_RESIZE_OFF);
            Tabela.getColumnModel().getColumn(0).setPreferredWidth(200);
            Tabela.getColumnModel().getColumn(1).setPreferredWidth(130);
            Tabela.getColumnModel().getColumn(2).setPreferredWidth(929);
            Tabela.getColumnModel().getColumn(3).setPreferredWidth(70);
            Tabela.getColumnModel().getColumn(4).setPreferredWidth(100);
        }
    }

    public void readTabelaByName(String Nome) {

        ProdutosDAO pdao = new ProdutosDAO();
        List<Produtos> list = pdao.ReadByName(Nome);

        String[] columnName = {"Imagem", "Código", "Descrição", "Estoque", "Preço R$"};
        Object[][] rows = new Object[list.size()][5];

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getUrl_Img() != null) {
                ImageIcon image = new ImageIcon(new ImageIcon(list.get(i).getUrl_Img()).getImage()
                        .getScaledInstance(200, 130, 0));

                rows[i][0] = image;
            } else {
                rows[i][0] = null;
            }

            rows[i][1] = list.get(i).getCodigoProduto();
            rows[i][2] = list.get(i).getNomeProduto();
            rows[i][3] = list.get(i).getQtdProduto();
            rows[i][4] = list.get(i).getValorVenda();
        }

        ModeloTabela model = new ModeloTabela(rows, columnName);
        Tabela.setModel(model);
        Tabela.setRowHeight(130);

        if (!TabelaScroll.isVisible()) {
            Tabela.setAutoResizeMode(Tabela.AUTO_RESIZE_OFF);
            Tabela.getColumnModel().getColumn(0).setPreferredWidth(200);
            Tabela.getColumnModel().getColumn(1).setPreferredWidth(130);
            Tabela.getColumnModel().getColumn(2).setPreferredWidth(944);
            Tabela.getColumnModel().getColumn(3).setPreferredWidth(70);
            Tabela.getColumnModel().getColumn(4).setPreferredWidth(100);
        } else {
            Tabela.setAutoResizeMode(Tabela.AUTO_RESIZE_OFF);
            Tabela.getColumnModel().getColumn(0).setPreferredWidth(200);
            Tabela.getColumnModel().getColumn(1).setPreferredWidth(130);
            Tabela.getColumnModel().getColumn(2).setPreferredWidth(929);
            Tabela.getColumnModel().getColumn(3).setPreferredWidth(70);
            Tabela.getColumnModel().getColumn(4).setPreferredWidth(100);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        baseTela = new javax.swing.JPanel();
        btnCaixa = new javax.swing.JButton();
        btnEncerrar = new javax.swing.JButton();
        btnFinanceiro = new javax.swing.JButton();
        btnCadastro = new javax.swing.JButton();
        btnProdutos = new javax.swing.JButton();
        btnVenda = new javax.swing.JButton();
        txtUsuario = new javax.swing.JLabel();
        txtData = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        txtBusca = new javax.swing.JTextField();
        btnPesquisa = new javax.swing.JButton();
        TabelaScroll = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        imgExcluir = new javax.swing.JLabel();
        imgEditar = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JLabel();
        btnRefresh = new javax.swing.JLabel();
        imgTela = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        baseTela.setBackground(new java.awt.Color(53, 53, 53));
        baseTela.setPreferredSize(new java.awt.Dimension(1920, 1080));
        baseTela.setLayout(null);

        btnCaixa.setBorderPainted(false);
        btnCaixa.setContentAreaFilled(false);
        btnCaixa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaixaActionPerformed(evt);
            }
        });
        baseTela.add(btnCaixa);
        btnCaixa.setBounds(6, 755, 360, 70);

        btnEncerrar.setBorderPainted(false);
        btnEncerrar.setContentAreaFilled(false);
        btnEncerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncerrarActionPerformed(evt);
            }
        });
        baseTela.add(btnEncerrar);
        btnEncerrar.setBounds(106, 1015, 160, 40);

        btnFinanceiro.setBorderPainted(false);
        btnFinanceiro.setContentAreaFilled(false);
        btnFinanceiro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFinanceiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinanceiroActionPerformed(evt);
            }
        });
        baseTela.add(btnFinanceiro);
        btnFinanceiro.setBounds(6, 645, 360, 70);

        btnCadastro.setBorderPainted(false);
        btnCadastro.setContentAreaFilled(false);
        btnCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });
        baseTela.add(btnCadastro);
        btnCadastro.setBounds(6, 535, 360, 70);

        btnProdutos.setBorderPainted(false);
        btnProdutos.setContentAreaFilled(false);
        btnProdutos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutosActionPerformed(evt);
            }
        });
        baseTela.add(btnProdutos);
        btnProdutos.setBounds(6, 435, 360, 70);

        btnVenda.setBorderPainted(false);
        btnVenda.setContentAreaFilled(false);
        btnVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendaActionPerformed(evt);
            }
        });
        baseTela.add(btnVenda);
        btnVenda.setBounds(6, 315, 360, 70);
        baseTela.add(txtUsuario);
        txtUsuario.setBounds(1716, 105, 200, 40);

        txtData.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtData.setForeground(new java.awt.Color(255, 255, 255));
        txtData.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        baseTela.add(txtData);
        txtData.setBounds(1676, 15, 240, 40);

        btnLogout.setBorderPainted(false);
        btnLogout.setContentAreaFilled(false);
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        baseTela.add(btnLogout);
        btnLogout.setBounds(1790, 150, 100, 30);

        txtBusca.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtBusca.setBorder(null);
        txtBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscaActionPerformed(evt);
            }
        });
        baseTela.add(txtBusca);
        txtBusca.setBounds(866, 355, 480, 50);

        btnPesquisa.setBorderPainted(false);
        btnPesquisa.setContentAreaFilled(false);
        btnPesquisa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaActionPerformed(evt);
            }
        });
        baseTela.add(btnPesquisa);
        btnPesquisa.setBounds(1357, 355, 80, 50);

        Tabela.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Tabela.setForeground(new java.awt.Color(0, 0, 0));
        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Imagem", "Código", "Descrição", "Estoque", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabela.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Tabela.setIntercellSpacing(new java.awt.Dimension(2, 2));
        Tabela.setSelectionBackground(new java.awt.Color(255, 184, 0));
        Tabela.setSelectionForeground(new java.awt.Color(0, 0, 0));
        Tabela.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TabelaKeyReleased(evt);
            }
        });
        TabelaScroll.setViewportView(Tabela);

        baseTela.add(TabelaScroll);
        TabelaScroll.setBounds(430, 440, 1450, 560);

        imgExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Group 7.png"))); // NOI18N
        imgExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        baseTela.add(imgExcluir);
        imgExcluir.setBounds(1670, 1030, 210, 40);

        imgEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Group 8.png"))); // NOI18N
        imgEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        baseTela.add(imgEditar);
        imgEditar.setBounds(1450, 1030, 210, 40);

        btnEditar.setBorderPainted(false);
        btnEditar.setContentAreaFilled(false);
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        baseTela.add(btnEditar);
        btnEditar.setBounds(1450, 1030, 210, 40);

        btnExcluir.setBorderPainted(false);
        btnExcluir.setContentAreaFilled(false);
        btnExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        baseTela.add(btnExcluir);
        btnExcluir.setBounds(1680, 1030, 200, 40);

        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BTN CADASTRAR.png"))); // NOI18N
        btnCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCadastrarMouseClicked(evt);
            }
        });
        baseTela.add(btnCadastrar);
        btnCadastrar.setBounds(1820, 360, 55, 50);

        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BTN REFRESH.png"))); // NOI18N
        btnRefresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRefreshMouseClicked(evt);
            }
        });
        baseTela.add(btnRefresh);
        btnRefresh.setBounds(1720, 360, 60, 50);

        imgTela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/PRODUTO-BUSCA.png"))); // NOI18N
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

    private void btnEncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnEncerrarActionPerformed

    private void txtBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscaActionPerformed

    private void btnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaActionPerformed
        readTabelaByName(txtBusca.getText());
    }//GEN-LAST:event_btnPesquisaActionPerformed

    private void TabelaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TabelaKeyReleased

    }//GEN-LAST:event_TabelaKeyReleased

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (Tabela.getSelectedRow() != - 1) {
            SelecionarProdutosDeletar();
            readTabela();
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma linha selecionada");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (Tabela.getSelectedRow() != - 1) {
            SelecionarProdutos();
            readTabela();
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma linha selecionada");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

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

    private void btnRefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRefreshMouseClicked
        readTabela();
    }//GEN-LAST:event_btnRefreshMouseClicked

    private void btnCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarMouseClicked
        UI_CadastroProduto produto = new UI_CadastroProduto();
        produto.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCadastrarMouseClicked

    public void SelecionarProdutosDeletar() {
        Produtos produtoRetorno = new Produtos();
        ProdutosDAO pdao = new ProdutosDAO();
        String NomeProduto;

        NomeProduto = Tabela.getValueAt(Tabela.getSelectedRow(), 2).toString();

        for (Produtos p : pdao.ReadByName(NomeProduto)) {

            produtoRetorno.setCodigoProduto(p.getCodigoProduto());
            produtoRetorno.setIdProduto(p.getIdProduto());
            produtoRetorno.setNomeProduto(p.getNomeProduto());
            produtoRetorno.setNotaFiscal(p.getNotaFiscal());
            produtoRetorno.setQtdProduto(p.getQtdProduto());
            produtoRetorno.setValorCompra(p.getValorCompra());
            produtoRetorno.setVoltagem(p.getVoltagem());
            produtoRetorno.setValorVenda(p.getValorVenda());
            produtoRetorno.setUrl_Img(p.getUrl_Img());
            produtoRetorno.setSerie(p.getSerie());
            produtoRetorno.setCategoria(p.getCategoria());
            produtoRetorno.setIdFornecedor(p.getIdFornecedor());

            produtoRetorno.setIdProduto(p.getIdProduto());
        }

        pdao.Delete(produtoRetorno);

    }

    public void SelecionarProdutos() {
        Produtos produtoRetorno = new Produtos();
        ProdutosDAO pdao = new ProdutosDAO();
        String NomeProduto;

        if (Tabela.getSelectedRow() != - 1) {
            NomeProduto = Tabela.getValueAt(Tabela.getSelectedRow(), 2).toString();

            for (Produtos p : pdao.ReadByName(NomeProduto)) {

                produtoRetorno.setCodigoProduto(p.getCodigoProduto());
                produtoRetorno.setIdProduto(p.getIdProduto());
                produtoRetorno.setNomeProduto(p.getNomeProduto());
                produtoRetorno.setNotaFiscal(p.getNotaFiscal());
                produtoRetorno.setQtdProduto(p.getQtdProduto());
                produtoRetorno.setValorCompra(p.getValorCompra());
                produtoRetorno.setVoltagem(p.getVoltagem());
                produtoRetorno.setValorVenda(p.getValorVenda());
                produtoRetorno.setUrl_Img(p.getUrl_Img());
                produtoRetorno.setSerie(p.getSerie());
                produtoRetorno.setCategoria(p.getCategoria());
                produtoRetorno.setIdFornecedor(p.getIdFornecedor());
                produtoRetorno.setIdProduto(p.getIdProduto());
            }

        }

        UI_CadastroProduto obj = new UI_CadastroProduto(produtoRetorno);
        obj.setVisible(true);
        dispose();
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
            java.util.logging.Logger.getLogger(UI_VisualizacaoProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI_VisualizacaoProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI_VisualizacaoProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_VisualizacaoProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI_VisualizacaoProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabela;
    private javax.swing.JScrollPane TabelaScroll;
    private javax.swing.JPanel baseTela;
    private javax.swing.JLabel btnCadastrar;
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnCaixa;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEncerrar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFinanceiro;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnPesquisa;
    private javax.swing.JButton btnProdutos;
    private javax.swing.JLabel btnRefresh;
    private javax.swing.JButton btnVenda;
    private javax.swing.JLabel imgEditar;
    private javax.swing.JLabel imgExcluir;
    private javax.swing.JLabel imgTela;
    private javax.swing.JTextField txtBusca;
    private javax.swing.JLabel txtData;
    private javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables
}
