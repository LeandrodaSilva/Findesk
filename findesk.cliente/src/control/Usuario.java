/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import Exceptions.ipException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.SGBD;
import view.TelaPrincipal;
import view.BuscaUser;
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
       setConfig();
       TelaPrincipal mytela = new TelaPrincipal();
       //BuscaUser bu = new BuscaUser();
       mytela.mostrar();
    }
    
    
    
    private static void setConfig(){
       
        try {
            SGBD mybd = new SGBD();
            mybd.getConexaoMySQL();
            mybd.setUserConfig(InetAddress.getLocalHost().getHostAddress(), 5561);
            mybd.fecharConexao();
            System.out.println("ip do usuário atualizado para "+ InetAddress.getLocalHost().getHostAddress());
        } catch (UnknownHostException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ipException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
 
    
}
