package model;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Item implements Serializable{

	private int idItem;

	private String nome;

	private String cor;

	private String descricao;

	private String dataEntrada;

	private String dataSaida;
        
        private String foto;
        
        private int idDoc;
        
        public Item(){
            this.idItem = 0;
            this.cor = "";
            this.dataEntrada = "";
            this.dataSaida = "";
            this.foto = "";
            this.descricao = "";
            this.nome = "";
            this.idDoc = 0;
        }


	public void setIdItem(int id) {
            this.idItem = id;
	}

	public void setNome(String nome) {
            this.nome = nome;
	}

	public void setCor(String cor) {
            this.cor = cor;
	}

	public void setDescricao(String descricao) {
            this.descricao = descricao;
	}

	public void setDataEntrada(String dataEntrada) {
            this.dataEntrada = dataEntrada;
	}

	public void setDataSaida(String dataSaida) {
            this.dataSaida = dataSaida;
	}

	public void setFoto(String foto) {
            this.foto = foto;
	}
        
        public void setIdDoc(int idDoc){
            this.idDoc = idDoc;
        }
        
        public int getIdDoc(){
            return this.idDoc;
        }

	public int getIdItem() {
		return this.idItem;
	}

	public String getNome() {
		return this.nome;
	}

	public String getCor() {
		return this.cor;
	}

	public String getDescrição() {
		return this.descricao;
	}

	public String getDataEntrada() {
		return this.dataEntrada;
	}
        
        public String getFoto(){
            return this.foto;
        }
        
        public Boolean load(String id){
            SGBD mybd = new SGBD();
            mybd.getConexaoMySQL();
            ResultSet rs = mybd.consultarItemBd("select idItem, idCor, idDoc, nome, fotoItem, descricaoItem , concat(data.idDia, \"/\",data.idMes, \"/\", data.idAno) "
                                                + "from item,nomeItem, dataentrada, data "
                                                 + "where item.idItem = \""+id+"\" and item.idNome = nomeItem.idNome and "
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
