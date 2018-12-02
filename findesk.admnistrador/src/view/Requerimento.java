/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.net.Socket;
import model.Item;
import model.Sockets;

/**
 *
 * @author ld_si
 */
public class Requerimento extends javax.swing.JFrame {

    private static Requerimento janelaControl;
    private static Socket cliente;

    /**
     * Creates new form Requerimento
     */
    public Requerimento() {
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

        jPanelFundo = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jButtonAceitar = new javax.swing.JButton();
        jButtonNegar = new javax.swing.JButton();
        jLabelNomeItem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        jPanelFundo.setBackground(new java.awt.Color(255, 255, 255));
        jPanelFundo.setLayout(null);

        jLabelTitulo.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Requerimento");
        jPanelFundo.add(jLabelTitulo);
        jLabelTitulo.setBounds(270, 90, 260, 70);

        jButtonAceitar.setText("Aceitar");
        jButtonAceitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceitarActionPerformed(evt);
            }
        });
        jPanelFundo.add(jButtonAceitar);
        jButtonAceitar.setBounds(530, 510, 71, 32);

        jButtonNegar.setText("Negar");
        jButtonNegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNegarActionPerformed(evt);
            }
        });
        jPanelFundo.add(jButtonNegar);
        jButtonNegar.setBounds(220, 510, 70, 32);

        jLabelNomeItem.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNomeItem.setText("Nome:");
        jPanelFundo.add(jLabelNomeItem);
        jLabelNomeItem.setBounds(240, 270, 330, 16);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAceitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceitarActionPerformed
        Sockets.sendText(cliente, "Aceito");
        janelaControl.setVisible(false);
    }//GEN-LAST:event_jButtonAceitarActionPerformed

    private void jButtonNegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNegarActionPerformed
        Sockets.sendText(cliente, "Negado");
        janelaControl.setVisible(false);
    }//GEN-LAST:event_jButtonNegarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void mostrar(Socket novoCliente, Item novoItem) {
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
            java.util.logging.Logger.getLogger(Requerimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Requerimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Requerimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Requerimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Requerimento janela = new Requerimento();
                jLabelNomeItem.setText("Nome: " + novoItem.getNomeItem());
                janela.setVisible(true);
                janelaControl = janela;
                cliente = novoCliente;
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceitar;
    private javax.swing.JButton jButtonNegar;
    private static javax.swing.JLabel jLabelNomeItem;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelFundo;
    // End of variables declaration//GEN-END:variables
}
