/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Connection.ConnectionFac;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author lucve
 */
public class FuncionariosDAO {
    public boolean checkLogin(String email, String senha){

    Connection con = ConnectionFac.getConnecton(); 
    PreparedStatement stmt = null;
    ResultSet rs = null;
    boolean check = false;

    if(!email.isEmpty() && !senha.isEmpty()) {

        try {
            stmt = con.prepareStatement("SELECT * FROM Funcionarios WHERE email = ?, and senha = ?");
            stmt.setString(1, email);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();

            if (rs.next()){

              check = true;

            }

        } catch (SQLException ex) {
        //Logger.getLogger(UserDAO.class.getEmail()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFac.closeConnection(con, stmt, rs);
        }

    }

    return check;

}

}
