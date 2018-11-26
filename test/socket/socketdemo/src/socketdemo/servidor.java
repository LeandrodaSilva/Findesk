/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketdemo;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ld_si
 */
public class servidor {
    private static Socket clienteS;
    private static String msgR = "";
    
    public static void start(servidorUI janela) {
        try {
            // Instancia o ServerSocket ouvindo a porta 12345
            ServerSocket servidor = new ServerSocket(5060);
            System.out.println("Servidor ouvindo a porta 5060");
            while(true) {
              // o método accept() bloqueia a execução até que
              // o servidor receba um pedido de conexão
              Socket cliente = servidor.accept();
              janela.setVisible(true);
               new Thread() {
                   @Override
                   public void run() {
                       try {
                           tratamento(cliente,janela);
                       } catch (IOException ex) {
                           Logger.getLogger(servidor.class.getName()).log(Level.SEVERE, null, ex);
                       }
                    }
                }.start();
               System.out.println("aguardando nova conexao");
//              System.out.println("Cliente conectado: " + cliente.getInetAddress().getHostAddress());
//              ObjectInputStream recebido = new ObjectInputStream(cliente.getInputStream());
//              Item msg = (Item) recebido.readObject();
////              System.out.println("msg recebida: " + msg);
////              if(msg.equals("1")){
////                  janela.setVisible(true);
////              }
//              System.out.println("ID: "+msg.getIdItem()+"\nNome: "+msg.getNome());
//              
//              clienteS = cliente;
//              
//              int id = msg.getIdItem();
//              String ids = Integer.toString(id);
//              janela.setJLabelId(ids);
//              janela.setVisible(true);
//              ObjectOutputStream saida = new ObjectOutputStream(cliente.getOutputStream());
//              String aceito = "aceito";
//            
//              saida.flush();
//              saida.writeObject(msgR);
//              saida.close();
//              msgR = "";
//               
//              
//              
//              cliente.close();
            }  
        }   
        catch(IOException e) {
           System.out.println("Erro: " + e.getMessage());
        }
    }
    public Socket getClient(){
        return this.clienteS;
    }
    public void setMsg(String msg){
        this.msgR = msg;
    }
    public static void tratamento(Socket cliente, servidorUI janela) throws IOException{
        while(true){
            System.out.println("Entrou while");
            if(!msgR.equals("")){
                System.out.println("Entrou if");
            try {
                System.out.println("Cliente conectado: " + cliente.getInetAddress().getHostAddress());
              ObjectInputStream recebido = new ObjectInputStream(cliente.getInputStream());
              Item msg = (Item) recebido.readObject();
//              System.out.println("msg recebida: " + msg);
//              if(msg.equals("1")){
//                  janela.setVisible(true);
//              }
              System.out.println("ID: "+msg.getIdItem()+"\nNome: "+msg.getNome());
              
              clienteS = cliente;
              
              int id = msg.getIdItem();
              String ids = Integer.toString(id);
              janela.setJLabelId(ids);
              ObjectOutputStream saida = new ObjectOutputStream(cliente.getOutputStream());
              String aceito = "aceito";
            
              saida.flush();
              saida.writeObject(aceito);
              saida.close();
              msgR = "";
               
              
              
              cliente.close();
         }
              catch(Exception e) {
           System.out.println("Erro: " + e.getMessage());
        }
         break;   
         }
            }
        }
        

}
