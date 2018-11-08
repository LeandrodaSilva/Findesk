/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ld_si
 */
public class Conexao {
    
    private final String driverName = "com.mysql.jdbc.Driver";                        
    private final String serverName = "localhost:3306";   
    private final String mydatabase = "findesk";       
    private final String url = "jdbc:mysql://localhost:3306/findesk";  // + serverName + "/" + mydatabase;
    private final String username = "utfpr";            
    private final String password = "02utfpres31";   
    
    public Connection getConnection(){
        try {
            Class.forName(driverName);
            
            return DriverManager.getConnection(url, username, password);
            
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na conexão: ",ex);
        }
    }
    
    public static void closeConnection(Connection con){
        
        try {
            if(con!= null){
                con.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void closeConnection(Connection con, PreparedStatement stmt){
        
        closeConnection(con);
         
        try {
          if(stmt != null){
              stmt.close();
          }
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs){
        
        closeConnection(con, stmt);
         
        try {
          if(rs != null){
              rs.close();
          }
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
