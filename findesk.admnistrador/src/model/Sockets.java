package model;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import javax.swing.JOptionPane;

public class Sockets {

    private String ipCliente;

    private String ipServidor;

    private int porta;



    public Sockets(){
        this.ipServidor = "127.0.0.1";
        this.ipCliente = "127.0.0.1";
        this.porta = 5060;
    }
    
    public Sockets(String ip, int porta){
        this.ipServidor = ip;
        this.ipCliente = "127.0.0.1";
        this.porta = porta;
    }
    
       public Sockets(int porta){
        this.ipServidor = "127.0.0.1";
        this.ipCliente = "127.0.0.1";
        this.porta = porta;
    }
    

    public void setIpCliente(String ip) {
        this.ipCliente = ip;
    }

    public void setIpServidor(String ip) {
        this.ipServidor = ip;
    }

    public void setPorta(int porta) {
        this.porta = porta;
    }


    public String getIpCliente() {
            return this.ipCliente;
    }

    public int getIpServidor() {
            return this.getIpServidor();
    }

    public int getPortaa() {
            return this.porta;
    }

    public void sendMensage() {

    }

    public void startServer() {
        new Thread() {
            public void run() {
               try {
                // Instancia o ServerSocket ouvindo a porta 12345
                ServerSocket servidor = new ServerSocket(porta);
                System.out.println("Servidor ouvindo a porta " + porta);
                while(true) {
                    // o método accept() bloqueia a execução até que
                    // o servidor receba um pedido de conexão
                    Socket cliente = servidor.accept();
                    System.out.println("Cliente conectado: " + cliente.getInetAddress().getHostAddress());
                    ObjectOutputStream saida = new ObjectOutputStream(cliente.getOutputStream());
                    saida.flush();
                    saida.writeObject(new Date());
                    saida.close();
                    cliente.close();
                }  
                }   
                catch(Exception e) {
                   System.out.println("Erro: " + e.getMessage());
                }
            }
      }.start();
    }
    
     public void testConnection(){
        try {
            Socket cliente = new Socket(this.ipServidor,porta);
            ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());
            Date data_atual = (Date)entrada.readObject();
            JOptionPane.showMessageDialog(null,"Data recebida do servidor:" + data_atual.toString());
            entrada.close();
            System.out.println("Conexão encerrada");
        }
        catch(Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

}
