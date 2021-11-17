/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI_SistemaInterno;

import Model.DAO.Clientes;
import Model.DAO.ClientesDAO;
import Model.DAO.Produtos;
import Model.DAO.ProdutosDAO;
import static java.lang.Thread.sleep;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jessi
 */
public class UI_VisualizacaoClientes extends javax.swing.JFrame {

    /**
     * Creates new form UI_VizualizacaoClientes
     */
    public UI_VisualizacaoClientes() {
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

        readTableCliente();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imgBase = new javax.swing.JPanel();
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
        tabelaScroll = new javax.swing.JScrollPane();
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

        imgBase.setBackground(new java.awt.Color(55, 55, 55));

        btnCaixa.setBorderPainted(false);
        btnCaixa.setContentAreaFilled(false);
        btnCaixa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaixaActionPerformed(evt);
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

        btnFinanceiro.setBorderPainted(false);
        btnFinanceiro.setContentAreaFilled(false);
        btnFinanceiro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFinanceiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinanceiroActionPerformed(evt);
            }
        });

        btnCadastro.setBorderPainted(false);
        btnCadastro.setContentAreaFilled(false);
        btnCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
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

        btnVenda.setBorderPainted(false);
        btnVenda.setContentAreaFilled(false);
        btnVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendaActionPerformed(evt);
            }
        });

        txtData.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtData.setForeground(new java.awt.Color(255, 255, 255));
        txtData.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        btnLogout.setBorderPainted(false);
        btnLogout.setContentAreaFilled(false);
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnPesquisa.setBorderPainted(false);
        btnPesquisa.setContentAreaFilled(false);
        btnPesquisa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaActionPerformed(evt);
            }
        });

        txtBusca.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtBusca.setBorder(null);

        Tabela.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        Tabela.setForeground(new java.awt.Color(0, 0, 0));
        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código do Cliente", "Nome Completo", "Telefone"
            }
        ));
        Tabela.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Tabela.setIntercellSpacing(new java.awt.Dimension(2, 2));
        Tabela.setSelectionBackground(new java.awt.Color(255, 184, 0));
        Tabela.setSelectionForeground(new java.awt.Color(0, 0, 0));
        Tabela.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TabelaKeyReleased(evt);
            }
        });
        tabelaScroll.setViewportView(Tabela);

        imgExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Group 7.png"))); // NOI18N
        imgExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        imgEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Group 8.png"))); // NOI18N
        imgEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnEditar.setBorderPainted(false);
        btnEditar.setContentAreaFilled(false);
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setBorderPainted(false);
        btnExcluir.setContentAreaFilled(false);
        btnExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BTN CADASTRAR.png"))); // NOI18N
        btnCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCadastrarMouseClicked(evt);
            }
        });

        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BTN REFRESH.png"))); // NOI18N
        btnRefresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRefreshMouseClicked(evt);
            }
        });

        imgTela.setForeground(new java.awt.Color(37, 37, 37));
        imgTela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BUSCA CLIENTES- editado.png"))); // NOI18N

        javax.swing.GroupLayout imgBaseLayout = new javax.swing.GroupLayout(imgBase);
        imgBase.setLayout(imgBaseLayout);
        imgBaseLayout.setHorizontalGroup(
            imgBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imgBaseLayout.createSequentialGroup()
                .addGap(1600, 1600, 1600)
                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(imgBaseLayout.createSequentialGroup()
                .addGap(1722, 1722, 1722)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(imgBaseLayout.createSequentialGroup()
                .addGap(860, 860, 860)
                .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(370, 370, 370)
                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(imgBaseLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(imgBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(tabelaScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 1460, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(imgBaseLayout.createSequentialGroup()
                .addGap(1450, 1450, 1450)
                .addGroup(imgBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imgEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(imgBaseLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(btnCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(imgBaseLayout.createSequentialGroup()
                .addGap(1680, 1680, 1680)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(imgBaseLayout.createSequentialGroup()
                .addGap(1363, 1363, 1363)
                .addComponent(btnPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(imgTela)
            .addGroup(imgBaseLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(btnEncerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(imgBaseLayout.createSequentialGroup()
                .addGap(1787, 1787, 1787)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(imgBaseLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(btnVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(imgBaseLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(btnFinanceiro, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(imgBaseLayout.createSequentialGroup()
                .addGap(1670, 1670, 1670)
                .addComponent(imgExcluir))
        );
        imgBaseLayout.setVerticalGroup(
            imgBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imgBaseLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(215, 215, 215)
                .addGroup(imgBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(imgBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(imgBaseLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(btnProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tabelaScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(imgBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imgEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(imgBaseLayout.createSequentialGroup()
                .addGap(755, 755, 755)
                .addComponent(btnCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(imgBaseLayout.createSequentialGroup()
                .addGap(1030, 1030, 1030)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(imgBaseLayout.createSequentialGroup()
                .addGap(355, 355, 355)
                .addComponent(btnPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(imgTela)
            .addGroup(imgBaseLayout.createSequentialGroup()
                .addGap(1015, 1015, 1015)
                .addComponent(btnEncerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(imgBaseLayout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(imgBaseLayout.createSequentialGroup()
                .addGap(315, 315, 315)
                .addComponent(btnVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(imgBaseLayout.createSequentialGroup()
                .addGap(645, 645, 645)
                .addComponent(btnFinanceiro, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(imgBaseLayout.createSequentialGroup()
                .addGap(1030, 1030, 1030)
                .addComponent(imgExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgBase, javax.swing.GroupLayout.PREFERRED_SIZE, 1921, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnEncerrarActionPerformed

    private void btnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaActionPerformed
        readTableClienteByName(txtBusca.getText());
    }//GEN-LAST:event_btnPesquisaActionPerformed

    private void TabelaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TabelaKeyReleased

    }//GEN-LAST:event_TabelaKeyReleased

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (Tabela.getSelectedRow() != - 1) {
            SelecionarClienteDelete();
            readTableCliente();
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma linha selecionada");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (Tabela.getSelectedRow() != - 1) {
            SelecionarClienteUpdate();
            readTableCliente();
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

    private void btnCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarMouseClicked
        UI_CadastroCliente cliente = new UI_CadastroCliente();
        cliente.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCadastrarMouseClicked

    private void btnRefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRefreshMouseClicked
        readTableCliente();
    }//GEN-LAST:event_btnRefreshMouseClicked

    public void readTableCliente() {
        DefaultTableModel modelo = (DefaultTableModel) Tabela.getModel();
        modelo.setNumRows(0);

        ClientesDAO cdao = new ClientesDAO();
        for (Clientes C : cdao.Read()) {

            modelo.addRow(new Object[]{
                C.getCodigoCliente(),
                C.getNomeCliente(),
                C.getTelefone()
            });
        }
    }

    public void readTableClienteByName(String Nome) {
        DefaultTableModel modelo = (DefaultTableModel) Tabela.getModel();
        modelo.setNumRows(0);

        ClientesDAO cdao = new ClientesDAO();
        for (Clientes C : cdao.ReadByName(Nome)) {

            modelo.addRow(new Object[]{
                C.getCodigoCliente(),
                C.getNomeCliente(),
                C.getTelefone()
            });
        }
    }

    public void SelecionarClienteUpdate() {
        Clientes clienteRetorno = new Clientes();
        ClientesDAO cdao = new ClientesDAO();
        String NomeCliente;

        if (Tabela.getSelectedRow() != - 1) {
            NomeCliente = Tabela.getValueAt(Tabela.getSelectedRow(), 2).toString();

            for (Clientes c : cdao.ReadByName(NomeCliente)) {

                clienteRetorno.setIdCliente(c.getIdCliente());
                clienteRetorno.setCodigoCliente(c.getCodigoCliente());
                clienteRetorno.setDateNascimento(c.getDateNascimento());
                clienteRetorno.setNomeCliente(c.getNomeCliente());
                clienteRetorno.setRazaoSocial(c.getRazaoSocial());
                clienteRetorno.setCpf(c.getCpf());
                clienteRetorno.setCnpj(c.getCnpj());
                clienteRetorno.setRg(c.getRg());
                clienteRetorno.setInscricaoEstadual(c.getInscricaoEstadual());
                clienteRetorno.setEndereco(c.getEndereco());
                clienteRetorno.setCep(c.getCep());
                clienteRetorno.setEstado(c.getEstado());
                clienteRetorno.setCidade(c.getCidade());
                clienteRetorno.setBairro(c.getBairro());
                clienteRetorno.setEmail(c.getEmail());
                clienteRetorno.setTelefone(c.getTelefone());

            }

        }

        UI_CadastroCliente obj = new UI_CadastroCliente(clienteRetorno);
        obj.setVisible(true);
        dispose();
    }

    public void SelecionarClienteDelete() {
        Clientes clienteRetorno = new Clientes();
        ClientesDAO cdao = new ClientesDAO();
        String NomeCliente;

        if (Tabela.getSelectedRow() != - 1) {
            NomeCliente = Tabela.getValueAt(Tabela.getSelectedRow(), 2).toString();

            for (Clientes c : cdao.ReadByName(NomeCliente)) {

                clienteRetorno.setIdCliente(c.getIdCliente());
                clienteRetorno.setCodigoCliente(c.getCodigoCliente());
                clienteRetorno.setDateNascimento(c.getDateNascimento());
                clienteRetorno.setNomeCliente(c.getNomeCliente());
                clienteRetorno.setRazaoSocial(c.getRazaoSocial());
                clienteRetorno.setCpf(c.getCpf());
                clienteRetorno.setCnpj(c.getCnpj());
                clienteRetorno.setRg(c.getRg());
                clienteRetorno.setInscricaoEstadual(c.getInscricaoEstadual());
                clienteRetorno.setEndereco(c.getEndereco());
                clienteRetorno.setCep(c.getCep());
                clienteRetorno.setEstado(c.getEstado());
                clienteRetorno.setCidade(c.getCidade());
                clienteRetorno.setBairro(c.getBairro());
                clienteRetorno.setEmail(c.getEmail());
                clienteRetorno.setTelefone(c.getTelefone());

            }

        }

        cdao.Delete(clienteRetorno);
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
            java.util.logging.Logger.getLogger(UI_VisualizacaoClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI_VisualizacaoClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI_VisualizacaoClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_VisualizacaoClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI_VisualizacaoClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabela;
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
    private javax.swing.JPanel imgBase;
    private javax.swing.JLabel imgEditar;
    private javax.swing.JLabel imgExcluir;
    private javax.swing.JLabel imgTela;
    private javax.swing.JScrollPane tabelaScroll;
    private javax.swing.JTextField txtBusca;
    private javax.swing.JLabel txtData;
    private javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables
}
