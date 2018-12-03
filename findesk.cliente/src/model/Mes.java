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
public class Mes implements Serializable{
    private int idMes;

    public int getIdMes() {
        return idMes;
    }

    public void setIdMes(int idMes) {
        this.idMes = idMes;
    }

    public Mes(int idMes) {
        this.idMes = idMes;
    }
    
    public Mes() {
        this.idMes = 0;
    }
    
}
