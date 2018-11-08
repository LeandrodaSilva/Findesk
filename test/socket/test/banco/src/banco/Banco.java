/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author ld_si
 */
import java.sql.Connection;
 
import java.sql.DriverManager;
 
import java.sql.SQLException;
 
  
 
//Início da classe de conexão//
 
public class Banco 
{
 
    public static String status = "Não conectou...";
 
    //Método Construtor da Classe//
 
    public Banco() {}
 
 
    //Método de Conexão//
 
    public static java.sql.Connection getConexaoMySQL() 
    {

        Connection connection = null;          //atributo do tipo Connection



        try 
        {

            // Carregando o JDBC Driver padrão

            String driverName = "com.mysql.jdbc.Driver";                        

            Class.forName(driverName);



            // Configurando a nossa conexão com um banco de dados//

            String serverName = "127.0.0.1:3307";    //caminho do servidor do BD

            String mydatabase = "findesk";        //nome do seu banco de dados

            String url = "jdbc:mysql://127.0.0.1:3307/findesk";  // + serverName + "/" + mydatabase;

            String username = "root";        //nome de um usuário de seu BD      

            String password = "02utfpres31";      //sua senha de acesso

            connection = DriverManager.getConnection(url, username, password);



                //Testa sua conexão//  

            if (connection != null) 
            {

                status = ("STATUS--->Conectado com sucesso!");
            } else 
            {

                status = ("STATUS--->Não foi possivel realizar conexão");
            }



            return connection;
            
        } catch (ClassNotFoundException e) 
        {  
            //Driver não encontradO
            System.out.println("O driver expecificado nao foi encontrado.");

            return null;

        } catch (SQLException e) 
        {
            //Não conseguindo se conectar ao banco
            System.out.println("Nao foi possivel conectar ao Banco de Dados.");

            return null;
        }
    }
 
  
 
    //Método que retorna o status da sua conexão//
 
    public static String statusConection() 
    {
 
        return status;
    }
 
   
 
   //Método que fecha sua conexão//
 
    public static boolean FecharConexao() 
    {
 
        try 
        {
 
            Banco.getConexaoMySQL().close();
 
            return true;
        } catch (SQLException e) 
        {
 
            return false;
        }
    }
 
   
 
   //Método que reinicia sua conexão//
 
    public static java.sql.Connection ReiniciarConexao() {
 
        FecharConexao();
 
  
 
        return Banco.getConexaoMySQL();
 
    }
 
}
