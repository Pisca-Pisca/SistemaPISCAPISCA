/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

/**
 *
 * @author lucve
 */
public class Funcionarios {
    private int IdFuncionario;
    private int CodigoFunconario;
    private String DataNascimento = "";
    private String NomeFuncionario;
    private String Admicao = "";
    private String Desligamento = null;
    private String Rg = "";
    private String Cpf = "";
    private String Endereco = "";
    private String Cep = "";
    private int Estado = 0;
    private String Cidade = "";
    private String Bairro = "";
    private String Email = "";
    private String Senha ;
    private String Telefone = "";
    private byte[] Url_Img = new byte[5];
    private int Tipo_Acesso = 1;
    private boolean Status = false;

        
    // GETTERS E SETTERS

    public int getIdFuncionario() {
        return IdFuncionario;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean Status) {
        this.Status = Status;
    }

    public void setIdFuncionario(int IdFuncionario) {
        this.IdFuncionario = IdFuncionario;
    }

    public int getCodigoFunconario() {
        return CodigoFunconario;
    }

    public void setCodigoFunconario(int CodigoFunconario) {
        this.CodigoFunconario = CodigoFunconario;
    }

    public String getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(String DataNascimento) {
        this.DataNascimento = DataNascimento;
    }

    public String getNomeFuncionario() {
        return NomeFuncionario;
    }

    public void setNomeFuncionario(String NomeFuncionario) {
        this.NomeFuncionario = NomeFuncionario;
    }

    public String getAdmicao() {
        return Admicao;
    }

    public void setAdmicao(String Admicao) {
        this.Admicao = Admicao;
    }

    public String getDesligamento() {
        return Desligamento;
    }

    public void setDesligamento(String Desligamento) {
        if(Desligamento != null){
            this.setStatus(true);
        }else{
            this.setStatus(false);
        }
        
        this.Desligamento = Desligamento;
    }

    public String getRg() {
        return Rg;
    }

    public void setRg(String Rg) {
        this.Rg = Rg;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getCep() {
        return Cep;
    }

    public void setCep(String Cep) {
        this.Cep = Cep;
    }

    public int getEstado() {
        return Estado;
    }

    public void setEstado(int Estado) {
        this.Estado = Estado;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public byte[] getUrl_Img() {
        return Url_Img;
    }

    public void setUrl_Img(byte[] Url_Img) {
        this.Url_Img = Url_Img;
    }
    
    public int getTipo_Acesso() {
        return Tipo_Acesso;
    }

    public void setTipo_Acesso(int Tipo_Acesso) {
        this.Tipo_Acesso = Tipo_Acesso;
    }   
}
