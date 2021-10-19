/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Connection.ConnectionFac;
import Model.DAO.Produtos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author lucve
 */
public class ProdutosDAO {
    
    public void Create(Produtos P){
        
        Connection con = ConnectionFac.getConnecton();
        
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO produtos (CodigoProduto, NomeProduto, QtdProduto, ValorCompra, ValorVenda, NotaFiscal, Serie, Url_Img, idCategoria, idFornecedor VALUES(?,?,?,?,?,?,?,?)");
            
            stmt.setString(2, P.getNomeProduto());
            stmt.setInt(1, P.getCodigoProduto());
            stmt.setInt(3, P.getQtdProduto());
            stmt.setDouble(4, P.getValorCompra());
            stmt.setDouble(5, P.getValorVenda());
            stmt.setString(6, P.getNotaFiscal());
            stmt.setInt(7, P.getSerie());
            stmt.setString(8, P.getUrl_Img());
            stmt.setInt(9, P.getIdCategoria());
            stmt.setInt(10, P.getIdFornecedor());
            
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso");
        } 
        catch (SQLException ex) {
            throw new RuntimeException("Erro ao inserir valores na tabela Produtos", ex);
        }
        finally {
            ConnectionFac.closeConnection(con, stmt);
        }
             
    }
    
    public List<Produtos> Read(){
        Connection con = ConnectionFac.getConnecton();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Produtos> produtos = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM Produtos");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
            
                Produtos produto = new Produtos();
                
                produto.setIdProduto(rs.getInt("idProduto"));
                produto.setCodigoProduto(rs.getInt("CodigoProduto"));
                produto.setNomeProduto(rs.getString("NomeProduto"));
                produto.setQtdProduto(rs.getInt("QtdProduto"));
                produto.setValorCompra(rs.getDouble("ValorCompra"));
                produto.setValorVenda(rs.getDouble("ValorVenda"));
                produto.setNotaFiscal(rs.getString("NotaFiscal"));
                produto.setSerie(rs.getInt("Serie"));
                produto.setUrl_Img(rs.getString("Url_Img"));
                produto.setIdCategoria(rs.getInt("idCategoria"));
                produto.setIdFornecedor(rs.getInt("idFornecedor"));
                
                
                
                produtos.add(produto);
                
                
            }
       } 
        catch (SQLException ex) {
            throw new RuntimeException("Erro ao ler os valores da tabela Produtos", ex);
       }
        finally {
          ConnectionFac.closeConnection(con, stmt, rs);
        
        }
      
      return produtos;
    }
    
     public void Update(Produtos P){
        
        Connection con = ConnectionFac.getConnecton();
        
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("Update produtos SET CodigoProduto = ?, NomeProduto = ?, QtdProduto = ?, ValorCompra = ?, ValorVenda = ?, Serie = ?, NotaFiscal = ?, Url_Img = ?, idFornecedor, idCategoria WHERE idProduto = ?");
            
            stmt.setString(2, P.getNomeProduto());
            stmt.setInt(1, P.getCodigoProduto());
            stmt.setInt(3, P.getQtdProduto());
            stmt.setDouble(4, P.getValorCompra());
            stmt.setDouble(5, P.getValorVenda());
            stmt.setInt(6, P.getSerie());
            stmt.setString(7, P.getNotaFiscal());
            stmt.setString(8, P.getUrl_Img());
            stmt.setInt(9, P.getIdCategoria());
            stmt.setInt(10, P.getIdFornecedor());
            
            stmt.setInt(11, P.getIdProduto());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com Sucesso");
        } 
        catch (SQLException ex) {
            throw new RuntimeException("Erro ao atualizar valores na tabela Produtos", ex);
        }
        finally {
            ConnectionFac.closeConnection(con, stmt);
        }
             
    }
    
    
    
    
    
}
