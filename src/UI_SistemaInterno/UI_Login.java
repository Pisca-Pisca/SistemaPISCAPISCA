package UI_SistemaInterno;

import Connection.ConnectionFacPisca;
import Model.DAO.Funcionarios;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class UI_Login extends javax.swing.JFrame {

    ConnectionFacPisca conectar = new ConnectionFacPisca(); //acessar os métodos de conexao com o banco
    Funcionarios Funcionario = new Funcionarios(); //acessar os atributos da classe funcionarios

    //Instanciar as UIs para exibir o email de login em todas as telas
    UI_Inicio inicio = new UI_Inicio();
    UI_FinanceiroDadosBoleto financeiro = new UI_FinanceiroDadosBoleto();
    UI_FinanceiroConsulta financeiroConsulta = new UI_FinanceiroConsulta();
    UI_Catalogo catalogo = new UI_Catalogo();
    UI_Caixa caixa = new UI_Caixa();
    UI_CadastroProduto cadastroProduto = new UI_CadastroProduto();
    UI_CadastroFuncionario cadastroFuncionario = new UI_CadastroFuncionario();
    UI_CadastroFornecedor cadastroFornecedor = new UI_CadastroFornecedor();
    UI_CadastroCliente cadastroCliente = new UI_CadastroCliente();
    UI_Boleto boleto = new UI_Boleto();
    UI_FechamentoCaixa fechamentoCaixa = new UI_FechamentoCaixa();
    UI_Carrinho carrinho = new UI_Carrinho();

    public UI_Login() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtSenha = new javax.swing.JPasswordField();
        txtLogin = new javax.swing.JTextField();
        btnEncerrar = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        imgTela = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1024, 948));
        setMinimumSize(new java.awt.Dimension(1024, 948));
        setUndecorated(true);

        txtSenha.setBackground(new java.awt.Color(196, 196, 196));
        txtSenha.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtSenha.setBorder(null);

        txtLogin.setBackground(new java.awt.Color(196, 196, 196));
        txtLogin.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtLogin.setBorder(null);

        btnEncerrar.setBorder(null);
        btnEncerrar.setContentAreaFilled(false);
        btnEncerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEncerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEncerrarMouseClicked(evt);
            }
        });

        btnLogin.setBorder(null);
        btnLogin.setContentAreaFilled(false);
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
        });
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        imgTela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LOGIN.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(780, 780, 780)
                .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(1693, 1693, 1693)
                .addComponent(btnEncerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(780, 780, 780)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(imgTela)
            .addGroup(layout.createSequentialGroup()
                .addGap(770, 770, 770)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(588, 588, 588)
                .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(1008, 1008, 1008)
                .addComponent(btnEncerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(970, 970, 970)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(imgTela)
            .addGroup(layout.createSequentialGroup()
                .addGap(788, 788, 788)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(1920, 1080));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEncerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEncerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnEncerrarMouseClicked

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed

        buscarFuncionarios(Funcionario);

    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
//        UI_CadastroProduto produto = new UI_CadastroProduto();
//        produto.setVisible(true);
    }//GEN-LAST:event_btnLoginMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI_Login().setVisible(true);
            }
        });
    }

    private void buscarFuncionarios(Funcionarios Funcionario) {
        this.conectar.conectaBanco();

        String login = this.txtLogin.getText();
        String senha = this.txtSenha.getText();

        try {
            this.conectar.executarSQL(
                    "SELECT "
                    + "Email,"
                    + "Senha"
                    + " FROM"
                    + " Funcionarios"
                    + " WHERE"
                    + " Email = '" + login + "'"
                    + "And Senha = '" + senha + "'"
                    + ";"
            );

            while (this.conectar.getResultSet().next()) {

                Funcionario.setEmail(this.conectar.getResultSet().getString(1));
                Funcionario.setSenha(this.conectar.getResultSet().getString(2));

            }

            if (Funcionario.getEmail() == "") {
                JOptionPane.showMessageDialog(null, "Login Inválido!");
            } else {
                UI_Inicio inicio = new UI_Inicio();
                inicio.setVisible(true);

                inicio.enviaDados(this, Funcionario);
                boleto.enviaDados(this, Funcionario);
                cadastroCliente.enviaDados(this, Funcionario);
                cadastroFornecedor.enviaDados(this, Funcionario);
                cadastroFuncionario.enviaDados(this, Funcionario);
                cadastroProduto.enviaDados(this, Funcionario);
                caixa.enviaDados(this, Funcionario);
                carrinho.enviaDados(this, Funcionario);
                catalogo.enviaDados(this, Funcionario);
                fechamentoCaixa.enviaDados(this, Funcionario);
                financeiroConsulta.enviaDados(this, Funcionario);
                financeiro.enviaDados(this, Funcionario);

                dispose();
            }

        } catch (Exception e) {
            System.out.println("Erro ao consultar funcionários " + e.getMessage());

        } finally {
            this.conectar.fechaBanco();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEncerrar;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel imgTela;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
