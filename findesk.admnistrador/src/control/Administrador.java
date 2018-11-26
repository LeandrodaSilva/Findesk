package control;
import Exceptions.ipException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.SGBD;
import model.Sockets;
import view.TelaPrincipal;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

/**
 *
 * @author ld_si
 */
//teste
public class Administrador {
    
    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        //Comentar esta parte abaixo caso nao deseje ativar o servidor
        setConfig();
        
        SGBD mybd = new SGBD();
        mybd.getConexaoMySQL();
        
        
        
        Sockets novo = new Sockets(mybd.loadAdmPort());
        novo.startServer();
        
        mybd.fecharConexao();
        //fim do servidor
        
        TelaPrincipal telaPrincipal = new TelaPrincipal();
        telaPrincipal.mostrar();
    }
    



    private static void setConfig(){     
        
            SGBD mybd = new SGBD();
            mybd.getConexaoMySQL();
        try {
            mybd.setAdmConfig(InetAddress.getLocalHost().getHostAddress(), 5060);
        } catch (UnknownHostException ex) {
            Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ipException ex) {
            Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
        }
            mybd.fecharConexao();
        try {
            System.out.println("ip do administrador atualizado para "+ InetAddress.getLocalHost().getHostAddress());
        } catch (UnknownHostException ex) {
            Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
}