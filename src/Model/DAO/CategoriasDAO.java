/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Connection.ConnectionFac;
import Model.DAO.Categorias;
import Model.DAO.Clientes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author lucve
 */
public class CategoriasDAO {
    
     public void Create(Categorias Cat){
        
        Connection con = ConnectionFac.getConnecton();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO Categorias(NomeCategoria) VALUES(?)");
            
            stmt.setString(1, Cat.getNomeCategoria());  
            
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso");
        } 
        catch (SQLException ex) {
            throw new RuntimeException("Erro ao inserir valores na tabela Categorias", ex);
        }
        finally {
            ConnectionFac.closeConnection(con, stmt);
        }
             
    }
     
    
}
