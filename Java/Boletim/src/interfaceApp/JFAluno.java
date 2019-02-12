package interfaceApp;

import classes.Aluno;
import classes.ConectaBanco;
import classes.ModeloTabela;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class JFAluno extends javax.swing.JFrame {
    ConectaBanco conecta = new ConectaBanco();
    
    public JFAluno() {
        initComponents();

        conecta.conecte();
        preenchaTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCurso = new javax.swing.JTextField();
        txtIdade = new javax.swing.JTextField();
        txtMatricula = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnGravar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAluno = new javax.swing.JTable();
        txtNome = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Aluno");

        jLabel1.setText("Nome");

        jLabel2.setText("Idade");

        jLabel3.setText("Curso");

        jLabel4.setText("Matrícula");

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

        tblAluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Matricula", "Curso", "Idade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAlunoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAluno);
        if (tblAluno.getColumnModel().getColumnCount() > 0) {
            tblAluno.getColumnModel().getColumn(0).setMinWidth(250);
            tblAluno.getColumnModel().getColumn(0).setMaxWidth(250);
            tblAluno.getColumnModel().getColumn(1).setMinWidth(100);
            tblAluno.getColumnModel().getColumn(1).setMaxWidth(100);
            tblAluno.getColumnModel().getColumn(2).setMinWidth(170);
            tblAluno.getColumnModel().getColumn(2).setMaxWidth(170);
            tblAluno.getColumnModel().getColumn(3).setMinWidth(50);
            tblAluno.getColumnModel().getColumn(3).setMaxWidth(50);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtCurso)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(323, 323, 323)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(57, 57, 57))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap())))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGravar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExcluir)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGravar)
                    .addComponent(btnEditar)
                    .addComponent(btnExcluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private int linha = -1;
    private int selected;
    
    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        
        Aluno aluno = new Aluno();
        
        try{
            
            if (this.linha != 0) {
                
                aluno.setIdAluno(this.linha);
            }

            aluno.setNome(txtNome.getText());
            aluno.setCurso(txtCurso.getText());
            aluno.setMatricula(txtMatricula.getText());
            aluno.setIdade(Integer.parseInt( txtIdade.getText() ) );
            
            aluno.salve();
            
            this.preenchaTabela();

            this.limpeFormulario();
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Os dados não foram informados corretamente =(");
        }
        
    }//GEN-LAST:event_btnGravarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        
        try{
            
            Aluno aluno = new Aluno();
            
            aluno.setIdAluno(this.selected);
            aluno.setNome( txtNome.getText());
            aluno.setMatricula( txtMatricula.getText() );
            aluno.setCurso( txtCurso.getText());
            aluno.setIdade( ( Integer.parseInt(txtIdade.getText()) ) );
            
            aluno.edite();

            this.controleBotoes(true);
            this.preenchaTabela();
            this.limpeFormulario();
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Os dados não foram editados corretamente xD");
        }
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

        Aluno aluno = new Aluno();
        
        aluno.setIdAluno(this.selected);
        
        aluno.delete();
        
        this.controleBotoes(true);
        this.preenchaTabela();
        this.limpeFormulario();

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void tblAlunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAlunoMouseClicked
        
        this.linha = tblAluno.getSelectedRow();
        
        TableModel model = tblAluno.getModel();
        
        this.selected = Integer.parseInt(model.getValueAt(linha, 0).toString());
        
        txtNome.setText( model.getValueAt(linha, 1).toString() );
        txtMatricula.setText( model.getValueAt(linha, 2).toString() );
        txtCurso.setText( model.getValueAt(linha, 3).toString() );
        txtIdade.setText( model.getValueAt(linha, 4).toString() );

        this.controleBotoes(false);
        
    }//GEN-LAST:event_tblAlunoMouseClicked

    private void preenchaTabela() {
        
        String[] colunas = new String[]{"Cod", "Nome", "Matricula", "Curso", "Idade"};

        ArrayList dados = new ArrayList();

        conecta.executeSQL( "select * from aluno order by nome" );
        
        try {
            conecta.rs.first();
            do {                           
                dados.add( new Object[]{
                    conecta.rs.getInt("idAluno"),
                    conecta.rs.getString("Nome"),
                    conecta.rs.getString("Matricula"),
                    conecta.rs.getString("Curso"),
                    conecta.rs.getInt("Idade")
                });              
            } while (conecta.rs.next());
        } catch (SQLException ex) {
            Logger.getLogger(JFAluno.class.getName()).log(Level.SEVERE, null, ex);
        }

        ModeloTabela modelo = new ModeloTabela(dados, colunas);

        tblAluno.setModel(modelo);
        
    }
    
    private void controleBotoes(boolean habilita) {
        btnGravar.setEnabled(habilita);
        btnEditar.setEnabled(!habilita);
        btnExcluir.setEnabled(!habilita);
    }
    
    private void limpeFormulario() {
        txtNome.setText("");
        txtMatricula.setText("");
        txtCurso.setText("");
        txtIdade.setText("");
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnGravar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAluno;
    private javax.swing.JTextField txtCurso;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
