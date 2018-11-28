/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.Ano;
import model.Data;
import model.DataEntrada;
import model.Dia;
import model.Mes;
import model.SGBD;

/**
 *
 * @author ld_si
 */
public class teste {
    public static void main(String[] args) {
        //setar valores para a data forma 1
        DataEntrada data = new DataEntrada(new Data(
                                           new Dia(13),// inserir valor inteiro dia
                                           new Mes(6), // inserir valor inteiro mes
                                           new Ano(2018))); //inserir valor inteiro ano
        //fim
        
        //setar valores para data forma 2
        DataEntrada dataEntrada = new DataEntrada();
        dataEntrada.getDataEntrada().getIdDia().setIdDia(13);
        dataEntrada.getDataEntrada().getIdMes().setIdMes(6);
        dataEntrada.getDataEntrada().getIdAno().setIdAno(2018);
        //fim
        
        //obter valores da data
        int dia = dataEntrada.getDataEntrada().getIdDia().getIdDia();
        int mes = dataEntrada.getDataEntrada().getIdMes().getIdMes();
        int ano = dataEntrada.getDataEntrada().getIdAno().getIdAno();        
        //fim
        System.out.println(dia+"/"+mes+"/"+ano);
        
        
        SGBD.getConexaoMySQL();
        int id = SGBD.consultarIdNomeItem("Documento");
        System.out.println("Id: "+id);
        SGBD.fecharConexao();
    }
}
