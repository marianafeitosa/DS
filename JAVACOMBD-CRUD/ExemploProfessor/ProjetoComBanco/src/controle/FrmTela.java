package controle;

import conexao.Conexao; //importar do package conexao a classe Conexao
//importação das classes
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
 
public class FrmTela extends javax.swing.JFrame {
    
    Conexao con_cliente;
    
    /**
     * Creates new form NewJFrame
     */
    public FrmTela() {
        initComponents();
        con_cliente = new Conexao(); // inicialização do objeto como instancia 
        con_cliente.conecta(); //chama o método que conecta
        con_cliente.executaSQL("SELECT * FROM tbclientes ORDER BY COD"); //chama o método "executaSQL" e passa como parametro query SELECT
        preencherTabela();
        posicionarRegistro();
        tblClientes.setAutoCreateRowSorter(true); //ativa a classificação ordenada da tabela
        
        txtCodigo.disable();
    }
    
    public void preencherTabela(){
        int[] columnWidths = { 4, 100, 50, 50, 100 }; //vetor com as larguras preferenciais  desejadas das colunas na tabela tblClientes
        // Estrutura de repetição para definir a largura preferencial das colunas na tabela tblClientes
        for (int i = 0; i < columnWidths.length; i++) {
            tblClientes.getColumnModel().getColumn(i).setPreferredWidth(columnWidths[i]);
        }
        
        DefaultTableModel modelo = (DefaultTableModel) tblClientes.getModel(); // Obtendo o modelo da tabela para manipulação
        modelo.setNumRows(0); // Limpa todos os dados da tabela atual
        
        try{
            con_cliente.resultset.beforeFirst(); // Movendo o cursor do resultset para antes do primeiro item
            while(con_cliente.resultset.next()){ // Iterando sobre os resultados do resultset
                // Lendo os valores das colunas do resultset e atribuindo a variáveis
                String cod = con_cliente.resultset.getString("cod");
                String nome = con_cliente.resultset.getString("nome");
                String dataNascimento = con_cliente.resultset.getString("dt_nasc");
                String telefone = con_cliente.resultset.getString("telefone");
                String email = con_cliente.resultset.getString("email");
            
                // Adicionando uma nova linha à tabela com os valores das variáveis lidas
                modelo.addRow(new Object[]{cod, nome, dataNascimento, telefone, email});
            }
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "\nErro ao listar dados da tabela!  :\n"+erro, "Mensagem do Programa: ",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void posicionarRegistro(){
        try{
            con_cliente.resultset.first(); //posiciona o 1º registro da tabela
            mostrarDados(); //chama o método que irá buscar o dado da tabela
        }catch(SQLException erro){
             JOptionPane.showMessageDialog(null, "Não foi possível posicionar no primeiro registro: "+erro, "Mensagemos do programa: ", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void mostrarDados(){
        try{
            //associando a caixa de texto do JFRAME ao campo correspondente
            txtCodigo.setText(con_cliente.resultset.getString("cod"));
            txtNome.setText(con_cliente.resultset.getString("nome"));
            txtDataNascimento.setText(con_cliente.resultset.getString("dt_nasc"));
            txtTelefone.setText(con_cliente.resultset.getString("telefone"));
            txtEmail.setText(con_cliente.resultset.getString("email"));
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Não localizou os dados: "+erro, "Mensagemos do programa: ", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCodigo = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblDataNascimento = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtDataNascimento = new javax.swing.JFormattedTextField();
        txtTelefone = new javax.swing.JFormattedTextField();
        txtEmail = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        btnPrimeiroRegistro = new javax.swing.JButton();
        btnVoltarRegistro = new javax.swing.JButton();
        btnAvancarRegistro = new javax.swing.JButton();
        btnUltimoRegistro = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnAdicionar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtPesquisarNome = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblCodigo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblCodigo.setText("Código:");

        lblNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblNome.setText("Nome:");

        lblDataNascimento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblDataNascimento.setText("Data de Nascimento:");

        lblTelefone.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblTelefone.setText("Telefone:");

        lblEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblEmail.setText("Email:");

        try {
            txtDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataNascimentoActionPerformed(evt);
            }
        });

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtEmail.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        try {
            txtCodigo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        tblClientes.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Data Nascimento", "Telefone", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClientesMouseClicked(evt);
            }
        });
        tblClientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblClientesKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblClientes);

        btnPrimeiroRegistro.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnPrimeiroRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controle/First.png"))); // NOI18N
        btnPrimeiroRegistro.setMaximumSize(new java.awt.Dimension(60, 60));
        btnPrimeiroRegistro.setMinimumSize(new java.awt.Dimension(60, 60));
        btnPrimeiroRegistro.setPreferredSize(new java.awt.Dimension(60, 60));
        btnPrimeiroRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeiroRegistroActionPerformed(evt);
            }
        });

        btnVoltarRegistro.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnVoltarRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controle/Back.png"))); // NOI18N
        btnVoltarRegistro.setMaximumSize(new java.awt.Dimension(60, 60));
        btnVoltarRegistro.setMinimumSize(new java.awt.Dimension(60, 60));
        btnVoltarRegistro.setPreferredSize(new java.awt.Dimension(60, 60));
        btnVoltarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarRegistroActionPerformed(evt);
            }
        });

        btnAvancarRegistro.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnAvancarRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controle/Forward.png"))); // NOI18N
        btnAvancarRegistro.setMaximumSize(new java.awt.Dimension(60, 60));
        btnAvancarRegistro.setMinimumSize(new java.awt.Dimension(60, 60));
        btnAvancarRegistro.setPreferredSize(new java.awt.Dimension(60, 60));
        btnAvancarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvancarRegistroActionPerformed(evt);
            }
        });

        btnUltimoRegistro.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnUltimoRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controle/Last.png"))); // NOI18N
        btnUltimoRegistro.setMaximumSize(new java.awt.Dimension(60, 60));
        btnUltimoRegistro.setMinimumSize(new java.awt.Dimension(60, 60));
        btnUltimoRegistro.setPreferredSize(new java.awt.Dimension(60, 60));
        btnUltimoRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoRegistroActionPerformed(evt);
            }
        });

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controle/Folder_verified.png"))); // NOI18N
        btnSalvar.setMaximumSize(new java.awt.Dimension(60, 60));
        btnSalvar.setMinimumSize(new java.awt.Dimension(60, 60));
        btnSalvar.setPreferredSize(new java.awt.Dimension(60, 60));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controle/Folder_delete.png"))); // NOI18N
        btnExcluir.setMaximumSize(new java.awt.Dimension(60, 60));
        btnExcluir.setMinimumSize(new java.awt.Dimension(60, 60));
        btnExcluir.setPreferredSize(new java.awt.Dimension(60, 60));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controle/File_edit.png"))); // NOI18N
        btnEditar.setMaximumSize(new java.awt.Dimension(60, 60));
        btnEditar.setMinimumSize(new java.awt.Dimension(60, 60));
        btnEditar.setPreferredSize(new java.awt.Dimension(60, 60));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controle/Folder_add.png"))); // NOI18N
        btnAdicionar.setMaximumSize(new java.awt.Dimension(60, 60));
        btnAdicionar.setMinimumSize(new java.awt.Dimension(60, 60));
        btnAdicionar.setPreferredSize(new java.awt.Dimension(60, 60));
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Pesquisar por nome do Cliente:");

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controle/Zoom.gif"))); // NOI18N
        btnPesquisar.setMaximumSize(new java.awt.Dimension(50, 50));
        btnPesquisar.setMinimumSize(new java.awt.Dimension(50, 50));
        btnPesquisar.setPreferredSize(new java.awt.Dimension(50, 50));
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controle/Exit.png"))); // NOI18N
        btnSair.setMaximumSize(new java.awt.Dimension(50, 50));
        btnSair.setMinimumSize(new java.awt.Dimension(50, 50));
        btnSair.setPreferredSize(new java.awt.Dimension(50, 50));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDataNascimento)
                            .addComponent(lblEmail)
                            .addComponent(lblTelefone)
                            .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNome))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                            .addComponent(txtDataNascimento)
                            .addComponent(txtTelefone)
                            .addComponent(txtEmail)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtPesquisarNome, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btnPrimeiroRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnVoltarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnAvancarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnUltimoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDataNascimento)
                    .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefone)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnPrimeiroRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAvancarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUltimoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtPesquisarNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDataNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataNascimentoActionPerformed
    
    // Quando uma linha na tabela de clientes é clicada com o mouse, esse método é acionado
    private void tblClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientesMouseClicked
       int linhaSelecionada = tblClientes.getSelectedRow(); // Obtendo o índice da linha selecionada na tabela
        
       // Preenchendo os campos de texto com os valores da linha selecionada na tabela
        txtCodigo.setText(tblClientes.getValueAt(linhaSelecionada, 0).toString());
        txtNome.setText(tblClientes.getValueAt(linhaSelecionada, 1).toString());
        txtDataNascimento.setText(tblClientes.getValueAt(linhaSelecionada, 2).toString());
        txtTelefone.setText(tblClientes.getValueAt(linhaSelecionada, 3).toString());
        txtEmail.setText(tblClientes.getValueAt(linhaSelecionada, 4).toString());
    }//GEN-LAST:event_tblClientesMouseClicked
    
   // Quando uma tecla é pressionada enquanto a tabela de clientes está em foco, esse método é acionado
    private void tblClientesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblClientesKeyPressed
         int linhaSelecionada = tblClientes.getSelectedRow(); // Obtendo o índice da linha selecionada na tabela
        
       // Preenchendo os campos de texto com os valores da linha selecionada na tabela
        txtCodigo.setText(tblClientes.getValueAt(linhaSelecionada, 0).toString());
        txtNome.setText(tblClientes.getValueAt(linhaSelecionada, 1).toString());
        txtDataNascimento.setText(tblClientes.getValueAt(linhaSelecionada, 2).toString());
        txtTelefone.setText(tblClientes.getValueAt(linhaSelecionada, 3).toString());
        txtEmail.setText(tblClientes.getValueAt(linhaSelecionada, 4).toString());
    }//GEN-LAST:event_tblClientesKeyPressed

    private void btnPrimeiroRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroRegistroActionPerformed
        try{
            con_cliente.resultset.first();
            mostrarDados();
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Não foi possível acessar o primeiro registro: "+erro, "Mensagemos do programa: ", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnPrimeiroRegistroActionPerformed

    private void btnUltimoRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoRegistroActionPerformed
        try{
            con_cliente.resultset.last();
            mostrarDados();
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Não foi possível acessar o primeiro registro: "+erro, "Mensagemos do programa: ", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnUltimoRegistroActionPerformed

    private void btnVoltarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarRegistroActionPerformed
        try{
            //se o registro for o primeiro e o usuário clicar no botão, move para o ultimo registro
            if (con_cliente.resultset.isFirst()) {
                con_cliente.resultset.last(); // Mover para o último registro
            } else {
                con_cliente.resultset.previous();
            }
            mostrarDados();
            
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Não foi possível acessar o registro: "+erro, "Mensagemos do programa: ", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnVoltarRegistroActionPerformed

    private void btnAvancarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvancarRegistroActionPerformed
        try{
            //se o registro for o último e o usuário clicar no botão, move para o primeiro registro
            if (con_cliente.resultset.isLast()) {
                con_cliente.resultset.first(); // Mover para o primeiro registro
            } else {
                con_cliente.resultset.next();
            }
            mostrarDados();
            
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Não foi possível acessar o registro: "+erro, "Mensagemos do programa: ", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnAvancarRegistroActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        limparCampos(); //executa o método limparCampos()
        
        txtNome.requestFocus(); //posiciona o cursor no campo txtCodigo para digitação
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
            //declaração de variáveis e atribuição a elas o valor de cada caixa de texto respectiva atraves do metodo getText()
            String nome = txtNome.getText();
            String dataNasc = txtDataNascimento.getText();
            String telefone = txtTelefone.getText();
            String email = txtEmail.getText();
                
                //estrutura de decisão para ver se algum campo estiver vazio. Se algum campo estiver vazio vai exibir a mensagem de erro, caso contrário irá prosseguir com o try catch
               if(nome.isEmpty() || dataNasc.isEmpty() || telefone.isEmpty() || email.isEmpty()){
                   JOptionPane.showMessageDialog(null, "\nErro na gravação: \nCampo vazio");
               }else{
                   
                   try{
                        //define a querry SQL de inserção, onde são informados nome da tabela, campos e na sequência as variáveis resultantes das caixas de texto
                        String insertSql = "INSERT INTO tbclientes (nome, dt_nasc, telefone, email) VALUES ('" + nome +  " ', '" + dataNasc +  "', '" + telefone +  "', '" + email +  "'  )";

                        //executa (no ambiente Java - virtualmente) o comando da inserção
                        con_cliente.statement.executeUpdate(insertSql);

                        JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso!", "Mensagem do Programa  ", JOptionPane.INFORMATION_MESSAGE);

                        //executa (no ambiente Java - virtualmente) o comando de seleção dos dados da tabela
                        con_cliente.executaSQL("SELECT * FROM tbClientes ORDER BY cod");

                        preencherTabela();

                    }catch(SQLException erroSql){
                        JOptionPane.showMessageDialog(null, "\nErro na gravação: \n" +erroSql, "Mensagemos do programa: ", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
               
                  
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
            //declaração de variáveis e atribuição a elas o valor de cada caixa de texto respectiva atraves do metodo getText()
            String codigo = txtCodigo.getText();
            String nome = txtNome.getText();
            String dataNasc = txtDataNascimento.getText();
            String telefone = txtTelefone.getText();
            String email = txtEmail.getText();
            
            String sql;
            String msg = "";
                        
            try{
                sql = "UPDATE tbclientes set nome='" + nome + "',dt_nasc='" + dataNasc + "', telefone='" + telefone + "', email='" + email + "' WHERE cod = " + codigo;
                msg = "Alteração de registro";

                 //executa (no ambiente Java - virtualmente) o comando da inserção
                con_cliente.statement.executeUpdate(sql);
                 JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso!", "Mensagem do Programa  ", JOptionPane.INFORMATION_MESSAGE);
                
                  //executa (no ambiente Java - virtualmente) o comando de seleção dos dados da tabela
                con_cliente.executaSQL("SELECT * FROM tbClientes ORDER BY cod");

                preencherTabela();
                 
            }catch(SQLException erroSql){
                JOptionPane.showMessageDialog(null, "\nErro na gravação: \n" +erroSql, "Mensagemos do programa: ", JOptionPane.INFORMATION_MESSAGE);
            }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        JOptionPane.showMessageDialog(null, "Finalizando programa...");
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // atribuição a uma string vazia para a consulta SQL.
        String sql = "";
        
        try{
            // Exibição de uma uma caixa de diálogo de confirmação para a exclusão.
            int resposta = JOptionPane.showConfirmDialog(null, "Deseja excluir o registro: ", "Confirmar Exclusão", JOptionPane.YES_NO_OPTION);
            
            // Se o usuário confirmar a exclusão (clicar em "Sim").
            if(resposta == 0){
                
                // Atribuição a variavel sql para uma consulta  SQL para excluir um registro com base no código inserido no campo txtCodigo.
                sql = "DELETE FROM tbclientes WHERE cod = " + txtCodigo.getText();
                
                // Execução da consulta de exclusão no banco de dados.
                int excluir = con_cliente.statement.executeUpdate(sql);
                
                    // Se a exclusão for bem-sucedida (um registro foi excluído).
                    if(excluir == 1){
                        
                        // Exibição de uma mensagem de sucesso.
                        JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso! ", "Mensagem do Programa ", JOptionPane.INFORMATION_MESSAGE);
                        con_cliente.executaSQL("SELECT * FROM tbclientes ORDER BY cod"); // Execução de uma consulta SQL para atualizar os registros no banco de dados.
                        con_cliente.resultset.first(); //posiciona o cursor no primeiro registro
                        preencherTabela(); //executa o método preencherTabela
                        posicionarRegistro(); //executa o método posicionarRegistro
                    }else{ // Se a exclusão não for bem-sucedida (nenhum registro foi excluído).
                        JOptionPane.showMessageDialog(null, "Operação cancelada pelo usuário ", "Mensagem do Programa ", JOptionPane.INFORMATION_MESSAGE);
                    }
            }
        }catch(SQLException erroSql){
            // Em caso de erro SQL, exiba uma mensagem de erro.
            JOptionPane.showMessageDialog(null, "\nErro na exclusão: \n" +erroSql, "Mensagemos do programa: ", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        try{
                String pesquisa = "SELECT * FROM tbclientes WHERE nome LIKE '" + txtPesquisarNome.getText() + "%' ";
                con_cliente.executaSQL(pesquisa);
                if(con_cliente.resultset.first()){
                    preencherTabela();
                }else{
                    JOptionPane.showMessageDialog(null, "\n Não há registros com esse parâmetro ", "Mensagemos do programa: ", JOptionPane.INFORMATION_MESSAGE);
                }
            }catch(SQLException erroSql){
            // Em caso de erro SQL, exiba uma mensagem de erro.
            JOptionPane.showMessageDialog(null, "\nNenhum registro encontrado: \n" +erroSql, "Mensagemos do programa: ", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    /**
     * @param args the command line arguments
     */
    //FUNÇÃO MAIN
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(FrmTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmTela().setVisible(true);
            }
        });
    }
    
    public void limparCampos(){
        //limpa a caixa de texto em questão
        txtCodigo.setText("");
        txtNome.setText("");
        txtDataNascimento.setText("");
        txtTelefone.setText("");
        txtEmail.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnAvancarRegistro;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnPrimeiroRegistro;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnUltimoRegistro;
    private javax.swing.JButton btnVoltarRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDataNascimento;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JTable tblClientes;
    private javax.swing.JFormattedTextField txtCodigo;
    private javax.swing.JFormattedTextField txtDataNascimento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesquisarNome;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
