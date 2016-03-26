/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.scripts.JO;
import modelo.Pessoa;

/**
 *
 * @author Maria
 */
public class PessoaVisualizacaoTela extends javax.swing.JFrame {

    Pessoa pessoa;
    List<Pessoa> pessoas = new ArrayList<>();
    public PessoaVisualizacaoTela() {
        initComponents();
    }
    
    public PessoaVisualizacaoTela(Pessoa pessoa,List<Pessoa> pessoas) {
        this();
        this.pessoa = pessoa;
        this.pessoas = pessoas;
        preencheRotulo();
    }
    
    public void preencheRotulo(){
        rotuloNome1.setText(pessoa.getNome());
        rotuloTelefone1.setText(pessoa.getTelefone());
        rotuloEndereco1.setText(pessoa.getEndereco());
        rotuloBairro1.setText(pessoa.getBairro().getNome());
        rotuloCidade1.setText(pessoa.getBairro().getCidade().getNome());
        rotuloEstado1.setText(pessoa.getBairro().getCidade().getEstado());
    }
    public void excluir() {
        int escolha = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir");
        if(escolha == 0){
            int indice = pessoas.indexOf(pessoa);        
            pessoas.remove(indice);
            JOptionPane.showMessageDialog(this, "Exclusão realizada com sucesso!!");
            dispose();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelCadastro = new javax.swing.JPanel();
        rotuloNome = new javax.swing.JLabel();
        rotuloTelefone = new javax.swing.JLabel();
        rotuloEndereco = new javax.swing.JLabel();
        rotuloBairro = new javax.swing.JLabel();
        rotuloCidade = new javax.swing.JLabel();
        rotuloEstado = new javax.swing.JLabel();
        botaoCancelar = new javax.swing.JButton();
        botaoAlterar = new javax.swing.JButton();
        rotuloNome1 = new javax.swing.JLabel();
        rotuloTelefone1 = new javax.swing.JLabel();
        rotuloEndereco1 = new javax.swing.JLabel();
        rotuloBairro1 = new javax.swing.JLabel();
        rotuloCidade1 = new javax.swing.JLabel();
        rotuloEstado1 = new javax.swing.JLabel();
        botaoExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        painelCadastro.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro"));

        rotuloNome.setText("Nome");

        rotuloTelefone.setText("Telefone");

        rotuloEndereco.setText("Endereço");

        rotuloBairro.setText("Bairro");

        rotuloCidade.setText("Cidade");

        rotuloEstado.setText("Estado");

        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });

        botaoAlterar.setText("Alterar");
        botaoAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlterarActionPerformed(evt);
            }
        });

        rotuloNome1.setText("Nome");

        rotuloTelefone1.setText("Telefone");

        rotuloEndereco1.setText("Endereço");

        rotuloBairro1.setText("Bairro");

        rotuloCidade1.setText("Cidade");

        rotuloEstado1.setText("Estado");

        botaoExcluir.setText("Excluir");
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelCadastroLayout = new javax.swing.GroupLayout(painelCadastro);
        painelCadastro.setLayout(painelCadastroLayout);
        painelCadastroLayout.setHorizontalGroup(
            painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(rotuloCidade)
                        .addComponent(rotuloEstado)
                        .addComponent(rotuloBairro, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(botaoAlterar)
                    .addComponent(rotuloEndereco)
                    .addComponent(rotuloTelefone)
                    .addComponent(rotuloNome))
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCadastroLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rotuloEstado1)
                            .addComponent(rotuloNome1)
                            .addComponent(rotuloTelefone1)
                            .addComponent(rotuloEndereco1)
                            .addComponent(rotuloBairro1)
                            .addComponent(rotuloCidade1)))
                    .addGroup(painelCadastroLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(botaoExcluir)
                        .addGap(41, 41, 41)
                        .addComponent(botaoCancelar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelCadastroLayout.setVerticalGroup(
            painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloNome1)
                    .addComponent(rotuloNome))
                .addGap(18, 18, 18)
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloTelefone1)
                    .addComponent(rotuloTelefone))
                .addGap(33, 33, 33)
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloEndereco1)
                    .addComponent(rotuloEndereco))
                .addGap(34, 34, 34)
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloBairro1)
                    .addComponent(rotuloBairro))
                .addGap(18, 18, 18)
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloCidade)
                    .addComponent(rotuloCidade1))
                .addGap(18, 18, 18)
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloEstado)
                    .addComponent(rotuloEstado1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCancelar)
                    .addComponent(botaoAlterar)
                    .addComponent(botaoExcluir))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(painelCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void botaoAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAlterarActionPerformed
       new PessoaAlteraTela(pessoa).setVisible(true);
        
    }//GEN-LAST:event_botaoAlterarActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        excluir();
    }//GEN-LAST:event_botaoExcluirActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(PessoaVisualizacaoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PessoaVisualizacaoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PessoaVisualizacaoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PessoaVisualizacaoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PessoaVisualizacaoTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAlterar;
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JPanel painelCadastro;
    private javax.swing.JLabel rotuloBairro;
    private javax.swing.JLabel rotuloBairro1;
    private javax.swing.JLabel rotuloCidade;
    private javax.swing.JLabel rotuloCidade1;
    private javax.swing.JLabel rotuloEndereco;
    private javax.swing.JLabel rotuloEndereco1;
    private javax.swing.JLabel rotuloEstado;
    private javax.swing.JLabel rotuloEstado1;
    private javax.swing.JLabel rotuloNome;
    private javax.swing.JLabel rotuloNome1;
    private javax.swing.JLabel rotuloTelefone;
    private javax.swing.JLabel rotuloTelefone1;
    // End of variables declaration//GEN-END:variables

   
}
