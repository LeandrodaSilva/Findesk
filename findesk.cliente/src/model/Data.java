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
public class Data implements Serializable{
    private Dia idDia;
    private Mes idMes;
    private Ano idAno;

    public Data(Dia idDia, Mes idMes, Ano idAno) {
        this.idDia = idDia;
        this.idMes = idMes;
        this.idAno = idAno;
    }
    

    public Data() {
        this.idDia = new Dia();
        this.idMes = new Mes();
        this.idAno = new Ano();
    }
    
    
    public Dia getIdDia() {
        return idDia;
    }

    public void setIdDia(Dia idDia) {
        this.idDia = idDia;
    }

    public Mes getIdMes() {
        return idMes;
    }

    public void setIdMes(Mes idMes) {
        this.idMes = idMes;
    }

    public Ano getIdAno() {
        return idAno;
    }

    public void setIdAno(Ano idAno) {
        this.idAno = idAno;
    }
    
    
}
