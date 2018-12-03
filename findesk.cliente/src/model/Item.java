package model;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Item implements Serializable {

    private int idItem;
    private int idNome;
    private String nomeItem;
    private String cor;
    private String descricaoItem;
    private String dataEntradaString;
    private int idDataEntrada;
    private DataEntrada dataEntrada;
    private int idDataSaida;
    private DataSaida dataSaida;
    private String fotoItem;
    private int idDoc;
    private int retiradoItem;

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public int getIdNome() {
        return idNome;
    }

    public void setIdNome(int idNome) {
        this.idNome = idNome;
    }

    public String getNomeItem() {
        return nomeItem;
    }

    public void setNomeItem(String nome) {
        this.nomeItem = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getDescricaoItem() {
        return descricaoItem;
    }

    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }

    public String getDataEntradaString() {
        return dataEntradaString;
    }

    public void setDataEntradaString(String dataEntradaString) {
        this.dataEntradaString = dataEntradaString;
    }

    public int getIdDataEntrada() {
        return idDataEntrada;
    }

    public void setIdDataEntrada(int idDataEntrada) {
        this.idDataEntrada = idDataEntrada;
    }

    public DataEntrada getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(DataEntrada dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public int getIdDataSaida() {
        return idDataSaida;
    }

    public void setIdDataSaida(int idDataSaida) {
        this.idDataSaida = idDataSaida;
    }

    public DataSaida getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(DataSaida dataSaida) {
        this.dataSaida = dataSaida;
    }

    public String getFotoItem() {
        return fotoItem;
    }

    public void setFotoItem(String fotoItem) {
        this.fotoItem = fotoItem;
    }

    public int getIdDoc() {
        return idDoc;
    }

    public void setIdDoc(int idDoc) {
        this.idDoc = idDoc;
    }

    public int getRetiradoItem() {
        return retiradoItem;
    }

    public void setRetiradoItem(int retiradoItem) {
        this.retiradoItem = retiradoItem;
    }


 

    public Item() {
        this.idItem = 0;
        this.cor = "";
        this.dataEntradaString = "";
        this.dataEntrada = new DataEntrada();
        this.dataSaida = new DataSaida();
        this.fotoItem = "";
        this.descricaoItem = "";
        this.nomeItem = "";
        this.idDoc = 0;
        this.retiradoItem = 0;
    }

  
 

    public Boolean load(String id) {
        SGBD mybd = new SGBD();
        mybd.getConexaoMySQL();
        ResultSet rs = mybd.consultarItemBd("select idItem, idCor, idDoc, nome, fotoItem, descricaoItem , concat(data.idDia, \"/\",data.idMes, \"/\", data.idAno) "
                + "from item,nomeItem, dataentrada, data "
                + "where item.idItem = \"" + id + "\" and item.idNome = nomeItem.idNome and "
                + "item.idDataEntrada = dataentrada.idDataEntrada and "
                + "data.idData = dataentrada.idData;");
        try {

            setIdItem(rs.getInt("idItem"));
            setNomeItem(rs.getString("nome"));
            setIdDoc(rs.getInt("idDoc"));
            setFotoItem(rs.getString("fotoItem"));
            setDataEntradaString(rs.getString(7));
            setDescricaoItem(rs.getString("descricaoItem"));
            setCor(rs.getString("idCor"));
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Item.class.getName()).log(Level.SEVERE, null, ex);
        }
        mybd.fecharConexao();
        return false;
    }

}
