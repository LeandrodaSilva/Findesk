/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketdemo;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author ld_si
 */
public class ipException extends Exception{
    public ipException(){
        System.out.println("IP vazio adicionado ip padrão: 127.0.0.1:5061");
        try {
            SGBD.setUserConfig("127.0.0.1", 5061);
        } catch (ipException ex) {
            Logger.getLogger(ipException.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
