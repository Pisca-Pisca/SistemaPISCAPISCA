/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI_SistemaInterno;

import Model.DAO.Funcionarios;
import Model.DAO.FuncionariosDAO;
import static java.lang.Thread.sleep;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import sistemainternopisca.ModeloTabela;

/**
 *
 * @author nicol
 */
public class UI_VisualizacaoFuncionario extends javax.swing.JFrame {

    Funcionarios F = new Funcionarios();
    FuncionariosDAO dao = new FuncionariosDAO();

    /**
     * Creates new form UI_VizualizacaoFuncionario
     */
    public UI_VisualizacaoFuncionario() {
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

    public void readTabela() {
        FuncionariosDAO fdao = new FuncionariosDAO();
        List<Funcionarios> list = fdao.Read();

        String[] columnName = {"Imagem", "Nome Completo", "Telefone", "Status"};
        Object[][] rows = new Object[list.size()][4];

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getUrl_Img() != null) {
                ImageIcon image = new ImageIcon(new ImageIcon(list.get(i).getUrl_Img()).getImage()
                        .getScaledInstance(200, 190, 0));

                rows[i][0] = image;
            } else {
                rows[i][0] = null;
            }

            rows[i][1] = list.get(i).getNomeFuncionario();
            rows[i][2] = list.get(i).getTelefone();

            if (list.get(i).isStatus() == true) {
                rows[i][3] = "Ativo";
            } else {
                rows[i][3] = "Inativo";
            }
        }

        ModeloTabela model = new ModeloTabela(rows, columnName);
        tabela.setModel(model);
        tabela.setRowHeight(190);

