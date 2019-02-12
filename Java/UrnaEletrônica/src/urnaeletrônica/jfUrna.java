package urnaeletrônica;

import javax.swing.JOptionPane;

public class jfUrna extends javax.swing.JFrame {

    int v12=0, v13=0, v15=0, v17=0, v18=0, v19=0, v30=0, v45=0, v50=0, v51=0, vBranco=0, total=0;
    int voto;
    
    public jfUrna() {
        initComponents();
        habilitaLabel(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBranco = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnConfirma = new javax.swing.JButton();
        btnCorrige = new javax.swing.JButton();
        txtVoto = new javax.swing.JTextField();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lblPresidente = new javax.swing.JLabel();
        lblVice = new javax.swing.JLabel();
        lblPartido = new javax.swing.JLabel();
        lblColigacao = new javax.swing.JLabel();
        btnParcial = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBranco.setBackground(new java.awt.Color(255, 255, 255));
        btnBranco.setText("BRANCO");
        btnBranco.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnBranco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrancoActionPerformed(evt);
            }
        });
        getContentPane().add(btnBranco, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 250, 90, 40));

        btn1.setBackground(new java.awt.Color(0, 0, 0));
        btn1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setText("1");
        btn1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 60, 40));

        btn2.setBackground(new java.awt.Color(0, 0, 0));
        btn2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setText("2");
        btn2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, 60, 40));

        btn3.setBackground(new java.awt.Color(0, 0, 0));
        btn3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn3.setForeground(new java.awt.Color(255, 255, 255));
        btn3.setText("3");
        btn3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, 60, 40));

        btn4.setBackground(new java.awt.Color(0, 0, 0));
        btn4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn4.setForeground(new java.awt.Color(255, 255, 255));
        btn4.setText("4");
        btn4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 60, 40));

        btn5.setBackground(new java.awt.Color(0, 0, 0));
        btn5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn5.setForeground(new java.awt.Color(255, 255, 255));
        btn5.setText("5");
        btn5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 60, 40));

        btn6.setBackground(new java.awt.Color(0, 0, 0));
        btn6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn6.setForeground(new java.awt.Color(255, 255, 255));
        btn6.setText("6");
        btn6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, 60, 40));

        btn7.setBackground(new java.awt.Color(0, 0, 0));
        btn7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn7.setForeground(new java.awt.Color(255, 255, 255));
        btn7.setText("7");
        btn7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        getContentPane().add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 60, 40));

        btn8.setBackground(new java.awt.Color(0, 0, 0));
        btn8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn8.setForeground(new java.awt.Color(255, 255, 255));
        btn8.setText("8");
        btn8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        getContentPane().add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, 60, 40));

        btn9.setBackground(new java.awt.Color(0, 0, 0));
        btn9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn9.setForeground(new java.awt.Color(255, 255, 255));
        btn9.setText("9");
        btn9.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        getContentPane().add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, 60, 40));

        btn0.setBackground(new java.awt.Color(0, 0, 0));
        btn0.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn0.setForeground(new java.awt.Color(255, 255, 255));
        btn0.setText("0");
        btn0.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        getContentPane().add(btn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, 60, 40));

        btnConfirma.setBackground(new java.awt.Color(0, 102, 0));
        btnConfirma.setText("CONFIRMA");
        btnConfirma.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnConfirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmaActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfirma, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 90, 40));

        btnCorrige.setBackground(new java.awt.Color(255, 51, 0));
        btnCorrige.setText("CORRIGE");
        btnCorrige.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnCorrige.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCorrigeActionPerformed(evt);
            }
        });
        getContentPane().add(btnCorrige, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, 90, 40));

        txtVoto.setEditable(false);
        txtVoto.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        getContentPane().add(txtVoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 90, 60));

        lbl1.setText("Presidente:");
        getContentPane().add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 90, -1));

        lbl2.setText("Vice:");
        getContentPane().add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        lbl3.setText("Partido:");
        getContentPane().add(lbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        lbl4.setText("Coligação:");
        getContentPane().add(lbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        lblPresidente.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblPresidente.setText(" ");
        getContentPane().add(lblPresidente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 300, 30));

        lblVice.setText(" ");
        getContentPane().add(lblVice, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 270, -1));

        lblPartido.setText(" ");
        getContentPane().add(lblPartido, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 310, -1));

        lblColigacao.setText(" ");
        getContentPane().add(lblColigacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 290, -1));

        btnParcial.setText("Parcial");
        btnParcial.setEnabled(false);
        btnParcial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParcialActionPerformed(evt);
            }
        });
        getContentPane().add(btnParcial, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 310, 90, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        if(txtVoto.getText().length()<2){
            
            txtVoto.setText(txtVoto.getText() + "1");
             
            if(txtVoto.getText().length()==2){
                habilitaLabel(true);
                voto = Integer.parseInt(txtVoto.getText());
                preencheLabel();
            }
        }
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        if(txtVoto.getText().length()<2){
            
            txtVoto.setText(txtVoto.getText() + "2");
            
            if(txtVoto.getText().length()==2){
                habilitaLabel(true);
                voto = Integer.parseInt(txtVoto.getText());
                preencheLabel();
            }
        }
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        if(txtVoto.getText().length()<2){
            
            txtVoto.setText(txtVoto.getText() + "3");
            
            if(txtVoto.getText().length()==2){
                habilitaLabel(true);
                voto = Integer.parseInt(txtVoto.getText());
                preencheLabel();
            }
        }
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        if(txtVoto.getText().length()<2){
            
            txtVoto.setText(txtVoto.getText() + "4");
            
            if(txtVoto.getText().length()==2){
                habilitaLabel(true);
                voto = Integer.parseInt(txtVoto.getText());
                preencheLabel();
            }
        }
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        if(txtVoto.getText().length()<2){
            
            txtVoto.setText(txtVoto.getText() + "5");
            
            if(txtVoto.getText().length()==2){
                habilitaLabel(true);
                voto = Integer.parseInt(txtVoto.getText());
                preencheLabel();
            }
        }
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        if(txtVoto.getText().length()<2){
            
            txtVoto.setText(txtVoto.getText() + "6");
            
            if(txtVoto.getText().length()==2){
                habilitaLabel(true);
                voto = Integer.parseInt(txtVoto.getText());
                preencheLabel();
            }
        }
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        if(txtVoto.getText().length()<2){
            
            txtVoto.setText(txtVoto.getText() + "7");
            
            if(txtVoto.getText().length()==2){
                habilitaLabel(true);
                voto = Integer.parseInt(txtVoto.getText());
                preencheLabel();
            }
        }
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        if(txtVoto.getText().length()<2){
            
            txtVoto.setText(txtVoto.getText() + "8");
            
            if(txtVoto.getText().length()==2){
                habilitaLabel(true);
                voto = Integer.parseInt(txtVoto.getText());
                preencheLabel();
            }
        }
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        if(txtVoto.getText().length()<2){
            
            txtVoto.setText(txtVoto.getText() + "9");
            
            if(txtVoto.getText().length()==2){
                habilitaLabel(true);
                voto = Integer.parseInt(txtVoto.getText());
                preencheLabel();
            }
        }
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        if(txtVoto.getText().length()<2){
            
            txtVoto.setText(txtVoto.getText() + "0");
            
            if(txtVoto.getText().length()==2){
                habilitaLabel(true);
                voto = Integer.parseInt(txtVoto.getText());
                preencheLabel();
            }
        }
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnConfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmaActionPerformed
        
        total++;
        btnParcial.setEnabled(true);
        if(voto==12){
            v12++;
        } else if(voto==13){
            v13++;
        } else if(voto==15){
            v15++;
        } else if(voto==17){
            v17++;
        } else if(voto==18){
            v18++;
        } else if(voto==19){
            v19++;
        } else if(voto==30){
            v30++;
        } else if(voto==45){
            v45++;
        } else if(voto==50){
            v50++;
        } else if(voto==51){
            v51++;
        } else {
            vBranco++;
        }
        habilitaLabel(false);
        txtVoto.setText("");
        lblPresidente.setText("");
        lblVice.setText("");
        lblPartido.setText("");
        lblColigacao.setText("");
    }//GEN-LAST:event_btnConfirmaActionPerformed

    private void btnCorrigeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCorrigeActionPerformed
        String teste = txtVoto.getText();
        teste = teste.substring(0, teste.length() - 1);
        txtVoto.setText(teste);
        voto = Integer.parseInt(txtVoto.getText());
        habilitaLabel(false);
        lblPresidente.setText("");
        lblVice.setText("");
        lblPartido.setText("");
        lblColigacao.setText("");
    }//GEN-LAST:event_btnCorrigeActionPerformed

    private void btnBrancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrancoActionPerformed
        txtVoto.setText("00");
        voto = Integer.parseInt(txtVoto.getText());
        habilitaLabel(true);
        preencheLabel();
    }//GEN-LAST:event_btnBrancoActionPerformed

    private void btnParcialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParcialActionPerformed
        JOptionPane.showMessageDialog(null, "Ciro Gomes: " + ( (v12*100) / total ) + " %\n"
                                            + "Fernando Haddad: " + ( (v13*100) / total ) + " %\n"
                                            + "Henrique Meireles: " + ( (v15*100) / total ) + " %\n"
                                            + "Jair Bolsonaro: " + ( (v17*100) / total ) + " %\n"
                                            + "Marina Silva: " + ( (v18*100) / total ) + " %\n"
                                            + "Álvaro Dias: " + ( (v19*100) / total ) + " %\n"
                                            + "João Amoêdo: " + ( (v30*100) / total ) + " %\n"
                                            + "Geraldo Alckimin: " + ( (v45*100) / total ) + " %\n"
                                            + "Guilherme Boulos: " + ( (v50*100) / total ) + " %\n"
                                            + "Cabo Daciolo: " + ( (v51*100) / total ) + " %\n"
                                            + "Brancos/Nulos: " + ( (vBranco*100) / total ) + " %\n");
    }//GEN-LAST:event_btnParcialActionPerformed

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
            java.util.logging.Logger.getLogger(jfUrna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfUrna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfUrna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfUrna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfUrna().setVisible(true);
            }
        });
    }
    
    public void habilitaLabel(boolean habilita){
        lbl1.setVisible(habilita);
        lbl2.setVisible(habilita);
        lbl3.setVisible(habilita);
        lbl4.setVisible(habilita);    
    }
    
    public void preencheLabel(){
        
        if(voto==12){
            lblPresidente.setText("Ciro Gomes");
            lblVice.setText("Kátia Abreu");
            lblPartido.setText("PDT - Partido Democrático Trabalhista");
            lblColigacao.setText("Brasil Soberano");
        } else if(voto==13){
            lblPresidente.setText("Fernando Haddad");
            lblVice.setText("Manuela D'Ávila");
            lblPartido.setText("PT - Partido dos Trabalhadores");
            lblColigacao.setText("O Povo Feliz de Novo");
        } else if(voto==15){
            lblPresidente.setText("Henrique Meirelles");
            lblVice.setText("Germano Rigotto");
            lblPartido.setText("MDB - Movimento Democrático Brasileiro");
            lblColigacao.setText("Essa é a Solução");
        } else if(voto==17){
            lblPresidente.setText("Jair Bolsonaro");
            lblVice.setText("General Mourão");
            lblPartido.setText("PSL - Partido Social Liberal");
            lblColigacao.setText("Brasil Acima de Tudo, Deus Acima de Todos");
        } else if(voto==18){
            lblPresidente.setText("Marina Silva");
            lblVice.setText("Eduardo Jorge");
            lblPartido.setText("REDE");
            lblColigacao.setText("Unidos Para Transformar o Brasil");
        } else if(voto==19){
            lblPresidente.setText("Álvaro Dias");
            lblVice.setText("Paulo Rabello");
            lblPartido.setText("PODEMOS");
            lblColigacao.setText("Mudança de Verdade");
        } else if(voto==30){
            lblPresidente.setText("João Amoêdo");
            lblVice.setText("Professor Christian");
            lblPartido.setText("NOVO");
            lblColigacao.setText("Só o NOVO é novo");
        } else if(voto==45){
            lblPresidente.setText("Geraldo Alckimin");
            lblVice.setText("Ana Amélia");
            lblPartido.setText("PSDB - Partido da Social Democracia Brasileira");
            lblColigacao.setText("Para Unir o Brasil");
        } else if(voto==50){
            lblPresidente.setText("Guilherme Boulos");
            lblVice.setText("Sônia Guajajara");
            lblPartido.setText("PSOL - Partido Socialismo e Liberdade");
            lblColigacao.setText("Vamos Sem Medo de Mudar o Brasil");
        } else if(voto==50){
            lblPresidente.setText("Cabo Daciolo");
            lblVice.setText("Professora Suelene Balduino");
            lblPartido.setText("PATRIOTAS");
            lblColigacao.setText("PATRIOTAS");
        } else {
            lblPresidente.setText("NULO");
            lblVice.setText("NULO");
            lblPartido.setText("NULO");
            lblColigacao.setText("NULO");
        } 
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnBranco;
    private javax.swing.JButton btnConfirma;
    private javax.swing.JButton btnCorrige;
    private javax.swing.JButton btnParcial;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lblColigacao;
    private javax.swing.JLabel lblPartido;
    private javax.swing.JLabel lblPresidente;
    private javax.swing.JLabel lblVice;
    private javax.swing.JTextField txtVoto;
    // End of variables declaration//GEN-END:variables
}
