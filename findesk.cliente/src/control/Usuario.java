/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
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
       TelaPrincipal mytela = new TelaPrincipal();
       BuscaUser bu = new BuscaUser();
       mytela.mostrar();
    }
    
 
    
}
