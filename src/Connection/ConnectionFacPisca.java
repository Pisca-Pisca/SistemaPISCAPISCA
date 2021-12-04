/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author lucve
 */
public class ConnectionFacPisca {
    private Connection conn = null; //variável de conexão com o banco
    private Statement statement; //variável de manipulação do SQL

    
    private ResultSet resultSet;
    
    private String servidor = "localhost:3306";
    private String nomeDoBanco = "mydb";
    private String usuario = "root";
    private String senha = "";
     
     public ConnectionFacPisca(){
    
    }
     
    public ConnectionFacPisca(String servidor, String nomeDoBanco, String usuario, String senha){
        this.servidor = servidor;
        this.nomeDoBanco = nomeDoBanco;
        this.usuario = usuario;
        this.senha = senha;
    }
    
    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public ResultSet getResultSet() {
        return resultSet;
    }

    public void setResultSet(ResultSet resultSet) {
        this.resultSet = resultSet;
    }
    
     public void conectaBanco(){
        try {
            //Class.forName("com.mysql.jdbc.Driver").newInstance();

            conn = DriverManager.getConnection("jdbc:mysql://" + servidor + "/" + nomeDoBanco, usuario, senha);
            //conn = DriverManager.getConnection("jdbc:mysql://localhost3306/banco_loja", "root", "root");
            
            if(conn != null){
                System.out.println("Conexão efetuada com sucesso! " + "ID: " + conn);
            }            
            
        } catch (SQLException e) {
            System.out.println("Conexão não realizada - ERRO: " + e.getMessage());
        }
    }
    
     public boolean fechaBanco(){
        try {
            conn.close();
            return true;
        } catch (SQLException ex ) {
            System.out.println("Erro ao fechar conexao " + ex.getMessage());
            return false;
        }
    }
     
    public int insertSQL(String SQL){
        int status = 0;
        try {
            //createStatement de con para criar o Statement
            this.setStatement(getConn().createStatement());   
            System.out.println("Entrou na consulta " + SQL);

            // Definido o Statement, executamos a query no banco de dados
            this.getStatement().executeUpdate(SQL);            
        
            return status;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return status;
        }
    }
    
    public void executarSQL(String sql) {
        try {
            System.out.println("Funcionario:" + sql);
            this.statement = conn.createStatement(
                    ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            this.resultSet = this.statement.executeQuery(sql);


        } catch (SQLException sqlex) {
            sqlex.printStackTrace();
        }
    }
    
    public boolean updateSQL(String pSQL){
        try {            
            //createStatement de con para criar o Statement
            this.setStatement(getConn().createStatement());

            // Definido o Statement, executamos a query no banco de dados
            getStatement().executeUpdate(pSQL);
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
        return true;
    }
    
}
