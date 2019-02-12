package interfaceApp;

import classes.ConectaBanco;
import classes.Disciplina;
import classes.ModeloTabela;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class JFDisciplina extends javax.swing.JFrame {
    
    ConectaBanco conecta = new ConectaBanco();
    
    public JFDisciplina() {
        initComponents();
        
        conecta.conecte();
        preenchaTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblDisciplina = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtProfessor = new javax.swing.JTextField();
        txtFrequencia = new javax.swing.JTextField();
        btnGravar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        txtNota = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Disciplina");

        tblDisciplina.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod.", "Nome", "Professor", "Nota Mín.", "Freq."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDisciplina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDisciplinaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDisciplina);
        if (tblDisciplina.getColumnModel().getColumnCount() > 0) {
            tblDisciplina.getColumnModel().getColumn(0).setPreferredWidth(25);
            tblDisciplina.getColumnModel().getColumn(1).setPreferredWidth(150);
            tblDisciplina.getColumnModel().getColumn(2).setPreferredWidth(150);
            tblDisciplina.getColumnModel().getColumn(3).setPreferredWidth(25);
            tblDisciplina.getColumnModel().getColumn(4).setResizable(false);
            tblDisciplina.getColumnModel().getColumn(4).setPreferredWidth(25);
        }

        jLabel1.setText("Cod.");

        jLabel2.setText("Nome");

        jLabel3.setText("Professor");

        txtCod.setEnabled(false);

        jLabel4.setText("Nota Mínima");

        jLabel5.setText("Freq.");

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

        txtNota.setText("0.00");
        txtNota.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGravar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtProfessor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNota, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txtFrequencia, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNome)
                                .addGap(13, 13, 13))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFrequencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGravar)
                    .addComponent(btnEditar)
                    .addComponent(btnExcluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private int selected;
    private int linha = -1;
    
    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
     
        Disciplina disciplina = new Disciplina();
        
        try{
            
            disciplina.setNome(txtNome.getText());
            disciplina.setProfessor(txtProfessor.getText());
            disciplina.setNotaMinima( Double.parseDouble(txtNota.getText()));
            disciplina.setFrequencia(Integer.parseInt( txtFrequencia.getText() ) );
            
            disciplina.salve();
            this.preenchaTabela();

            this.limpeFormulario();
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Os dados não foram informados corretamente =(");
        }       

    }//GEN-LAST:event_btnGravarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        try{
            
            Disciplina disciplina = new Disciplina();
            
            disciplina.setIdDisciplina(this.selected);
            disciplina.setNome( txtNome.getText());
            disciplina.setProfessor(txtProfessor.getText());
            disciplina.setNotaMinima( Double.parseDouble(txtNota.getText()));
            disciplina.setFrequencia(Integer.parseInt( txtFrequencia.getText() ) );
            
            disciplina.edite();

            this.controleBotoes(true);
            this.preenchaTabela();
            this.limpeFormulario();
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Os dados não foram editados corretamente xD");
        }

    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

        Disciplina disciplina = new Disciplina();
        
        disciplina.setIdDisciplina(this.selected);
        
        disciplina.delete();
        
        this.controleBotoes(true);
        this.preenchaTabela();
        this.limpeFormulario();
        
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void tblDisciplinaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDisciplinaMouseClicked

        this.linha = tblDisciplina.getSelectedRow();
        
        TableModel model = tblDisciplina.getModel();
        
        this.selected = Integer.parseInt(model.getValueAt(linha, 0).toString());
        
        txtCod.setText( model.getValueAt(linha, 0).toString());
        txtNome.setText( model.getValueAt(linha, 1).toString() );
        txtProfessor.setText( model.getValueAt(linha, 2).toString() );
        txtNota.setText( model.getValueAt(linha, 3).toString() );
        txtFrequencia.setText( model.getValueAt(linha, 4).toString() );

        this.controleBotoes(false);
        
    }//GEN-LAST:event_tblDisciplinaMouseClicked
    
    private void preenchaTabela() {
        
        String[] colunas = new String[]{"Cod", "Nome", "Professor", "Nota Mínima", "Frequencia"};

        ArrayList dados = new ArrayList();

        conecta.executeSQL( "select * from disciplina order by Nome" );
        try {
            conecta.rs.first();
            do {                
            
                dados.add( new Object[]{
                    conecta.rs.getInt("idDisciplina"),
                    conecta.rs.getString("Nome"),
                    conecta.rs.getString("Professor"),
                    conecta.rs.getDouble("NotaMinima"),
                    conecta.rs.getInt("Frequencia")
                });
            } while (conecta.rs.next());
        } catch (SQLException ex) {
            Logger.getLogger(JFAluno.class.getName()).log(Level.SEVERE, null, ex);
        }

        ModeloTabela modelo = new ModeloTabela(dados, colunas);

        tblDisciplina.setModel(modelo);
        
    }
    
    private void controleBotoes(boolean habilita) {
        btnGravar.setEnabled(habilita);
        btnEditar.setEnabled(!habilita);
        btnExcluir.setEnabled(!habilita);
    }
    
    private void limpeFormulario() {
        txtCod.setText("");
        txtNome.setText("");
        txtProfessor.setText("");
        txtNota.setText("0.00");
        txtFrequencia.setText("");
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFDisciplina().setVisible(true);
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDisciplina;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtFrequencia;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtNota;
    private javax.swing.JTextField txtProfessor;
    // End of variables declaration//GEN-END:variables
}
