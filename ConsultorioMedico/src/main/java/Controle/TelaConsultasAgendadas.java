/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controle;

import java.awt.BorderLayout;
import java.awt.Container;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author maria
 */

public class TelaConsultasAgendadas extends JFrame {
    private JTable tabelaConsultas;
    private JScrollPane scrollPane;

    public TelaConsultasAgendadas() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Consultas Agendadas");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // Configurando o ícone (substitua pelo caminho do seu ícone)
        ImageIcon icone = new ImageIcon("caminho/do/seu/icone.png");
        setIconImage(icone.getImage());

        Vector<Vector<String>> dados = buscarDadosDoBanco();

        Vector<String> colunas = new Vector<>();
        colunas.add("Nome Paciente");
        colunas.add("Especialidade");
        colunas.add("Médico");
        colunas.add("Data Consulta");
        colunas.add("Horário Consulta");
        colunas.add("Email");

        DefaultTableModel model = new DefaultTableModel(dados, colunas);
        tabelaConsultas = new JTable(model);
        tabelaConsultas.setAutoCreateRowSorter(true);

        scrollPane = new JScrollPane(tabelaConsultas);

        Container tela = getContentPane();
        tela.setLayout(new BorderLayout());
        tela.add(scrollPane, BorderLayout.CENTER);

        JButton btnAtualizar = new JButton("Atualizar Tabela");
        btnAtualizar.addActionListener(e -> atualizarTabela());
        tela.add(btnAtualizar, BorderLayout.SOUTH);

        setVisible(true);
    }

    private Vector<Vector<String>> buscarDadosDoBanco() {
        Vector<Vector<String>> dados = new Vector<>();

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/sistemamedico", "root", "");

            String query = "SELECT nome_paciente, especialidade, nome_medico, data_consulta, horario_consulta, email FROM agendamento";
            try (PreparedStatement statement = connection.prepareStatement(query);
                 ResultSet resultSet = statement.executeQuery()) {

                while (resultSet.next()) {
                    Vector<String> linha = new Vector<>();
                    linha.add(resultSet.getString("nome_paciente"));
                    linha.add(resultSet.getString("especialidade"));
                    linha.add(resultSet.getString("nome_medico"));
                    linha.add(resultSet.getString("data_consulta"));
                    linha.add(resultSet.getString("horario_consulta"));
                    linha.add(resultSet.getString("email"));
                    dados.add(linha);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao buscar dados do banco de dados.",
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }

        return dados;
    }
  
    void atualizarTabela() {
        DefaultTableModel model = (DefaultTableModel) tabelaConsultas.getModel();
        model.setRowCount(0); // Limpa todas as linhas da tabela

        Vector<Vector<String>> novosDados = buscarDadosDoBanco();
        for (Vector<String> linha : novosDados) {
            model.addRow(linha);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TelaConsultasAgendadas());
    }
}