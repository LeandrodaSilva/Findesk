/*
 * AcessaBD2.java
 * Created on 30 de Maio de 2005
 * @author  fabricio@utfpr.edu.br
 */
package bancodados;

import java.sql.*;
import javax.swing.*;
import java.util.Vector;

public class AcessaBD2 extends java.awt.Frame {

    private Connection connection = null;
    private Statement stdados = null;
    private ResultSet rsdados = null;
    private JTable tabela = null;
    private JScrollPane scroller = null;
    private PreparedStatement pstdados = null;
    private CallableStatement cstdados = null;

    public AcessaBD2() {
        initComponents();
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
        textArea2 = new java.awt.TextArea();
        button11 = new java.awt.Button();
        button12 = new java.awt.Button();
        button13 = new java.awt.Button();
        button15 = new java.awt.Button();

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

        textArea1.setText("SELECT * from clientes order by idade desc");
        add(textArea1);
        textArea1.setBounds(10, 200, 500, 80);

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
        button6.setBounds(180, 290, 120, 23);

        button7.setLabel("mostra tabela");
        button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button7ActionPerformed(evt);
            }
        });
        add(button7);
        button7.setBounds(80, 290, 100, 23);

        button8.setLabel("Update");
        button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button8ActionPerformed(evt);
            }
        });
        add(button8);
        button8.setBounds(10, 420, 62, 23);

        button9.setLabel("Commit");
        button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button9ActionPerformed(evt);
            }
        });
        add(button9);
        button9.setBounds(180, 420, 62, 23);

        button10.setLabel("Rollback");
        button10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button10ActionPerformed(evt);
            }
        });
        add(button10);
        button10.setBounds(250, 420, 70, 23);

        textArea2.setText("insert into clientes (nome, fone, email, idade) values ('nome2', 'fone2', 'email2', 2)");
        add(textArea2);
        textArea2.setBounds(10, 330, 500, 80);

        button11.setLabel("P-Update");
        button11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button11ActionPerformed(evt);
            }
        });
        add(button11);
        button11.setBounds(80, 420, 90, 23);

        button12.setLabel("SP1");
        button12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button12ActionPerformed(evt);
            }
        });
        add(button12);
        button12.setBounds(330, 420, 50, 23);

        button13.setLabel("SP2");
        button13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button13ActionPerformed(evt);
            }
        });
        add(button13);
        button13.setBounds(390, 420, 50, 23);

        button15.setLabel("SP3");
        button15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button15ActionPerformed(evt);
            }
        });
        add(button15);
        button15.setBounds(450, 420, 60, 23);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-529)/2, (screenSize.height-605)/2, 529, 605);
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
        ExecutaUpdate();
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
            MovPrimeiro(rsdados);
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

    private void button11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button11ActionPerformed
        ExecutaPUpdate();
    }//GEN-LAST:event_button11ActionPerformed

    private void button12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button12ActionPerformed
        ExecutaStoredProcedure1();
    }//GEN-LAST:event_button12ActionPerformed

    private void button13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button13ActionPerformed
        ExecutaStoredProcedure2();
    }//GEN-LAST:event_button13ActionPerformed

    private void button15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button15ActionPerformed
        ExecutaStoredProcedure3();
    }//GEN-LAST:event_button15ActionPerformed

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
        try {
            String usuario = "postgres";
            String senha = "123456";

            Class.forName("org.postgresql.Driver");  //para acesso ao banco de dados Postgre
            String urlconexao = "jdbc:postgresql://127.0.0.1/Desktop"; //para acesso ao banco de dados fabricio, usando o banco de dados Postgre.
            connection = DriverManager.getConnection(urlconexao, usuario, senha);
            connection.setAutoCommit(false);//configuracao necessaria para confirmacao ou nao de alteracoes no banco de dados.
            DatabaseMetaData dbmt = connection.getMetaData();
            System.out.println("Nome do BD: " + dbmt.getDatabaseProductName());
            System.out.println("Versao do BD: " + dbmt.getDatabaseProductVersion());
            System.out.println("URL: " + dbmt.getURL());
            System.out.println("Driver: " + dbmt.getDriverName());
            System.out.println("Versao Driver: " + dbmt.getDriverVersion());
            System.out.println("Usuario: " + dbmt.getUserName());
        } catch (ClassNotFoundException erro) {
            System.out.println("Falha ao carregar o driver JDBC/ODBC." + erro);
            return false;
        } catch (SQLException erro) {
            System.out.println("Falha na conexao, comando sql = " + erro);
            return false;
        }
        return true;
    }

    public void ExecutaUpdate() {
        try {
            String sqldml = textArea2.getText();
            int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;//(c)
            int concorrencia = ResultSet.CONCUR_UPDATABLE;
            stdados = connection.createStatement(tipo, concorrencia);
            int resposta = stdados.executeUpdate(sqldml);
            //String sql = "create table, drop table. alter table";
            //stdados.execute(sql);
            System.out.println("Resposta do Update = " + resposta);
            JOptionPane.showMessageDialog(this, "Resposta do Update = " + resposta);
        } catch (SQLException erro) {
            System.out.println("Erro Executa Update = " + erro);
        }
    }

    public void ExecutaQuery() {
        try {
            String sqldql = textArea1.getText();
            int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;//(c)
            int concorrencia = ResultSet.CONCUR_UPDATABLE;
            stdados = connection.createStatement(tipo, concorrencia);
            rsdados = stdados.executeQuery(sqldql);
        } catch (SQLException erro) {
            System.out.println("Erro Executa Query = " + erro);
        }
    }

    public void ExecutaPUpdate() {
        try {
            String sqldml = "Insert into clientes (nome,fone,email,idade) "
                    + "values (?,?,?,?)";
            int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
            int concorrencia = ResultSet.CONCUR_UPDATABLE;
            pstdados = connection.prepareStatement(sqldml, tipo, concorrencia);
            String nome = JOptionPane.showInputDialog("Entre com o nome: ");
            pstdados.setString(1, nome);
            String fone = JOptionPane.showInputDialog("Entre com o fone: ");
            pstdados.setString(2, fone);
            String email = JOptionPane.showInputDialog("Entre com o e-mail: ");
            pstdados.setString(3, email);
            int idade = Integer.valueOf(JOptionPane.showInputDialog("Entre com a idade: "));
            pstdados.setInt(4, idade);
            int resposta = pstdados.executeUpdate();
            System.out.println("Resposta do P-Update = " + resposta);
            JOptionPane.showMessageDialog(this, "Resposta do P-Update = " + resposta);
        } catch (SQLException erro) {
            System.out.println("Erro Executa P-Update = " + erro);
        }
    }

    public void ExecutaStoredProcedure1() {
        try {
            int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;//(c)
            int concorrencia = ResultSet.CONCUR_UPDATABLE;
            cstdados = connection.prepareCall("{call consultaclientes()}", tipo, concorrencia);
            rsdados = cstdados.executeQuery();
        } catch (SQLException erro) {
            System.out.println("Erro Executa StoredProcedure = " + erro);
        }
    }

    public void ExecutaStoredProcedure2() {
        try {
            int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;//(c)
            int concorrencia = ResultSet.CONCUR_UPDATABLE;
            cstdados = connection.prepareCall("{call consultaidade(?)}", tipo, concorrencia);
            int idademinima = Integer.valueOf(JOptionPane.showInputDialog("Entre com a idade minima: ", 18));
            cstdados.setInt(1, idademinima);
            rsdados = cstdados.executeQuery();
        } catch (SQLException erro) {
            System.out.println("Erro Executa StoredProcedure2 = " + erro);
        } catch (NumberFormatException erro) {
            //usuario clicou no cancelar...
        }
    }

    public void ExecutaStoredProcedure3() {
        try {
            int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;//(c)
            int concorrencia = ResultSet.CONCUR_UPDATABLE;
            cstdados = connection.prepareCall("{call inserecliente(?,?,?,?)}", tipo, concorrencia);
            String nome = JOptionPane.showInputDialog("Entre com o nome: ");
            cstdados.setString(1, nome);
            int idade = Integer.valueOf(JOptionPane.showInputDialog("Entre com a idade: "));
            cstdados.setInt(2, idade);
            String fone = JOptionPane.showInputDialog("Entre com o fone: ");
            cstdados.setString(3, fone);
            String email = JOptionPane.showInputDialog("Entre com o e-mail: ");
            cstdados.setString(4, email);
            cstdados.executeUpdate();
        } catch (SQLException erro) {
            System.out.println("Erro Executa StoredProcedure2 = " + erro);
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
        Vector cabecalhos = new Vector();
        Vector registros = new Vector();
        if (!rs.first()) {
            atualizaTabela(cabecalhos, registros);
            JOptionPane.showMessageDialog(this, "O ResultSet esta vazio.");
            return;
        }
        try {
            //obtem as informacoes sobre o banco de dados.
            DatabaseMetaData dbmt = connection.getMetaData();
            System.out.println("Nome do BD: " + dbmt.getDatabaseProductName());

            // obtem titulos de coluna
            ResultSetMetaData rsmd = rs.getMetaData();
            for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                cabecalhos.addElement(rsmd.getColumnName(i));
            }
            // obtem dados da linha
            do {
                registros.addElement(ProximoRegistro(rs, rsmd));
            } while (rs.next());
            atualizaTabela(cabecalhos, registros);

        } catch (SQLException erro) {
            System.out.println("Erro Exibe Tabela = " + erro);
        }
    }

    public void atualizaTabela(Vector cabecalhos, Vector registros) {
        if (tabela != null) {
            remove(tabela);
            remove(scroller);
        }
        tabela = new JTable(registros, cabecalhos);
        // exibe a tabela com conteudos de ResultSet
        scroller = new JScrollPane(tabela);
        add(scroller);
        scroller.setBounds(10, 480, 500, 100);
        validate();
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
    private java.awt.Button button11;
    private java.awt.Button button12;
    private java.awt.Button button13;
    private java.awt.Button button15;
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
    private java.awt.TextArea textArea1;
    private java.awt.TextArea textArea2;
    // End of variables declaration//GEN-END:variables

    public static void main(String[] args) {
        new AcessaBD2().show();
    }
}
