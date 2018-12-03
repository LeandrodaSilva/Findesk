/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author ld_si
 */
public class Ano implements Serializable{
    private int idAno;

    public Ano(int idAno) {
        this.idAno = idAno;
    }
    
    public Ano() {
        this.idAno = 0;
    }
    
    
    public int getIdAno() {
        return idAno;
    }

    public void setIdAno(int idAno) {
        this.idAno = idAno;
    }

    
    
}
