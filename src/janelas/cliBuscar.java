/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janelas;

import java.awt.Component;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pi.Encapsular.EncapsularClientes;
import pi.Servicos.ServicoCliente;

/**
 *
 * @author Home
 */
public class cliBuscar extends javax.swing.JPanel {
    
    cliBuscar buscarCliente = new cliBuscar();
    
    String ultimaBusca = null;
    private Component rootPane;

    /**
     * Creates new form cliBuscar
     */
    public cliBuscar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfBuscarCliPanel = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btBuscarCliPanel = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tbBuscarCli = new javax.swing.JTable();
        btBuscarCliPanel1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        tfBuscarCliPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBuscarCliPanelActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Buscar Clientes");

        btBuscarCliPanel.setText("Buscar");
        btBuscarCliPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarCliPanelActionPerformed(evt);
            }
        });

        tbBuscarCli.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(11, 15, 127)));
        tbBuscarCli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código do Cliente", "Nome do Cliente", "CPF", "Data de Nascimento", "Sexo", "Endereço", "Complemento", "CEP", "Bairro", "Cidade", "Estado", "Telefone", "E-mail"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(tbBuscarCli);

        btBuscarCliPanel1.setText("Alterar");
        btBuscarCliPanel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarCliPanel1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome Cliente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btBuscarCliPanel1)
                .addGap(107, 107, 107))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jLabel1)
                        .addGap(65, 65, 65)
                        .addComponent(tfBuscarCliPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(btBuscarCliPanel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(331, 331, 331)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 812, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfBuscarCliPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscarCliPanel)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btBuscarCliPanel1)
                .addContainerGap(158, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tfBuscarCliPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBuscarCliPanelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBuscarCliPanelActionPerformed

    private void btBuscarCliPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarCliPanelActionPerformed
        boolean resultSearch = false;
        
        //Grava o campo de pesquisa como a última pesquisa válida. O valor
        //de última pesquisa válida é utilizado na atualização da lista
        ultimaBusca = tfBuscarCliPanel.getText();

        try {
            //Solicita a atualização da lista com o novo critério
            //de pesquisa (ultimaPesquisa)
            resultSearch = refreshList();
        } catch (Exception e) {
            //Exibe mensagens de erro na fonte de dados e para o listener
            JOptionPane.showMessageDialog(rootPane, e.getMessage(),
                    "Falha ao obter lista", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //Exibe mensagem de erro caso a pesquisa não tenha resultados
        if (!resultSearch) {
            JOptionPane.showMessageDialog(rootPane, "A pesquisa não retornou resultados ",
                    "Sem resultados", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btBuscarCliPanelActionPerformed

    private void btBuscarCliPanel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarCliPanel1ActionPerformed
   
    }//GEN-LAST:event_btBuscarCliPanel1ActionPerformed

    
    public boolean refreshList() throws SQLException, Exception {
        List<EncapsularClientes> lista = ServicoCliente.ListarItens();
        System.err.println(lista.size());

        //Obtém o elemento representante do conteúdo da tabela na tela
        DefaultTableModel model = (DefaultTableModel) tbBuscarCli.getModel();
        //Indica que a tabela deve excluir todos seus elementos
        //Isto limpará a lista, mesmo que a pesquisa não tenha sucesso
        model.setRowCount(0);

        //Verifica se não existiram resultados. Caso afirmativo, encerra a
        //atualização e indica ao elemento acionador o não sucesso da pesquisa
        if (lista == null || lista.size() <= 0) {
            return false;
        }

        //Percorre a lista de resultados e os adiciona na tabela
        for (int i = 0; i < lista.size(); i++) {
            EncapsularClientes cli = lista.get(i);
            if (cli != null) {
                Object[] row = new Object[12];
                row[0] = cli.getId_cliente();
                row[1] = cli.getNm_cliente();
                row[2] = cli.getSexo();
                SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
                row[3] = formatador.format(cli.getData_nasc());
                row[4] = cli.getEndereco();
                row[5] = cli.getComplemento();
                row[6] = cli.getCep();
                row[7] = cli.getBairro();
                row[8] = cli.getCidade();
                row[9] = cli.getEstado();
                row[10] = cli.getEmail();
                row[11] = cli.getTelefone();
                model.addRow(row);
            }
        }

        //Se chegamos até aqui, a pesquisa teve sucesso, então
        //retornamos "true" para o elemento acionante, indicando
        //que não devem ser exibidas mensagens de erro
        return true;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscarCliPanel;
    private javax.swing.JButton btBuscarCliPanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable tbBuscarCli;
    private javax.swing.JTextField tfBuscarCliPanel;
    // End of variables declaration//GEN-END:variables
}
