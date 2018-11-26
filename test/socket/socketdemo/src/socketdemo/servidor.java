/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketdemo;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author ld_si
 */
public class servidor {
    
    public static void main(String[] args) {
        try {
            // Instancia o ServerSocket ouvindo a porta 12345
            ServerSocket servidor = new ServerSocket(5060);
            System.out.println("Servidor ouvindo a porta 5060");
            while(true) {
              // o método accept() bloqueia a execução até que
              // o servidor receba um pedido de conexão
              Socket cliente = servidor.accept();
              System.out.println("Cliente conectado: " + cliente.getInetAddress().getHostAddress());
              ObjectInputStream recebido = new ObjectInputStream(cliente.getInputStream());
              String msg = (String) recebido.readObject();
              System.out.println("msg recebida: " + msg);
             
//              JOptionPane jop = new JOptionPane();
//              jop.showMessageDialog(null,"Mensagem recebida: " + msg);
              //JOptionPane.showMessageDialog(null,"Mensagem recebida do cliente: " + msg);
              ObjectOutputStream saida = new ObjectOutputStream(cliente.getOutputStream());
              saida.flush();
              saida.writeObject("Oi cliente");
              saida.close();
              cliente.close();
            }  
        }   
        catch(Exception e) {
           System.out.println("Erro: " + e.getMessage());
        }
    }
    public void mostrar(){
        
    }
}
