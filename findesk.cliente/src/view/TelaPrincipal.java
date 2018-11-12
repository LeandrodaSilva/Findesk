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
import view.NewClass;
import view.NewJFrame;

/**
 *
 * @author ld_si
 */
public class TelaPrincipal extends javax.swing.JFrame {
    
    private static DefaultComboBoxModel defaultComboBoxCategoria = new DefaultComboBoxModel();
    private static DefaultComboBoxModel defaultComboBoxDiaInicial = new DefaultComboBoxModel();
    private static DefaultComboBoxModel defaultComboBoxMesInicial = new DefaultComboBoxModel();
    private static DefaultComboBoxModel defaultComboBoxAnoInicial = new DefaultComboBoxModel();
    private static DefaultComboBoxModel defaultComboBoxDiaFinal = new DefaultComboBoxModel();
    private static DefaultComboBoxModel defaultComboBoxMesFinal = new DefaultComboBoxModel();
    private static DefaultComboBoxModel defaultComboBoxAnoFinal = new DefaultComboBoxModel();
    private static DefaultComboBoxModel defaultComboBoxCor = new DefaultComboBoxModel();
    private static DefaultComboBoxModel defaultComboBoxNome= new DefaultComboBoxModel();
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
        jLabelDataFinal = new javax.swing.JLabel();
        jComboBoxDiaFinal = new javax.swing.JComboBox<>();
        jComboBoxMesFinal = new javax.swing.JComboBox<>();
        jComboBoxAnoFinal = new javax.swing.JComboBox<>();
        jComboBoxCor = new javax.swing.JComboBox<>();
        jComboBoxNome = new javax.swing.JComboBox<>();
        jLabelCor = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jLabelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Findesk");
        setMaximumSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);

        jLabelConfirmar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelConfirmar.setText("Vai!!");
        getContentPane().add(jLabelConfirmar);
        jLabelConfirmar.setBounds(360, 470, 34, 14);

        jButtonConfirmar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/bt2.png"))); // NOI18N
        jButtonConfirmar.setContentAreaFilled(false);
        jButtonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConfirmar);
        jButtonConfirmar.setBounds(320, 450, 120, 70);

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
        jLabelTitulo.setBounds(320, 110, 120, 70);

        jLabelComboBoxCategoria.setForeground(new java.awt.Color(255, 255, 255));
        jLabelComboBoxCategoria.setText("Selecionar Categoria");
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
        jLabelDataInicial.setText("Data de busca inicial ");
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

        jLabelDataFinal.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDataFinal.setText("Data de busca final");
        getContentPane().add(jLabelDataFinal);
        jLabelDataFinal.setBounds(210, 280, 130, 14);

        jComboBoxDiaFinal.setModel(defaultComboBoxDiaFinal);
        jComboBoxDiaFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDiaFinalActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxDiaFinal);
        jComboBoxDiaFinal.setBounds(350, 280, 70, 20);

        jComboBoxMesFinal.setModel(defaultComboBoxMesFinal);
        jComboBoxMesFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMesFinalActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxMesFinal);
        jComboBoxMesFinal.setBounds(430, 280, 70, 20);

        jComboBoxAnoFinal.setModel(defaultComboBoxAnoFinal);
        jComboBoxAnoFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAnoFinalActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxAnoFinal);
        jComboBoxAnoFinal.setBounds(510, 280, 110, 20);

        jComboBoxCor.setModel(defaultComboBoxCor);
        jComboBoxCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCorActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxCor);
        jComboBoxCor.setBounds(350, 310, 70, 20);

        jComboBoxNome.setModel(defaultComboBoxNome);
        jComboBoxNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxNomeActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxNome);
        jComboBoxNome.setBounds(350, 340, 110, 20);

        jLabelCor.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCor.setText("Cor do item");
        getContentPane().add(jLabelCor);
        jLabelCor.setBounds(210, 310, 110, 14);

        jLabelNome.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNome.setText("Nome do item");
        getContentPane().add(jLabelNome);
        jLabelNome.setBounds(210, 340, 110, 14);

        jLabelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Fundo2.png"))); // NOI18N
        jLabelFundo.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Fundo2.png"))); // NOI18N
        jLabelFundo.setEnabled(false);
        getContentPane().add(jLabelFundo);
        jLabelFundo.setBounds(0, 0, 800, 600);
    }// </editor-fold>//GEN-END:initComponents

    
    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarActionPerformed
        // TODO add your handling code here:
        ocultar();
        NewJFrame novo = new NewJFrame();
        novo.criar();
        janelaControl.fechar();
    }//GEN-LAST:event_jButtonConfirmarActionPerformed
    //Dia Inicial
    private void jComboBoxDiaInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDiaInicialActionPerformed
       if(estaMarcado("DataInicial")) showComponents("DataFinal");
    }//GEN-LAST:event_jComboBoxDiaInicialActionPerformed
    //Ano Inicial
    private void jComboBoxAnoInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAnoInicialActionPerformed
        if(estaMarcado("DataInicial")) showComponents("DataFinal");
    }//GEN-LAST:event_jComboBoxAnoInicialActionPerformed
    //Categoria
    private void jComboBoxCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCategoriaActionPerformed

        showComponents("DataInicial");
        Object item = jComboBoxCategoria.getSelectedItem();
        String itemName = item.toString();
        
        System.out.println("Categoria: "+itemName);
     
        popularComboBoxNome("SELECT nome FROM nome, categoria WHERE nomeCat = '"+itemName+"' and categoria.`idCategoria` = nome.`idCategoria`");
      
        jComboBoxNome.setModel(defaultComboBoxNome);    
       
    }//GEN-LAST:event_jComboBoxCategoriaActionPerformed
    //Mês Inicial
    private void jComboBoxMesInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMesInicialActionPerformed
        if(estaMarcado("DataInicial")) showComponents("DataFinal");
    }//GEN-LAST:event_jComboBoxMesInicialActionPerformed
    //Dia Final
    private void jComboBoxDiaFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDiaFinalActionPerformed
        if(estaMarcado("DataFinal")) showComponents("jButtonConfirmar");
    }//GEN-LAST:event_jComboBoxDiaFinalActionPerformed
    // Mês Final
    private void jComboBoxMesFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMesFinalActionPerformed
        if(estaMarcado("DataFinal")) showComponents("jButtonConfirmar");
    }//GEN-LAST:event_jComboBoxMesFinalActionPerformed
    //Ano Final
    private void jComboBoxAnoFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAnoFinalActionPerformed
        if(estaMarcado("DataFinal")) showComponents("Cor");
    }//GEN-LAST:event_jComboBoxAnoFinalActionPerformed

    private void jComboBoxCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCorActionPerformed
        if(estaMarcado("Cor")) showComponents("Nome");
    }//GEN-LAST:event_jComboBoxCorActionPerformed

    private void jComboBoxNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxNomeActionPerformed
        if(estaMarcado("Nome")) showComponents("jButtonConfirmar");
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
     
        jLabelDataFinal.hide();
        jComboBoxDiaFinal.hide();
        jComboBoxMesFinal.hide();
        jComboBoxAnoFinal.hide();
        
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
            case "DataFinal":
                jLabelDataFinal.show();
                jComboBoxDiaFinal.show();
                jComboBoxMesFinal.show();
                jComboBoxAnoFinal.show();
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
                if(jComboBoxDiaInicial.getSelectedItem().toString() != "Dia" &&
                    jComboBoxMesInicial.getSelectedItem().toString() != "Mês" &&
                    jComboBoxAnoInicial.getSelectedItem().toString() != "Ano"
                ) return true;
            break;
            
            case "DataFinal":
                if(jComboBoxDiaFinal.getSelectedItem().toString() != "Dia" &&
                    jComboBoxMesFinal.getSelectedItem().toString() != "Mês" &&
                    jComboBoxAnoFinal.getSelectedItem().toString() != "Ano"
                ) return true;
            break;
            case "Cor":
                if(jComboBoxDiaFinal.getSelectedItem().toString() != "Cor"
                ) return true;
            break;
            case "Nome":
                if(jComboBoxDiaFinal.getSelectedItem().toString() != "Nome"
                ) return true;
            break;
        }
        
        return false;
    }
    
    private static void popularComboBoxCategoria(){
        SGBD mybd = new SGBD("127.0.0.1:3307", "findesk", "client", "client123456");
        
        mybd.getConexaoMySQL();
        ArrayList strList = new ArrayList();
        System.out.println(mybd.statusConection());
        
        
        
        ResultSet rs = mybd.consultarItemBd("SELECT * FROM categoria");
       
        String nome;
        
        try {
            rs.beforeFirst();
            while(rs.next()){
                nome = rs.getString(2);
                strList.add(nome);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        defaultComboBoxCategoria = new DefaultComboBoxModel(strList.toArray());
        
        
        mybd.fecharConexao();
        
    }
   
    private static void popularComboBoxDia(){
        SGBD mybd = new SGBD("127.0.0.1:3307", "findesk", "client", "client123456");
        
        mybd.getConexaoMySQL();
        ArrayList strList = new ArrayList();
        System.out.println(mybd.statusConection());
        
        
        
        ResultSet rs = mybd.consultarItemBd("SELECT * FROM dia");
       
        String nome;
        strList.add("Dia");
        try {
            rs.beforeFirst();
            while(rs.next()){
                nome = rs.getString(1);
                strList.add(nome);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        defaultComboBoxDiaInicial = new DefaultComboBoxModel(strList.toArray());
        defaultComboBoxDiaFinal = new DefaultComboBoxModel(strList.toArray());
        
        
        mybd.fecharConexao();
        
        
    }
    
    private static void popularComboBoxMes(){
        SGBD mybd = new SGBD("127.0.0.1:3307", "findesk", "client", "client123456");
        
        mybd.getConexaoMySQL();
        ArrayList strList = new ArrayList();
        System.out.println(mybd.statusConection());
        
        
        
        ResultSet rs = mybd.consultarItemBd("SELECT * FROM mes");
       
        String nome;
        strList.add("Mês");
        try {
            rs.beforeFirst();
            while(rs.next()){
                nome = rs.getString(1);
                strList.add(nome);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        defaultComboBoxMesInicial = new DefaultComboBoxModel(strList.toArray());
        defaultComboBoxMesFinal = new DefaultComboBoxModel(strList.toArray());
        
        
        mybd.fecharConexao();
        
    }
    
    private static void popularComboBoxAno(){
        SGBD mybd = new SGBD("127.0.0.1:3307", "findesk", "client", "client123456");
        
        mybd.getConexaoMySQL();
        ArrayList strList = new ArrayList();
        System.out.println(mybd.statusConection());
        
        
        
        ResultSet rs = mybd.consultarItemBd("SELECT * FROM ano");
       
        String nome;
        strList.add("Ano");
        try {
            rs.beforeFirst();
            while(rs.next()){
                nome = rs.getString(1);
                strList.add(nome);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        defaultComboBoxAnoInicial = new DefaultComboBoxModel(strList.toArray());
        defaultComboBoxAnoFinal = new DefaultComboBoxModel(strList.toArray());
        
        
        mybd.fecharConexao();
        
    }
    
    private static void popularComboBoxCor(){
        SGBD mybd = new SGBD("127.0.0.1:3307", "findesk", "client", "client123456");
        
        mybd.getConexaoMySQL();
        ArrayList strList = new ArrayList();
        System.out.println(mybd.statusConection());
        
        
        
        ResultSet rs = mybd.consultarItemBd("SELECT * FROM cor");
       
        String nome;
        strList.add("Cor");
        try {
            rs.beforeFirst();
            while(rs.next()){
                nome = rs.getString(2);
                strList.add(nome);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        defaultComboBoxCor = new DefaultComboBoxModel(strList.toArray());
        
        
        
        mybd.fecharConexao();
        
    }
    
    private static void popularComboBoxNome(String sql){
        SGBD mybd = new SGBD("127.0.0.1:3307", "findesk", "client", "client123456");
        
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
                nome = rs.getString(1);
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
    private javax.swing.JComboBox<String> jComboBoxAnoFinal;
    private javax.swing.JComboBox<String> jComboBoxAnoInicial;
    private javax.swing.JComboBox<String> jComboBoxCategoria;
    private javax.swing.JComboBox<String> jComboBoxCor;
    private javax.swing.JComboBox<String> jComboBoxDiaFinal;
    private javax.swing.JComboBox<String> jComboBoxDiaInicial;
    private javax.swing.JComboBox<String> jComboBoxMesFinal;
    private javax.swing.JComboBox<String> jComboBoxMesInicial;
    private javax.swing.JComboBox<String> jComboBoxNome;
    private javax.swing.JLabel jLabelComboBoxCategoria;
    private javax.swing.JLabel jLabelConfirmar;
    private javax.swing.JLabel jLabelCor;
    private javax.swing.JLabel jLabelDataFinal;
    private javax.swing.JLabel jLabelDataInicial;
    private javax.swing.JLabel jLabelFundo;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelTitulo;
    // End of variables declaration//GEN-END:variables
}
