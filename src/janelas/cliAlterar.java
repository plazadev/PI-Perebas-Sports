/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janelas;

import java.awt.Component;
import java.util.Date;
import javax.swing.JOptionPane;
import pi.Encapsular.EncapsularClientes;
import pi.Servicos.ServicoCliente;

/**
 *
 * @author Home
 */
public class cliAlterar extends javax.swing.JPanel {
    
    EncapsularClientes cliente = new EncapsularClientes();
  
    public EncapsularClientes getCliente() {
        return cliente;
    }
  
    public void setCliente(EncapsularClientes cliente) {
        this.cliente = cliente;
    }
    
    
    
    private Component rootPane;
    /**
     * Creates new form cliAlterar
     */
    public cliAlterar() {
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

        btCadastrarCliPanel = new javax.swing.JButton();
        tfNomeCli = new javax.swing.JTextField();
        tfTelefoneCli = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lbDataCli = new javax.swing.JLabel();
        tfCPFCli = new javax.swing.JTextField();
        lbEditar = new javax.swing.JLabel();
        tfDataCli = new javax.swing.JFormattedTextField();
        comboSexoCli = new javax.swing.JComboBox<>();
        tfEstadoCli = new javax.swing.JTextField();
        btCancelarCliPanel = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        lbNomeCli = new javax.swing.JLabel();
        tfBairroCli = new javax.swing.JTextField();
        lbComplementoCli1 = new javax.swing.JLabel();
        tfComplementoCli = new javax.swing.JTextField();
        lbTelefoneCli = new javax.swing.JLabel();
        lbCodClienteCli = new javax.swing.JLabel();
        lbEmailCli = new javax.swing.JLabel();
        tfEnderecoCli = new javax.swing.JTextField();
        tfCidadeCli = new javax.swing.JTextField();
        lbEnderecoCli = new javax.swing.JLabel();
        lbCidadeCli = new javax.swing.JLabel();
        tfCepCli = new javax.swing.JTextField();
        lbSexoCli = new javax.swing.JLabel();
        lbBairroCli = new javax.swing.JLabel();
        tfCodCli = new javax.swing.JTextField();
        tfEmailCli = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        btCadastrarCliPanel.setText("Atualizar");
        btCadastrarCliPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarCliPanelActionPerformed(evt);
            }
        });

        tfNomeCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeCliActionPerformed(evt);
            }
        });

        tfTelefoneCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTelefoneCliActionPerformed(evt);
            }
        });

        jLabel5.setText("CEP:");

        lbDataCli.setText("Data de Nascimento:");

        lbEditar.setText("CPF:");

        tfDataCli.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        comboSexoCli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino", "Outros" }));

        btCancelarCliPanel.setText("Cancelar");

        jLabel10.setText("Estado:");

        lbNomeCli.setText("Nome:");

        lbComplementoCli1.setText("Comp:");

        lbTelefoneCli.setText("Telefone: ");

        lbCodClienteCli.setText("Código do cliente:");

        lbEmailCli.setText("E-mail:");

        lbEnderecoCli.setText("Endereço:");

        lbCidadeCli.setText("Cidade:");

        lbSexoCli.setText("Sexo:");

        lbBairroCli.setText("Bairro:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Alterar Clientes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addComponent(jLabel7)
                .addContainerGap(280, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(152, 152, 152)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lbCodClienteCli)
                                .addComponent(lbNomeCli)
                                .addComponent(lbEditar)
                                .addComponent(lbEmailCli))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfCodCli, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tfNomeCli, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbSexoCli)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(comboSexoCli, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(tfCPFCli, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(lbTelefoneCli)
                                                .addComponent(lbDataCli))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(tfTelefoneCli)
                                                .addComponent(tfDataCli, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(tfEmailCli, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lbCidadeCli)
                                .addComponent(jLabel5)
                                .addComponent(lbEnderecoCli))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfCidadeCli, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(tfEnderecoCli, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lbComplementoCli1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfComplementoCli, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(tfCepCli, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lbBairroCli))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(56, 56, 56)
                                            .addComponent(btCadastrarCliPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btCancelarCliPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(tfEstadoCli, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                                        .addComponent(tfBairroCli))))
                            .addGap(2, 2, 2)))
                    .addContainerGap(152, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel7)
                .addContainerGap(417, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(101, 101, 101)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbCodClienteCli)
                        .addComponent(tfCodCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbNomeCli)
                        .addComponent(tfNomeCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbSexoCli)
                        .addComponent(comboSexoCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbEditar)
                        .addComponent(tfCPFCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbDataCli)
                        .addComponent(tfDataCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbEmailCli)
                        .addComponent(tfEmailCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbTelefoneCli)
                        .addComponent(tfTelefoneCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(28, 28, 28)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbEnderecoCli)
                        .addComponent(tfEnderecoCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbComplementoCli1)
                        .addComponent(tfComplementoCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(tfCepCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbBairroCli)
                        .addComponent(tfBairroCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbCidadeCli)
                        .addComponent(tfCidadeCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(tfEstadoCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(28, 28, 28)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btCadastrarCliPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btCancelarCliPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(101, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarCliPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarCliPanelActionPerformed
        //Cria uma instância do cliente e obtém
        //seus valores dos campos da tela
        
        EncapsularClientes cli = new EncapsularClientes();
        cli.setId_cliente(Integer.parseInt(tfCodCli.getText()));
        cli.setNm_cliente(tfNomeCli.getText());
        cli.setSexo((String) comboSexoCli.getSelectedItem());
        cli.setCpf(tfCPFCli.getText());
        Date data = null;
        try {
            data = (Date) tfDataCli.getValue();
        } catch (Exception e) {

        }
        cli.setData_nasc(data);
        cli.setEndereco(tfEnderecoCli.getText());
        cli.setComplemento(tfComplementoCli.getText());
        cli.setCep(tfCepCli.getText());
        cli.setBairro(tfBairroCli.getText());
        cli.setCidade(tfCidadeCli.getText());
        cli.setEstado(tfEstadoCli.getText());
        cli.setEmail(tfEmailCli.getText());
        cli.setTelefone(tfTelefoneCli.getText());

        try {
            //Chama o serviço para cadastro do cliente
            ServicoCliente.getInstance().cadastrarCliente(cli);
        } catch (Exception e) {
            //Exibe mensagens de erro para o usuário
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(rootPane, e.getMessage(),
                "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //Caso tenha chegado até aqui, o cliente foi inserido com sucesso
        //Então exibe uma mensagem de sucesso para o usuário
        JOptionPane.showMessageDialog(rootPane, "Cliente inserido com sucesso",
            "Cadastro efetuado", JOptionPane.INFORMATION_MESSAGE);

        tfCodCli.setText("");
        tfNomeCli.setText("");
        comboSexoCli.setSelectedItem(0);
        tfCPFCli.setText("");
        tfDataCli.setText("");
        tfEnderecoCli.setText("");
        tfComplementoCli.setText("");
        tfCepCli.setText("");
        tfBairroCli.setText("");
        tfCidadeCli.setText("");
        tfEstadoCli.setText("");
        tfEmailCli.setText("");
        tfTelefoneCli.setText("");
    }//GEN-LAST:event_btCadastrarCliPanelActionPerformed

    private void tfNomeCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomeCliActionPerformed

    private void tfTelefoneCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTelefoneCliActionPerformed

    }//GEN-LAST:event_tfTelefoneCliActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrarCliPanel;
    private javax.swing.JButton btCancelarCliPanel;
    private javax.swing.JComboBox<String> comboSexoCli;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lbBairroCli;
    private javax.swing.JLabel lbCidadeCli;
    private javax.swing.JLabel lbCodClienteCli;
    private javax.swing.JLabel lbComplementoCli1;
    private javax.swing.JLabel lbDataCli;
    private javax.swing.JLabel lbEditar;
    private javax.swing.JLabel lbEmailCli;
    private javax.swing.JLabel lbEnderecoCli;
    private javax.swing.JLabel lbNomeCli;
    private javax.swing.JLabel lbSexoCli;
    private javax.swing.JLabel lbTelefoneCli;
    private javax.swing.JTextField tfBairroCli;
    private javax.swing.JTextField tfCPFCli;
    private javax.swing.JTextField tfCepCli;
    private javax.swing.JTextField tfCidadeCli;
    private javax.swing.JTextField tfCodCli;
    private javax.swing.JTextField tfComplementoCli;
    private javax.swing.JFormattedTextField tfDataCli;
    private javax.swing.JTextField tfEmailCli;
    private javax.swing.JTextField tfEnderecoCli;
    private javax.swing.JTextField tfEstadoCli;
    private javax.swing.JTextField tfNomeCli;
    private javax.swing.JTextField tfTelefoneCli;
    // End of variables declaration//GEN-END:variables
}
