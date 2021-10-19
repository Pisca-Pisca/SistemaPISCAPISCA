/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Connection.ConnectionFac;
import Model.DAO.Clientes;
import Model.DAO.Produtos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author lucve
 */
public class ClientesDAO {
    
    public void Create(Clientes C){
        
        Connection con = ConnectionFac.getConnecton();
        
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO Clientes(CodigoCliente, DateNascimento, NomeCliente, RazaoSocial, Cpf, Cnpj, Rg, IncricaoEstadual, Endereco, Cep, Estado, Cidade, Bairro, Email, Telefone, idProduto  VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            
            stmt.setInt(1, C.getCodigoCliente());  
            stmt.setString(2, C.getDateNascimento());
            stmt.setString(3, C.getNomeCliente()); 
            stmt.setString(4, C.getRazaoSocial());
            stmt.setString(5, C.getCpf());
            stmt.setString(6, C.getCnpj());
            stmt.setString(7, C.getRg());
            stmt.setString(8, C.getInscricaoSocial());
            stmt.setString(9, C.getEndereco());
            stmt.setString(10, C.getEstado());
            stmt.setString(11, C.getCep());
            stmt.setString(12, C.getCidade());
            stmt.setString(13, C.getBairro());
            stmt.setString(14, C.getEmail());
            stmt.setString(15, C.getTelefone());
            stmt.setInt(16, C.getIdProduto());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso");
        } 
        catch (SQLException ex) {
            throw new RuntimeException("Erro ao inserir valores na tabela Clientes", ex);
        }
        finally {
            ConnectionFac.closeConnection(con, stmt);
        }
             
    }
    
}
