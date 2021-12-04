/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI_SistemaInterno;

import sistemainternopisca.validar;
import Model.DAO.Funcionarios;
import java.awt.image.BufferedImage;
import java.io.File;
import static java.lang.Thread.sleep;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFileChooser;
import Model.DAO.FuncionariosDAO;
import javax.swing.text.MaskFormatter;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.ParseException;
import java.util.Random;
import javax.swing.text.DefaultFormatterFactory;
import sistemainternopisca.ManipularImagem;

/**
 *
 * @author nicol
 */
public class UI_CadastroFuncionario extends javax.swing.JFrame {

    private MaskFormatter telMask;
    private MaskFormatter celMask;
    private BufferedImage imagem;

    Funcionarios F = new Funcionarios();
    FuncionariosDAO dao = new FuncionariosDAO();
    Funcionarios FuncionarioRetorno = new Funcionarios();
    validar Validar = new validar();

    /**
     * Creates new form UI_CadastroFuncionario
     *
     * @param FuncionariosRetorno
     */
    public UI_CadastroFuncionario(Funcionarios FuncionariosRetorno) {
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

        FuncionarioRetorno = FuncionariosRetorno;

        if (FuncionarioRetorno.getIdFuncionario() != 0) {
            txtBairro.setText(FuncionarioRetorno.getBairro());
            txtCEP.setText(FuncionarioRetorno.getCep());
            txtCPF.setText(FuncionarioRetorno.getCpf());
            txtCidade.setText(FuncionarioRetorno.getCidade());
            txtCodigoFuncionario.setText(String.valueOf(FuncionarioRetorno.getCodigoFunconario()));
            txtDataAdimissao.setText(FuncionarioRetorno.getAdmicao());
            txtDataDesligamento.setText(FuncionarioRetorno.getDesligamento());
            txtDataNascimento.setText(FuncionarioRetorno.getDataNascimento());
            txtEmail.setText(FuncionarioRetorno.getEmail());
            txtSenha.setText(FuncionarioRetorno.getSenha());
            txtEndereco.setText(FuncionarioRetorno.getEndereco());
            txtNomeCompleto.setText(FuncionarioRetorno.getNomeFuncionario());
            txtRG.setText(FuncionarioRetorno.getRg());
            celOuFixo.setText(FuncionarioRetorno.getTelefone());
            comboEstado.setSelectedIndex(FuncionarioRetorno.getEstado());
            comboTipoAcesso.setSelectedIndex(FuncionarioRetorno.getTipo_Acesso());
        }

    }

    public UI_CadastroFuncionario() {
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

        txtCodigoFuncionario.setText(String.valueOf(codigo));
    }

    public void enviaDados(UI_Login login, Funcionarios funcionarios) {
        String email = funcionarios.getEmail();
        txtUsuario.setText(email);
    }

