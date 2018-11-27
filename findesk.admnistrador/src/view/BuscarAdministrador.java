/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import control.Administrador;
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
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import model.*;

/**
 *
 * @author ld_si
 */
//SEU LELEO GAYuhguhg
public class BuscarAdministrador extends javax.swing.JFrame {
    
    private static BuscarAdministrador janelaControl;
    private static DefaultComboBoxModel defaultComboBoxCategoria;
    private static DefaultComboBoxModel defaultComboBoxNome;
    private DefaultTableModel defaultTableResultado;
    public Item itemSelecionado = new Item();

    /**
     * Creates new form suaJanela
     */
    public BuscarAdministrador(String resultado) {
        initComponents();
        popularComboBoxCategoria();
        jComboBoxCategoria.setModel(defaultComboBoxCategoria);
      
    }
    public BuscarAdministrador() {
        initComponents();
        popularComboBoxCategoria();
        jComboBoxCategoria.setModel(defaultComboBoxCategoria);
        
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
        jLabelFoto = new javax.swing.JLabel();
        jLabelCategoria = new javax.swing.JLabel();
        jLabelPalavraChave = new javax.swing.JLabel();
        jButtonBuscar = new javax.swing.JButton();
        jComboBoxCategoria = new javax.swing.JComboBox<>();
        jComboBoxNome = new javax.swing.JComboBox<>();
        jButtonAlterar = new javax.swing.JButton();
        jButtonDeletar = new javax.swing.JButton();
        jLabelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);

        jButtonVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/icons8-seta-longa-à-esquerda-filled-50.png"))); // NOI18N
        jButtonVoltar.setContentAreaFilled(false);
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltar);
        jButtonVoltar.setBounds(70, 520, 61, 23);

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Buscar Item");
        getContentPane().add(jLabelTitulo);
        jLabelTitulo.setBounds(290, 0, 220, 70);

        jTableResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Descrição", "Cor", "Situação do Item"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableResultado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableResultadoMouseClicked(evt);
            }
        });
        jScrollPaneResultado.setViewportView(jTableResultado);

        getContentPane().add(jScrollPaneResultado);
        jScrollPaneResultado.setBounds(0, 350, 790, 150);

        jLabelFoto.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelFoto);
        jLabelFoto.setBounds(350, 90, 370, 190);

        jLabelCategoria.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelCategoria.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCategoria.setText("Categorias");
        getContentPane().add(jLabelCategoria);
        jLabelCategoria.setBounds(60, 70, 180, 40);

        jLabelPalavraChave.setVisible(false);
        jLabelPalavraChave.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelPalavraChave.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPalavraChave.setText("Itens");
        getContentPane().add(jLabelPalavraChave);
        jLabelPalavraChave.setBounds(60, 130, 180, 40);

        jButtonBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/icons8-pesquisar-24.png"))); // NOI18N
        jButtonBuscar.setContentAreaFilled(false);
        jButtonBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonBuscar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jButtonBuscarMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButtonBuscarMouseMoved(evt);
            }
        });
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscar);
        jButtonBuscar.setBounds(210, 100, 50, 40);

        jComboBoxCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCategoriaActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxCategoria);
        jComboBoxCategoria.setBounds(60, 110, 150, 20);

        jComboBoxNome.setVisible(false);
        jComboBoxNome.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos" }));
        jComboBoxNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxNomeActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxNome);
        jComboBoxNome.setBounds(60, 170, 150, 20);

        jButtonAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/icons8-editar-arquivo-24.png"))); // NOI18N
        jButtonAlterar.setBorderPainted(false);
        jButtonAlterar.setContentAreaFilled(false);
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAlterar);
        jButtonAlterar.setBounds(610, 510, 50, 40);

        jButtonDeletar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonDeletar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/icons8-lixo-26.png"))); // NOI18N
        jButtonDeletar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButtonDeletar.setBorderPainted(false);
        jButtonDeletar.setContentAreaFilled(false);
        jButtonDeletar.setOpaque(false);
        jButtonDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeletarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDeletar);
        jButtonDeletar.setBounds(680, 510, 50, 40);

        jLabelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Fundo2.png"))); // NOI18N
        jLabelFundo.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Fundo2.png"))); // NOI18N
        jLabelFundo.setEnabled(false);
        jLabelFundo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabelFundoMouseMoved(evt);
            }
        });
        getContentPane().add(jLabelFundo);
        jLabelFundo.setBounds(0, 0, 790, 600);

        setSize(new java.awt.Dimension(799, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        janelaControl.dispose();
        TelaPrincipal telaPrincipal = new TelaPrincipal();
        telaPrincipal.mostrar();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jTableResultadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableResultadoMouseClicked
        jLabelFoto.setVisible(true);
        int linha = jTableResultado.getSelectedRow();
        System.out.println("Selecionado "+ linha);
        String id = (String) jTableResultado.getValueAt(linha, 0);
        System.out.println("Conteudo  "+ id);
        if(itemSelecionado.load(id)){
            System.out.println("Item carregado: "+ itemSelecionado.getIdItem());
        }
        popular(jLabelFoto, itemSelecionado.getFoto());
    }//GEN-LAST:event_jTableResultadoMouseClicked

    private void jComboBoxCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCategoriaActionPerformed
        Object item = jComboBoxCategoria.getSelectedItem();
        String itemName = item.toString();
        if(itemName == "Todas"){
            jComboBoxNome.setVisible(false);
            jLabelPalavraChave.setVisible(false);
        }else{
            jComboBoxNome.setVisible(true);
            jLabelPalavraChave.setVisible(true);
            popularComboBoxNome("select distinct nomeItem.nome " +
                                "from item, nomeItem, categoria " +
                                "where nomeItem.idNome = item.idNome and " +
                                        "nomeItem.idCategoria = categoria.idCategoria and " +
                                        "categoria.nomeCat like \""
                                        + itemName
                                         + "\";");

            jComboBoxNome.setModel(defaultComboBoxNome);
        }
    }//GEN-LAST:event_jComboBoxCategoriaActionPerformed

    private void jComboBoxNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxNomeActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        String categoria = jComboBoxCategoria.getSelectedItem().toString();
        String nome = jComboBoxNome.getSelectedItem().toString();
        if ( categoria == "Todas"){
            ;
                    popularResultado("select idItem, nome, descricaoItem, nomeCor, retiradoItem "+
                                     "from item, nomeitem, cor "+
                                     "where nomeitem.idNome = item.idNome and "+
                                     "cor.idCor = item.idCor ");
        }
        if( nome != "Todos" && categoria != "Todas"){
        
        popularResultado("select idItem, nome, descricaoItem, nomeCor, retiradoItem "+
                         "from nomeitem, item, categoria "+
                         " where nome like \""+nome+"\"and nomeCat like \""+categoria+"\"and "+
                         "item.idNome = nomeitem.idNome and nomeItem.idCategoria = categoria.idCategoria and "+
                         "cor.idCor = item.idCor ");
        }
        if(nome == "Todos" && categoria != "Todas"){
            
            popularResultado("select idItem, nome, descricaoItem, nomeCor, retiradoItem "+
                             "from nomeitem, item, categoria "+
                             "where item.idNome = nomeitem.idNome and nomeItem.idCategoria = categoria.idCategoria and "+
                             "nomeCat like \""+categoria+"\"and "+
                             "cor.idCor = item.idCor ");
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonBuscarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBuscarMouseMoved
        
    }//GEN-LAST:event_jButtonBuscarMouseMoved

    private void jButtonBuscarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBuscarMouseDragged
       
    }//GEN-LAST:event_jButtonBuscarMouseDragged

    private void jLabelFundoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelFundoMouseMoved
      
    }//GEN-LAST:event_jLabelFundoMouseMoved

    private void jButtonDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletarActionPerformed
        SGBD mybd = new SGBD();
        mybd.getConexaoMySQL();
        System.out.println(mybd.statusConection());
        Object objeto = defaultTableResultado.getValueAt(jTableResultado.getSelectedRow(), 0);
        Object objeto1 = defaultTableResultado.getValueAt(jTableResultado.getSelectedRow(), 1);
        objeto1.toString();
        Integer.parseInt((String) objeto);
        System.out.println("valor "+objeto);
        int Confirm = JOptionPane.showConfirmDialog(null,"Deseja excluir "+objeto1+"?","sim ou nao", JOptionPane.YES_NO_OPTION);
        if (Confirm == JOptionPane.YES_OPTION) {
        JOptionPane.showMessageDialog(null, ""+objeto1+" deletado com sucesso!!");
        //mybd.alterarItemBd("delete from item where idItem = \""+objeto+"\"");
        defaultTableResultado.removeRow(jTableResultado.getSelectedRow());
        jLabelFoto.setVisible(false);
        } 
    }//GEN-LAST:event_jButtonDeletarActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    
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
    
    private static void popularComboBoxNome(String sql){
        SGBD mybd = new SGBD();
        
        mybd.getConexaoMySQL();
        ArrayList strList = new ArrayList();
        System.out.println(mybd.statusConection());
        
        
        //"SELECT nome FROM nome, categoria WHERE nomeCat = 'Eletrônicos' and categoria.`idCategoria` = nome.`idCategoria`")
        ResultSet rs = mybd.consultarItemBd(sql);
       
        String nome;
        strList.add("Todos");
        try {
            rs.beforeFirst();
            while(rs.next()){
                nome = rs.getString("nome");
                strList.add(nome);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        defaultComboBoxNome = new DefaultComboBoxModel(strList.toArray());
        
        mybd.fecharConexao();
        
    }
    
    private static void popularComboBoxCategoria(){
        SGBD mybd = new SGBD();
        
        mybd.getConexaoMySQL();
        ArrayList strList = new ArrayList();
        System.out.println(mybd.statusConection());
        
        
        
        ResultSet rs = mybd.consultarItemBd("select distinct categoria.nomeCat " +
                                                "from nomeItem, item, categoria " +
                                                "where item.idNome = nomeItem.idNome and " +
                                                "nomeItem.idCategoria = categoria.idCategoria;");
       
        String nome;
        strList.add("Todas");
        try {
            rs.beforeFirst();
            while(rs.next()){
                nome = rs.getString("nomeCat");
                strList.add(nome);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        defaultComboBoxCategoria = new DefaultComboBoxModel(strList.toArray());
        
        
        mybd.fecharConexao();
        
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
            java.util.logging.Logger.getLogger(BuscarAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BuscarAdministrador buscaUser = new BuscarAdministrador();
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
            java.util.logging.Logger.getLogger(BuscarAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BuscarAdministrador buscaUser = new BuscarAdministrador(result);
                buscaUser.setVisible(true);
                janelaControl = buscaUser;
            }
        });
//        if(janelaControlRequerimento != null){
//            janelaControlRequerimento.dispose();
//        }
    }
    
   
    
    private  void popularResultado(String resultado){
            String[] colunas = new String[5];
            SGBD mybd = new SGBD();

            mybd.getConexaoMySQL();
            ArrayList strList = new ArrayList();
            System.out.println(mybd.statusConection());

          
            ResultSet rs;
            rs = mybd.consultarItemBd(resultado);
            String nome;
            strList.add("Selecionar");
            defaultTableResultado = (DefaultTableModel) jTableResultado.getModel();
            int linhasTabela = defaultTableResultado.getRowCount(), x = 0;
            if(linhasTabela > 0){
                for(x = 0; x < linhasTabela; x++){
                    defaultTableResultado.removeRow(0);
                }
            }
            try {
                rs.beforeFirst();
                while(rs.next()){
                    colunas[0] = Integer.toString(rs.getInt(1));
                    colunas[1] = rs.getString(2);
                    colunas[2] = rs.getString(3);
                    
                    colunas[3] = rs.getString(4);
                    colunas[4] = rs.getString(5);
                    if(rs.getString(5).equals("1")){
                        colunas[4] = "retirado";
                    }else{
                        colunas[4] = "disponível";
                    }
                    defaultTableResultado.addRow(colunas);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
            }
            mybd.fecharConexao();
        
    }
    
    public void showFrame(){
        janelaControl.setVisible(true);
        janelaControl.setAlwaysOnTop(true);
        janelaControl.setAlwaysOnTop(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonDeletar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JComboBox<String> jComboBoxCategoria;
    private javax.swing.JComboBox<String> jComboBoxNome;
    private javax.swing.JLabel jLabelCategoria;
    private javax.swing.JLabel jLabelFoto;
    private javax.swing.JLabel jLabelFundo;
    private javax.swing.JLabel jLabelPalavraChave;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JScrollPane jScrollPaneResultado;
    private javax.swing.JTable jTableResultado;
    // End of variables declaration//GEN-END:variables
}
