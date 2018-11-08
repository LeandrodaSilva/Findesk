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
public class Usuario {
    
    public static void main(String[] args) {
        SGBD mybd = new SGBD();
        mybd.getConexaoMySQL();
        System.out.println(mybd.statusConection());
    }
    
}
