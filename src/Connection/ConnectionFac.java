/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lucve
 */
public class ConnectionFac {
    
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    
    private static final String URL = "jdbc:mysql://localhost:3306/mydb";
    
    private static final String USER = "root";
    
    private static final String PASS = "";
    
    
    public static Connection getConnecton(){
        
        try {
            Class.forName(DRIVER);
            
            return DriverManager.getConnection(DRIVER, URL, USER);
            
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro ao conectar com o BD", ex);
        }
        
    }
    
    public static void closeConnection(Connection con){
        if(con != null){
            try {
                con.close();
            } catch (SQLException ex) {
                 throw new RuntimeException("Erro ao fechar a conexão", ex);
            }
        }
    }
    
    public static void closeConnection(Connection con, PreparedStatement stmt){
      closeConnection(con);
        
         try {
             if(stmt != null){
                 stmt.close();
             }
                 
             
            } catch (SQLException ex) {
                 throw new RuntimeException("Erro ao fechar a conexão", ex);
            }

    }
    
    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs){
      closeConnection(con, stmt);
        
         try {
             if(rs != null){
                 rs.close();
             }
                 
             
            } catch (SQLException ex) {
                 throw new RuntimeException("Erro ao fechar a conexão", ex);
            }

    }
    
    
}

    
    
    

