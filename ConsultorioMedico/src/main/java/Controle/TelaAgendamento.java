/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controle;

import Conexao.Conexao;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author maria
 */
public class TelaAgendamento extends JFrame {
    private JTextField tfNomePaciente;
    private JComboBox<String> cbEspecialidade;
    private JComboBox<String> cbNomeMedico;
    private JTextField tfDataConsulta;
    private JComboBox<String> cbHorarioConsulta;
    private JTextField tfEmail;
    private JPasswordField pfSenha;
    private JButton btnAgendarConsulta;

    // Simule alguns dados de exemplo
    private String[] especialidades = {"Cardiologia", "Dermatologia", "Ginecologia", "Oftalmologia"};
    private String[] medicos = {"Dr. Silva", "Dra. Santos", "Dr. Oliveira", "Dra. Pereira"};
    private String[] horarios = {"08:00", "10:00", "14:00", "16:00"};

    public TelaAgendamento() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Agendamento de Consultas");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        Container tela = getContentPane();
        tela.setLayout(new GridLayout(8, 2, 10, 10));
        tela.setBackground(Color.WHITE);

        // Configurando o ícone
        ImageIcon icone = new ImageIcon("caminho/do/seu/icone.png");
        setIconImage(icone.getImage());

        JLabel lblNomePaciente = new JLabel("Nome do Paciente:");
        tfNomePaciente = new JTextField();

        JLabel lblEspecialidade = new JLabel("Especialidade:");
        cbEspecialidade = new JComboBox<>(especialidades);

        JLabel lblNomeMedico = new JLabel("Nome do Médico:");
        cbNomeMedico = new JComboBox<>(medicos);

        JLabel lblDataConsulta = new JLabel("Data da Consulta:");
        tfDataConsulta = new JTextField();
        tfDataConsulta.setText(obterDataAtual());

        JLabel lblHorarioConsulta = new JLabel("Horário da Consulta:");
        cbHorarioConsulta = new JComboBox<>(horarios);
        cbHorarioConsulta.setSelectedItem(obterHorarioAtual());

        JLabel lblEmail = new JLabel("Email:");
        tfEmail = new JTextField();

        JLabel lblSenha = new JLabel("Senha:");
        pfSenha = new JPasswordField();

        btnAgendarConsulta = new JButton("Agendar Consulta");
        btnAgendarConsulta.addActionListener((ActionEvent e) -> realizarAgendamento());

        tela.add(lblNomePaciente);
        tela.add(tfNomePaciente);
        tela.add(lblEspecialidade);
        tela.add(cbEspecialidade);
        tela.add(lblNomeMedico);
        tela.add(cbNomeMedico);
        tela.add(lblDataConsulta);
        tela.add(tfDataConsulta);
        tela.add(lblHorarioConsulta);
        tela.add(cbHorarioConsulta);
        tela.add(lblEmail);
        tela.add(tfEmail);
        tela.add(lblSenha);
        tela.add(pfSenha);
        tela.add(new JLabel()); // Espaço em branco
        tela.add(btnAgendarConsulta);

        setVisible(true);
    }

    private void realizarAgendamento() {
        // Implemente a lógica de agendamento aqui
        String nomePaciente = tfNomePaciente.getText();
        String especialidade = (String) cbEspecialidade.getSelectedItem();
        String nomeMedico = (String) cbNomeMedico.getSelectedItem();
        String dataConsulta = tfDataConsulta.getText();
        String horarioConsulta = (String) cbHorarioConsulta.getSelectedItem();
        String email = tfEmail.getText();
        char[] senha = pfSenha.getPassword();

        // Validar campos obrigatórios
        if (nomePaciente.isEmpty() || email.isEmpty() || senha.length == 0) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos obrigatórios.",
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Adicione a lógica para salvar o agendamento no banco de dados
        try {
            Conexao conexao = new Conexao();
            if (conexao.conecta()) {
                String inserirConsulta = "INSERT INTO consulta (nome_paciente, especialidade, nome_medico, "
                        + "data_consulta, horario_consulta, email, senha) VALUES (?, ?, ?, ?, ?, ?, ?)";
                
                conexao.executaSQL(inserirConsulta, nomePaciente, especialidade, nomeMedico,
                        dataConsulta, horarioConsulta, email, new String(senha));

                JOptionPane.showMessageDialog(this, "Consulta agendada com sucesso!");
                dispose(); // Fechar a janela após o agendamento
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao conectar ao banco de dados.",
                        "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao agendar consulta.",
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private String obterDataAtual() {
        return new SimpleDateFormat("DD/MM/YYYY").format("DD/MM/YYYY");
    }

    private String obterHorarioAtual() {
        Calendar cal = Calendar.getInstance();
        int hora = cal.get(Calendar.HOUR_OF_DAY);
        if (hora < 10) {
            return "08:00";
        } else if (hora < 14) {
            return "10:00";
        } else {
            return "14:00";
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new TelaAgendamento();
        });
    }
}