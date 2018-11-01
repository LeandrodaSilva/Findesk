
package bancodados;

import java.sql.*;
import javax.swing.*;
import java.util.Vector;

public class AcessaBD extends java.awt.Frame {
    
    private Connection connection = null;
    private Statement stdados = null;
    private ResultSet rsdados = null;
    //private JTable tabela1 = null;
    //private JScrollPane scroller1 = null;

    public AcessaBD() {
        initComponents();
        
    }
    
    public AcessaBD(int i) {
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        labelid = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        label6 = new java.awt.Label();
        labelnome = new java.awt.Label();
        labelidade = new java.awt.Label();
        labelemail = new java.awt.Label();
        labelfone = new java.awt.Label();
        button2 = new java.awt.Button();
        button3 = new java.awt.Button();
        button4 = new java.awt.Button();
        button5 = new java.awt.Button();
        textArea1 = new java.awt.TextArea();
        button1 = new java.awt.Button();
        button6 = new java.awt.Button();
        button7 = new java.awt.Button();
        button8 = new java.awt.Button();
        button9 = new java.awt.Button();
        button10 = new java.awt.Button();
        scroller = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();

        setTitle("Acessando Banco de Dados");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });
        setLayout(null);

        label1.setText("Id:");
        add(label1);
        label1.setBounds(30, 80, 20, 19);

        labelid.setName("labelid"); // NOI18N
        add(labelid);
        labelid.setBounds(50, 80, 100, 19);

        label3.setText("nome:");
        add(label3);
        label3.setBounds(30, 110, 43, 19);

        label4.setText("Idade:");
        add(label4);
        label4.setBounds(30, 140, 43, 19);

        label5.setText("fone:");
        add(label5);
        label5.setBounds(260, 140, 36, 19);

        label6.setText("e-mail:");
        add(label6);
        label6.setBounds(30, 170, 45, 19);

        labelnome.setName("labelnome"); // NOI18N
        add(labelnome);
        labelnome.setBounds(80, 110, 270, 19);

        labelidade.setName("labelidade"); // NOI18N
        add(labelidade);
        labelidade.setBounds(80, 140, 140, 19);

        labelemail.setName("labelemail"); // NOI18N
        add(labelemail);
        labelemail.setBounds(80, 170, 270, 19);

        labelfone.setName("labelfone"); // NOI18N
        add(labelfone);
        labelfone.setBounds(300, 140, 150, 20);

        button2.setLabel("Primeiro");
        button2.setName("btnprimeiro"); // NOI18N
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        add(button2);
        button2.setBounds(120, 40, 67, 23);

        button3.setLabel("Próximo");
        button3.setName("btnproximo"); // NOI18N
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });
        add(button3);
        button3.setBounds(260, 40, 65, 23);

        button4.setLabel("Anterior");
        button4.setName("btnanterior"); // NOI18N
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });
        add(button4);
        button4.setBounds(190, 40, 66, 23);

        button5.setLabel("Último");
        button5.setName("btnultimo"); // NOI18N
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });
        add(button5);
        button5.setBounds(330, 40, 60, 23);

        textArea1.setText("SELECT * from clientes order by idade");
        add(textArea1);
        textArea1.setBounds(10, 200, 490, 80);

        button1.setLabel("Abre BD");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        add(button1);
        button1.setBounds(10, 290, 70, 23);

        button6.setLabel("Executa Consulta");
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });
        add(button6);
        button6.setBounds(390, 290, 110, 23);

        button7.setLabel("mostra tabela");
        button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button7ActionPerformed(evt);
            }
        });
        add(button7);
        button7.setBounds(90, 290, 90, 23);

        button8.setLabel("Update");
        button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button8ActionPerformed(evt);
            }
        });
        add(button8);
        button8.setBounds(190, 290, 62, 23);

        button9.setLabel("Commit");
        button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button9ActionPerformed(evt);
            }
        });
        add(button9);
        button9.setBounds(250, 290, 62, 23);

        button10.setLabel("Rollback");
        button10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button10ActionPerformed(evt);
            }
        });
        add(button10);
        button10.setBounds(320, 290, 68, 23);

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scroller.setViewportView(tabela);

        add(scroller);
        scroller.setBounds(10, 320, 500, 160);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-529)/2, (screenSize.height-536)/2, 529, 536);
    }// </editor-fold>//GEN-END:initComponents

    private void button10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button10ActionPerformed
        try {
            connection.rollback();
        } catch (SQLException erro) {
            System.out.println("Erro Roolback = " + erro);
        }
    }//GEN-LAST:event_button10ActionPerformed
    
    private void button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button9ActionPerformed
        try {
            connection.commit();
        } catch (SQLException erro) {
            System.out.println("Erro commit = " + erro);
        }
    }//GEN-LAST:event_button9ActionPerformed
    
    private void button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button8ActionPerformed
        ExecutaUpdade();
    }//GEN-LAST:event_button8ActionPerformed
    
    private void button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button7ActionPerformed
        try {
            ExibeTabela(rsdados);
        } catch (SQLException erro) {
            System.out.println("Erro Exibe Tabela = " + erro);
        }
    }//GEN-LAST:event_button7ActionPerformed
    
    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
        ExecutaQuery();
    }//GEN-LAST:event_button6ActionPerformed
    
    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        if (AcessaBD()) {
            ExecutaQuery();
            ExibeRegistro(rsdados);
        }
    }//GEN-LAST:event_button1ActionPerformed
    
    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        MovAnterior(rsdados);
    }//GEN-LAST:event_button4ActionPerformed
    
    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        MovProximo(rsdados);
    }//GEN-LAST:event_button3ActionPerformed
    
    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        MovUltimo(rsdados);
    }//GEN-LAST:event_button5ActionPerformed
    
    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        MovPrimeiro(rsdados);
    }//GEN-LAST:event_button2ActionPerformed
    
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        Sair();
        System.exit(0);
    }//GEN-LAST:event_exitForm
    
    public void MovProximo(ResultSet rs) {
        try {
            if (rsdados != null) {
                if (!rsdados.isLast()) {
                    rsdados.next();
                    ExibeRegistro(rs);
                } else {
                    JOptionPane.showMessageDialog(this, "Nao existe proximo elemento.");
                }
            }
        } catch (Exception erro) {
            System.out.println(erro);
        }
    }
    
    public void MovAnterior(ResultSet rs) {
        try {
            if (rsdados != null) {
                if (!rsdados.isFirst()) {
                    rsdados.previous();
                    ExibeRegistro(rs);
                } else {
                    JOptionPane.showMessageDialog(this, "Nao existe registro anterior.");
                }
            }
        } catch (Exception erro) {
            System.out.println(erro);
        }
    }
    
    public void MovUltimo(ResultSet rs) {
        try {
            if (rsdados != null) {
                if (!rsdados.isLast()) {
                    rsdados.last();
                    ExibeRegistro(rs);
                } else {
                    JOptionPane.showMessageDialog(this, "O ultimo registro ja esta selecionado.");
                }
            }
        } catch (Exception erro) {
            System.out.println(erro);
        }
    }
    
    public void MovPrimeiro(ResultSet rs) {
        try {
            if (rsdados != null) {
                if (!rsdados.isFirst()) {
                    rsdados.first();
                    ExibeRegistro(rs);
                } else {
                    JOptionPane.showMessageDialog(this, "O primeiro registro ja esta selecionado.");
                }
            }
        } catch (Exception erro) {
            System.out.println(erro);
        }
    }
    
    public void ExibeRegistro(ResultSet rs) {
        try {
            //faz a leitura do registro corrento do ResutSet e atribui os valores lidos aos objetos visuais (Textfields)
            labelid.setText(String.valueOf(rs.getInt("id")));
            labelnome.setText(rs.getString("nome"));
            labelidade.setText(String.valueOf(rs.getInt("idade")));
            labelfone.setText(rs.getString("fone"));
            labelemail.setText(rs.getString("email"));
        } catch (Exception erro) {
            System.out.println(erro);
        }
    }
    
    public boolean AcessaBD() {
        /*As 7 linhas a seguir sao necessarias apenas se for usado escolha do banco em tempo de execucao (linha 369)*/
        /*
        String pastainicial = System.getProperty("user.dir").toString();
        JFileChooser fileChooser = new JFileChooser(pastainicial);
        fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        System.out.println(this.getLocale());
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.CANCEL_OPTION){return false;}
        File arquivo = fileChooser.getSelectedFile();
         */
        
        try {
            String usuario = "postgres";
            String senha = "123456";
            
            Class.forName("org.postgresql.Driver");  //para acesso ao banco de dados Postgre
            String urlconexao = "jdbc:postgresql://localhost:5432/bancodados"; //para acesso ao banco de dados fabricio, usando o banco de dados Postgre.

            //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");//ODBC DRIVER
            //String urlconexao = "jdbc:odbc:Driver={MicroSoft Access Driver (*.mdb)};DBQ="+arquivo.getAbsolutePath(); //para criar o DSN em tempo de execucao do Access
            //ou
            //String urlconexao = "jdbc:odbc:aulajava"; //para acessar usando um DSN j� existente no ODBC

            //Class.forName("org.hsqldb.jdbcDriver");//hypersonicSQL DRIVER
            //String urlconexao = "jdbc:hsqldb:C:/dados/dbexper";//para acesso ao banco dbexper usando o banco HypersonicSQL (http://www.hsqldb.org/)

            connection = DriverManager.getConnection(urlconexao, usuario, senha);
            connection.setAutoCommit(false);//configuracao necessaria para confirmacao ou nao de alteracoes no banco de dados.

        } catch (ClassNotFoundException erro) {
            System.out.println("Falha ao carregar o driver JDBC/ODBC." + erro);
            return false;
        } catch (SQLException erro) {
            System.out.println("Falha na conexao, comando sql = " + erro);
            return false;
        }
        return true;
    }
    
    public void ExecutaUpdade() {
        try {
            String querydados = textArea1.getText();
            int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;//(c)
            //a) ResultSet.TYPE_FORWARD_ONLY = O conjunto de dados nao eh rolavel, isto e, soh anda para frente uma unica vez.
            //b) ResultSet.TYPE_SCROLL_INSENSITIVE = O conjunto de dados eh rolavel, mas nao eh sensivel as alteracoes do banco de dados.
            //c) ResultSet.TYPE_SCROLL_SENSITIVE = O conjunto de dados eh rolavel sendo sensivel as alteracoes do banco de dados.

            int concorrencia = ResultSet.CONCUR_UPDATABLE;
            //ResultSet.CONCUR_READ_ONLY => O conjunto de resultados nao pode ser usado para atualizar o banco de dados.
            //ResultSet.CONCUR_UPDATABLE tabela => O conjunto de resultados pode ser usado para atualizar o banco de dados.

            //stdados.execute("SET SEARCH_PATH TO nome_esquema");//necessario para selecionar o esquema no banco de dados Postgre.
            //ou se utiliza o nome do esquema.nomedatabela

            stdados = connection.createStatement(tipo, concorrencia);
            //connection.prepareStatement(sql)
            int resposta = stdados.executeUpdate(querydados);//DML
            //boolean resposta = stdados.execute(querydados);//DDL
            //rsdados = stdados.executeQuery(querydados);//DQL
            System.out.println("Resposta do Update = " + resposta);
        } catch (SQLException erro) {
            System.out.println("Erro Executa Update = " + erro);
        }
    }
    
    public void ExecutaQuery() {
        try {
            String querydados = textArea1.getText();
            int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
            //ResultSet.TYPE_FORWARD_ONLY = O conjunto de dados nao � rol�vel, isto �, s� anda para frente uma �nica vez.
            //ResultSet.TYPE_SCROLL_INSENSITIVE = O conjunto de dados � rol�vel, mas nao � sens�vel �s altera�oes do banco de dados.
            //ResultSet.TYPE_SCROLL_SENSITIVE = O conjunto de dados � rol�vel e � sens�vel �s altera�oes do banco de dados.
            int concorrencia = ResultSet.CONCUR_READ_ONLY;
            //ResultSet.CONCUR_READ_ONLY = O conjunto de resultados nao pode ser usado para atualizar o banco de dados.
            //ResultSet.CONCUR_UPDATABLE = O conjunto de resultados pode ser usado para atualizar o banco de dados.
            stdados = connection.createStatement(tipo, concorrencia);
            //stdados.execute("SET SEARCH_PATH TO nome_esquema");//necessario para selecionar o esquema no banco de dados Postgre.
            //ou se utiliza o nome do esquema.nomedatabela
            rsdados = stdados.executeQuery(querydados);
            //stdados.executeQuery = retorna um resultSet
            MovPrimeiro(rsdados);
        } catch (SQLException erro) {
            System.out.println("Erro Executa Query = " + erro);
        }
    }
    
    public void Sair() {
        try {
            if (rsdados != null) {
                rsdados.close();
                stdados.close();
                connection.close();
            }
        } catch (SQLException erro) {
            System.out.println("Nao foi possivel a desconexao." + erro);
        }
    }
    
    private void ExibeTabela(ResultSet rs) throws SQLException {
        if (!rs.first()) {// Se nao houver registros, exibe uma mensagem e termina a execucao do metodo
            JOptionPane.showMessageDialog(this, "O ResultSet esta vazio.");
            return;
        }
        
        final Vector cabecalhos = new Vector();
        final Vector registros = new Vector();
        //comentario sobre a classe Vector

        try {
            // obtem titulos de coluna
            ResultSetMetaData rsmd = rs.getMetaData();
            for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                cabecalhos.addElement(rsmd.getColumnName(i));
            }
            // obtem dados da linha
            do {
                registros.addElement(ProximoRegistro(rs, rsmd));
            } while (rs.next());
            
            if (tabela != null) {
                remove(tabela);
                remove(scroller);
            }
            tabela = new JTable(registros, cabecalhos);
            // exibe a tabela com conteudos de ResultSet
            scroller = new JScrollPane(tabela);
            add(scroller);
            scroller.setBounds(10, 330, 490, 180);
            validate();
            this.repaint();
        } catch (SQLException erro) {
            System.out.println("Erro Exibe Tabela = " + erro);
        }
    }
    
    private Vector ProximoRegistro(ResultSet rs, ResultSetMetaData rsmd) throws SQLException {
        Vector registro = new Vector();
        for (int i = 1; i <= rsmd.getColumnCount(); i++) {
            //A classe Types eh uma classo do pacote java.sql
            if (rsmd.getColumnType(i) == Types.VARCHAR
                    || rsmd.getColumnClassName(i).equalsIgnoreCase("java.lang.String")) {//para string
                registro.addElement(rs.getString(i));
            } else if (rsmd.getColumnType(i) == Types.INTEGER) {//para inteiros
                registro.addElement(new Long(rs.getLong(i)));
            } else {
                //tratamento para os tipos que serao lidos do banco de dados.
            }
        }
        return registro;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Button button10;
    private java.awt.Button button2;
    private java.awt.Button button3;
    private java.awt.Button button4;
    private java.awt.Button button5;
    private java.awt.Button button6;
    private java.awt.Button button7;
    private java.awt.Button button8;
    private java.awt.Button button9;
    private java.awt.Label label1;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label labelemail;
    private java.awt.Label labelfone;
    private java.awt.Label labelid;
    private java.awt.Label labelidade;
    private java.awt.Label labelnome;
    private javax.swing.JScrollPane scroller;
    private javax.swing.JTable tabela;
    private java.awt.TextArea textArea1;
    // End of variables declaration//GEN-END:variables

    public static void main(String[] args) {
        new AcessaBD().show();
    }
}
