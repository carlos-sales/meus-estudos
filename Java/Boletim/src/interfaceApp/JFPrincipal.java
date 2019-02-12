package interfaceApp;

import javax.swing.JFrame;

public class JFPrincipal extends javax.swing.JFrame {

    public JFPrincipal() {
        initComponents();
        setExtendedState( JFrame.MAXIMIZED_BOTH );
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jmiAluno = new javax.swing.JMenuItem();
        jmiDisciplina = new javax.swing.JMenuItem();
        jmiBoletim = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Boletim");

        jMenu3.setText("Cadastro");

        jmiAluno.setText("Aluno");
        jmiAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAlunoActionPerformed(evt);
            }
        });
        jMenu3.add(jmiAluno);

        jmiDisciplina.setText("Disciplina");
        jmiDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiDisciplinaActionPerformed(evt);
            }
        });
        jMenu3.add(jmiDisciplina);

        jmiBoletim.setText("Lançamento de Boletim");
        jmiBoletim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiBoletimActionPerformed(evt);
            }
        });
        jMenu3.add(jmiBoletim);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 843, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 482, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAlunoActionPerformed

        JFAluno aluno = new JFAluno();
        
        aluno.setVisible(true);
        
    }//GEN-LAST:event_jmiAlunoActionPerformed

    private void jmiDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiDisciplinaActionPerformed

        JFDisciplina disciplina = new JFDisciplina();
        
        disciplina.setVisible(true);
        
    }//GEN-LAST:event_jmiDisciplinaActionPerformed

    private void jmiBoletimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiBoletimActionPerformed

        JFLancBoletim lancBoletim = new JFLancBoletim();
        
        lancBoletim.setVisible(true);

    }//GEN-LAST:event_jmiBoletimActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jmiAluno;
    private javax.swing.JMenuItem jmiBoletim;
    private javax.swing.JMenuItem jmiDisciplina;
    // End of variables declaration//GEN-END:variables
}
