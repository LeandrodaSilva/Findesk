/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author alvar
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    private static TelaPrincipal janelaControl; 
            
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

        jLabelCadastrar1 = new javax.swing.JLabel();
        jLabelCadastrar3 = new javax.swing.JLabel();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        jLabelFundoCadastrar = new javax.swing.JLabel();

        jLabelCadastrar1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabelCadastrar1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCadastrar1.setText("Cadastrar Item");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
                formAncestorMoved(evt);
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
            }
        });
        getContentPane().setLayout(null);

        jLabelCadastrar3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabelCadastrar3.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCadastrar3.setText("FinDesk");
        getContentPane().add(jLabelCadastrar3);
        jLabelCadastrar3.setBounds(320, 0, 280, 70);

        jButtonCadastrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonCadastrar.setText("Cadastrar Item");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadastrar);
        jButtonCadastrar.setBounds(270, 320, 260, 60);

        jButtonBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscar);
        jButtonBuscar.setBounds(270, 190, 260, 60);

        jLabelFundoCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Fundo2.png"))); // NOI18N
        jLabelFundoCadastrar.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Fundo2.png"))); // NOI18N
        jLabelFundoCadastrar.setEnabled(false);
        getContentPane().add(jLabelFundoCadastrar);
        jLabelFundoCadastrar.setBounds(0, -10, 800, 600);

        setSize(new java.awt.Dimension(815, 618));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        janelaControl.dispose();
        CadastrarItem cadastrarItem = new CadastrarItem();
        CadastrarItem.mostrar();
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void formAncestorMoved(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_formAncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_formAncestorMoved

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
         janelaControl.dispose();
         BuscarAdministrador buscaTeste = new BuscarAdministrador();
         buscaTeste.mostrar();
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    /**
     */
    public static void mostrar() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {  
               TelaPrincipal telaPrincipal =  new TelaPrincipal();
               telaPrincipal.setVisible(true);
               janelaControl = telaPrincipal;
            }
        });
    }
                
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JLabel jLabelCadastrar1;
    private javax.swing.JLabel jLabelCadastrar3;
    private javax.swing.JLabel jLabelFundoCadastrar;
    // End of variables declaration//GEN-END:variables
}
