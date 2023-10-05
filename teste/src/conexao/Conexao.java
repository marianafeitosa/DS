/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author dti
 */
public class Conexao {
    final private String driver = "com.mysql.cj.jdbc.Driver"; // definição do driver MySql para acesso aos dados
    //final private String url = "jdbc:mysql://localhost/clientes"; // acesso ao bd "clientes" no servidor (myAdmin)
    final private String url = "jdbc:mysql://127.0.0.1/clientes";
    final private String usuario = "root"; // usuário do MySql
    final private String senha = "usbw"; // senha do MySql
    private Connection conexao; //variável que armazenará a conexão aberta
    public Statement statement; // variável para  execução dos comandos SQL dentro do ambiete Java
    public ResultSet resultset; //variável que armazenará o resultado da execução de um comando sql
    
    
    public boolean conecta()
    {
        boolean result = true;
        try
        {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url,usuario,senha);
            JOptionPane.showMessageDialog(null,"Conexão estabelecida", "Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
        }catch(ClassNotFoundException Driver){
            JOptionPane.showMessageDialog(null,"Driver não localizado"+Driver, "Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
            result = false;
        }catch(SQLException Fonte){
            JOptionPane.showMessageDialog(null,"Fonte de dados não localizada!"+Fonte,"Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
            result = false;
        }
        return result;
    }
    
    public void desconecta()
    {
        try{
            conexao.close();
            JOptionPane.showMessageDialog(null, "Conexão com o banco fechada","Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        }catch(SQLException fecha){
            JOptionPane.showMessageDialog(null,"Erro ao fechar o banco", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void executaSQL(String sql)
    {
        try{
            statement = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            resultset = statement.executeQuery(sql);
        }catch (SQLException excecao){
            JOptionPane.showMessageDialog(null, "Erro no comando SQL! \n Erro: " + excecao,"Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
}
