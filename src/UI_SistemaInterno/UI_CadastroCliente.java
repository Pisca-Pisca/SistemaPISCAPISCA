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
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.ParseException;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

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
    private MaskFormatter telMask;
    private MaskFormatter celMask;

    public UI_CadastroCliente(Clientes ClientesRetorno) {
        initComponents();
        inicializa_jformatter();
        ClienteRetorno = ClientesRetorno;

        if (ClienteRetorno.getIdCliente() != 0) {
            if (ClienteRetorno.getCpf() != "") {
                txtCodigoCliente.setText(String.valueOf(ClienteRetorno.getCodigoCliente()));
                txtNomeRazaoSocial.setText(ClienteRetorno.getNomeCliente());
                txtCPF_CNPJ.setText(ClienteRetorno.getCpf());
                txtRGInscricao1.setText(ClienteRetorno.getRg());
                txtDataNascimento.setText(ClienteRetorno.getDateNascimento());
                celOuFixo.setText(ClienteRetorno.getTelefone());
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
        inicializa_jformatter();


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
        
        Random codigoCliente = new Random();
        int codigo = codigoCliente.nextInt(500000) + 1;

        txtCodigoCliente.setText(String.valueOf(codigo));
    }

    public void inicializa_jformatter() {

        try {
            celMask = new MaskFormatter("(##)#####-####");
            telMask = new MaskFormatter("(##)####-####");
        } catch (ParseException ex) {
            ex.printStackTrace();
        }

        radioFixo.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    celOuFixo.setValue(null);
                    celOuFixo.setFormatterFactory(new DefaultFormatterFactory(telMask));
                }
            }
        });

        radioCelular.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    celOuFixo.setValue(null);
                    celOuFixo.setFormatterFactory(new DefaultFormatterFactory(celMask));
                }
            }
        });
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
        celOuFixo = new javax.swing.JFormattedTextField();
        btnVisualizar = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        radioCelular = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        radioFixo = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        imgTela = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        baseTala.setBackground(new java.awt.Color(37, 37, 37));
        baseTala.setPreferredSize(new java.awt.Dimension(1980, 1220));

        comboEstado.setBackground(new java.awt.Color(102, 102, 102));
        comboEstado.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        comboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        comboEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEstadoActionPerformed(evt);
            }
        });

        txtCEP.setBackground(new java.awt.Color(187, 184, 184));
        txtCEP.setBorder(null);
        try {
            txtCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCEP.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCEP.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N

        txtDataNascimento.setBackground(new java.awt.Color(187, 184, 184));
        txtDataNascimento.setBorder(null);
        try {
            txtDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataNascimento.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtDataNascimento.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N

        txtBusca.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtBusca.setBorder(null);

        txtEndereco.setBackground(new java.awt.Color(187, 184, 184));
        txtEndereco.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtEndereco.setBorder(null);

        txtCPF_CNPJ.setBackground(new java.awt.Color(187, 184, 184));
        txtCPF_CNPJ.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtCPF_CNPJ.setBorder(null);
        txtCPF_CNPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPF_CNPJActionPerformed(evt);
            }
        });

        txtEmail.setBackground(new java.awt.Color(187, 184, 184));
        txtEmail.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtEmail.setBorder(null);

        txtBairro.setBackground(new java.awt.Color(187, 184, 184));
        txtBairro.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtBairro.setBorder(null);

        txtCodigoCliente.setBackground(new java.awt.Color(187, 184, 184));
        txtCodigoCliente.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtCodigoCliente.setBorder(null);

        txtCidade.setBackground(new java.awt.Color(187, 184, 184));
        txtCidade.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtCidade.setBorder(null);

        txtRGInscricao1.setBackground(new java.awt.Color(187, 184, 184));
        txtRGInscricao1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtRGInscricao1.setBorder(null);
        txtRGInscricao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRGInscricao1ActionPerformed(evt);
            }
        });

        txtNomeRazaoSocial.setBackground(new java.awt.Color(187, 184, 184));
        txtNomeRazaoSocial.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtNomeRazaoSocial.setBorder(null);

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

        btnEnviar.setBorderPainted(false);
        btnEnviar.setContentAreaFilled(false);
        btnEnviar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        btnSearch.setBorderPainted(false);
        btnSearch.setContentAreaFilled(false);
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnLogout.setBorderPainted(false);
        btnLogout.setContentAreaFilled(false);
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        txtUsuario.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        txtData.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtData.setForeground(new java.awt.Color(255, 255, 255));
        txtData.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        celOuFixo.setBackground(new java.awt.Color(187, 184, 184));
        celOuFixo.setBorder(null);
        celOuFixo.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        celOuFixo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celOuFixoActionPerformed(evt);
            }
        });

        btnVisualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnVisualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BTN VISUALIZAÇÃO.png"))); // NOI18N
        btnVisualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVisualizarMouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(228, 228, 228));

        grupoSelectCadastroCliente.add(radioCelular);
        radioCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioCelularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(radioCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(radioCelular)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(228, 228, 228));

        grupoSelectCadastroCliente.add(radioFixo);
        radioFixo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        radioFixo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        radioFixo.setPreferredSize(new java.awt.Dimension(120, 18));
        radioFixo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioFixoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(radioFixo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(radioFixo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

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

        imgTela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CLIENTE - CADASTRO.jpg"))); // NOI18N
        imgTela.setPreferredSize(new java.awt.Dimension(1920, 1080));

        javax.swing.GroupLayout baseTalaLayout = new javax.swing.GroupLayout(baseTala);
        baseTala.setLayout(baseTalaLayout);
        baseTalaLayout.setHorizontalGroup(
            baseTalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(baseTalaLayout.createSequentialGroup()
                .addGap(1720, 1720, 1720)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTalaLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btnVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(410, 410, 410)
                .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTalaLayout.createSequentialGroup()
                .addGap(500, 500, 500)
                .addComponent(txtCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(txtCPF_CNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTalaLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btnCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1040, 1040, 1040)
                .addComponent(txtRGInscricao1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTalaLayout.createSequentialGroup()
                .addGap(1664, 1664, 1664)
                .addComponent(comboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTalaLayout.createSequentialGroup()
                .addGap(970, 970, 970)
                .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTalaLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btnFinanceiro, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTalaLayout.createSequentialGroup()
                .addGap(830, 830, 830)
                .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTalaLayout.createSequentialGroup()
                .addGap(510, 510, 510)
                .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTalaLayout.createSequentialGroup()
                .addGap(1060, 1060, 1060)
                .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTalaLayout.createSequentialGroup()
                .addGap(1340, 1340, 1340)
                .addComponent(celOuFixo, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTalaLayout.createSequentialGroup()
                .addGap(1310, 1310, 1310)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTalaLayout.createSequentialGroup()
                .addGap(1460, 1460, 1460)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTalaLayout.createSequentialGroup()
                .addGap(1740, 1740, 1740)
                .addComponent(btnVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTalaLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btnProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTalaLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(btnEncerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(imgTela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(baseTalaLayout.createSequentialGroup()
                .addGap(1480, 1480, 1480)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTalaLayout.createSequentialGroup()
                .addGap(500, 500, 500)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTalaLayout.createSequentialGroup()
                .addGap(1790, 1790, 1790)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTalaLayout.createSequentialGroup()
                .addGap(1660, 1660, 1660)
                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTalaLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btnCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTalaLayout.createSequentialGroup()
                .addGap(500, 500, 500)
                .addComponent(txtNomeRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTalaLayout.createSequentialGroup()
                .addGap(1430, 1430, 1430)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTalaLayout.createSequentialGroup()
                .addGap(500, 500, 500)
                .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        baseTalaLayout.setVerticalGroup(
            baseTalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(baseTalaLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(170, 170, 170)
                .addGroup(baseTalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(baseTalaLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(90, 90, 90)
                .addGroup(baseTalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCPF_CNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(baseTalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(baseTalaLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(txtRGInscricao1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(256, 256, 256)
                .addComponent(comboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTalaLayout.createSequentialGroup()
                .addGap(640, 640, 640)
                .addComponent(btnFinanceiro, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTalaLayout.createSequentialGroup()
                .addGap(790, 790, 790)
                .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTalaLayout.createSequentialGroup()
                .addGap(900, 900, 900)
                .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTalaLayout.createSequentialGroup()
                .addGap(900, 900, 900)
                .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTalaLayout.createSequentialGroup()
                .addGap(680, 680, 680)
                .addComponent(celOuFixo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTalaLayout.createSequentialGroup()
                .addGap(640, 640, 640)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTalaLayout.createSequentialGroup()
                .addGap(640, 640, 640)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTalaLayout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addComponent(btnVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTalaLayout.createSequentialGroup()
                .addGap(410, 410, 410)
                .addComponent(btnProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTalaLayout.createSequentialGroup()
                .addGap(1010, 1010, 1010)
                .addComponent(btnEncerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(imgTela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(baseTalaLayout.createSequentialGroup()
                .addGap(420, 420, 420)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTalaLayout.createSequentialGroup()
                .addGap(680, 680, 680)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTalaLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTalaLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTalaLayout.createSequentialGroup()
                .addGap(740, 740, 740)
                .addComponent(btnCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTalaLayout.createSequentialGroup()
                .addGap(590, 590, 590)
                .addComponent(txtNomeRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTalaLayout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(baseTalaLayout.createSequentialGroup()
                .addGap(790, 790, 790)
                .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

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
            UI_ModalDocumentoInvalido invalido = new UI_ModalDocumentoInvalido(new javax.swing.JFrame(), true);
            invalido.setVisible(true);
        }
    }//GEN-LAST:event_btnEnviarActionPerformed

    public void selecionarProdutoRetorno() {
        ClienteRetorno.setCodigoCliente(Integer.parseInt(txtCodigoCliente.getText()));
        ClienteRetorno.setNomeCliente(txtNomeRazaoSocial.getText());
        ClienteRetorno.setCpf(txtCPF_CNPJ.getText());
        ClienteRetorno.setRg(txtRGInscricao1.getText());
        ClienteRetorno.setDateNascimento(txtDataNascimento.getText());
        ClienteRetorno.setEmail(txtEmail.getText());
        ClienteRetorno.setTelefone(celOuFixo.getText());
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

    private void radioCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioCelularActionPerformed

    }//GEN-LAST:event_radioCelularActionPerformed

    private void radioFixoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioFixoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioFixoActionPerformed

    private void celOuFixoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_celOuFixoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_celOuFixoActionPerformed

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
        NovoCliente.setTelefone(celOuFixo.getText());
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
    private javax.swing.JFormattedTextField celOuFixo;
    private javax.swing.JComboBox<String> comboEstado;
    private javax.swing.ButtonGroup grupoSelectCadastroCliente;
    private javax.swing.JLabel imgTela;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    public javax.swing.JRadioButton radioCelular;
    public javax.swing.JRadioButton radioFixo;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtBusca;
    private javax.swing.JFormattedTextField txtCEP;
    private javax.swing.JTextField txtCPF_CNPJ;
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
