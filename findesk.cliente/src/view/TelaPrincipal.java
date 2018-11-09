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
import model.SGBD;

/**
 *
 * @author ld_si
 */
public class TelaPrincipal extends javax.swing.JFrame {
    
    public static DefaultComboBoxModel defaultComboBoxCategoria = new DefaultComboBoxModel();

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonConfirmar = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Findesk");
        setMaximumSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);

        jButtonConfirmar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonConfirmar.setText("Buscar");
        getContentPane().add(jButtonConfirmar);
        jButtonConfirmar.setBounds(320, 450, 120, 60);

        jComboBox2.setModel(defaultComboBoxCategoria);
        jComboBox2.setSelectedItem(jComboBox2);
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(390, 200, 106, 20);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Buscar");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(320, 110, 120, 70);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Selecionar Categoria");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(240, 200, 140, 20);

        jLabelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Fundo2.png"))); // NOI18N
        jLabelFundo.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Fundo2.png"))); // NOI18N
        jLabelFundo.setEnabled(false);
        jLabelFundo.setMaximumSize(new java.awt.Dimension(800, 600));
        jLabelFundo.setMinimumSize(new java.awt.Dimension(800, 600));
        jLabelFundo.setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().add(jLabelFundo);
        jLabelFundo.setBounds(0, 0, 800, 600);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void criar() {
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
        popularComboBox();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaPrincipal janela =  new TelaPrincipal();
                janela.setVisible(true);
            }
        });
    }
    public static void popularComboBox(){
        SGBD mybd = new SGBD("127.0.0.1:3307", "findesk", "client", "client123456");
        
        mybd.getConexaoMySQL();
        ArrayList strList = new ArrayList();
        System.out.println(mybd.statusConection());
        
        
        
        ResultSet rs = mybd.consultarItemBd("SELECT * FROM categoria");
       
        String nome;
        
        try {
            rs.first();
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
   
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelFundo;
    // End of variables declaration//GEN-END:variables
}
