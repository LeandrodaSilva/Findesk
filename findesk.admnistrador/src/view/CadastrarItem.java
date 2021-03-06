/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import javax.swing.JOptionPane;
import control.Administrador;
import java.awt.Component;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import model.*;

/**
 *
 * @author alvar
 */
public class CadastrarItem extends javax.swing.JFrame {

    private static DefaultComboBoxModel defaultComboBoxCategoria = new DefaultComboBoxModel();
    private static DefaultComboBoxModel defaultComboBoxDia = new DefaultComboBoxModel();
    private static DefaultComboBoxModel defaultComboBoxMes = new DefaultComboBoxModel();
    private static DefaultComboBoxModel defaultComboBoxAno = new DefaultComboBoxModel();
    private static DefaultComboBoxModel defaultComboBoxCor = new DefaultComboBoxModel();
    private static DefaultComboBoxModel defaultComboBoxNumero = new DefaultComboBoxModel();
    private static DefaultComboBoxModel defaultComboBoxNome = new DefaultComboBoxModel();
    private static CadastrarItem janelaControl;
    private DefaultTableModel defaultTableResultado;
    public Item itemSelecionado = new Item();

    /**
     * Creates new form CadastrarItem
     */
    public CadastrarItem() {

        initComponents();
        popularComboBoxCategoria();
        popularComboBoxDia();
        popularComboBoxMes();
        popularComboBoxAno();
        popularComboBoxCor();
        popularComboBoxNumero();
        jComboBoxCategoria.setModel(defaultComboBoxCategoria);
        jComboBoxDia.setModel(defaultComboBoxDia);
        jComboBoxMes.setModel(defaultComboBoxMes);
        jComboBoxAno.setModel(defaultComboBoxAno);
        jComboBoxCor.setModel(defaultComboBoxCor);
        jLabelDoc.setVisible(false);
        jTextFieldDocumento.setVisible(false);
        // jComboBoxNumero.setModel(defaultComboBoxNumero);

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
        jPanelFundo = new javax.swing.JPanel();
        jComboBoxCor = new javax.swing.JComboBox<>();
        jLabelCor = new javax.swing.JLabel();
        jLabelDataDescricao = new javax.swing.JLabel();
        jTextFieldDocumento = new javax.swing.JTextField();
        jLabelNomeItem = new javax.swing.JLabel();
        jComboBoxDia = new javax.swing.JComboBox<>();
        jComboBoxCategoria = new javax.swing.JComboBox<>();
        jComboBoxMes = new javax.swing.JComboBox<>();
        jComboBoxAno = new javax.swing.JComboBox<>();
        jTextFieldNomeItem = new javax.swing.JTextField();
        jButtonVoltar = new javax.swing.JButton();
        jLabelDataPerda = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescricao = new javax.swing.JTextArea();
        jButtonCadastrar = new javax.swing.JButton();
        jLabelCategoria = new javax.swing.JLabel();
        jLabelDoc = new javax.swing.JLabel();
        jLabelFindesk = new javax.swing.JLabel();
        jButtonFechar = new javax.swing.JButton();
        jButtonMinimizar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabelFoto = new javax.swing.JLabel();
        jTextFielPathFoto = new javax.swing.JTextField();
        jButtonFoto = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();

        jLabelCadastrar1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabelCadastrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/FINDESK_LOGO3_Azul_PNG.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanelFundo.setBackground(new java.awt.Color(255, 255, 255));
        jPanelFundo.setLayout(null);

        jComboBoxCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCorActionPerformed(evt);
            }
        });
        jPanelFundo.add(jComboBoxCor);
        jComboBoxCor.setBounds(520, 160, 110, 30);

        jLabelCor.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelCor.setText("Cor:");
        jPanelFundo.add(jLabelCor);
        jLabelCor.setBounds(450, 150, 60, 50);

        jLabelDataDescricao.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelDataDescricao.setText("Descrição:");
        jPanelFundo.add(jLabelDataDescricao);
        jLabelDataDescricao.setBounds(30, 310, 150, 30);

        jTextFieldDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDocumentoActionPerformed(evt);
            }
        });
        jPanelFundo.add(jTextFieldDocumento);
        jTextFieldDocumento.setBounds(450, 240, 180, 30);

        jLabelNomeItem.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelNomeItem.setText("Nome do item:");
        jPanelFundo.add(jLabelNomeItem);
        jLabelNomeItem.setBounds(30, 160, 170, 29);

        jComboBoxDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDiaActionPerformed(evt);
            }
        });
        jPanelFundo.add(jComboBoxDia);
        jComboBoxDia.setBounds(200, 270, 60, 30);

        jComboBoxCategoria.setToolTipText("");
        jComboBoxCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCategoriaActionPerformed(evt);
            }
        });
        jPanelFundo.add(jComboBoxCategoria);
        jComboBoxCategoria.setBounds(200, 210, 200, 30);

        jComboBoxMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMesActionPerformed(evt);
            }
        });
        jPanelFundo.add(jComboBoxMes);
        jComboBoxMes.setBounds(260, 270, 60, 30);

        jPanelFundo.add(jComboBoxAno);
        jComboBoxAno.setBounds(320, 270, 80, 30);

        jTextFieldNomeItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeItemActionPerformed(evt);
            }
        });
        jPanelFundo.add(jTextFieldNomeItem);
        jTextFieldNomeItem.setBounds(200, 160, 200, 30);

        jButtonVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/VoltarPreto.png"))); // NOI18N
        jButtonVoltar.setToolTipText("Voltar");
        jButtonVoltar.setContentAreaFilled(false);
        jButtonVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonVoltarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonVoltarMouseExited(evt);
            }
        });
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });
        jPanelFundo.add(jButtonVoltar);
        jButtonVoltar.setBounds(20, 540, 59, 35);

        jLabelDataPerda.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelDataPerda.setText("Data de perda:");
        jPanelFundo.add(jLabelDataPerda);
        jLabelDataPerda.setBounds(30, 260, 170, 30);

        jTextAreaDescricao.setColumns(20);
        jTextAreaDescricao.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDescricao);

        jPanelFundo.add(jScrollPane1);
        jScrollPane1.setBounds(200, 330, 340, 150);

        jButtonCadastrar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonCadastrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCadastrar.setText("CADASTRAR");
        jButtonCadastrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonCadastrar.setContentAreaFilled(false);
        jButtonCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonCadastrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonCadastrarMouseExited(evt);
            }
        });
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });
        jPanelFundo.add(jButtonCadastrar);
        jButtonCadastrar.setBounds(290, 540, 180, 40);

        jLabelCategoria.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelCategoria.setText("Categoria:");
        jPanelFundo.add(jLabelCategoria);
        jLabelCategoria.setBounds(30, 210, 110, 30);

        jLabelDoc.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelDoc.setText("Num documento:");
        jPanelFundo.add(jLabelDoc);
        jLabelDoc.setBounds(450, 190, 190, 60);

        jLabelFindesk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/FINDESK_LOGO3_Azul_PNG.png"))); // NOI18N
        jLabelFindesk.setText("jLabel1");
        jPanelFundo.add(jLabelFindesk);
        jLabelFindesk.setBounds(-40, -10, 390, 110);

        jButtonFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/FecharPreto.png"))); // NOI18N
        jButtonFechar.setToolTipText("Fechar");
        jButtonFechar.setBorderPainted(false);
        jButtonFechar.setContentAreaFilled(false);
        jButtonFechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonFecharMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonFecharMouseExited(evt);
            }
        });
        jButtonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharActionPerformed(evt);
            }
        });
        jPanelFundo.add(jButtonFechar);
        jButtonFechar.setBounds(760, 0, 20, 30);

        jButtonMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/MinimizarPreto.png"))); // NOI18N
        jButtonMinimizar.setToolTipText("Minimizar");
        jButtonMinimizar.setBorderPainted(false);
        jButtonMinimizar.setContentAreaFilled(false);
        jButtonMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonMinimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonMinimizarMouseExited(evt);
            }
        });
        jButtonMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMinimizarActionPerformed(evt);
            }
        });
        jPanelFundo.add(jButtonMinimizar);
        jButtonMinimizar.setBounds(700, 0, 40, 30);
        jPanelFundo.add(jSeparator2);
        jSeparator2.setBounds(0, 520, 800, 10);

        jLabelFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/noImage.png"))); // NOI18N
        jPanelFundo.add(jLabelFoto);
        jLabelFoto.setBounds(580, 330, 140, 130);

        jTextFielPathFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFielPathFotoActionPerformed(evt);
            }
        });
        jPanelFundo.add(jTextFielPathFoto);
        jTextFielPathFoto.setBounds(520, 530, 250, 40);

        jButtonFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/cameraPreta.png"))); // NOI18N
        jButtonFoto.setContentAreaFilled(false);
        jButtonFoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonFotoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonFotoMouseExited(evt);
            }
        });
        jButtonFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFotoActionPerformed(evt);
            }
        });
        jPanelFundo.add(jButtonFoto);
        jButtonFoto.setBounds(540, 450, 40, 40);
        jPanelFundo.add(jSeparator3);
        jSeparator3.setBounds(0, 110, 800, 10);

        getContentPane().add(jPanelFundo);
        jPanelFundo.setBounds(0, 0, 800, 600);

        setSize(new java.awt.Dimension(798, 589));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        String categoria = jComboBoxCategoria.getSelectedItem().toString();
        int dia = Integer.parseInt((String) jComboBoxDia.getSelectedItem());
        int mes = Integer.parseInt((String) jComboBoxMes.getSelectedItem());
        int ano = Integer.parseInt((String) jComboBoxAno.getSelectedItem());
        String nome = jTextFieldNomeItem.getText();
        String cor = jComboBoxCor.getSelectedItem().toString();
        String path = jTextFielPathFoto.getText();
        String idDoc = jTextFieldDocumento.getText();
        String descricao = jTextAreaDescricao.getText();
        SGBD mybd = new SGBD();
        System.out.println(mybd.statusConection());
        mybd.getConexaoMySQL();

        ResultSet rsNome = mybd.consultarItemBd("select idNome from nomeitem where nome like \"" + nome + "\";");
        ResultSet rsCategoria = mybd.consultarItemBd("select idCategoria from categoria where nomeCat like \"" + categoria + "\";");
        ResultSet rsCor = mybd.consultarItemBd("select idCor from cor where nomeCor like \"" + cor + "\";");
        ResultSet rsData = mybd.consultarItemBd("select idData from data where idDia like \"" + dia + "\" "
                + "and idMes like \"" + mes + "\" and idAno like \"" + ano + "\"; ");
        String corId = "";
        int nomeId = 0;
        String categoriaId = "";
        int dataId = 0;
        try {
            categoriaId = rsCategoria.getString("idCategoria");
            corId = rsCor.getString("idCor");
            nomeId = Integer.parseInt(rsNome.getString("idNome"));
            dataId = Integer.parseInt(rsData.getString("idData"));
        } catch (SQLException ex) {
            Logger.getLogger(CadastrarItem.class.getName()).log(Level.SEVERE, null, ex);
        }

        //if (rsNome == null) {
        //     mybd.inserirItemBd("Insert into nomeitem (nome, idCategoria) "
        //             + "Values(\"" + nome + "\", \"" + categoriaId + "\";)");
        // }
        mybd.alterarItemBd("insert into item (idCor, idDoc, idNome, idAdm, idDataEntrada, idDataSaida, retiradoItem, fotoItem, descricaoItem )"
                + "values(\"" + corId + "\", 0, \"" + nomeId + "\", 1, \"" + dataId + "\" , 1, 0, \""+path+"\", \"" + descricao + "\" );");
        JOptionPane.showMessageDialog(null, "" + nome + " cadastrado com sucesso!!");
        mybd.fecharConexao();
        janelaControl.dispose();
        TelaPrincipal telaPrincipal = new TelaPrincipal();
        telaPrincipal.mostrar();
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jComboBoxCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCategoriaActionPerformed
        Object item = jComboBoxCategoria.getSelectedItem();
        String itemName = item.toString();
        popularComboBoxNome("select distinct nomeItem.nome "
                + "from item, nomeItem, categoria "
                + "where nomeItem.idNome = item.idNome and "
                + "nomeItem.idCategoria = categoria.idCategoria and "
                + "categoria.nomeCat like \""
                + itemName
                + "\";");

        // jComboBoxNome.setModel(defaultComboBoxNome);
    }//GEN-LAST:event_jComboBoxCategoriaActionPerformed

    private void jComboBoxDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxDiaActionPerformed

    private void jComboBoxMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxMesActionPerformed

    private void jTextFieldDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDocumentoActionPerformed

    private void jComboBoxCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCorActionPerformed

    private void jButtonVoltarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonVoltarMouseEntered
        jButtonVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/VoltarAzul.png")));
    }//GEN-LAST:event_jButtonVoltarMouseEntered

    private void jButtonVoltarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonVoltarMouseExited
        jButtonVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/VoltarPreto.png")));
    }//GEN-LAST:event_jButtonVoltarMouseExited

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        janelaControl.dispose();
        TelaPrincipal telaPrincipal = new TelaPrincipal();
        telaPrincipal.mostrar();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jButtonFecharMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonFecharMouseEntered
        jButtonFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/FecharAzul.png")));
    }//GEN-LAST:event_jButtonFecharMouseEntered

    private void jButtonFecharMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonFecharMouseExited
        jButtonFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/FecharPreto.png")));
    }//GEN-LAST:event_jButtonFecharMouseExited

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonFecharActionPerformed

    private void jButtonMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonMinimizarMouseEntered
        jButtonMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/MinimizarAzul.png")));
    }//GEN-LAST:event_jButtonMinimizarMouseEntered

    private void jButtonMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonMinimizarMouseExited
        jButtonMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/MinimizarPreto.png")));
    }//GEN-LAST:event_jButtonMinimizarMouseExited

    private void jButtonMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinimizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonMinimizarActionPerformed

    private void jButtonCadastrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCadastrarMouseEntered
        jButtonCadastrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(000, 191, 255)));
        jButtonCadastrar.setForeground(new java.awt.Color(000, 191, 255));
    }//GEN-LAST:event_jButtonCadastrarMouseEntered

    private void jButtonCadastrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCadastrarMouseExited
        jButtonCadastrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonCadastrar.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_jButtonCadastrarMouseExited

    private void jTextFielPathFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFielPathFotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFielPathFotoActionPerformed

    private void jButtonFotoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonFotoMouseEntered
        jButtonFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/cameraAzul.png")));
    }//GEN-LAST:event_jButtonFotoMouseEntered

    private void jButtonFotoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonFotoMouseExited
        jButtonFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/cameraPreta.png")));
    }//GEN-LAST:event_jButtonFotoMouseExited

    private void jButtonFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFotoActionPerformed
        JFileChooser arquivo = new JFileChooser();
        arquivo.setDialogTitle("selecione uma foto");
        arquivo.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int opc = arquivo.showOpenDialog(this);
        if (opc == JFileChooser.APPROVE_OPTION) {
            File file = new File("Caminho");
            file = arquivo.getSelectedFile();
            String filename = file.getAbsolutePath();
            jTextFielPathFoto.setText(filename);
            ImageIcon imagem = new ImageIcon(arquivo.getSelectedFile().getPath());
            jLabelFoto.setIcon(new ImageIcon(imagem.getImage().getScaledInstance(jLabelFoto.getWidth(), jLabelFoto.getHeight(), Image.SCALE_DEFAULT)));
        }
    }//GEN-LAST:event_jButtonFotoActionPerformed

    private void jTextFieldNomeItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeItemActionPerformed
    
    

    private static void popularComboBoxNome(String sql) {
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
            while (rs.next()) {
                nome = rs.getString("nome");
                strList.add(nome);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
        }

        defaultComboBoxNome = new DefaultComboBoxModel(strList.toArray());

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
            java.util.logging.Logger.getLogger(CadastrarItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CadastrarItem cadastrarItem = new CadastrarItem();
                cadastrarItem.setVisible(true);
                janelaControl = cadastrarItem;
            }
        });
    }

    private static void popularComboBoxCategoria() {
        SGBD mybd = new SGBD();

        mybd.getConexaoMySQL();
        ArrayList strList = new ArrayList();
        System.out.println(mybd.statusConection());

        ResultSet rs = mybd.consultarItemBd("select distinct categoria.nomeCat "
                + "from nomeItem, item, categoria "
                + "where item.idNome = nomeItem.idNome and "
                + "nomeItem.idCategoria = categoria.idCategoria;");

        String nome;
        strList.add("Todas");
        try {
            rs.beforeFirst();
            while (rs.next()) {
                nome = rs.getString("nomeCat");
                strList.add(nome);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
        }

        defaultComboBoxCategoria = new DefaultComboBoxModel(strList.toArray());

        mybd.fecharConexao();

    }

    private static void popularComboBoxDia() {
        SGBD mybd = new SGBD();

        mybd.getConexaoMySQL();
        ArrayList strList = new ArrayList();
        System.out.println(mybd.statusConection());

        ResultSet rs = mybd.consultarItemBd("SELECT * FROM dia");

        String nome;
        strList.add("Dia");
        try {
            rs.isFirst();
            while (rs.next()) {
                nome = rs.getString(1);
                strList.add(nome);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
        }

        defaultComboBoxDia = new DefaultComboBoxModel(strList.toArray());

        mybd.fecharConexao();

    }

    private static void popularComboBoxMes() {
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
            while (rs.next()) {
                nome = rs.getString(1);
                strList.add(nome);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
        }

        defaultComboBoxMes = new DefaultComboBoxModel(strList.toArray());

        mybd.fecharConexao();

    }

    private static void popularComboBoxAno() {
        SGBD mybd = new SGBD();

        mybd.getConexaoMySQL();
        ArrayList strList = new ArrayList();
        System.out.println(mybd.statusConection());

        ResultSet rs = mybd.consultarItemBd("SELECT * FROM ano");

        String nome;
        strList.add("Ano");
        try {
            rs.isFirst();
            while (rs.next()) {
                nome = rs.getString(1);
                strList.add(nome);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
        }

        defaultComboBoxAno = new DefaultComboBoxModel(strList.toArray());

        mybd.fecharConexao();

    }

    private static void popularComboBoxCor() {
        SGBD mybd = new SGBD();

        mybd.getConexaoMySQL();
        ArrayList strList = new ArrayList();
        System.out.println(mybd.statusConection());

        ResultSet rs = mybd.consultarItemBd("select nomeCor from cor");

        String nome;
        strList.add("Cor");
        try {
            rs.isFirst();
            while (rs.next()) {
                nome = rs.getString(1);
                strList.add(nome);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
        }

        defaultComboBoxCor = new DefaultComboBoxModel(strList.toArray());

        mybd.fecharConexao();

    }

    private static void popularComboBoxNumero() {
        SGBD mybd = new SGBD();

        mybd.getConexaoMySQL();
        ArrayList strList = new ArrayList();
        System.out.println(mybd.statusConection());

        ResultSet rs = mybd.consultarItemBd("SELECT item.idDoc "
                + "FROM item, nomeItem, categoria "
                + "WHERE item.idNome  = nomeItem.idNome and "
                + "nomeItem.idCategoria  = categoria.idCategoria and  "
                + "categoria.idCategoria like \"e\";");

        int numero;
        strList.add("Selecione");

        defaultComboBoxNumero = new DefaultComboBoxModel(strList.toArray());

        mybd.fecharConexao();

    }

    private static void dataEntrada(int dia, int mes, int ano) {
        SGBD mybd = new SGBD();

        mybd.getConexaoMySQL();
        ArrayList strList = new ArrayList();
        System.out.println(mybd.statusConection());

        ResultSet rs = mybd.consultarItemBd("SELECT idDataEntrada from dataEntrada"
                + "where idData = (select idData from data"
                + " where idDia = \"" + dia + "\" AND idMes = \"" + mes + "\" AND idAno = \"" + ano + "\")  "
                + "(`nome`, `idCategoria`)"
                + "  );");

        mybd.fecharConexao();

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonFoto;
    private javax.swing.JButton jButtonMinimizar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JComboBox<String> jComboBoxAno;
    private javax.swing.JComboBox<String> jComboBoxCategoria;
    private javax.swing.JComboBox<String> jComboBoxCor;
    private javax.swing.JComboBox<String> jComboBoxDia;
    private javax.swing.JComboBox<String> jComboBoxMes;
    private javax.swing.JLabel jLabelCadastrar1;
    private javax.swing.JLabel jLabelCategoria;
    private javax.swing.JLabel jLabelCor;
    private javax.swing.JLabel jLabelDataDescricao;
    private javax.swing.JLabel jLabelDataPerda;
    private javax.swing.JLabel jLabelDoc;
    private javax.swing.JLabel jLabelFindesk;
    private javax.swing.JLabel jLabelFoto;
    private javax.swing.JLabel jLabelNomeItem;
    private javax.swing.JPanel jPanelFundo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextArea jTextAreaDescricao;
    private javax.swing.JTextField jTextFielPathFoto;
    private javax.swing.JTextField jTextFieldDocumento;
    private javax.swing.JTextField jTextFieldNomeItem;
    // End of variables declaration//GEN-END:variables

}
