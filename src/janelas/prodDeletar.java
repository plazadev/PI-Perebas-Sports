/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janelas;

import java.awt.Component;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pi.Encapsular.EncapsularProdutos;
import pi.Principal.MenuPrincipal;
import pi.Servicos.ServicoProdutos;

/**
 *
 * @author Home
 */
public class prodDeletar extends javax.swing.JPanel {

    String ultimaBusca = null;
    private Component rootPane;

    /**
     * Creates new form prodDeletar
     */
    public prodDeletar() {
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

        panelDeletarPro = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        btDeletarProPanel = new javax.swing.JButton();
        tfDeletarProPanel = new javax.swing.JTextField();
        btBuscarDeletarProPanel = new javax.swing.JButton();
        jScrollPane18 = new javax.swing.JScrollPane();
        tbDeletarPro = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel24.setText("Deletar Produto");

        btDeletarProPanel.setText("Deletar");
        btDeletarProPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeletarProPanelActionPerformed(evt);
            }
        });

        btBuscarDeletarProPanel.setText("Buscar");
        btBuscarDeletarProPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarDeletarProPanelActionPerformed(evt);
            }
        });

        tbDeletarPro.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(11, 15, 127)));
        tbDeletarPro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código do Produto", "Nome do Produto", "Catgoria", "Tamanho", "Cor", "Quantidade", "Preço", "Descrição"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane18.setViewportView(tbDeletarPro);

        jLabel1.setText("Codigo Produto");

        javax.swing.GroupLayout panelDeletarProLayout = new javax.swing.GroupLayout(panelDeletarPro);
        panelDeletarPro.setLayout(panelDeletarProLayout);
        panelDeletarProLayout.setHorizontalGroup(
            panelDeletarProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDeletarProLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelDeletarProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDeletarProLayout.createSequentialGroup()
                        .addComponent(btDeletarProPanel)
                        .addGap(108, 108, 108))
                    .addComponent(jScrollPane18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 812, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelDeletarProLayout.createSequentialGroup()
                        .addGroup(panelDeletarProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDeletarProLayout.createSequentialGroup()
                                .addGap(185, 185, 185)
                                .addComponent(jLabel1)
                                .addGap(29, 29, 29)
                                .addComponent(tfDeletarProPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(btBuscarDeletarProPanel))
                            .addGroup(panelDeletarProLayout.createSequentialGroup()
                                .addGap(304, 304, 304)
                                .addComponent(jLabel24)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );
        panelDeletarProLayout.setVerticalGroup(
            panelDeletarProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDeletarProLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel24)
                .addGap(34, 34, 34)
                .addGroup(panelDeletarProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDeletarProPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscarDeletarProPanel)
                    .addComponent(jLabel1))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btDeletarProPanel)
                .addContainerGap(305, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 873, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelDeletarPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 619, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelDeletarPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btDeletarProPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeletarProPanelActionPerformed
        try {
            ServicoProdutos.deletar(Integer.parseInt(tfDeletarProPanel.getText()));
            refreshList();

        } catch (Exception ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(rootPane, "Produto excluído!",
                "Excluído", JOptionPane.INFORMATION_MESSAGE);
        tfDeletarProPanel.setText("");
    }//GEN-LAST:event_btDeletarProPanelActionPerformed

    private void btBuscarDeletarProPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarDeletarProPanelActionPerformed
       boolean resultSearch = false;
        
        //Grava o campo de pesquisa como a última pesquisa válida. O valor
        //de última pesquisa válida é utilizado na atualização da lista
        ultimaBusca = tfDeletarProPanel.getText();

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
    }//GEN-LAST:event_btBuscarDeletarProPanelActionPerformed

    public boolean refreshList() throws SQLException, Exception {
        //Realiza a pesquisa de clientes com o último valor de pesquisa
        //para atualizar a lista
        List<EncapsularProdutos> resultado = ServicoProdutos.getInstance().
                procurar(ultimaBusca);

        //Obtém o elemento representante do conteúdo da tabela na tela
        DefaultTableModel model = (DefaultTableModel) tbDeletarPro.getModel();
        //Indica que a tabela deve excluir todos seus elementos
        //Isto limpará a lista, mesmo que a pesquisa não tenha sucesso
        model.setRowCount(0);

        //Verifica se não existiram resultados. Caso afirmativo, encerra a
        //atualização e indica ao elemento acionador o não sucesso da pesquisa
        if (resultado == null || resultado.size() <= 0) {
            return false;
        }

        //Percorre a lista de resultados e os adiciona na tabela
        for (int i = 0; i < resultado.size(); i++) {
            EncapsularProdutos produto = resultado.get(i);
            if (produto != null) {
                Object[] row = new Object[5];
                row[0] = produto.getCod_produto();
                row[1] = produto.getNm_produto();
                row[2] = produto.getCategoria();
                row[4] = produto.getPreco();
                row[5] = produto.getQtde();
                row[6] = produto.getDescricao();
                row[7] = produto.getCor();
                row[8] = produto.getTamanho();
                model.addRow(row);
            }
        }

        //Se chegamos até aqui, a pesquisa teve sucesso, então
        //retornamos "true" para o elemento acionante, indicando
        //que não devem ser exibidas mensagens de erro
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscarDeletarProPanel;
    private javax.swing.JButton btDeletarProPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JPanel panelDeletarPro;
    private javax.swing.JTable tbDeletarPro;
    private javax.swing.JTextField tfDeletarProPanel;
    // End of variables declaration//GEN-END:variables
}
