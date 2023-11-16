/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controle;

import java.awt.BorderLayout;
import java.awt.Container;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;

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

        // Configurando o �cone (substitua pelo caminho do seu �cone)
        ImageIcon icone = new ImageIcon("caminho/do/seu/icone.png");
        setIconImage(icone.getImage());

        // Simulando dados de consultas agendadas (voc� deve buscar esses dados do banco de dados)
        Vector<Vector<String>> dados = new Vector<>();
        Vector<String> colunas = new Vector<>();
        colunas.add("Nome Paciente");
        colunas.add("Especialidade");
        colunas.add("M�dico");
        colunas.add("Data Consulta");
        colunas.add("Hor�rio Consulta");
        colunas.add("Email");

        // Adicione dados de exemplo (substitua pelos dados do banco)
        Vector<String> consulta1 = new Vector<>();
        consulta1.add("Jo�o Silva");
        consulta1.add("Cardiologia");
        consulta1.add("Dr. Oliveira");
        consulta1.add("2023-12-01");
        consulta1.add("08:00");
        consulta1.add("joao@email.com");

        Vector<String> consulta2 = new Vector<>();
        consulta2.add("Maria Santos");
        consulta2.add("Dermatologia");
        consulta2.add("Dra. Pereira");
        consulta2.add("2023-12-02");
        consulta2.add("10:00");
        consulta2.add("maria@email.com");

        dados.add(consulta1);
        dados.add(consulta2);

        tabelaConsultas = new JTable(dados, colunas);
        tabelaConsultas.setAutoCreateRowSorter(true);

        scrollPane = new JScrollPane(tabelaConsultas);

        Container tela = getContentPane();
        tela.setLayout(new BorderLayout());
        tela.add(scrollPane, BorderLayout.CENTER);

        setVisible(true);
    }
 
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TelaConsultasAgendadas());
    }
}