    private void limparCamposProdutos() {

        txtBairro.setText("");
        txtCEP.setText("");
        txtCPF.setText("");
        txtCidade.setText("");
        txtCodigoFuncionario.setText("");
        txtDataAdimissao.setText("");
        txtDataDesligamento.setText("");
        txtDataNascimento.setText("");
        txtEmail.setText("");
        txtEndereco.setText("");
        txtNomeCompleto.setText("");
        txtRG.setText("");
        celOuFixo.setText("");
        txtSenha.setText("");
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gupoSelectTelCel = new javax.swing.ButtonGroup();
        baseTela = new javax.swing.JPanel();
        txtNomeCompleto = new javax.swing.JTextField();
        celOuFixo = new javax.swing.JFormattedTextField();
        txtDataDesligamento = new javax.swing.JFormattedTextField();
        txtDataAdimissao = new javax.swing.JFormattedTextField();
        txtDataNascimento = new javax.swing.JFormattedTextField();
        txtCEP = new javax.swing.JFormattedTextField();
        txtCPF = new javax.swing.JFormattedTextField();
        txtRG = new javax.swing.JFormattedTextField();
        txtCodigoFuncionario = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtBusca = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        btnSearch1 = new javax.swing.JButton();
        btnVenda = new javax.swing.JButton();
        btnProdutos = new javax.swing.JButton();
        btnCadastro = new javax.swing.JButton();
        btnFinanceiro = new javax.swing.JButton();
        btnEncerrar = new javax.swing.JButton();
        btnCaixa = new javax.swing.JButton();
        btnEnviar = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnEnviarArquivo = new javax.swing.JButton();
        comboTipoAcesso = new javax.swing.JComboBox<>();
        comboEstado = new javax.swing.JComboBox<>();
        btnVisualizar = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        radioCelular = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        radioFixo = new javax.swing.JRadioButton();
        txtNomeArquivo = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JLabel();
        txtData = new javax.swing.JLabel();
        imgTela = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        baseTela.setBackground(new java.awt.Color(37, 37, 37));
        baseTela.setPreferredSize(new java.awt.Dimension(1920, 1080));
        baseTela.setLayout(null);

        txtNomeCompleto.setBackground(new java.awt.Color(187, 184, 184));
        txtNomeCompleto.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtNomeCompleto.setBorder(null);
        txtNomeCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeCompletoActionPerformed(evt);
            }
        });
        baseTela.add(txtNomeCompleto);
        txtNomeCompleto.setBounds(1040, 460, 480, 50);

        celOuFixo.setBackground(new java.awt.Color(187, 184, 184));
        celOuFixo.setBorder(null);
        celOuFixo.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        celOuFixo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celOuFixoActionPerformed(evt);
            }
        });
        baseTela.add(celOuFixo);
        celOuFixo.setBounds(1457, 688, 350, 50);

        txtDataDesligamento.setBackground(new java.awt.Color(187, 184, 184));
        txtDataDesligamento.setBorder(null);
        try {
            txtDataDesligamento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataDesligamento.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtDataDesligamento.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        baseTela.add(txtDataDesligamento);
        txtDataDesligamento.setBounds(1600, 560, 210, 60);

        txtDataAdimissao.setBackground(new java.awt.Color(187, 184, 184));
        txtDataAdimissao.setBorder(null);
        try {
            txtDataAdimissao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataAdimissao.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtDataAdimissao.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtDataAdimissao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataAdimissaoActionPerformed(evt);
            }
        });
        baseTela.add(txtDataAdimissao);
        txtDataAdimissao.setBounds(1340, 560, 200, 60);

        txtDataNascimento.setBackground(new java.awt.Color(187, 184, 184));
        txtDataNascimento.setBorder(null);
        try {
            txtDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataNascimento.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtDataNascimento.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        baseTela.add(txtDataNascimento);
        txtDataNascimento.setBounds(1590, 460, 220, 50);

        txtCEP.setBackground(new java.awt.Color(187, 184, 184));
        txtCEP.setBorder(null);
        try {
            txtCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCEP.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCEP.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        baseTela.add(txtCEP);
        txtCEP.setBounds(510, 790, 240, 60);

        txtCPF.setBackground(new java.awt.Color(187, 184, 184));
        txtCPF.setBorder(null);
        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFActionPerformed(evt);
            }
        });
        baseTela.add(txtCPF);
        txtCPF.setBounds(940, 560, 350, 60);

        txtRG.setBackground(new java.awt.Color(187, 184, 184));
        txtRG.setBorder(null);
        try {
            txtRG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtRG.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtRG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRGActionPerformed(evt);
            }
        });
        baseTela.add(txtRG);
        txtRG.setBounds(510, 560, 360, 60);

        txtCodigoFuncionario.setBackground(new java.awt.Color(187, 184, 184));
        txtCodigoFuncionario.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtCodigoFuncionario.setBorder(null);
        baseTela.add(txtCodigoFuncionario);
        txtCodigoFuncionario.setBounds(510, 460, 220, 50);

        txtCidade.setBackground(new java.awt.Color(187, 184, 184));
        txtCidade.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtCidade.setBorder(null);
        baseTela.add(txtCidade);
        txtCidade.setBounds(510, 910, 260, 50);

        txtEmail.setBackground(new java.awt.Color(187, 184, 184));
        txtEmail.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtEmail.setBorder(null);
        baseTela.add(txtEmail);
        txtEmail.setBounds(510, 680, 470, 60);

        txtBairro.setBackground(new java.awt.Color(187, 184, 184));
        txtBairro.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtBairro.setBorder(null);
        baseTela.add(txtBairro);
        txtBairro.setBounds(1520, 790, 290, 60);

        txtEndereco.setBackground(new java.awt.Color(187, 184, 184));
        txtEndereco.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtEndereco.setBorder(null);
        baseTela.add(txtEndereco);
        txtEndereco.setBounds(810, 790, 650, 60);

        txtBusca.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtBusca.setBorder(null);
        baseTela.add(txtBusca);
        txtBusca.setBounds(780, 340, 660, 40);

        txtSenha.setBackground(new java.awt.Color(187, 184, 184));
        txtSenha.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtSenha.setBorder(null);
        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });
        baseTela.add(txtSenha);
        txtSenha.setBounds(1040, 690, 360, 50);

        btnSearch1.setBorderPainted(false);
        btnSearch1.setContentAreaFilled(false);
        btnSearch1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        baseTela.add(btnSearch1);
        btnSearch1.setBounds(1450, 330, 80, 60);

        btnVenda.setBorderPainted(false);
        btnVenda.setContentAreaFilled(false);
        btnVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendaActionPerformed(evt);
            }
        });
        baseTela.add(btnVenda);
        btnVenda.setBounds(9, 300, 360, 100);

        btnProdutos.setBorderPainted(false);
        btnProdutos.setContentAreaFilled(false);
        btnProdutos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutosActionPerformed(evt);
            }
        });
        baseTela.add(btnProdutos);
        btnProdutos.setBounds(9, 400, 360, 110);

        btnCadastro.setBorderPainted(false);
        btnCadastro.setContentAreaFilled(false);
        btnCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });
        baseTela.add(btnCadastro);
        btnCadastro.setBounds(9, 520, 360, 100);

        btnFinanceiro.setBorderPainted(false);
        btnFinanceiro.setContentAreaFilled(false);
        btnFinanceiro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFinanceiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinanceiroActionPerformed(evt);
            }
        });
        baseTela.add(btnFinanceiro);
        btnFinanceiro.setBounds(9, 620, 360, 110);

        btnEncerrar.setBorderPainted(false);
        btnEncerrar.setContentAreaFilled(false);
        btnEncerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncerrarActionPerformed(evt);
            }
        });
        baseTela.add(btnEncerrar);
        btnEncerrar.setBounds(109, 1010, 150, 50);

        btnCaixa.setBorderPainted(false);
        btnCaixa.setContentAreaFilled(false);
        btnCaixa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaixaActionPerformed(evt);
            }
        });
        baseTela.add(btnCaixa);
        btnCaixa.setBounds(9, 730, 360, 110);

        btnEnviar.setBorderPainted(false);
        btnEnviar.setContentAreaFilled(false);
        btnEnviar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        baseTela.add(btnEnviar);
        btnEnviar.setBounds(1010, 990, 350, 80);

        btnSearch.setBorderPainted(false);
        btnSearch.setContentAreaFilled(false);
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        baseTela.add(btnSearch);
        btnSearch.setBounds(1429, 330, 80, 60);

        btnLogout.setBorderPainted(false);
        btnLogout.setContentAreaFilled(false);
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        baseTela.add(btnLogout);
        btnLogout.setBounds(1789, 150, 110, 30);

        btnEnviarArquivo.setBorderPainted(false);
        btnEnviarArquivo.setContentAreaFilled(false);
        btnEnviarArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarArquivoActionPerformed(evt);
            }
        });
        baseTela.add(btnEnviarArquivo);
        btnEnviarArquivo.setBounds(970, 910, 130, 50);

        comboTipoAcesso.setBackground(new java.awt.Color(102, 102, 102));
        comboTipoAcesso.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        comboTipoAcesso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Operador de caixa", "Funcionário" }));
        baseTela.add(comboTipoAcesso);
        comboTipoAcesso.setBounds(770, 450, 230, 70);

        comboEstado.setBackground(new java.awt.Color(102, 102, 102));
        comboEstado.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        comboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        comboEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEstadoActionPerformed(evt);
            }
        });
        baseTela.add(comboEstado);
        comboEstado.setBounds(820, 900, 100, 70);

        btnVisualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnVisualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BTN VISUALIZAÇÃO.png"))); // NOI18N
        btnVisualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVisualizarMouseClicked(evt);
            }
        });
        baseTela.add(btnVisualizar);
        btnVisualizar.setBounds(1750, 320, 60, 60);

        jPanel1.setBackground(new java.awt.Color(228, 228, 228));

        gupoSelectTelCel.add(radioCelular);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(radioCelular)
                .addContainerGap())
        );

        baseTela.add(jPanel1);
        jPanel1.setBounds(1440, 640, 30, 30);

        jPanel2.setBackground(new java.awt.Color(228, 228, 228));

        gupoSelectTelCel.add(radioFixo);
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

        baseTela.add(jPanel2);
        jPanel2.setBounds(1590, 640, 30, 30);

        txtNomeArquivo.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        baseTela.add(txtNomeArquivo);
        txtNomeArquivo.setBounds(1110, 910, 700, 50);

        txtUsuario.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        baseTela.add(txtUsuario);
        txtUsuario.setBounds(1719, 100, 180, 30);

        txtData.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtData.setForeground(new java.awt.Color(255, 255, 255));
        txtData.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        baseTela.add(txtData);
        txtData.setBounds(1659, 10, 240, 30);

        imgTela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/FUNCIONÁRIO - CADASTRO.png"))); // NOI18N
        baseTela.add(imgTela);
        imgTela.setBounds(0, 0, 1928, 1080);

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

    private void btnVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendaActionPerformed
        UI_Carrinho carrinho = new UI_Carrinho();
        carrinho.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnVendaActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed

        boolean docValido = false;

        docValido = Validar.CPFValido(txtCPF.getText());

        if (docValido) {

            if (FuncionarioRetorno.getIdFuncionario() == 0) {
                F.setCodigoFunconario(Integer.parseInt(txtCodigoFuncionario.getText()));
                F.setNomeFuncionario(txtNomeCompleto.getText());
                F.setDataNascimento(txtDataNascimento.getText());
                F.setAdmicao(txtDataAdimissao.getText());
                F.setDesligamento(txtDataDesligamento.getText());
                F.setRg(txtRG.getText());
                F.setCpf(txtCPF.getText());
                F.setEndereco(txtEndereco.getText());
                F.setCep(txtCEP.getText());
                F.setEstado(comboEstado.getSelectedIndex());
                F.setCidade(txtCidade.getText());
                F.setBairro(txtBairro.getText());
                F.setEmail(txtEmail.getText());
                F.setSenha(txtSenha.getText());
                F.setTelefone(celOuFixo.getText());
                F.setTipo_Acesso(comboTipoAcesso.getSelectedIndex());

                dao.Create(F);
            } else {
                FuncionarioRetorno.setCodigoFunconario(Integer.parseInt(txtCodigoFuncionario.getText()));
                FuncionarioRetorno.setNomeFuncionario(txtNomeCompleto.getText());
                FuncionarioRetorno.setDataNascimento(txtDataNascimento.getText());
                FuncionarioRetorno.setAdmicao(txtDataAdimissao.getText());
                FuncionarioRetorno.setDesligamento(txtDataDesligamento.getText());
                FuncionarioRetorno.setRg(txtRG.getText());
                FuncionarioRetorno.setCpf(txtCPF.getText());
                FuncionarioRetorno.setEndereco(txtEndereco.getText());
                FuncionarioRetorno.setCep(txtCEP.getText());
                FuncionarioRetorno.setEstado(comboEstado.getSelectedIndex());
                FuncionarioRetorno.setCidade(txtCidade.getText());
                FuncionarioRetorno.setBairro(txtBairro.getText());
                FuncionarioRetorno.setEmail(txtEmail.getText());
                FuncionarioRetorno.setSenha(txtSenha.getText());
                FuncionarioRetorno.setTelefone(celOuFixo.getText());
                FuncionarioRetorno.setTipo_Acesso(comboTipoAcesso.getSelectedIndex());

                dao.Update(FuncionarioRetorno);
            }
            limparCamposProdutos();
        } else {
            // MOSTRAR A MODAL COM ERRO DE CPF
        }
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void comboEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboEstadoActionPerformed

    private void txtCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPFActionPerformed

    private void btnEnviarArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarArquivoActionPerformed
        JFileChooser fc = new JFileChooser();
        int res = fc.showOpenDialog(null);

        if (res == JFileChooser.APPROVE_OPTION) {
            File arquivo = fc.getSelectedFile();

            try {
                imagem = ManipularImagem.setImagemDimensao(arquivo.getAbsolutePath(), 200, 130);

                txtNomeArquivo.setText("Imagem enviada com sucesso");
                F.setUrl_Img(ManipularImagem.getImgBytes(imagem));

            } catch (Exception ex) {
                // System.out.println(ex.printStackTrace().toString());
            }

        } else {
            txtNomeArquivo.setText("Voce não selecionou nenhum arquivo.");
        }
    }//GEN-LAST:event_btnEnviarArquivoActionPerformed

    private void txtRGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRGActionPerformed

    private void radioFixoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioFixoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioFixoActionPerformed

    private void radioCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioCelularActionPerformed

    }//GEN-LAST:event_radioCelularActionPerformed

    private void btnEncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnEncerrarActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void celOuFixoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_celOuFixoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_celOuFixoActionPerformed

    private void txtDataAdimissaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataAdimissaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataAdimissaoActionPerformed

    private void txtNomeCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeCompletoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeCompletoActionPerformed

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
        UI_VisualizacaoFuncionario visuFuncionario = new UI_VisualizacaoFuncionario();
        visuFuncionario.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnVisualizarMouseClicked

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
            java.util.logging.Logger.getLogger(UI_CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI_CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI_CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI_CadastroFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel baseTela;
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnCaixa;
    private javax.swing.JButton btnEncerrar;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnEnviarArquivo;
    private javax.swing.JButton btnFinanceiro;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnProdutos;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSearch1;
    private javax.swing.JButton btnVenda;
    private javax.swing.JLabel btnVisualizar;
    private javax.swing.JFormattedTextField celOuFixo;
    private javax.swing.JComboBox<String> comboEstado;
    private javax.swing.JComboBox<String> comboTipoAcesso;
    private javax.swing.ButtonGroup gupoSelectTelCel;
    private javax.swing.JLabel imgTela;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JRadioButton radioCelular;
    public javax.swing.JRadioButton radioFixo;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtBusca;
    private javax.swing.JFormattedTextField txtCEP;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCodigoFuncionario;
    private javax.swing.JLabel txtData;
    private javax.swing.JFormattedTextField txtDataAdimissao;
    private javax.swing.JFormattedTextField txtDataDesligamento;
    private javax.swing.JFormattedTextField txtDataNascimento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JLabel txtNomeArquivo;
    private javax.swing.JTextField txtNomeCompleto;
    private javax.swing.JFormattedTextField txtRG;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables
}
