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
public class Categoria implements Serializable{
    private String idCategoria;
    private String nomeCat;

    public Categoria(String idCategoria, String nomeCat) {
        this.idCategoria = idCategoria;
        this.nomeCat = nomeCat;
    }
    
    public Categoria() {
        this.idCategoria = "";
        this.nomeCat = "";
    }

    public String getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(String idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNomeCat() {
        return nomeCat;
    }

    public void setNomeCat(String nomeCat) {
        this.nomeCat = nomeCat;
    }
}
