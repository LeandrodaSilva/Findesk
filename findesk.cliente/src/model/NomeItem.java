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
public class NomeItem {
    private String idNome;
    private String nome;
    private Categoria categoria;

    public NomeItem(String idNome, String nome, Categoria categoria) {
        this.idNome = idNome;
        this.nome = nome;
        this.categoria = categoria;
    }
    
    public NomeItem() {
        this.idNome = "";
        this.nome = "";
        this.categoria = new Categoria();
    }

    public String getIdNome() {
        return idNome;
    }

    public void setIdNome(String idNome) {
        this.idNome = idNome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
}
