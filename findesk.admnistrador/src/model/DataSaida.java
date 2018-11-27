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
public class DataSaida {
    private Data dataSaida;

    public DataSaida(Data dataSaida) {
        this.dataSaida = dataSaida;
    }

    DataSaida() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Data getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Data dataSaida) {
        this.dataSaida = dataSaida;
    }
    
}
