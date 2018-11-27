/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import view.*;
import model.*;
/**
 *
 * @author ld_si
 */
public class Servidor{
    private static Socket clienteS;

    
    
    public static void start(ServidorUI janela) {
        try {
            // Instancia o ServerSocket ouvindo a porta 12345
            ServerSocket servidor = new ServerSocket(5060);
            System.out.println("Servidor ouvindo a porta 5060");
            while (true) {
                // o método accept() bloqueia a execução até que
                // o servidor receba um pedido de conexão
                Socket cliente = servidor.accept();
                clienteS = cliente;
                ObjectInputStream itemRecebido = new ObjectInputStream(clienteS.getInputStream());
                Item item;
                try {
                    item = (Item) itemRecebido.readObject();
                    System.out.println("ID: " + item.getIdItem() + "\nNome: " + item.getNome());

                    int valor = item.getIdItem();
                    String id = Integer.toString(valor);
                    janela.setJLabelId(id);
                    janela.setJLabelNome("etste");
                    janela.setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                break;
            }
            servidor.close();
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
  
    public static void tratamento(String resposta) throws IOException {
       
        try {
            System.out.println("Executando tratamento");
            System.out.println("Cliente conectado: " + clienteS.getInetAddress().getHostAddress());
            ObjectOutputStream saida = new ObjectOutputStream(clienteS.getOutputStream());
            
            saida.flush();
            saida.writeObject(resposta);
            saida.close();

            clienteS.close();
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }     
    }

}
