/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.SGBD;

/**
 *
 * @author ld_si
 */
public class Usuario {

    /**
     * @param args the command line arguments
     * 
     */
  
    public static void main(String[] args) {
 
        SGBD mybd = new SGBD("127.0.0.1:3307", "findesk", "client", "client123456");
        
        mybd.getConexaoMySQL();
        
        System.out.println(mybd.statusConection());
        
        mybd.consultarItemBd("SELECT * FROM cor");
        
        mybd.fecharConexao();
    }
    
 
    
}
