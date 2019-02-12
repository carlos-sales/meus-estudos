package interfaceApp;

import classes.Aluno;
import classes.Disciplina;
import classes.Boletim;
import classes.ConectaBanco;
import classes.ModeloTabela;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class JFLancBoletim extends javax.swing.JFrame {

    ConectaBanco conecta = new ConectaBanco();
    
    private int linha = -1;
    private int selected;
    public JFLancBoletim() {
        
        initComponents();
        
        conecta.conecte();
        
        Boletim b = new Boletim();
        
        int aux = b.preencheCB('a').getItemCount();
        //preenche Combobox Aluno
        for (int i = 0; i < aux; i++) {
             cbbAluno.addItem(b.preencheCB('a').getItemAt(i));
        }
        //Preenche Combobox Disciplina
        for (int i = 0; i < aux; i++) {
             cbbDisciplina.addItem(b.preencheCB('d').getItemAt(i));
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblBoletim = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbbAluno = new javax.swing.JComboBox<>();
        cbbDisciplina = new javax.swing.JComboBox<>();
        txtNota = new javax.swing.JFormattedTextField();
        txtFreq = new javax.swing.JTextField();
        btnGravar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnFecharBoletim = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lblMedia = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lançamento Boletim");

        tblBoletim.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod.", "Aluno", "Disciplina", "Nota", "Falta(s)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblBoletim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBoletimMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBoletim);
        if (tblBoletim.getColumnModel().getColumnCount() > 0) {
            tblBoletim.getColumnModel().getColumn(1).setPreferredWidth(175);
            tblBoletim.getColumnModel().getColumn(2).setPreferredWidth(175);
            tblBoletim.getColumnModel().getColumn(3).setPreferredWidth(30);
            tblBoletim.getColumnModel().getColumn(4).setPreferredWidth(30);
        }

        jLabel1.setText("Aluno");

        jLabel2.setText("Disciplina");

        jLabel3.setText("Nota");

        jLabel4.setText("Faltas");

        txtNota.setText("0.00");

        btnGravar.setText("Gravar");
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.setEnabled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnFecharBoletim.setText("Fechar Boletim");
        btnFecharBoletim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharBoletimActionPerformed(evt);
            }
        });

        jLabel5.setText("Média:");

        lblMedia.setText("[média parcial]");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbbAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbbDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(txtNota, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(txtFreq, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGravar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExcluir)
                                .addGap(18, 18, 18)
                                .addComponent(btnFecharBoletim)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblMedia)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFreq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGravar)
                    .addComponent(btnEditar)
                    .addComponent(btnExcluir)
                    .addComponent(btnFecharBoletim)
                    .addComponent(jLabel5)
                    .addComponent(lblMedia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        
        Boletim boletim = new Boletim();
        
        try{
            //Informações a serem gravadas
            boletim.setIdAluno( boletim.getIdSelecionado(cbbAluno.getSelectedIndex(), 'a') );
            boletim.setIdDisciplina( boletim.getIdSelecionado(cbbDisciplina.getSelectedIndex(), 'd') );
            boletim.setNota(Double.parseDouble(txtNota.getText()) );
            boletim.setFrequencia(Integer.parseInt( txtFreq.getText() ) );
            
            //chama método para gravar info
            boletim.salve();
            
            //atualiza label com a média em tempo real
            lblMedia.setText ( Double.toString(boletim.gera_media()) );
            //preenche tabela com informações do aluno selecionado
            tblBoletim.setModel( boletim.preenchaTabela(boletim.getIdSelecionado(cbbAluno.getSelectedIndex(), 'a')) );
            //deixa o cbb inativo até que se finalize a media
            this.controleCbb(false);
            this.controleBotoes(false);
            this.limpeFormulario();
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Os dados não foram informados corretamente =(");
        }       
        
    }//GEN-LAST:event_btnGravarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        
        try{
            
            Boletim boletim = new Boletim();
            
            boletim.setIdBoletim(this.selected);
            boletim.setNota( Double.parseDouble(txtNota.getText()));
            boletim.setFrequencia(( Integer.parseInt(txtFreq.getText()) ) );
            
            boletim.edite();
            
            lblMedia.setText ( Double.toString(boletim.gera_media()) );
                        
            tblBoletim.setModel( boletim.preenchaTabela(boletim.getIdSelecionado(cbbAluno.getSelectedIndex(), 'a')) );
            controleBotoes(false);
            this.limpeFormulario();
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Os dados não foram editados corretamente xD");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

        Boletim boletim = new Boletim();
        
        boletim.setIdBoletim(this.selected);
        boletim.delete();
        
        controleBotoes(false);
        
        lblMedia.setText ( Double.toString(boletim.gera_media()) );
        tblBoletim.setModel( boletim.preenchaTabela(boletim.getIdSelecionado(cbbAluno.getSelectedIndex(), 'a')) );
        this.limpeFormulario();
        btnGravar.setEnabled(true);
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void tblBoletimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBoletimMouseClicked
        
        this.linha = tblBoletim.getSelectedRow();
        
        TableModel model = tblBoletim.getModel();
        
        this.selected = Integer.parseInt(model.getValueAt(linha, 0).toString());
        
        txtNota.setText( model.getValueAt(linha, 3).toString() );
        txtFreq.setText( model.getValueAt(linha, 4).toString() );
        
        this.controleBotoes(false);
        
    }//GEN-LAST:event_tblBoletimMouseClicked

    private void btnFecharBoletimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharBoletimActionPerformed
     
        Boletim boletim = new Boletim();
        
        if ( boletim.apv_freq() && boletim.apv_media() ) JOptionPane.showMessageDialog(null, "Aprovado! =)");
        else if ( !boletim.apv_freq() && !boletim.apv_media() ) JOptionPane.showMessageDialog(null, "Reprovado por media insuficiente e acumulo de faltas");
        else if ( !boletim.apv_freq() ) JOptionPane.showMessageDialog(null, "Reprovado por acumulo de faltas");
        else JOptionPane.showMessageDialog(null, "Reprovado por média insuficiente =(");
        
        limpeFormulario();
        boletim.delete_all(boletim.getIdSelecionado(cbbAluno.getSelectedIndex(), 'a'));
        lblMedia.setText("[media parcial]");
        cbbAluno.setSelectedIndex(-1);
        cbbDisciplina.setSelectedIndex(-1);
        controleBotoes(true);
        controleCbb(true);
        tblBoletim.setModel( boletim.preenchaTabela(0) );
    }//GEN-LAST:event_btnFecharBoletimActionPerformed

    private void limpaTabela(){
        DefaultTableModel model = (DefaultTableModel) tblBoletim.getModel();

        model.setRowCount(0);
    }
    
    private void controleBotoes(boolean habilita) {
        btnGravar.setEnabled(habilita);
        btnEditar.setEnabled(!habilita);
        btnExcluir.setEnabled(!habilita);
    }
    
    private void controleCbb(boolean habilita){
        cbbAluno.setEnabled(habilita);
        cbbDisciplina.setEnabled(habilita);
    }
    
    
    private void limpeFormulario() {
        txtNota.setText("0.00");
        txtFreq.setText("");
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFLancBoletim().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFecharBoletim;
    private javax.swing.JButton btnGravar;
    private javax.swing.JComboBox<Object> cbbAluno;
    private javax.swing.JComboBox<Object> cbbDisciplina;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMedia;
    private javax.swing.JTable tblBoletim;
    private javax.swing.JTextField txtFreq;
    private javax.swing.JFormattedTextField txtNota;
    // End of variables declaration//GEN-END:variables
}
