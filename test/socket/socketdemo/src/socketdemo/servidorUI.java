/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketdemo;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ld_si
 */
public class servidorUI extends javax.swing.JFrame {
    private static servidor server = new servidor();
    private static servidorUI janelaControl;

    /**
     * Creates new form servidorUI
     */
    public servidorUI() {
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

        jLabelTitulo = new javax.swing.JLabel();
        jLabelId = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jButtonAceitar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabelTitulo.setText("Solicitação de Retirada");
        getContentPane().add(jLabelTitulo);
        jLabelTitulo.setBounds(214, 90, 361, 44);

        jLabelId.setText("ID:");
        getContentPane().add(jLabelId);
        jLabelId.setBounds(270, 210, 240, 14);

        jLabelNome.setText("Nome: ");
        getContentPane().add(jLabelNome);
        jLabelNome.setBounds(270, 230, 280, 20);

        jButtonAceitar.setText("Aceitar");
        jButtonAceitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceitarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAceitar);
        jButtonAceitar.setBounds(477, 460, 80, 23);

        jButton1.setText("Negar");
        getContentPane().add(jButton1);
        jButton1.setBounds(220, 460, 90, 23);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAceitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceitarActionPerformed
        server.setMsg("aceito");
        //server.setMsg("");
        janelaControl.setVisible(false);
    }//GEN-LAST:event_jButtonAceitarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(servidorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(servidorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(servidorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(servidorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                servidorUI janela = new servidorUI();
                janelaControl = janela;
                janela.setVisible(false);
                
                new Thread() {
                   public void run() {
                       server.start(janela);
                    }
                }.start();
                
            }
        });
    }
    public void setJLabelId(String id){
        this.jLabelId.setText(id);
    }
    public void setJLabelNome(String nome){
        this.jLabelNome.setText(nome);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAceitar;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelTitulo;
    // End of variables declaration//GEN-END:variables
}
