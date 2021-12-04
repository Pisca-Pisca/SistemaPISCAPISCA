/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI_SistemaInterno;

import Model.DAO.Clientes;
import Model.DAO.ClientesDAO;
import Model.DAO.Funcionarios;
import Model.DAO.FuncionariosDAO;
import Model.DAO.Produtos;
import Model.DAO.ProdutosDAO;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import static java.lang.Thread.sleep;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import sistemainternopisca.ModeloTabela;

/**
 *
 * @author jessi
 */
public class UI_Carrinho extends javax.swing.JFrame {

    List<Clientes> listaClientes;
    ClientesDAO cdao = new ClientesDAO();
    Clientes cliente;
    Object itemSelecionado;

    List<Funcionarios> listaFuncionarios;
    FuncionariosDAO fdao = new FuncionariosDAO();
    Funcionarios funcionarios;
    Object itemSelecionadoFuncionario;

    List<Produtos> listaProdutos;
    ProdutosDAO pdao = new ProdutosDAO();
    Produtos produtos;
    Object itemSelecionadoProdutos;

    public UI_Carrinho() {
        initComponents();
        listarClientes();
        listarProduto();
        listarFuncionarios();

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
                        txtUsuario.setText(dataHora);
                        txtDataHora.setText(dataHora);
                        sleep(1000);
                    }
                } catch (InterruptedException ex) {
                    System.out.println("Problema na atualização da data/hora");
                    ex.printStackTrace();
                }
            }
        }.start();

        Random codigoCarrinho = new Random();
        int codigo = codigoCarrinho.nextInt(50000) + 1;

        txtCodigo.setText(String.valueOf(codigo));
    }

    private void listarFuncionarios() {
        listaFuncionarios = fdao.Read();
        selecionarFuncinario.removeAllItems();

        for (int i = 0; i < listaFuncionarios.size(); i++) {
            selecionarFuncinario.addItem(listaFuncionarios.get(i).getNomeFuncionario());
        }
    }

    private void listarProduto() {
        listaProdutos = pdao.Read();
        selecionarProduto.removeAllItems();

        for (int i = 0; i < listaProdutos.size(); i++) {
            selecionarProduto.addItem(listaProdutos.get(i).getNomeProduto());
        }
    }

    private void listarClientes() {
        listaClientes = cdao.Read();
        selecionarClientes.removeAllItems();

        for (int i = 0; i < listaClientes.size(); i++) {
            selecionarClientes.addItem(listaClientes.get(i).getNomeCliente());

            selecionarClientes.addItemListener(new ItemListener() {
                @Override
                public void itemStateChanged(ItemEvent e) {
                    if (e.getStateChange() == ItemEvent.SELECTED) {
                        itemSelecionado = selecionarClientes.getSelectedItem().toString();

                        for (int i = 0; i < listaClientes.size(); i++) {
                            if (itemSelecionado == listaClientes.get(i).getNomeCliente()) {
                                txtCPF.setText(listaClientes.get(i).getCpf());
                                txtEndereço.setText(listaClientes.get(i).getEndereco());
                                txtEmail.setText(listaClientes.get(i).getEmail());
                                txtCelular.setText(listaClientes.get(i).getTelefone());
                            }
                        }

                    }
                }
            });

        }
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
        btnPesquisaCliente = new javax.swing.JButton();
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
        selecionarClientes = new javax.swing.JComboBox<>();
        selecionarFuncinario = new javax.swing.JComboBox<>();
        selecionarProduto = new javax.swing.JComboBox<>();
        txtData = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JLabel();
        txtqtd = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        TabelaScroll = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        imgTela = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1922, 1080));
        setUndecorated(true);

        baseTela.setBackground(new java.awt.Color(57, 57, 57));
        baseTela.setLayout(null);

        btnVenda.setBorderPainted(false);
        btnVenda.setContentAreaFilled(false);
        btnVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendaActionPerformed(evt);
            }
        });
        baseTela.add(btnVenda);
        btnVenda.setBounds(0, 326, 370, 50);

        btnProdutos.setBorderPainted(false);
        btnProdutos.setContentAreaFilled(false);
        btnProdutos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutosActionPerformed(evt);
            }
        });
        baseTela.add(btnProdutos);
        btnProdutos.setBounds(0, 430, 370, 60);

        btnCadastros.setBorderPainted(false);
        btnCadastros.setContentAreaFilled(false);
        btnCadastros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrosActionPerformed(evt);
            }
        });
        baseTela.add(btnCadastros);
        btnCadastros.setBounds(0, 546, 370, 50);

        btnEncerrar.setBorderPainted(false);
        btnEncerrar.setContentAreaFilled(false);
        btnEncerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncerrarActionPerformed(evt);
            }
        });
        baseTela.add(btnEncerrar);
        btnEncerrar.setBounds(100, 1016, 170, 50);

        btnCaixa.setBorderPainted(false);
        btnCaixa.setContentAreaFilled(false);
        btnCaixa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaixaActionPerformed(evt);
            }
        });
        baseTela.add(btnCaixa);
        btnCaixa.setBounds(0, 756, 370, 60);

        btnFinanceiro.setBorderPainted(false);
        btnFinanceiro.setContentAreaFilled(false);
        btnFinanceiro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFinanceiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinanceiroActionPerformed(evt);
            }
        });
        baseTela.add(btnFinanceiro);
        btnFinanceiro.setBounds(0, 656, 370, 60);

        btnCancelar.setBorderPainted(false);
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        baseTela.add(btnCancelar);
        btnCancelar.setBounds(440, 1016, 180, 50);

        txtCodigo.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(153, 153, 153));
        baseTela.add(txtCodigo);
        txtCodigo.setBounds(480, 399, 130, 31);

        txtDataHora.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txtDataHora.setForeground(new java.awt.Color(153, 153, 153));
        baseTela.add(txtDataHora);
        txtDataHora.setBounds(680, 398, 240, 32);

        btnPesquisaCliente.setBorderPainted(false);
        btnPesquisaCliente.setContentAreaFilled(false);
        baseTela.add(btnPesquisaCliente);
        btnPesquisaCliente.setBounds(1300, 476, 70, 50);

        txtCPF.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        baseTela.add(txtCPF);
        txtCPF.setBounds(1420, 490, 410, 30);

        txtEmail.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        baseTela.add(txtEmail);
        txtEmail.setBounds(1420, 570, 410, 30);

        txtCelular.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        baseTela.add(txtCelular);
        txtCelular.setBounds(1120, 570, 240, 30);

        txtEndereço.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        baseTela.add(txtEndereço);
        txtEndereço.setBounds(480, 570, 570, 30);

        btnPesquisaProduto.setBorderPainted(false);
        btnPesquisaProduto.setContentAreaFilled(false);
        btnPesquisaProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPesquisaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaProdutoActionPerformed(evt);
            }
        });
        baseTela.add(btnPesquisaProduto);
        btnPesquisaProduto.setBounds(1510, 656, 60, 50);

        txtQtdItens.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        baseTela.add(txtQtdItens);
        txtQtdItens.setBounds(1130, 1030, 80, 20);

        txtValorTotal.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        baseTela.add(txtValorTotal);
        txtValorTotal.setBounds(1240, 1023, 200, 31);

        btnCartao.setBorderPainted(false);
        btnCartao.setContentAreaFilled(false);
        btnCartao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        baseTela.add(btnCartao);
        btnCartao.setBounds(900, 1036, 30, 20);

        btnDinheiro.setBorderPainted(false);
        btnDinheiro.setContentAreaFilled(false);
        btnDinheiro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        baseTela.add(btnDinheiro);
        btnDinheiro.setBounds(960, 1026, 30, 40);

        btnBoleto.setBorderPainted(false);
        btnBoleto.setContentAreaFilled(false);
        btnBoleto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        baseTela.add(btnBoleto);
        btnBoleto.setBounds(1020, 1026, 30, 40);

        btnEnviar.setBorderPainted(false);
        btnEnviar.setContentAreaFilled(false);
        btnEnviar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        baseTela.add(btnEnviar);
        btnEnviar.setBounds(1670, 1016, 180, 50);

        btnLogout.setBorderPainted(false);
        btnLogout.setContentAreaFilled(false);
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        baseTela.add(btnLogout);
        btnLogout.setBounds(1780, 156, 120, 30);

        selecionarClientes.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        selecionarClientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        selecionarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionarClientesActionPerformed(evt);
            }
        });
        baseTela.add(selecionarClientes);
        selecionarClientes.setBounds(460, 470, 920, 60);

        selecionarFuncinario.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        selecionarFuncinario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        baseTela.add(selecionarFuncinario);
        selecionarFuncinario.setBounds(960, 380, 880, 60);

        selecionarProduto.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        selecionarProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        baseTela.add(selecionarProduto);
        selecionarProduto.setBounds(454, 646, 920, 60);

        txtData.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtData.setForeground(new java.awt.Color(255, 255, 255));
        txtData.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        baseTela.add(txtData);
        txtData.setBounds(1670, 12, 231, 43);

        txtUsuario.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        baseTela.add(txtUsuario);
        txtUsuario.setBounds(1720, 102, 180, 30);

        txtqtd.setBackground(new java.awt.Color(187, 184, 187));
        txtqtd.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtqtd.setBorder(null);
        txtqtd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtqtdActionPerformed(evt);
            }
        });
        baseTela.add(txtqtd);
        txtqtd.setBounds(1420, 650, 130, 40);

        btnAdd.setBorderPainted(false);
        btnAdd.setContentAreaFilled(false);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        baseTela.add(btnAdd);
        btnAdd.setBounds(1590, 650, 240, 40);

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código Produto", "Descrição Produto", "Qtd . Itens", "Preço Un. R$", "Preço Total R$"
            }
        ));
        TabelaScroll.setViewportView(Tabela);

        baseTela.add(TabelaScroll);
        TabelaScroll.setBounds(460, 716, 1370, 230);

        imgTela.setForeground(new java.awt.Color(187, 184, 184));
        imgTela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CARRINHO CLIENTE.png"))); // NOI18N
        baseTela.add(imgTela);
        imgTela.setBounds(0, 0, 1922, 1080);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(baseTela, javax.swing.GroupLayout.PREFERRED_SIZE, 1922, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void selecionarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionarClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selecionarClientesActionPerformed

    private void btnPesquisaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaProdutoActionPerformed

    }//GEN-LAST:event_btnPesquisaProdutoActionPerformed

    private void txtqtdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtqtdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtqtdActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        double quantidade = Double.parseDouble(txtqtd.getText());

        DefaultTableModel modelo = (DefaultTableModel) Tabela.getModel();

        for (Produtos p : pdao.ReadByNameSingle(selecionarProduto.getSelectedItem().toString())) {
            modelo.addRow(new Object[]{
                p.getCodigoProduto(),
                p.getNomeProduto(),
                txtqtd.getText(),
                p.getValorVenda(),
                quantidade * p.getValorVenda()
            });

            int total = p.getQtdProduto() - Integer.parseInt(txtqtd.getText());
            p.setQtdProduto(total);
            pdao.Update(p);

        }


        somarValotTotalProdutos();
        somarValorTotalitens();

    }//GEN-LAST:event_btnAddActionPerformed

    private void somarValotTotalProdutos() {
        double soma = 0, valor;
        int cont = Tabela.getRowCount();
        for (int i = 0; i < cont; i++) {
            valor = (double) Tabela.getValueAt(i, 4);
            soma = soma + valor;
        }
        txtValorTotal.setText(String.valueOf(soma));
    }
    
    private void somarValorTotalitens() {
        int soma = 0, valor;
        int cont = Tabela.getRowCount();
        for (int i = 0; i < cont; i++) {
            valor = Integer.parseInt(String.valueOf(Tabela.getValueAt(i, 2)));
            soma = soma + valor;
        }
        txtQtdItens.setText(String.valueOf(soma));
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabela;
    private javax.swing.JScrollPane TabelaScroll;
    private javax.swing.JPanel baseTela;
    private javax.swing.JButton btnAdd;
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
    private javax.swing.JComboBox<String> selecionarClientes;
    private javax.swing.JComboBox<String> selecionarFuncinario;
    private javax.swing.JComboBox<String> selecionarProduto;
    private javax.swing.JLabel txtCPF;
    private javax.swing.JLabel txtCelular;
    private javax.swing.JLabel txtCodigo;
    private javax.swing.JLabel txtData;
    private javax.swing.JLabel txtDataHora;
    private javax.swing.JLabel txtEmail;
    private javax.swing.JLabel txtEndereço;
    private javax.swing.JLabel txtQtdItens;
    private javax.swing.JLabel txtUsuario;
    private javax.swing.JLabel txtValorTotal;
    private javax.swing.JTextField txtqtd;
    // End of variables declaration//GEN-END:variables

}
