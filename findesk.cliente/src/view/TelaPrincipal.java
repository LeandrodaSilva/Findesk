/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import control.Usuario;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import model.SGBD;
import java.awt.Point;
import java.io.IOException;
import java.net.URISyntaxException;
import model.*;


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
    private static Point point = new Point();

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
        jButtonConfirmar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonConfirmar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/LupaPreta.png")));
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
        jSeparator1 = new javax.swing.JSeparator();
        jLabelLogoFindesk = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jButtonFechar = new javax.swing.JButton();
        jButtonMinimizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);

        jPanelFundo.setBackground(new java.awt.Color(255, 255, 255));
        jPanelFundo.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanelFundo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanelFundoMouseDragged(evt);
            }
        });
        jPanelFundo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelFundoMousePressed(evt);
            }
        });
        jPanelFundo.setLayout(null);

        jButtonConfirmar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonConfirmar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/LupaPreta.png"))); // NOI18N
        jButtonConfirmar.setText("Vai!");
        jButtonConfirmar.setToolTipText("Ir para a tela de seleção de itens.");
        jButtonConfirmar.setContentAreaFilled(false);
        jButtonConfirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonConfirmarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonConfirmarMouseExited(evt);
            }
        });
        jButtonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarActionPerformed(evt);
            }
        });
        jPanelFundo.add(jButtonConfirmar);
        jButtonConfirmar.setBounds(350, 400, 120, 70);

        jComboBoxCategoria.setModel(defaultComboBoxCategoria);
        jComboBoxCategoria.setSelectedItem(jComboBoxCategoria);
        jComboBoxCategoria.setToolTipText("Escolha a categoria ao qual seu item se encaixa.");
        jComboBoxCategoria.setAutoscrolls(true);
        jComboBoxCategoria.setBorder(null);
        jComboBoxCategoria.setRequestFocusEnabled(false);
        jComboBoxCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCategoriaActionPerformed(evt);
            }
        });
        jPanelFundo.add(jComboBoxCategoria);
        jComboBoxCategoria.setBounds(350, 200, 110, 26);

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTitulo.setText("Buscar");
        jPanelFundo.add(jLabelTitulo);
        jLabelTitulo.setBounds(350, 120, 120, 70);

        jLabelComboBoxCategoria.setForeground(new java.awt.Color(0, 0, 0));
        jLabelComboBoxCategoria.setText("*Selecionar Categoria");
        jPanelFundo.add(jLabelComboBoxCategoria);
        jLabelComboBoxCategoria.setBounds(210, 200, 140, 20);

        jComboBoxDiaInicial.setModel(defaultComboBoxDiaInicial);
        jComboBoxDiaInicial.setToolTipText("Possível dia da perda ou esquecimento do item.");
        jComboBoxDiaInicial.setAutoscrolls(true);
        jComboBoxDiaInicial.setBorder(null);
        jComboBoxDiaInicial.setRequestFocusEnabled(false);
        jComboBoxDiaInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDiaInicialActionPerformed(evt);
            }
        });
        jPanelFundo.add(jComboBoxDiaInicial);
        jComboBoxDiaInicial.setBounds(350, 250, 70, 26);

        jLabelDataInicial.setForeground(new java.awt.Color(0, 0, 0));
        jLabelDataInicial.setText("*Data de busca inicial ");
        jPanelFundo.add(jLabelDataInicial);
        jLabelDataInicial.setBounds(210, 250, 130, 16);

        jComboBoxMesInicial.setModel(defaultComboBoxMesInicial);
        jComboBoxMesInicial.setToolTipText("Possível mês da perda ou esquecimento do item.");
        jComboBoxMesInicial.setAutoscrolls(true);
        jComboBoxMesInicial.setBorder(null);
        jComboBoxMesInicial.setRequestFocusEnabled(false);
        jComboBoxMesInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMesInicialActionPerformed(evt);
            }
        });
        jPanelFundo.add(jComboBoxMesInicial);
        jComboBoxMesInicial.setBounds(430, 250, 70, 26);

        jComboBoxAnoInicial.setModel(defaultComboBoxAnoInicial);
        jComboBoxAnoInicial.setToolTipText("Possível ano da perda ou esquecimento do item.");
        jComboBoxAnoInicial.setAutoscrolls(true);
        jComboBoxAnoInicial.setBorder(null);
        jComboBoxAnoInicial.setRequestFocusEnabled(false);
        jComboBoxAnoInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAnoInicialActionPerformed(evt);
            }
        });
        jPanelFundo.add(jComboBoxAnoInicial);
        jComboBoxAnoInicial.setBounds(510, 250, 110, 26);

        jComboBoxCor.setModel(defaultComboBoxCor);
        jComboBoxCor.setToolTipText("Selecione a cor do item desejado.");
        jComboBoxCor.setAutoscrolls(true);
        jComboBoxCor.setBorder(null);
        jComboBoxCor.setRequestFocusEnabled(false);
        jComboBoxCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCorActionPerformed(evt);
            }
        });
        jPanelFundo.add(jComboBoxCor);
        jComboBoxCor.setBounds(350, 330, 110, 26);

        jComboBoxNome.setModel(defaultComboBoxNome);
        jComboBoxNome.setToolTipText("Selecione o nome do item desejado.");
        jComboBoxNome.setAutoscrolls(true);
        jComboBoxNome.setBorder(null);
        jComboBoxNome.setRequestFocusEnabled(false);
        jComboBoxNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxNomeActionPerformed(evt);
            }
        });
        jPanelFundo.add(jComboBoxNome);
        jComboBoxNome.setBounds(350, 290, 110, 26);

        jLabelCor.setBackground(new java.awt.Color(0, 0, 0));
        jLabelCor.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCor.setText("*Cor do item");
        jPanelFundo.add(jLabelCor);
        jLabelCor.setBounds(210, 330, 110, 16);

        jLabelNome.setBackground(new java.awt.Color(0, 0, 0));
        jLabelNome.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNome.setText("*Nome do item");
        jPanelFundo.add(jLabelNome);
        jLabelNome.setBounds(210, 290, 110, 16);
        jPanelFundo.add(jSeparator1);
        jSeparator1.setBounds(0, 110, 800, 20);

        jLabelLogoFindesk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/FINDESK_LOGO3_Azul_PNG.png"))); // NOI18N
        jLabelLogoFindesk.setToolTipText("Abrir site.");
        jLabelLogoFindesk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLogoFindeskMouseClicked(evt);
            }
        });
        jPanelFundo.add(jLabelLogoFindesk);
        jLabelLogoFindesk.setBounds(-40, -10, 350, 110);

        jSeparator2.setForeground(new java.awt.Color(204, 204, 204));
        jPanelFundo.add(jSeparator2);
        jSeparator2.setBounds(0, 510, 800, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/SWS3.png"))); // NOI18N
        jLabel1.setToolTipText("Smart Way Software.");
        jPanelFundo.add(jLabel1);
        jLabel1.setBounds(690, 510, 170, 220);

        jButtonFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/FecharPreto.png"))); // NOI18N
        jButtonFechar.setToolTipText("Fechar");
        jButtonFechar.setBorderPainted(false);
        jButtonFechar.setContentAreaFilled(false);
        jButtonFechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonFecharMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonFecharMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonFecharMouseExited(evt);
            }
        });
        jPanelFundo.add(jButtonFechar);
        jButtonFechar.setBounds(760, 0, 20, 30);

        jButtonMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/MinimizarPreto.png"))); // NOI18N
        jButtonMinimizar.setToolTipText("Minimizar");
        jButtonMinimizar.setBorderPainted(false);
        jButtonMinimizar.setContentAreaFilled(false);
        jButtonMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonMinimizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonMinimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonMinimizarMouseExited(evt);
            }
        });
        jPanelFundo.add(jButtonMinimizar);
        jButtonMinimizar.setBounds(700, 0, 40, 30);

        getContentPane().add(jPanelFundo);
        jPanelFundo.setBounds(0, 0, 800, 600);

        pack();
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

    private void jButtonFecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonFecharMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jButtonFecharMouseClicked

    private void jButtonMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonMinimizarMouseClicked
        janelaControl.setExtendedState(janelaControl.ICONIFIED);
    }//GEN-LAST:event_jButtonMinimizarMouseClicked

    private void jButtonFecharMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonFecharMouseEntered
        jButtonFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/FecharAzul.png")));
    }//GEN-LAST:event_jButtonFecharMouseEntered

    private void jButtonFecharMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonFecharMouseExited
        jButtonFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/FecharPreto.png")));
    }//GEN-LAST:event_jButtonFecharMouseExited

    private void jButtonConfirmarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonConfirmarMouseEntered
        jButtonConfirmar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(000, 191, 255)));
        jButtonConfirmar.setForeground(new java.awt.Color(000, 191, 255));
        jButtonConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/LupaAzul.png")));
    }//GEN-LAST:event_jButtonConfirmarMouseEntered

    private void jButtonConfirmarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonConfirmarMouseExited
        jButtonConfirmar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonConfirmar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/LupaPreta.png")));
    }//GEN-LAST:event_jButtonConfirmarMouseExited

    private void jPanelFundoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelFundoMousePressed
        point.x = evt.getX();
        point.y = evt.getY();
    }//GEN-LAST:event_jPanelFundoMousePressed

    private void jPanelFundoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelFundoMouseDragged
        Point p = janelaControl.getLocation();
        janelaControl.setLocation(p.x + evt.getX() - point.x, p.y + evt.getY() - point.y);
    }//GEN-LAST:event_jPanelFundoMouseDragged

    private void jButtonMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonMinimizarMouseEntered
       jButtonMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/MinimizarAzul.png")));
    }//GEN-LAST:event_jButtonMinimizarMouseEntered

    private void jButtonMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonMinimizarMouseExited
        jButtonMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/MinimizarPreto.png")));
    }//GEN-LAST:event_jButtonMinimizarMouseExited

    private void jLabelLogoFindeskMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLogoFindeskMouseClicked

        try {
            java.awt.Desktop.getDesktop().browse(new java.net.URI("http://www.google.com.br"));
        } catch (URISyntaxException | IOException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_jLabelLogoFindeskMouseClicked
    

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
        jComboBoxCategoria.setRenderer(new MyCellRender(000,191,255));
        jComboBoxCategoria.setBackground(Color.white);
 
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
        jComboBoxDiaInicial.setRenderer(new MyCellRender(000,191,255));
        jComboBoxDiaInicial.setBackground(Color.white);
        
        
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
        jComboBoxMesInicial.setRenderer(new MyCellRender(000,191,255));
        jComboBoxMesInicial.setBackground(Color.white);
        
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
        jComboBoxAnoInicial.setRenderer(new MyCellRender(000,191,255));
        jComboBoxAnoInicial.setBackground(Color.white);
        
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
                if(!nome.equals("Nulo")){
                    strList.add(nome);
                }
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        defaultComboBoxCor = new DefaultComboBoxModel(strList.toArray());
        jComboBoxCor.setRenderer(new MyCellRender(000,191,255));
        jComboBoxCor.setBackground(Color.white);
        
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
        jComboBoxNome.setRenderer(new MyCellRender(000,191,255));
        jComboBoxNome.setBackground(Color.white);
        
        mybd.fecharConexao();
        
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonMinimizar;
    private static javax.swing.JComboBox<String> jComboBoxAnoInicial;
    private static javax.swing.JComboBox<String> jComboBoxCategoria;
    private static javax.swing.JComboBox<String> jComboBoxCor;
    private static javax.swing.JComboBox<String> jComboBoxDiaInicial;
    private static javax.swing.JComboBox<String> jComboBoxMesInicial;
    private static javax.swing.JComboBox<String> jComboBoxNome;
    private javax.swing.JLabel jLabel1;
    private static javax.swing.JLabel jLabelComboBoxCategoria;
    private javax.swing.JLabel jLabelCor;
    private javax.swing.JLabel jLabelDataInicial;
    private javax.swing.JLabel jLabelLogoFindesk;
    private javax.swing.JLabel jLabelNome;
    private static javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelFundo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
