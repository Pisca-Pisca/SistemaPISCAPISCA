/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Connection.ConnectionFac;
import UI_SistemaInterno.UI_Modal;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author lucve
 */
public class FuncionariosDAO {

    public void Create(Funcionarios F) {

        Connection con = ConnectionFac.getConnecton();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO Funcionarios (CodigoFuncionario, NomeFuncionario, DataNascimento, Admicao, Desligamento, Rg, Cpf, Endereco, Cep,Estado, Cidade, Bairro, Email, Senha, Telefone, Url_Img, Tipo_Acesso) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

            stmt.setInt(1, F.getCodigoFunconario());
            stmt.setString(2, F.getNomeFuncionario());
            stmt.setString(3, F.getDataNascimento());
            stmt.setString(4, F.getAdmicao());
            stmt.setString(5, F.getDesligamento());
            stmt.setString(6, F.getRg());
            stmt.setString(7, F.getCpf());
            stmt.setString(8, F.getEndereco());
            stmt.setString(9, F.getCep());
            stmt.setInt(10, F.getEstado());
            stmt.setString(11, F.getCidade());
            stmt.setString(12, F.getBairro());
            stmt.setString(13, F.getEmail());
            stmt.setString(14, F.getSenha());
            stmt.setString(15, F.getTelefone());
            stmt.setBytes(16, F.getUrl_Img());
            stmt.setInt(17, F.getTipo_Acesso());

            stmt.executeUpdate();

            UI_Modal dialog = new UI_Modal(new javax.swing.JFrame(), true);
            dialog.enviaDados("Cadastro de Funcionário", "Funcionário salvo com Sucesso!");
            dialog.setVisible(true);

        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao inserir valores na tabela Funcionários", ex);
        } finally {
            ConnectionFac.closeConnection(con, stmt);
        }

    }

    public List<Funcionarios> Read() {
        Connection con = ConnectionFac.getConnecton();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Funcionarios> Funcionarios = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM Funcionarios");

            rs = stmt.executeQuery();

            while (rs.next()) {

                Funcionarios Funcionario = new Funcionarios();

                Funcionario.setCodigoFunconario(rs.getInt("CodigoFuncionario"));
                Funcionario.setNomeFuncionario(rs.getString("NomeFuncionario"));
                Funcionario.setDataNascimento(rs.getString("DataNascimento"));
                Funcionario.setAdmicao(rs.getString("Admicao"));
                Funcionario.setDesligamento(rs.getString("Desligamento"));
                Funcionario.setRg(rs.getString("Rg"));
                Funcionario.setCpf(rs.getString("Cpf"));
                Funcionario.setEndereco(rs.getString("Endereco"));
                Funcionario.setCep(rs.getString("Cep"));
                Funcionario.setEstado(rs.getInt("Estado"));
                Funcionario.setCidade(rs.getString("Cidade"));
                Funcionario.setBairro(rs.getString("Bairro"));
                Funcionario.setEmail(rs.getString("Email"));
                Funcionario.setEmail(rs.getString("Senha"));
                Funcionario.setTelefone(rs.getString("Telefone"));
                Funcionario.setUrl_Img(rs.getBytes("Url_Img"));
                Funcionario.setTipo_Acesso(rs.getInt("Tipo_Acesso"));

                Funcionarios.add(Funcionario);

            }
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao ler os valores da tabela Funcionários", ex);
        } finally {
            ConnectionFac.closeConnection(con, stmt, rs);
        }

        return Funcionarios;
    }

    public List<Funcionarios> ReadByName(String Nome) {
        Connection con = ConnectionFac.getConnecton();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Funcionarios> Funcionarios = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM Funcionarios WHERE NomeFuncionario like ?");
            stmt.setString(1, "%" + Nome + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Funcionarios Funcionario = new Funcionarios();

                Funcionario.setCodigoFunconario(rs.getInt("CodigoFuncionario"));
                Funcionario.setNomeFuncionario(rs.getString("NomeFuncionario"));
                Funcionario.setDataNascimento(rs.getString("DataNascimento"));
                Funcionario.setAdmicao(rs.getString("Admicao"));
                Funcionario.setDesligamento(rs.getString("Desligamento"));
                Funcionario.setRg(rs.getString("Rg"));
                Funcionario.setCpf(rs.getString("Cpf"));
                Funcionario.setEndereco(rs.getString("Endereco"));
                Funcionario.setCep(rs.getString("Cep"));
                Funcionario.setEstado(rs.getInt("Estado"));
                Funcionario.setCidade(rs.getString("Cidade"));
                Funcionario.setBairro(rs.getString("Bairro"));
                Funcionario.setEmail(rs.getString("Email"));
                Funcionario.setEmail(rs.getString("Senha"));
                Funcionario.setTelefone(rs.getString("Telefone"));
                Funcionario.setUrl_Img(rs.getBytes("Url_Img"));
                Funcionario.setTipo_Acesso(rs.getInt("Tipo_Acesso_idTipo_Acesso"));

                Funcionarios.add(Funcionario);

            }
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao ler os valores da tabela Funcionários - Filtro de Nome", ex);
        } finally {
            ConnectionFac.closeConnection(con, stmt, rs);

        }

        return Funcionarios;
    }

    public void Update(Funcionarios F) {

        Connection con = ConnectionFac.getConnecton();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE Funcionarios SET CodigoFuncionario = ?, NomeFuncionario = ?, DataNascimento = ?, Admicao = ?, Desligamento = ?, Rg = ?, Cpf = ?, Endereco = ?, Cep = ?,Estado = ?, Cidade = ?, Bairro = ?, Email = ?, Senha = ?, Telefone = ?, Url_Img = ?, Tipo_Acesso = ? WHERE idFuncionarios = ?");

            stmt.setInt(1, F.getCodigoFunconario());
            stmt.setString(2, F.getNomeFuncionario());
            stmt.setString(3, F.getDataNascimento());
            stmt.setString(4, F.getAdmicao());
            stmt.setString(5, F.getDesligamento());
            stmt.setString(6, F.getRg());
            stmt.setString(7, F.getCpf());
            stmt.setString(8, F.getEndereco());
            stmt.setString(9, F.getCep());
            stmt.setInt(10, F.getEstado());
            stmt.setString(11, F.getCidade());
            stmt.setString(12, F.getBairro());
            stmt.setString(13, F.getEmail());
            stmt.setString(14, F.getSenha());
            stmt.setString(15, F.getTelefone());
            stmt.setBytes(16, F.getUrl_Img());
            stmt.setInt(17, F.getTipo_Acesso());

            stmt.setInt(18, F.getIdFuncionario());

            UI_Modal dialog = new UI_Modal(new javax.swing.JFrame(), true);
            dialog.enviaDados("Atualização de Funcionário", "Funcionário atualizado com Sucesso!");
            dialog.setVisible(true);
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao atualizar valores na tabela Funcionários", ex);
        } finally {
            ConnectionFac.closeConnection(con, stmt);
        }

    }

    public void Delete(Funcionarios F) {

        Connection con = ConnectionFac.getConnecton();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM Funcionarios WHERE idFuncionarios = ?");

            stmt.setInt(1, F.getIdFuncionario());

            stmt.executeUpdate();

            UI_Modal dialog = new UI_Modal(new javax.swing.JFrame(), true);
            dialog.enviaDados("Exclusão de Funcionário", "Funcionário excluído com Sucesso!");
            dialog.setVisible(true);
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao excluir valores na tabela Funcionários", ex);
        } finally {
            ConnectionFac.closeConnection(con, stmt);
        }

    }
}
