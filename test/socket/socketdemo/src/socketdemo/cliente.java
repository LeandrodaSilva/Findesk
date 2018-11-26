/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketdemo;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author ld_si
 */
public class cliente {
    public static void main(String[] args) {
        try {
            Socket cliente = new Socket("127.0.0.1",5060);
            
            ObjectOutputStream saida = new ObjectOutputStream(cliente.getOutputStream());
            saida.flush();
            saida.writeObject("Oi Servidor");
            
            
            
            ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());
            String msg = (String)entrada.readObject();
            JOptionPane.showMessageDialog(null,"Mensagem recebida: " + msg);
            entrada.close();
            
            System.out.println("Conexão encerrada");
        }
        catch(Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
}
