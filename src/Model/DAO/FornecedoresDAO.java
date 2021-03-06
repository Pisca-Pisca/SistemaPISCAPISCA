/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Connection.ConnectionFac;
import UI_SistemaInterno.UI_Modal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author lucve
 */
public class FornecedoresDAO {

    public void Create(Fornecedores F) {

        Connection con = ConnectionFac.getConnecton();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO Fornecedores (CodigoFornecedor, RazaoSocial, Cnpj, InscricaoEstadual, Endereco, Cep, Estado, Cidade, Bairro, Email, Telefone) VALUES(?,?,?,?,?,?,?,?,?,?,?)");

            stmt.setInt(1, F.getCodigoFornecedor());
            stmt.setString(2, F.getRazaoSocial());
            stmt.setString(3, F.getCnpj());
            stmt.setString(4, F.getInscricaoEstadual());
            stmt.setString(5, F.getEndereco());
            stmt.setString(6, F.getCep());
            stmt.setString(7, F.getEstado());
            stmt.setString(8, F.getCidade());
            stmt.setString(9, F.getBairro());
            stmt.setString(10, F.getEmail());
            stmt.setString(11, F.getTelefone());

            stmt.executeUpdate();

            System.out.println("Testar String:" + stmt);

            UI_Modal dialog = new UI_Modal(new javax.swing.JFrame(), true);
            dialog.enviaDados("Cadastro de Fornecedor", "Fornecedor salvo com Sucesso!");
            dialog.setVisible(true);
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao inserir valores na tabela Fornecedores", ex);
        } finally {
            ConnectionFac.closeConnection(con, stmt);
        }

    }

    public List<Fornecedores> Read() {
        Connection con = ConnectionFac.getConnecton();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Fornecedores> Fornecedores = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM Fornecedores");

            rs = stmt.executeQuery();

            while (rs.next()) {

                Fornecedores fornecedor = new Fornecedores();

                fornecedor.setIdFornecedores(rs.getInt("idFornecedores"));
                fornecedor.setCodigoFornecedor(rs.getInt("CodigoFornecedor"));
                fornecedor.setRazaoSocial(rs.getString("RazaoSocial"));
                fornecedor.setCnpj(rs.getString("Cnpj"));
                fornecedor.setInscricaoEstadual(rs.getString("InscricaoEstadual"));
                fornecedor.setEndereco(rs.getString("Endereco"));
                fornecedor.setCep(rs.getString("Cep"));
                fornecedor.setEstado(rs.getString("Estado"));
                fornecedor.setCidade(rs.getString("Cidade"));
                fornecedor.setBairro(rs.getString("Bairro"));
                fornecedor.setEmail(rs.getString("Email"));
                fornecedor.setTelefone(rs.getString("Telefone"));

                Fornecedores.add(fornecedor);
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao ler os valores da tabela Fornecedores", ex);
        } finally {
            ConnectionFac.closeConnection(con, stmt, rs);
        }

        return Fornecedores;
    }

    public List<Fornecedores> ReadByName(String Nome) {
        Connection con = ConnectionFac.getConnecton();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Fornecedores> Fornecedores = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM Fornecedores WHERE Cnpj like ?");
            stmt.setString(1, "%" + Nome + "%");

            rs = stmt.executeQuery();

            while (rs.next()) {

                Fornecedores fornecedor = new Fornecedores();

                fornecedor.setIdFornecedores(rs.getInt("idFornecedores"));
                fornecedor.setCodigoFornecedor(rs.getInt("CodigoFornecedor"));
                fornecedor.setRazaoSocial(rs.getString("RazaoSocial"));
                fornecedor.setCnpj(rs.getString("Cnpj"));
                fornecedor.setInscricaoEstadual(rs.getString("InscricaoEstadual"));
                fornecedor.setEndereco(rs.getString("Endereco"));
                fornecedor.setCep(rs.getString("Cep"));
                fornecedor.setEstado(rs.getString("Estado"));
                fornecedor.setCidade(rs.getString("Cidade"));
                fornecedor.setBairro(rs.getString("Bairro"));
                fornecedor.setEmail(rs.getString("Email"));
                fornecedor.setTelefone(rs.getString("Telefone"));

                Fornecedores.add(fornecedor);
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao ler os valores da tabela Fornecedores", ex);
        } finally {
            ConnectionFac.closeConnection(con, stmt, rs);
        }

        return Fornecedores;
    }

    public void Update(Fornecedores F) {

        Connection con = ConnectionFac.getConnecton();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE Fornecedores SET CodigoFornecedor = ?, RazaoSocial = ?, Cnpj = ?, InscricaoEstadual = ?, Endereco = ?, Cep = ?, Estado = ?, Cidade = ?, Bairro = ?, Email = ?, Telefone = ? WHERE idFornecedores = ?");

            stmt.setInt(1, F.getCodigoFornecedor());
            stmt.setString(2, F.getRazaoSocial());
            stmt.setString(3, F.getCnpj());
            stmt.setString(4, F.getInscricaoEstadual());
            stmt.setString(5, F.getEndereco());
            stmt.setString(6, F.getCep());
            stmt.setString(7, F.getEstado());
            stmt.setString(8, F.getCidade());
            stmt.setString(9, F.getBairro());
            stmt.setString(10, F.getEmail());
            stmt.setString(11, F.getTelefone());

            stmt.setInt(12, F.getIdFornecedores());

            stmt.executeUpdate();

            System.out.println("Testar String:" + stmt);

            UI_Modal dialog = new UI_Modal(new javax.swing.JFrame(), true);
            dialog.enviaDados("Atualiza????o de Fornecedor", "Fornecedor atualizado com Sucesso!");
            dialog.setVisible(true);
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao inserir atualzar na tabela Fornecedores", ex);
        } finally {
            ConnectionFac.closeConnection(con, stmt);
        }

    }

    public void Delete(Fornecedores F) {

        Connection con = ConnectionFac.getConnecton();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM Fornecedores WHERE idFornecedores = ?");

            stmt.setInt(1, F.getIdFornecedores());

            stmt.executeUpdate();

            UI_Modal dialog = new UI_Modal(new javax.swing.JFrame(), true);
            dialog.enviaDados("Exclus??o de Fornecedor", "Fornecedor exclu??do com Sucesso!");
            dialog.setVisible(true);
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao excluir valores na tabela Fornecedores", ex);
        } finally {
            ConnectionFac.closeConnection(con, stmt);
        }

    }

}
