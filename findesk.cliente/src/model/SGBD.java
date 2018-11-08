/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ld_si
 */
import java.sql.Connection;
 
import java.sql.DriverManager;
import java.sql.ResultSet;
 
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
 
  
 
//Início da classe de conexão//
 
public class SGBD 
{
 
    public static String status = "Não conectou...";
    public static String driverName = "com.mysql.jdbc.Driver";
    public static String url;
    public static String user;
    public static String password;
    
    public static Connection connection = null;
    public static Statement sttmt = null;
    
 
    //Método Construtor da Classe//
    
    public SGBD() {
        this.url = "";
        this.user = "";
        this.password = "";
    }
 
    public SGBD(String ipPort, String database, String user, String password) {
        this.url = "jdbc:mysql://" + ipPort + "/" + database;
        this.user = user;
        this.password = password;
    }
 
 
    //Método de Conexão//
 
    public static java.sql.Connection getConexaoMySQL() 
    {

                 //atributo do tipo Connection

        
        try {
            // Carregando o JDBC Driver padrão         
            Class.forName(driverName);
            // Configurando a nossa conexão com um banco de dados//
            connection = DriverManager.getConnection(url, user, password);
            //Testa sua conexão//  
            if (connection != null) {
                sttmt = connection.createStatement();
                status = ("STATUS--->Conectado com sucesso!");
            } else {
                status = ("STATUS--->Não foi possivel realizar conexão");
            }
            
            return connection;    
        } catch (ClassNotFoundException e) {  
            //Driver não encontradO
            System.out.println("O driver expecificado nao foi encontrado.");
            return null;

        } catch (SQLException e) {
            //Não conseguindo se conectar ao banco
            System.out.println("Nao foi possivel conectar ao Banco de Dados.");
            return null;
        }
    }
 
  
 
    //Método que retorna o status da sua conexão//
 
    public static String statusConection() {
        return status;
    }
 
   
 
   //Método que fecha sua conexão//
 
    public static boolean fecharConexao() {
        try {
            SGBD.getConexaoMySQL().close();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
 
   
 
   //Método que reinicia sua conexão//
 
    public static java.sql.Connection reiniciarConexao() {
        fecharConexao();
        return SGBD.getConexaoMySQL();
    }
    
    
    public static void consultarItemBd(String sql){
        
         String result;
        try { 
            ResultSet rs = sttmt.executeQuery(sql);
            String id = rs.getString("idCor");
            String nome = rs.getString("nomeCor");
            while(rs.next()){
                System.out.println(id);
                System.out.println(nome);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SGBD.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    
    public static void inserirItemBd(){
        
    } 
    
    public static void alterarItemBd(){
        
    }
    
    public static void excluirItemBd(){
        
    }
    
    
 
}
