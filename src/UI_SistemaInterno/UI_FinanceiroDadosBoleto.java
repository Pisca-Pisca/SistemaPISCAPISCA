/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI_SistemaInterno;

import Model.DAO.Carrinho;
import Model.DAO.Clientes;
import Model.DAO.ClientesDAO;
import Model.DAO.Funcionarios;
import Model.DAO.carrinhoDAO;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import static java.lang.Thread.sleep;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 *
 * @author jessi
 */
public class UI_FinanceiroDadosBoleto extends javax.swing.JFrame {

    List<Clientes> listaClientes;
    ClientesDAO cdao = new ClientesDAO();
    Clientes cliente;
    Object itemSelecionado;

    List<Carrinho> listaCarrinho;
    carrinhoDAO cadao = new carrinhoDAO();
    Carrinho carrinho;
    Object itemSelecionadoCarrinho;

    /**
     * Creates new form UI_FinanceiroDadosBoleto
     */
    public UI_FinanceiroDadosBoleto() {
        initComponents();
        listarClientes();
        listarCarrinho();

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
                        txtDataProcessamento.setText(data.toString().replace('-', ' '));
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
        btnCadastro = new javax.swing.JButton();
        btnFinanceiro = new javax.swing.JButton();
        btnCaixa = new javax.swing.JButton();
        btnEncerrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnGeraBoleto = new javax.swing.JButton();
        btnCalendario = new javax.swing.JButton();
        txtRazaoSocial = new javax.swing.JLabel();
        txtCNPJ = new javax.swing.JLabel();
        txtCEP = new javax.swing.JLabel();
        txtEndereço = new javax.swing.JLabel();
        txtBairro = new javax.swing.JLabel();
        txtCidade = new javax.swing.JLabel();
        txtEstado = new javax.swing.JLabel();
        txtNome = new javax.swing.JLabel();
        txtCPF = new javax.swing.JLabel();
        txtDataProcessamento = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        txtDataVencimento = new javax.swing.JFormattedTextField();
        txtPrefixo = new javax.swing.JFormattedTextField();
        selecionarCliente = new javax.swing.JComboBox<>();
        btnLogout = new javax.swing.JButton();
        txtData = new javax.swing.JLabel();
        selecionarCarrinho = new javax.swing.JComboBox<>();
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

        btnCadastro.setBorderPainted(false);
        btnCadastro.setContentAreaFilled(false);
        btnCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
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

        btnCancelar.setBorderPainted(false);
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnGeraBoleto.setBorderPainted(false);
        btnGeraBoleto.setContentAreaFilled(false);
        btnGeraBoleto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGeraBoleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeraBoletoActionPerformed(evt);
            }
        });

        btnCalendario.setBorderPainted(false);
        btnCalendario.setContentAreaFilled(false);
        btnCalendario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCalendario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalendarioActionPerformed(evt);
            }
        });

        txtRazaoSocial.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        txtRazaoSocial.setForeground(new java.awt.Color(153, 153, 153));
        txtRazaoSocial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtRazaoSocial.setText("PISCA PISCA ILUMINAÇÃO E AUTOMAÇÃO RESIDENCIAL LTDA.");

        txtCNPJ.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txtCNPJ.setForeground(new java.awt.Color(153, 153, 153));
        txtCNPJ.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCNPJ.setText("00.000.000/0001-10");

        txtCEP.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txtCEP.setForeground(new java.awt.Color(153, 153, 153));
        txtCEP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCEP.setText("01301-00 ");

        txtEndereço.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txtEndereço.setForeground(new java.awt.Color(153, 153, 153));
        txtEndereço.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtEndereço.setText("Rua das Constelação, Nº 2007");

        txtBairro.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txtBairro.setForeground(new java.awt.Color(153, 153, 153));
        txtBairro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtBairro.setText("Consolação");

        txtCidade.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txtCidade.setForeground(new java.awt.Color(153, 153, 153));
        txtCidade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCidade.setText("São Paulo");

        txtEstado.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txtEstado.setForeground(new java.awt.Color(153, 153, 153));
        txtEstado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtEstado.setText("SP");

        txtNome.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtNome.setForeground(new java.awt.Color(153, 153, 153));
        txtNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNome.setEnabled(false);

        txtCPF.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtCPF.setForeground(new java.awt.Color(153, 153, 153));
        txtCPF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCPF.setEnabled(false);

        txtDataProcessamento.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txtDataProcessamento.setForeground(new java.awt.Color(153, 153, 153));
        txtDataProcessamento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        txtValor.setBackground(new java.awt.Color(187, 184, 187));
        txtValor.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtValor.setBorder(null);

        txtDataVencimento.setBackground(new java.awt.Color(187, 184, 184));
        txtDataVencimento.setBorder(null);
        try {
            txtDataVencimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataVencimento.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N

        txtPrefixo.setBackground(new java.awt.Color(187, 184, 187));
        txtPrefixo.setBorder(null);
        try {
            txtPrefixo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("R$ ")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtPrefixo.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N

        selecionarCliente.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        selecionarCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        selecionarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionarClienteActionPerformed(evt);
            }
        });

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

        selecionarCarrinho.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        selecionarCarrinho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtUsuario.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        imgTela.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        imgTela.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgTela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/DadosBoleto.png"))); // NOI18N

        javax.swing.GroupLayout baseTelaLayout = new javax.swing.GroupLayout(baseTela);
        baseTela.setLayout(baseTelaLayout);
        baseTelaLayout.setHorizontalGroup(
            baseTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(1720, 1720, 1720)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(1790, 1790, 1790)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addComponent(btnProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(210, 210, 210)
                .addComponent(txtRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(txtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addComponent(btnCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(210, 210, 210)
                .addComponent(txtEndereço, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addComponent(btnFinanceiro, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(194, 194, 194)
                .addComponent(selecionarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 1210, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addComponent(btnCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(201, 201, 201)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(339, 339, 339)
                .addComponent(txtDataProcessamento, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(570, 570, 570)
                .addGroup(baseTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(baseTelaLayout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(btnCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtDataVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addComponent(txtPrefixo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(selecionarCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(btnEncerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(920, 920, 920)
                .addComponent(btnGeraBoleto, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(1670, 1670, 1670)
                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(btnVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(1140, 1140, 1140)
                .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(890, 890, 890)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(imgTela))
        );
        baseTelaLayout.setVerticalGroup(
            baseTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(250, 250, 250)
                .addGroup(baseTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(baseTelaLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(baseTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20)
                .addGroup(baseTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(baseTelaLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(baseTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEndereço, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30)
                .addGroup(baseTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFinanceiro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(baseTelaLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(selecionarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(baseTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(baseTelaLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(baseTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDataProcessamento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(40, 40, 40)
                .addGroup(baseTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selecionarCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(baseTelaLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(baseTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDataVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrefixo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(80, 80, 80)
                .addGroup(baseTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(baseTelaLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnEncerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnGeraBoleto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(310, 310, 310)
                .addComponent(btnVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(780, 780, 780)
                .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTelaLayout.createSequentialGroup()
                .addGap(1000, 1000, 1000)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(imgTela)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(baseTela, javax.swing.GroupLayout.PREFERRED_SIZE, 1921, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        UI_FinanceiroConsulta consulta = new UI_FinanceiroConsulta();
        consulta.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

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

    private void btnGeraBoletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeraBoletoActionPerformed
        UI_Boleto boleto = new UI_Boleto();
        boleto.setVisible(true);
        
        boleto.enviaDados(this, txtDataVencimento.getText(), selecionarCarrinho.getSelectedItem().toString(), txtValor.getText(), selecionarCliente.getSelectedItem().toString(), txtCPF.getText());

        dispose();
    }//GEN-LAST:event_btnGeraBoletoActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        UI_Login login = new UI_Login();
        login.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnCalendarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalendarioActionPerformed

    }//GEN-LAST:event_btnCalendarioActionPerformed

    private void selecionarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionarClienteActionPerformed

    }//GEN-LAST:event_selecionarClienteActionPerformed

    private void listarClientes() {
        listaClientes = cdao.Read();
        selecionarCliente.removeAllItems();

        for (int i = 0; i < listaClientes.size(); i++) {
            selecionarCliente.addItem(listaClientes.get(i).getNomeCliente());

            selecionarCliente.addItemListener(new ItemListener() {
                @Override
                public void itemStateChanged(ItemEvent e) {
                    if (e.getStateChange() == ItemEvent.SELECTED) {
                        itemSelecionado = selecionarCliente.getSelectedItem().toString();

                        for (int i = 0; i < listaClientes.size(); i++) {
                            if (itemSelecionado == listaClientes.get(i).getNomeCliente()) {
                                txtNome.setText(listaClientes.get(i).getNomeCliente());
                                txtCPF.setText(listaClientes.get(i).getCpf());
                            }
                        }

                    }
                }
            });

        }
    }

    private void listarCarrinho() {
        listaCarrinho = cadao.Read();
        selecionarCarrinho.removeAllItems();

        for (int i = 0; i < listaCarrinho.size(); i++) {
            selecionarCarrinho.addItem(String.valueOf(listaCarrinho.get(i).getCodigoCompra()));

            selecionarCarrinho.addItemListener(new ItemListener() {
                @Override
                public void itemStateChanged(ItemEvent e) {
                    if (e.getStateChange() == ItemEvent.SELECTED) {
                        itemSelecionadoCarrinho = selecionarCarrinho.getSelectedItem();

                        for (int i = 0; i < listaCarrinho.size(); i++) {
                            if (Integer.parseInt(String.valueOf(itemSelecionadoCarrinho)) == listaCarrinho.get(i).getCodigoCompra()) {
                                txtValor.setText(String.valueOf(listaCarrinho.get(i).getValorTotal()));
                            }
                        }

                    }
                }
            });

        }
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
            java.util.logging.Logger.getLogger(UI_FinanceiroDadosBoleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI_FinanceiroDadosBoleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI_FinanceiroDadosBoleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_FinanceiroDadosBoleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI_FinanceiroDadosBoleto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel baseTela;
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnCaixa;
    private javax.swing.JButton btnCalendario;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEncerrar;
    private javax.swing.JButton btnFinanceiro;
    private javax.swing.JButton btnGeraBoleto;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnProdutos;
    private javax.swing.JButton btnVenda;
    private javax.swing.JLabel imgTela;
    private javax.swing.JComboBox<String> selecionarCarrinho;
    private javax.swing.JComboBox<String> selecionarCliente;
    private javax.swing.JLabel txtBairro;
    private javax.swing.JLabel txtCEP;
    private javax.swing.JLabel txtCNPJ;
    private javax.swing.JLabel txtCPF;
    private javax.swing.JLabel txtCidade;
    private javax.swing.JLabel txtData;
    private javax.swing.JLabel txtDataProcessamento;
    private javax.swing.JFormattedTextField txtDataVencimento;
    private javax.swing.JLabel txtEndereço;
    private javax.swing.JLabel txtEstado;
    private javax.swing.JLabel txtNome;
    private javax.swing.JFormattedTextField txtPrefixo;
    private javax.swing.JLabel txtRazaoSocial;
    private javax.swing.JLabel txtUsuario;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
