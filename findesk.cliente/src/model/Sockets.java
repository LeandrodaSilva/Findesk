package model;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Sockets {

    private String ipCliente;
    private String ipServidor;
    private int porta;

    public Sockets() {
        this.ipServidor = "127.0.0.1";
        this.ipCliente = "127.0.0.1";
        this.porta = 5060;
    }

    public Sockets(String ip, int porta) {
        this.ipServidor = ip;
        this.ipCliente = "127.0.0.1";
        this.porta = porta;
    }

    public Sockets(int porta) {
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

    public static void sendItem(Socket destino, Item novoItem) {
        try {
            ObjectOutputStream saida = new ObjectOutputStream(destino.getOutputStream());
            saida.flush();
            saida.writeObject(novoItem);

        } catch (IOException ex) {
            Logger.getLogger(Sockets.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void sendText(Socket destino, String msg) {
        try {
            ObjectOutputStream saida = new ObjectOutputStream(destino.getOutputStream());
            saida.flush();
            saida.writeObject(msg);

        } catch (IOException ex) {
            Logger.getLogger(Sockets.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void startServer() {
        new Thread() {
            public void run() {
                try {
                    ServerSocket servidor = new ServerSocket(porta);
                    System.out.println("Servidor ouvindo a porta " + porta);
                    while (true) {
                        Socket cliente = servidor.accept();
                        System.out.println("Cliente conectado: " + cliente.getInetAddress().getHostAddress());
                        tratamento(cliente);
                    }
                } catch (Exception e) {
                    System.out.println("Erro: " + e.getMessage());
                }
            }
        }.start();
    }

    public static void tratamento(Socket cliente) {
        try {
            ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());
            Item novoItem = (Item) entrada.readObject();

        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Sockets.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
