package model;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Item implements Serializable {

    private int idItem;
    private String nome;
    private String cor;
    private String descricao;
    private String dataEntrada;
    private DataEntrada dataE;
    private String dataSaida;
    private String foto;
    private int idDoc;

    public Item(String nome, String cor, String descricao, String dataEntrada, DataEntrada dataE, String dataSaida, String foto, int idDoc) {
        this.idItem = 0;
        this.nome = nome;
        this.cor = cor;
        this.descricao = descricao;
        this.dataEntrada = dataEntrada;
        this.dataE = dataE;
        this.dataSaida = dataSaida;
        this.foto = foto;
        this.idDoc = idDoc;
    }
    
    public Item(int idItem, String nome, String cor, String descricao, String dataEntrada, DataEntrada dataE, String dataSaida, String foto, int idDoc) {
        this.idItem = idItem;
        this.nome = nome;
        this.cor = cor;
        this.descricao = descricao;
        this.dataEntrada = dataEntrada;
        this.dataE = dataE;
        this.dataSaida = dataSaida;
        this.foto = foto;
        this.idDoc = idDoc;
    }

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public DataEntrada getDataE() {
        return dataE;
    }

    public void setDataE(DataEntrada dataE) {
        this.dataE = dataE;
    }

    public String getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public int getIdDoc() {
        return idDoc;
    }

    public void setIdDoc(int idDoc) {
        this.idDoc = idDoc;
    }

    public Item() {
        this.idItem = 0;
        this.cor = "";
        this.dataEntrada = "";
        this.dataSaida = "";
        this.foto = "";
        this.descricao = "";
        this.nome = "";
        this.idDoc = 0;
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
            setNome(rs.getString("nome"));
            setIdDoc(rs.getInt("idDoc"));
            setFoto(rs.getString("fotoItem"));
            setDataEntrada(rs.getString(7));
            setDescricao(rs.getString("descricaoItem"));
            setCor(rs.getString("idCor"));
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Item.class.getName()).log(Level.SEVERE, null, ex);
        }
        mybd.fecharConexao();
        return false;
    }

}
