/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Connection.ConnectionFac;
import Model.DAO.Clientes;
import Model.DAO.Produtos;
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
public class ClientesDAO {

    public void Create(Clientes C) {

        Connection con = ConnectionFac.getConnecton();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO Clientes (CodigoCliente, DateNascimento, NomeCliente, Cpf, Rg, Endereco, Cep, Estado, Cidade, Bairro, Email, Telefone) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)");

            stmt.setInt(1, C.getCodigoCliente());
            stmt.setString(2, C.getDateNascimento());
            stmt.setString(3, C.getNomeCliente());
            stmt.setString(4, C.getCpf());
            stmt.setString(5, C.getRg());
            stmt.setString(6, C.getEndereco());
            stmt.setInt(8, C.getEstado());
            stmt.setString(7, C.getCep());
            stmt.setString(9, C.getCidade());
            stmt.setString(10, C.getBairro());
            stmt.setString(11, C.getEmail());
            stmt.setString(12, C.getTelefone());

            stmt.executeUpdate();

            UI_Modal dialog = new UI_Modal(new javax.swing.JFrame(), true);
            dialog.enviaDados("Cadastro de Cliente", "Cliente salvo com Sucesso!");
            dialog.setVisible(true);
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao inserir valores na tabela Clientes", ex);
        } finally {
            ConnectionFac.closeConnection(con, stmt);
        }

    }

    public List<Clientes> Read() {
        Connection con = ConnectionFac.getConnecton();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Clientes> Clientes = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM Clientes");

            rs = stmt.executeQuery();

            while (rs.next()) {

                Clientes cliente = new Clientes();

                cliente.setIdCliente(rs.getInt("idCliente"));
                cliente.setCodigoCliente(rs.getInt("CodigoCliente"));
                cliente.setDateNascimento(rs.getString("DateNascimento"));
                cliente.setNomeCliente(rs.getString("NomeCliente"));
                cliente.setCpf(rs.getString("Cpf"));
                cliente.setRg(rs.getString("Rg"));
                cliente.setEndereco(rs.getString("Endereco"));
                cliente.setCep(rs.getString("Cep"));
                cliente.setEstado(rs.getInt("Estado"));
                cliente.setCidade(rs.getString("Cidade"));
                cliente.setBairro(rs.getString("Bairro"));
                cliente.setEmail(rs.getString("Email"));
                cliente.setTelefone(rs.getString("Telefone"));

                Clientes.add(cliente);
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao ler os valores da tabela Clientes", ex);
        } finally {
            ConnectionFac.closeConnection(con, stmt, rs);
        }

        return Clientes;
    }

    public List<Clientes> ReadByName(String Nome) {
        Connection con = ConnectionFac.getConnecton();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Clientes> Clientes = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM Clientes WHERE NomeCliente like ?");
            stmt.setString(1, "%" + Nome + "%");

            rs = stmt.executeQuery();

            while (rs.next()) {

                Clientes cliente = new Clientes();

                cliente.setIdCliente(rs.getInt("idCliente"));
                cliente.setCodigoCliente(rs.getInt("CodigoCliente"));
                cliente.setDateNascimento(rs.getString("DateNascimento"));
                cliente.setNomeCliente(rs.getString("NomeCliente"));
                cliente.setCpf(rs.getString("Cpf"));
                cliente.setRg(rs.getString("Rg"));
                cliente.setEndereco(rs.getString("Endereco"));
                cliente.setCep(rs.getString("Cep"));
                cliente.setEstado(rs.getInt("Estado"));
                cliente.setCidade(rs.getString("Cidade"));
                cliente.setBairro(rs.getString("Bairro"));
                cliente.setEmail(rs.getString("Email"));
                cliente.setTelefone(rs.getString("Telefone"));

                Clientes.add(cliente);
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao ler os valores da tabela Clientes", ex);
        } finally {
            ConnectionFac.closeConnection(con, stmt, rs);
        }

        return Clientes;
    }

    public void Update(Clientes C) {

        Connection con = ConnectionFac.getConnecton();

        PreparedStatement stmt = null;

        try {

            stmt = con.prepareStatement("UPDATE Clientes SET CodigoCliente = ?, DateNascimento = ?, NomeCliente = ?, Cpf = ?, Rg = ?, Endereco = ?, Cep = ?, Estado = ?, Cidade = ?, Bairro = ?, Email = ?, Telefone = ? WHERE idCliente = ?");

            stmt.setInt(1, C.getCodigoCliente());
            stmt.setString(2, C.getDateNascimento());
            stmt.setString(3, C.getNomeCliente());
            stmt.setString(4, C.getCpf());
            stmt.setString(5, C.getRg());
            stmt.setString(6, C.getEndereco());
            stmt.setInt(8, C.getEstado());
            stmt.setString(7, C.getCep());
            stmt.setString(9, C.getCidade());
            stmt.setString(10, C.getBairro());
            stmt.setString(11, C.getEmail());
            stmt.setString(12, C.getTelefone());
            stmt.setInt(13, C.getIdCliente());
            

            System.out.println("Testar String:" + stmt);

            stmt.executeUpdate();

            UI_Modal dialog = new UI_Modal(new javax.swing.JFrame(), true);
            dialog.enviaDados("Atualização de Cliente", "Cliente atualizado com Sucesso!");
            dialog.setVisible(true);
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao atualizar valores na tabela Clientes", ex);
        } finally {
            ConnectionFac.closeConnection(con, stmt);
        }

    }

    public void Delete(Clientes C) {

        Connection con = ConnectionFac.getConnecton();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM Clientes WHERE NomeCliente = ?");

            stmt.setString(1, C.getNomeCliente());

            
            System.out.println(stmt);
            
            stmt.executeUpdate();

            UI_Modal dialog = new UI_Modal(new javax.swing.JFrame(), true);
            dialog.enviaDados("Exclusão de Cliente", "Cliente excluído com Sucesso!");
            dialog.setVisible(true);
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao excluir valores na tabela Clientes", ex);
        } finally {
            ConnectionFac.closeConnection(con, stmt);
        }

    }

}
