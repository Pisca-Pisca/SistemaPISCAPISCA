/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI_SistemaInterno;

import Model.DAO.Funcionarios;
import Model.DAO.Produtos;
import Model.DAO.ProdutosDAO;
import static java.lang.Thread.sleep;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Date;
import javax.swing.ImageIcon;
import sistemainternopisca.ModeloTabela;

/**
 *
 * @author jessi
 */
public class UI_Catalogo extends javax.swing.JFrame {

    /**
     * Creates new form UI_Catalogo
     */
    public UI_Catalogo() {
        initComponents();

        readTabela();

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
            Tabela.getColumnModel().getColumn(2).setPreferredWidth(944);
            Tabela.getColumnModel().getColumn(3).setPreferredWidth(70);
            Tabela.getColumnModel().getColumn(4).setPreferredWidth(100);
        } else {
            Tabela.setAutoResizeMode(Tabela.AUTO_RESIZE_OFF);
            Tabela.getColumnModel().getColumn(0).setPreferredWidth(200);
            Tabela.getColumnModel().getColumn(1).setPreferredWidth(130);
            Tabela.getColumnModel().getColumn(2).setPreferredWidth(899);
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
            Tabela.getColumnModel().getColumn(2).setPreferredWidth(900);
            Tabela.getColumnModel().getColumn(3).setPreferredWidth(70);
            Tabela.getColumnModel().getColumn(4).setPreferredWidth(100);
        } else {
            Tabela.setAutoResizeMode(Tabela.AUTO_RESIZE_OFF);
            Tabela.getColumnModel().getColumn(0).setPreferredWidth(200);
            Tabela.getColumnModel().getColumn(1).setPreferredWidth(130);
            Tabela.getColumnModel().getColumn(2).setPreferredWidth(926);
            Tabela.getColumnModel().getColumn(3).setPreferredWidth(70);
            Tabela.getColumnModel().getColumn(4).setPreferredWidth(100);
        }
    }

    public void enviaDados(UI_Login login, Funcionarios funcionarios) {
        String email = funcionarios.getEmail();
        txtUsuario.setText(email);
    }

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
        btnPesquisa = new javax.swing.JButton();
        txtBusca = new javax.swing.JTextField();
        TabelaScroll = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        imgTela = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setUndecorated(true);
        getContentPane().setLayout(null);

        baseTela.setBackground(new java.awt.Color(57, 57, 57));
        baseTela.setForeground(new java.awt.Color(57, 57, 57));
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
        btnCaixa.setBounds(0, 750, 360, 70);

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

        btnFinanceiro.setBorderPainted(false);
        btnFinanceiro.setContentAreaFilled(false);
        btnFinanceiro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFinanceiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinanceiroActionPerformed(evt);
            }
        });
        baseTela.add(btnFinanceiro);
        btnFinanceiro.setBounds(0, 640, 360, 70);

        btnCadastro.setBorderPainted(false);
        btnCadastro.setContentAreaFilled(false);
        btnCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });
        baseTela.add(btnCadastro);
        btnCadastro.setBounds(0, 530, 360, 70);

        btnProdutos.setBorderPainted(false);
        btnProdutos.setContentAreaFilled(false);
        btnProdutos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutosActionPerformed(evt);
            }
        });
        baseTela.add(btnProdutos);
        btnProdutos.setBounds(0, 430, 370, 70);

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

        txtUsuario.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        baseTela.add(txtUsuario);
        txtUsuario.setBounds(1710, 100, 190, 40);

        txtData.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtData.setForeground(new java.awt.Color(255, 255, 255));
        txtData.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        baseTela.add(txtData);
        txtData.setBounds(1670, 10, 230, 40);

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

        btnPesquisa.setBorderPainted(false);
        btnPesquisa.setContentAreaFilled(false);
        btnPesquisa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaActionPerformed(evt);
            }
        });
        baseTela.add(btnPesquisa);
        btnPesquisa.setBounds(1351, 350, 90, 60);

        txtBusca.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtBusca.setBorder(null);
        txtBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscaActionPerformed(evt);
            }
        });
        baseTela.add(txtBusca);
        txtBusca.setBounds(860, 360, 490, 40);

        TabelaScroll.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N

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
        Tabela.setGridColor(new java.awt.Color(155, 155, 155));
        Tabela.setIntercellSpacing(new java.awt.Dimension(2, 2));
        Tabela.setSelectionBackground(new java.awt.Color(255, 184, 0));
        Tabela.setSelectionForeground(new java.awt.Color(0, 0, 0));
        TabelaScroll.setViewportView(Tabela);

        baseTela.add(TabelaScroll);
        TabelaScroll.setBounds(436, 480, 1420, 550);

        imgTela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/PRODUTO CATÁLOGO- editado.png"))); // NOI18N
        baseTela.add(imgTela);
        imgTela.setBounds(0, 0, 1921, 1080);

        getContentPane().add(baseTela);
        baseTela.setBounds(0, 0, 1921, 1080);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnEncerrarActionPerformed

    private void btnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaActionPerformed
        readTabelaByName(txtBusca.getText());
    }//GEN-LAST:event_btnPesquisaActionPerformed

    private void txtBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscaActionPerformed

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
            java.util.logging.Logger.getLogger(UI_Catalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI_Catalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI_Catalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_Catalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI_Catalogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabela;
    private javax.swing.JScrollPane TabelaScroll;
    private javax.swing.JPanel baseTela;
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnCaixa;
    private javax.swing.JButton btnEncerrar;
    private javax.swing.JButton btnFinanceiro;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnPesquisa;
    private javax.swing.JButton btnProdutos;
    private javax.swing.JButton btnVenda;
    private javax.swing.JLabel imgTela;
    private javax.swing.JTextField txtBusca;
    private javax.swing.JLabel txtData;
    private javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables
}
