package control;
import view.Estatisticas;
import view.BuscaAdm;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

/**
 *
 * @author ld_si
 */
public class Administrador {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        view.Estatisticas view = new view.Estatisticas();
        view.BuscaAdm ba = new view.BuscaAdm();
        ba.nomeQualquer();
        view.setSize(800, 600);
    }
    
}
