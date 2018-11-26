/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import control.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import model.SGBD;
import view.BuscaUser;


/**
 *
 * @author ld_si
 */
public class TelaPrincipal extends javax.swing.JFrame {
    
    private static DefaultComboBoxModel defaultComboBoxCategoria = new DefaultComboBoxModel();
    private static DefaultComboBoxModel defaultComboBoxDiaInicial = new DefaultComboBoxModel();
    private static DefaultComboBoxModel defaultComboBoxMesInicial = new DefaultComboBoxModel();
    private static DefaultComboBoxModel defaultComboBoxAnoInicial = new DefaultComboBoxModel();
    private static DefaultComboBoxModel defaultComboBoxCor = new DefaultComboBoxModel();
    private static DefaultComboBoxModel defaultComboBoxNumero = new DefaultComboBoxModel();
    private static DefaultComboBoxModel defaultComboBoxNome = new DefaultComboBoxModel();
    private static TelaPrincipal janelaControl;

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        popularComboBoxCategoria();
        popularComboBoxDia();
        popularComboBoxMes();
        popularComboBoxAno();
        popularComboBoxCor();
        popularComboBoxNumero();
        //popularComboBoxNome();
        //this.defaultComboBoxNome ;
        hideComponents();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelConfirmar = new javax.swing.JLabel();
        jButtonConfirmar = new javax.swing.JButton();
        jComboBoxCategoria = new javax.swing.JComboBox<>();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelComboBoxCategoria = new javax.swing.JLabel();
        jComboBoxDiaInicial = new javax.swing.JComboBox<>();
        jLabelDataInicial = new javax.swing.JLabel();
        jComboBoxMesInicial = new javax.swing.JComboBox<>();
        jComboBoxAnoInicial = new javax.swing.JComboBox<>();
        jComboBoxCor = new javax.swing.JComboBox<>();
        jComboBoxNome = new javax.swing.JComboBox<>();
        jLabelCor = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jLabelFundo = new javax.swing.JLabel();
        jLabelTitulo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Findesk");
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);

        jLabelConfirmar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelConfirmar.setText("Vai!!");
        getContentPane().add(jLabelConfirmar);
        jLabelConfirmar.setBounds(380, 470, 34, 20);

        jButtonConfirmar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/bt2.png"))); // NOI18N
        jButtonConfirmar.setContentAreaFilled(false);
        jButtonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConfirmar);
        jButtonConfirmar.setBounds(340, 450, 120, 70);

        jComboBoxCategoria.setModel(defaultComboBoxCategoria);
        jComboBoxCategoria.setSelectedItem(jComboBoxCategoria);
        jComboBoxCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCategoriaActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxCategoria);
        jComboBoxCategoria.setBounds(350, 200, 110, 20);

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Buscar");
        getContentPane().add(jLabelTitulo);
        jLabelTitulo.setBounds(350, 110, 120, 70);

        jLabelComboBoxCategoria.setForeground(new java.awt.Color(255, 255, 255));
        jLabelComboBoxCategoria.setText("*Selecionar Categoria");
        getContentPane().add(jLabelComboBoxCategoria);
        jLabelComboBoxCategoria.setBounds(210, 200, 140, 20);

        jComboBoxDiaInicial.setModel(defaultComboBoxDiaInicial);
        jComboBoxDiaInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDiaInicialActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxDiaInicial);
        jComboBoxDiaInicial.setBounds(350, 250, 70, 20);

        jLabelDataInicial.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDataInicial.setText("*Data de busca inicial ");
        getContentPane().add(jLabelDataInicial);
        jLabelDataInicial.setBounds(210, 250, 130, 14);

        jComboBoxMesInicial.setModel(defaultComboBoxMesInicial);
        jComboBoxMesInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMesInicialActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxMesInicial);
        jComboBoxMesInicial.setBounds(430, 250, 70, 20);

        jComboBoxAnoInicial.setModel(defaultComboBoxAnoInicial);
        jComboBoxAnoInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAnoInicialActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxAnoInicial);
        jComboBoxAnoInicial.setBounds(510, 250, 110, 20);

        jComboBoxCor.setModel(defaultComboBoxCor);
        jComboBoxCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCorActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxCor);
        jComboBoxCor.setBounds(350, 330, 110, 20);

        jComboBoxNome.setModel(defaultComboBoxNome);
        jComboBoxNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxNomeActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxNome);
        jComboBoxNome.setBounds(350, 290, 110, 20);

        jLabelCor.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCor.setText("*Cor do item");
        getContentPane().add(jLabelCor);
        jLabelCor.setBounds(210, 330, 110, 14);

        jLabelNome.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNome.setText("*Nome do item");
        getContentPane().add(jLabelNome);
        jLabelNome.setBounds(210, 290, 110, 14);

        jLabelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Fundo2.png"))); // NOI18N
        jLabelFundo.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Fundo2.png"))); // NOI18N
        jLabelFundo.setEnabled(false);
        getContentPane().add(jLabelFundo);
        jLabelFundo.setBounds(0, 0, 800, 600);

        jLabelTitulo1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabelTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo1.setText("Buscar");
        getContentPane().add(jLabelTitulo1);
        jLabelTitulo1.setBounds(350, 110, 120, 70);

        setSize(new java.awt.Dimension(800, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Confirmar
    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarActionPerformed
        // TODO add your handling code here:
        //"SELECT * FROM item, nome WHERE item.`idNome` = nome.`idNome` and nome.nome like \"PenDrive\";"
        String categoria = jComboBoxCategoria.getSelectedItem().toString();
        String dia = jComboBoxDiaInicial.getSelectedItem().toString();
        String mes = jComboBoxMesInicial.getSelectedItem().toString();
        String ano = jComboBoxAnoInicial.getSelectedItem().toString();
        String nome = jComboBoxNome.getSelectedItem().toString();
        String cor = jComboBoxCor.getSelectedItem().toString();
        String calcCor = "cor.idCor = item.idCor and " +"cor.nomeCor like \""+cor+"\" and ";
        String calcMes = "mes.idMes like \""+mes+"\" ";
        
        
        if(jComboBoxCategoria.getSelectedItem().toString().compareTo("Documentos") == 0){
            cor = jComboBoxCor.getSelectedItem().toString();
            int numero = Integer.parseInt(cor);
            calcCor = "item.idDoc = \""+numero+"\" and ";
        }
        
        int max = Integer.parseInt(dia);
        max = max + 5;
        
        if(max > 31){
            max = 5;
        }
        
        int min = Integer.parseInt(dia);
        min = min - 5;
        System.out.println("dia minimo: "+min);
        if(min < 1 && Integer.parseInt(mes) > 1){
           min = 31  - (min * -1);
           int m = (Integer.parseInt(mes) - 1);
           String mes2 = Integer.toString(m);
           calcMes = "mes.idMes like \""+mes+"\" "+"union "+" select item.idItem , nomeItem.nome ,item.fotoItem , item.descricaoItem " 
                            +"from item,nomeItem,cor,categoria, dataentrada , data, dia, mes, ano "
                            +"where item.idNome = nomeItem.idNome and "
                            +"item.retiradoItem = 0 and "
                            +"nomeItem.nome like \""+nome+"\" and " 
                            +"categoria.idCategoria = nomeItem.idCategoria and " 
                            +calcCor
                            +"dataentrada.idDataEntrada = item.idDataEntrada and "
                            +"data.idData = dataentrada.idData and "
                            +"data.idDia = dia.idDia and "
                            +"data.idMes = mes.idMes and "
                            +"data.idAno = ano.idAno and "
                            +"data.idDia >= \""+ min +"\" and "
                            +"ano.idAno like \""+ano+"\"  and "
                            + "mes.idMes like \""+mes2+"\" ;";
        }else{
            if(min < 1){
                min = ((min * (-1)) + min)+1;
            }else{
                calcMes += " and data.idDia >= \"" + min + "\" ;";
            }
        }
            
        
        
        String consulta = "select item.idItem , nomeItem.nome  ,item.fotoItem , item.descricaoItem " 
                            +"from item,nomeItem,cor,categoria, dataentrada , data, dia, mes, ano "
                            +"where item.idNome = nomeItem.idNome and "
                            +"item.retiradoItem = 0 and "
                            +"nomeItem.nome like \""+nome+"\" and " 
                            +"categoria.idCategoria = nomeItem.idCategoria and "  +"cor.idCor = item.idCor and " 
                            +calcCor
                            +"dataentrada.idDataEntrada = item.idDataEntrada and "
                            +"data.idData = dataentrada.idData and "
                            +"data.idDia = dia.idDia and "
                            +"data.idMes = mes.idMes and "
                            +"data.idAno = ano.idAno and "
                            +"data.idDia <= \""+ max +"\" and "
                            +"ano.idAno like \""+ano+"\"  and "
                            + calcMes;
        
        System.out.println("Consulta realizada: " + consulta);
        BuscaUser buscaUser = new BuscaUser();
        //BuscaUserImage buscaUserImage = new BuscaUserImage();
        janelaControl.setVisible(false);
        buscaUser.mostrar(consulta);
        //buscaUserImage.mostrar(consulta);
 
    }//GEN-LAST:event_jButtonConfirmarActionPerformed
    //Dia Inicial
    private void jComboBoxDiaInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDiaInicialActionPerformed
       if(estaMarcado("DataInicial")) showComponents("Nome");
    }//GEN-LAST:event_jComboBoxDiaInicialActionPerformed
    //Ano Inicial
    private void jComboBoxAnoInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAnoInicialActionPerformed
        if(estaMarcado("DataInicial")) showComponents("Nome");
    }//GEN-LAST:event_jComboBoxAnoInicialActionPerformed
    //Categoria
    private void jComboBoxCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCategoriaActionPerformed
        if(jComboBoxCategoria.getSelectedItem().toString().compareTo("Documentos") == 0){
            jLabelCor.setText("*Número");
            jComboBoxCor.setModel(defaultComboBoxNumero);
        }else{
            jLabelCor.setText("*Cor do item");
            jComboBoxCor.setModel(defaultComboBoxCor);
        }
        showComponents("DataInicial");
        Object item = jComboBoxCategoria.getSelectedItem();
        String itemName = item.toString();
        
        System.out.println("Categoria: "+itemName);
     
        popularComboBoxNome("select distinct nomeItem.nome " +
                            "from item, nomeItem, categoria " +
                            "where nomeItem.idNome = item.idNome and " +
                                    "nomeItem.idCategoria = categoria.idCategoria and "
                                    + "item.retiradoItem = 0 and " +
                                    "categoria.nomeCat like \""
                                    + itemName
                                     + "\";");
      
        jComboBoxNome.setModel(defaultComboBoxNome);    
       
    }//GEN-LAST:event_jComboBoxCategoriaActionPerformed
    //Mês Inicial
    private void jComboBoxMesInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMesInicialActionPerformed
        if(estaMarcado("DataInicial")) showComponents("Nome");
    }//GEN-LAST:event_jComboBoxMesInicialActionPerformed
    //Cor
    private void jComboBoxCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCorActionPerformed
        if(estaMarcado("Cor")) showComponents("jButtonConfirmar");
    }//GEN-LAST:event_jComboBoxCorActionPerformed
    //Nome
    private void jComboBoxNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxNomeActionPerformed
        if(estaMarcado("Nome")) showComponents("Cor");
    }//GEN-LAST:event_jComboBoxNomeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void mostrar() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {  
                TelaPrincipal janela =  new TelaPrincipal();
                janelaControl = janela;
                janela.setVisible(true);
            }
        });
    }
    
    public static void ocultar(){
         janelaControl.setVisible(false);
    }
    
    public static void fechar(){
         janelaControl.dispose();
    }
    
    private void hideComponents(){
        jLabelDataInicial.hide();
        jComboBoxDiaInicial.hide();
        jComboBoxMesInicial.hide();
        jComboBoxAnoInicial.hide();
     
        
        
        jLabelCor.hide();
        jComboBoxCor.hide();
        
        jLabelNome.hide();
        jComboBoxNome.hide();
        
        jLabelConfirmar.hide();
        jButtonConfirmar.hide();
    }
    
    public ImageIcon criarImageIcon(String caminho, String descricao) {
		java.net.URL imgURL = getClass().getResource(caminho);
		if (imgURL != null) {
			return new ImageIcon(imgURL, descricao);
		} else {
			System.err.println("Não foi possível carregar o arquivo de imagem: " + caminho);
			return null;
		}
	}
    
    private void showComponents(String opt){
        switch(opt){
            case "DataInicial":
                jComboBoxDiaInicial.show();
                jComboBoxMesInicial.show();
                jComboBoxAnoInicial.show();
                jLabelDataInicial.show();  
            break;
            case "Cor":
                jLabelCor.show();
                jComboBoxCor.show();
            break;
            case "Nome":
                jLabelNome.show();
                jComboBoxNome.show();
            break;
            case "jButtonConfirmar":
                jLabelConfirmar.show();
                jButtonConfirmar.show();
            break;
        }
    }
    
    private Boolean estaMarcado(String opt){
        switch(opt){
            case "DataInicial":
                if(jComboBoxDiaInicial.getSelectedItem().toString().compareTo("Dia") != 0 &&
                    jComboBoxMesInicial.getSelectedItem().toString() != "Mês" &&
                    jComboBoxAnoInicial.getSelectedItem().toString() != "Ano"
                ) return true;
                
            break;
            case "Cor":
                if(jComboBoxCor.getSelectedItem().toString() != "Cor"
                ) return true;
            break;
            case "Nome":
                if(jComboBoxNome.getSelectedItem().toString() != "Nome"
                ) return true;
            break;
        }
        
        return false;
    }
    
    private static void popularComboBoxCategoria(){
        SGBD mybd = new SGBD();
        
        mybd.getConexaoMySQL();
        ArrayList strList = new ArrayList();
        System.out.println(mybd.statusConection());
        
        
        
        ResultSet rs = mybd.consultarItemBd("select distinct categoria.nomeCat " +
                                                "from nomeItem, item, categoria " +
                                                "where item.idNome = nomeItem.idNome and "
                                                + "item.retiradoItem = 0 and " +
                                                "nomeItem.idCategoria = categoria.idCategoria;");
       
        String nome;
        strList.add("Selecionar");
        try {
            rs.beforeFirst();
            while(rs.next()){
                nome = rs.getString("nomeCat");
                strList.add(nome);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        defaultComboBoxCategoria = new DefaultComboBoxModel(strList.toArray());
        
        
        mybd.fecharConexao();
        
    }
   
    private static void popularComboBoxDia(){
        SGBD mybd = new SGBD();
        
        mybd.getConexaoMySQL();
        ArrayList strList = new ArrayList();
        System.out.println(mybd.statusConection());
        
        
        
        ResultSet rs = mybd.consultarItemBd("SELECT * FROM dia");
       
        String nome;
        strList.add("Dia");
        try {
            rs.isFirst();
            while(rs.next()){
                nome = rs.getString(1);
                strList.add(nome);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        defaultComboBoxDiaInicial = new DefaultComboBoxModel(strList.toArray());
        
        
        
        mybd.fecharConexao();
        
        
    }
    
    private static void popularComboBoxMes(){
        //"127.0.0.1:3307", "findesk", "client", "client123456"
        SGBD mybd = new SGBD();
        
        mybd.getConexaoMySQL();
        ArrayList strList = new ArrayList();
        System.out.println(mybd.statusConection());
        
        
        
        ResultSet rs = mybd.consultarItemBd("SELECT * FROM mes");
       
        String nome;
        strList.add("Mês");
        try {
            rs.isFirst();
            while(rs.next()){
                nome = rs.getString(1);
                strList.add(nome);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        defaultComboBoxMesInicial = new DefaultComboBoxModel(strList.toArray());
        
        
        mybd.fecharConexao();
        
    }
    
    private static void popularComboBoxAno(){
        SGBD mybd = new SGBD();
        
        mybd.getConexaoMySQL();
        ArrayList strList = new ArrayList();
        System.out.println(mybd.statusConection());
        
        
        
        ResultSet rs = mybd.consultarItemBd("SELECT * FROM ano");
       
        String nome;
        strList.add("Ano");
        try {
            rs.isFirst();
            while(rs.next()){
                nome = rs.getString(1);
                strList.add(nome);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        defaultComboBoxAnoInicial = new DefaultComboBoxModel(strList.toArray());
       
        
        
        mybd.fecharConexao();
        
    }
    
    private static void popularComboBoxCor(){
        SGBD mybd = new SGBD();
        
        mybd.getConexaoMySQL();
        ArrayList strList = new ArrayList();
        System.out.println(mybd.statusConection());
        
        
        
        ResultSet rs = mybd.consultarItemBd("select distinct cor.nomeCor " +
                                            "from cor, item " +
                                            "where item.idCor = cor.idCor;");
       
        String nome;
        strList.add("Cor");
        try {
            rs.beforeFirst();
            while(rs.next()){
                nome = rs.getString("nomeCor");
                strList.add(nome);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        defaultComboBoxCor = new DefaultComboBoxModel(strList.toArray());
        
        
        
        mybd.fecharConexao();
        
    }
    
    private static void popularComboBoxNumero(){
        SGBD mybd = new SGBD();
        
        mybd.getConexaoMySQL();
        ArrayList strList = new ArrayList();
        System.out.println(mybd.statusConection());
        
        
        
        ResultSet rs = mybd.consultarItemBd("SELECT item.idDoc " +
                                "FROM item, nomeItem, categoria " +
                                "WHERE item.idNome  = nomeItem.idNome and " +
                                        "nomeItem.idCategoria  = categoria.idCategoria and  " +
                                        "categoria.idCategoria like \"e\";");
       
        int numero;
        strList.add("Selecione");
        try {
            rs.beforeFirst();
            while(rs.next()){
                numero = rs.getInt(1);
                strList.add(numero);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        defaultComboBoxNumero= new DefaultComboBoxModel(strList.toArray());
        
        
        
        mybd.fecharConexao();
        
    }
    
    private static void popularComboBoxNome(String sql){
        SGBD mybd = new SGBD();
        
        mybd.getConexaoMySQL();
        ArrayList strList = new ArrayList();
        System.out.println(mybd.statusConection());
        
        
        //"SELECT nome FROM nome, categoria WHERE nomeCat = 'Eletrônicos' and categoria.`idCategoria` = nome.`idCategoria`")
        ResultSet rs = mybd.consultarItemBd(sql);
       
        String nome;
        strList.add("Nome");
        try {
            rs.beforeFirst();
            while(rs.next()){
                nome = rs.getString("nome");
                strList.add(nome);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        defaultComboBoxNome = new DefaultComboBoxModel(strList.toArray());
        
        mybd.fecharConexao();
        
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JComboBox<String> jComboBoxAnoInicial;
    private javax.swing.JComboBox<String> jComboBoxCategoria;
    private javax.swing.JComboBox<String> jComboBoxCor;
    private javax.swing.JComboBox<String> jComboBoxDiaInicial;
    private javax.swing.JComboBox<String> jComboBoxMesInicial;
    private javax.swing.JComboBox<String> jComboBoxNome;
    private javax.swing.JLabel jLabelComboBoxCategoria;
    private javax.swing.JLabel jLabelConfirmar;
    private javax.swing.JLabel jLabelCor;
    private javax.swing.JLabel jLabelDataInicial;
    private javax.swing.JLabel jLabelFundo;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelTitulo1;
    // End of variables declaration//GEN-END:variables
}
