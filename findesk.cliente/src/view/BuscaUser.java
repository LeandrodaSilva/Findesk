/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import control.Usuario;
import java.awt.Component;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import model.*;

/**
 *
 * @author ld_si
 */
public class BuscaUser extends javax.swing.JFrame {
    
    private static BuscaUser janelaControl;
    private static RequisicaoCliente janelaControlRequerimento = null;
    private  DefaultTableModel defaultTableResultado;
    public Item itemSelecionado = new Item();

    /**
     * Creates new form suaJanela
     */
    public BuscaUser(String resultado) {
        initComponents();
        popular(resultado);
    }
    public BuscaUser() {
        initComponents();
        popular();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonVoltar = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();
        jScrollPaneResultado = new javax.swing.JScrollPane();
        jTableResultado = new javax.swing.JTable();
        jButtonConfirmar = new javax.swing.JButton();
        jLabelFoto = new javax.swing.JLabel();
        jLabelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setMaximumSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);

        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltar);
        jButtonVoltar.setBounds(70, 530, 61, 23);

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Busca ");
        getContentPane().add(jLabelTitulo);
        jLabelTitulo.setBounds(340, 30, 110, 70);

        jTableResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Descrição"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableResultado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableResultadoMouseClicked(evt);
            }
        });
        jScrollPaneResultado.setViewportView(jTableResultado);

        getContentPane().add(jScrollPaneResultado);
        jScrollPaneResultado.setBounds(60, 312, 680, 190);

        jButtonConfirmar.setText("Confirmar");
        jButtonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConfirmar);
        jButtonConfirmar.setBounds(640, 530, 100, 23);

        jLabelFoto.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelFoto);
        jLabelFoto.setBounds(210, 100, 370, 200);

        jLabelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Fundo2.png"))); // NOI18N
        jLabelFundo.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Fundo2.png"))); // NOI18N
        jLabelFundo.setEnabled(false);
        getContentPane().add(jLabelFundo);
        jLabelFundo.setBounds(0, 0, 790, 600);

        setSize(new java.awt.Dimension(800, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        janelaControl.dispose();
        TelaPrincipal telaPrincipal = new TelaPrincipal();
        telaPrincipal.mostrar();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarActionPerformed
        janelaControl.setVisible(false);
        RequisicaoCliente requerimento = new RequisicaoCliente();
        requerimento.mostrar(itemSelecionado,janelaControl);
        janelaControlRequerimento = requerimento;
    }//GEN-LAST:event_jButtonConfirmarActionPerformed

    private void jTableResultadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableResultadoMouseClicked
        int linha = jTableResultado.getSelectedRow();
        System.out.println("Selecionado "+ linha);
        String id = (String) jTableResultado.getValueAt(linha, 0);
        System.out.println("Conteudo  "+ id);
        if(itemSelecionado.load(id)){
            System.out.println("Item carregado: "+ itemSelecionado.getIdItem());
        }
        popular(jLabelFoto, itemSelecionado.getFoto());
    }//GEN-LAST:event_jTableResultadoMouseClicked

    
    public void popular(JLabel label, String imagem){
        //atribui imagem nos labels desejados
        
        ImageIcon icon = new ImageIcon(imagem, "imagem");
        Image img = icon.getImage();
        Image nova = getScaledImage(img, 200,150);
        icon.setImage(nova);
        label.setIcon(icon); 
    }
      
    private Image getScaledImage(Image srcImg, int w, int h){
        //Redimensiona a imagem para o tamanho desejado
        BufferedImage resizedImg = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = resizedImg.createGraphics();

        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(srcImg, 0, 0, w, h, null);
        g2.dispose();

        return resizedImg;
    }
    
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
            java.util.logging.Logger.getLogger(BuscaUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscaUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscaUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscaUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BuscaUser buscaUser = new BuscaUser();
                buscaUser.setVisible(true);
                janelaControl = buscaUser;
            }
        });
    }
    
    public static void mostrar(String result) {
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
            java.util.logging.Logger.getLogger(BuscaUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscaUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscaUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscaUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BuscaUser buscaUser = new BuscaUser(result);
                buscaUser.setVisible(true);
                janelaControl = buscaUser;
            }
        });
//        if(janelaControlRequerimento != null){
//            janelaControlRequerimento.dispose();
//        }
    }
    
   
    
    private  void popular(String resultado){
      
            String categoria = "Eletrônicos";
            String item = "Pendrive";
            String descricao = "lindo";
            //String[] colunas = {"1","2","3"};   
            //System.out.println("Consulta recebida: "+resultado);
        ///////////////////////////////////////////////////////////////
            String[] colunas = new String[3];
            SGBD mybd = new SGBD();

            mybd.getConexaoMySQL();
            ArrayList strList = new ArrayList();
            System.out.println(mybd.statusConection());


            ResultSet rs;
            rs = mybd.consultarItemBd(resultado);
            String nome;
            strList.add("Selecionar");
            defaultTableResultado = (DefaultTableModel) jTableResultado.getModel();

            try {
                rs.beforeFirst();
                while(rs.next()){
                    colunas[0] = Integer.toString(rs.getInt(1));
                    colunas[1] = rs.getString(2);
                    colunas[2] = rs.getString(4);
                    defaultTableResultado.addRow(colunas);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
            }   
            mybd.fecharConexao();
        /////////////////////////////////////////////////////////////////////   
    }
    
    private  void popular(){
      
            String categoria = "Eletrônicos";
            String item = "Pendrive";
            String descricao = "lindo";
            String[] colunas = {"1","2","3"};
           
            defaultTableResultado = (DefaultTableModel) jTableResultado.getModel();
          
            
            defaultTableResultado.addRow(colunas);
            

            
        

        /////////////////////////////////////////////////////////////////////   
    }
    public void showFrame(){
        janelaControl.setVisible(true);
        janelaControl.setAlwaysOnTop(true);
        janelaControl.setAlwaysOnTop(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabelFoto;
    private javax.swing.JLabel jLabelFundo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JScrollPane jScrollPaneResultado;
    private javax.swing.JTable jTableResultado;
    // End of variables declaration//GEN-END:variables
}
