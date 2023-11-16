/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author maria
 */
public class Conexao {
    final private String driver = "com.mysql.cj.jdbc.Driver";
    final private String url = "jdbc:mysql://localhost/sistemamedico";
    final private String usuario = "root";
    final private String senha = "";
    private Connection conexao;
    private PreparedStatement preparedStatement;
    public ResultSet resultset; // Declarando o resultset como um campo da classe

    public boolean conecta() throws SQLException {
        boolean result = true;
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, usuario, senha);
            JOptionPane.showMessageDialog(null, "Conectou com o Banco");
        } catch (ClassNotFoundException Driver) {
            JOptionPane.showMessageDialog(null, "Driver n�o localizado" + Driver, "Mensagem do programa", JOptionPane.ERROR_MESSAGE);
            result = false;
        } catch (SQLException Fonte) {
            JOptionPane.showMessageDialog(null, "Fonte de dados n�o localizada!" + Fonte, "Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
            result = false;
        }
        return result;
    }
 
    public void desconecta() {
        try {
            if (conexao != null) {
                conexao.close();
                JOptionPane.showMessageDialog(null, "Conex�o com o banco fechada", "Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException fecha) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar o banco", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void executaSQL(String sql, Object... parametros) {
        try {
            preparedStatement = conexao.prepareStatement(sql);

            // Substitui os par�metros na query
            for (int i = 0; i < parametros.length; i++) {
                preparedStatement.setObject(i + 1, parametros[i]);
            }

            resultset = preparedStatement.executeQuery();
        } catch (SQLException excecao) {
            JOptionPane.showMessageDialog(null, "Erro no comando SQL! \n Erro: " + excecao, "Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
}
