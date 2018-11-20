package control;
import view.suaJanela;
import view.buscaAdm;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ld_si
 */
public class Administrador {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        view.suaJanela view = new view.suaJanela();
        view.buscaAdm ba = new view.buscaAdm();
        ba.nomeQualquer();
        view.setSize(800, 600);
    }
    
}
