/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketdemo;

import java.net.InetAddress;
import java.util.ArrayList;

/**
 *
 * @author ld_si
 */
public class main {
    public static void main(String[] args) {
        ArrayList array = new ArrayList();
        array.add("leandro");
        array.add("vitor");
        if(array.contains("vitor")){
            System.out.println("achou o vitor");
        }
        if(array.contains("leandro")){
            System.out.println("achou o leandro");
        }
          try {
            System.out.println("Meu ip: " +InetAddress.getLocalHost().getHostAddress());
        } catch (Exception e) {
        }
    }
    
}