        if (!tabelaScroll.isVisible()) {
            tabela.setAutoResizeMode(tabela.AUTO_RESIZE_OFF);
            tabela.getColumnModel().getColumn(0).setPreferredWidth(200);
            tabela.getColumnModel().getColumn(1).setPreferredWidth(1000);
            tabela.getColumnModel().getColumn(2).setPreferredWidth(190);
            tabela.getColumnModel().getColumn(3).setPreferredWidth(200);
        } else {
            tabela.setAutoResizeMode(tabela.AUTO_RESIZE_OFF);
            tabela.getColumnModel().getColumn(0).setPreferredWidth(200);
            tabela.getColumnModel().getColumn(1).setPreferredWidth(934);
            tabela.getColumnModel().getColumn(2).setPreferredWidth(170);
            tabela.getColumnModel().getColumn(3).setPreferredWidth(135);
        }
    }

    public void readTabelaByName(String Nome) {
        FuncionariosDAO fdao = new FuncionariosDAO();
        List<Funcionarios> list = fdao.ReadByName(Nome);

        String[] columnName = {"Imagem", "Nome Completo", "Telefone", "Status"};
        Object[][] rows = new Object[list.size()][4];

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getUrl_Img() != null) {
                ImageIcon image = new ImageIcon(new ImageIcon(list.get(i).getUrl_Img()).getImage()
                        .getScaledInstance(200, 130, 0));

                rows[i][0] = image;
            } else {
                rows[i][0] = null;
            }

            rows[i][1] = list.get(i).getNomeFuncionario();
            rows[i][2] = list.get(i).getTelefone();

            if (list.get(i).isStatus() == true) {
                rows[i][3] = "Ativo";
            } else {
                rows[i][3] = "Inativo";
            }
        }

        ModeloTabela model = new ModeloTabela(rows, columnName);
        tabela.setModel(model);
        tabela.setRowHeight(190);

        if (!tabelaScroll.isVisible()) {
            tabela.setAutoResizeMode(tabela.AUTO_RESIZE_OFF);
            tabela.getColumnModel().getColumn(0).setPreferredWidth(200);
            tabela.getColumnModel().getColumn(1).setPreferredWidth(934);
            tabela.getColumnModel().getColumn(2).setPreferredWidth(190);
            tabela.getColumnModel().getColumn(3).setPreferredWidth(200);
        } else {
            tabela.setAutoResizeMode(tabela.AUTO_RESIZE_OFF);
            tabela.getColumnModel().getColumn(0).setPreferredWidth(200);
            tabela.getColumnModel().getColumn(1).setPreferredWidth(934);
            tabela.getColumnModel().getColumn(2).setPreferredWidth(170);
            tabela.getColumnModel().getColumn(3).setPreferredWidth(135);
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
        txtBusca = new javax.swing.JTextField();
        btnCaixa = new javax.swing.JButton();
        btnEncerrar = new javax.swing.JButton();
        btnFinanceiro = new javax.swing.JButton();
        btnCadastro = new javax.swing.JButton();
        btnProdutos = new javax.swing.JButton();
        btnVenda = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnPesquisa = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        txtUsuario = new javax.swing.JLabel();
        txtData = new javax.swing.JLabel();
        imgEditar = new javax.swing.JLabel();
        imgExcluir = new javax.swing.JLabel();
        baseGambiarra = new javax.swing.JPanel();
        gambiarra = new javax.swing.JLabel();
        tabelaScroll = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        imgTela = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        baseTela.setBackground(new java.awt.Color(56, 56, 56));
        baseTela.setPreferredSize(new java.awt.Dimension(1920, 1080));

        txtBusca.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtBusca.setBorder(null);
        txtBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscaActionPerformed(evt);
            }
        });

        btnCaixa.setBorderPainted(false);
        btnCaixa.setContentAreaFilled(false);
        btnCaixa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

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

        btnCadastro.setBorderPainted(false);
        btnCadastro.setContentAreaFilled(false);
        btnCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnProdutos.setBorderPainted(false);
        btnProdutos.setContentAreaFilled(false);
        btnProdutos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnVenda.setBorderPainted(false);
        btnVenda.setContentAreaFilled(false);
        btnVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

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

        btnExcluir.setBorderPainted(false);
        btnExcluir.setContentAreaFilled(false);
        btnExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnEditar.setBorderPainted(false);
        btnEditar.setContentAreaFilled(false);
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        txtData.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtData.setForeground(new java.awt.Color(255, 255, 255));
        txtData.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        imgEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Group 8.png"))); // NOI18N
        imgEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        imgExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Group 7.png"))); // NOI18N
        imgExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        baseGambiarra.setBackground(new java.awt.Color(228, 228, 228));

        gambiarra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BUSCA - FUNCIONÁRIOS.png"))); // NOI18N

        javax.swing.GroupLayout baseGambiarraLayout = new javax.swing.GroupLayout(baseGambiarra);
        baseGambiarra.setLayout(baseGambiarraLayout);
        baseGambiarraLayout.setHorizontalGroup(
            baseGambiarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, baseGambiarraLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(gambiarra, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        baseGambiarraLayout.setVerticalGroup(
            baseGambiarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, baseGambiarraLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(gambiarra, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabela.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        tabela.setForeground(new java.awt.Color(0, 0, 0));
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Imagem", "Nome Completo", "Telefone", "Status"
            }
        ));
        tabela.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabela.setGridColor(new java.awt.Color(155, 155, 155));
        tabela.setIntercellSpacing(new java.awt.Dimension(2, 2));
        tabela.setSelectionBackground(new java.awt.Color(255, 184, 0));
        tabela.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tabela.setShowHorizontalLines(true);
        tabela.setShowVerticalLines(true);
        tabelaScroll.setViewportView(tabela);

        imgTela.setBackground(new java.awt.Color(204, 204, 204));
        imgTela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/FUNCIONÁRIO - BUSCA.png"))); // NOI18N

        javax.swing.GroupLayout baseTelaLayout = new javax.swing.GroupLayout(baseTela);
        baseTela.setLayout(baseTelaLayout);
        baseTelaLayout.setHorizontalGroup(
            baseTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(1790, 1790, 1790)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(880, 880, 880)
                .addComponent(baseGambiarra, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(860, 860, 860)
                .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(btnPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btnFinanceiro, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(1450, 1450, 1450)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(btnEncerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(1670, 1670, 1670)
                .addComponent(imgExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(420, 420, 420)
                .addComponent(tabelaScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 1460, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btnProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(imgTela, javax.swing.GroupLayout.PREFERRED_SIZE, 1920, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(1450, 1450, 1450)
                .addComponent(imgEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btnVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(1680, 1680, 1680)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(1716, 1716, 1716)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btnCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btnCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(1676, 1676, 1676)
                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        baseTelaLayout.setVerticalGroup(
            baseTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(baseGambiarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(baseTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(baseTelaLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(240, 240, 240)
                .addComponent(btnFinanceiro, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(315, 315, 315)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(1015, 1015, 1015)
                .addComponent(btnEncerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(1030, 1030, 1030)
                .addComponent(imgExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(430, 430, 430)
                .addComponent(tabelaScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(435, 435, 435)
                .addComponent(btnProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(imgTela)
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(1030, 1030, 1030)
                .addComponent(imgEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(315, 315, 315)
                .addComponent(btnVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(1030, 1030, 1030)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(755, 755, 755)
                .addComponent(btnCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(535, 535, 535)
                .addComponent(btnCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

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

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (tabela.getSelectedRow() != - 1) {
            SelecionarFuncionarioDeletar();
            readTabela();
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma linha selecionada");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (tabela.getSelectedRow() != - 1) {
            SelecionarFuncionario();
            readTabela();
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma linha selecionada");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogoutActionPerformed

    public void SelecionarFuncionarioDeletar() {
        Funcionarios funcionarioRetorno = new Funcionarios();
        FuncionariosDAO fdao = new FuncionariosDAO();
        String NomeFuncionario;

        NomeFuncionario = tabela.getValueAt(tabela.getSelectedRow(), 2).toString();

        for (Funcionarios f : fdao.ReadByName(NomeFuncionario)) {

            funcionarioRetorno.setCodigoFunconario(f.getCodigoFunconario());
            funcionarioRetorno.setNomeFuncionario(f.getNomeFuncionario());
            funcionarioRetorno.setDataNascimento(f.getDataNascimento());
            funcionarioRetorno.setAdmicao(f.getAdmicao());
            funcionarioRetorno.setDesligamento(f.getDesligamento());
            funcionarioRetorno.setRg(f.getRg());
            funcionarioRetorno.setCpf(f.getCpf());
            funcionarioRetorno.setEndereco(f.getEndereco());
            funcionarioRetorno.setCep(f.getCep());
            funcionarioRetorno.setEstado(f.getEstado());
            funcionarioRetorno.setCidade(f.getCidade());
            funcionarioRetorno.setBairro(f.getBairro());
            funcionarioRetorno.setEmail(f.getEmail());
            funcionarioRetorno.setSenha(f.getSenha());
            funcionarioRetorno.setTelefone(f.getTelefone());
            funcionarioRetorno.setTipo_Acesso(f.getTipo_Acesso());
        }

        fdao.Delete(funcionarioRetorno);

    }

    public void SelecionarFuncionario() {
        Funcionarios funcionarioRetorno = new Funcionarios();
        FuncionariosDAO fdao = new FuncionariosDAO();
        String NomeFuncionario;

        if (tabela.getSelectedRow() != - 1) {
            NomeFuncionario = tabela.getValueAt(tabela.getSelectedRow(), 2).toString();

            for (Funcionarios f : fdao.ReadByName(NomeFuncionario)) {

                funcionarioRetorno.setCodigoFunconario(f.getCodigoFunconario());
                funcionarioRetorno.setNomeFuncionario(f.getNomeFuncionario());
                funcionarioRetorno.setDataNascimento(f.getDataNascimento());
                funcionarioRetorno.setAdmicao(f.getAdmicao());
                funcionarioRetorno.setDesligamento(f.getDesligamento());
                funcionarioRetorno.setRg(f.getRg());
                funcionarioRetorno.setCpf(f.getCpf());
                funcionarioRetorno.setEndereco(f.getEndereco());
                funcionarioRetorno.setCep(f.getCep());
                funcionarioRetorno.setEstado(f.getEstado());
                funcionarioRetorno.setCidade(f.getCidade());
                funcionarioRetorno.setBairro(f.getBairro());
                funcionarioRetorno.setEmail(f.getEmail());
                funcionarioRetorno.setSenha(f.getSenha());
                funcionarioRetorno.setTelefone(f.getTelefone());
                funcionarioRetorno.setTipo_Acesso(f.getTipo_Acesso());
            }
        }

        UI_CadastroFuncionario obj = new UI_CadastroFuncionario(funcionarioRetorno);
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
            java.util.logging.Logger.getLogger(UI_VisualizacaoFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI_VisualizacaoFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI_VisualizacaoFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_VisualizacaoFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI_VisualizacaoFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel baseGambiarra;
    private javax.swing.JPanel baseTela;
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnCaixa;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEncerrar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFinanceiro;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnPesquisa;
    private javax.swing.JButton btnProdutos;
    private javax.swing.JButton btnVenda;
    private javax.swing.JLabel gambiarra;
    private javax.swing.JLabel imgEditar;
    private javax.swing.JLabel imgExcluir;
    private javax.swing.JLabel imgTela;
    private javax.swing.JTable tabela;
    private javax.swing.JScrollPane tabelaScroll;
    private javax.swing.JTextField txtBusca;
    private javax.swing.JLabel txtData;
    private javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables
}
