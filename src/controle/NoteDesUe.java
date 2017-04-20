/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

/**
 *
 * @author ZARABE FILS
 */
public class NoteDesUe extends javax.swing.JFrame {
   String lnom ;
   String lprenom;
   String lmatricule;
   Object lfonda;
   Object lphysique;
   String lsexe;
    NoteDesUe(){
    
    initComponents();
    }
    
    

    NoteDesUe(String nom, String prenom, String matricule, Object fonda, Object physique,String sexe) {
     initComponents();
     
     lnom=nom;
     lprenom=prenom;
    lmatricule=matricule;
    lfonda=fonda;
    lphysique=physique;
    lsexe=sexe;
    }

    void actualiser(){
        az.setText("");
        aze.setText("");
        azer.setText("");
        azert.setText("");
        cred1.setText("");
        cred2.setText("");
        cred3.setText("");
        code8.setText("");
        note1.setText("");
        note2.setText("");
        note3.setText("");
        note4.setText("");
        
    }
    
    
    
    
   
    
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField7 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        code1 = new javax.swing.JTextField();
        code2 = new javax.swing.JTextField();
        code5 = new javax.swing.JTextField();
        code6 = new javax.swing.JTextField();
        az = new javax.swing.JTextField();
        aze = new javax.swing.JTextField();
        azer = new javax.swing.JTextField();
        azert = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        note4 = new javax.swing.JTextField();
        code8 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cred1 = new javax.swing.JTextField();
        note1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        note2 = new javax.swing.JTextField();
        cred2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        note3 = new javax.swing.JTextField();
        cred3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        rein = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jTextField7.setText("   CODE");
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jTextField12.setText("jTextField12");

        code2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                code2ActionPerformed(evt);
            }
        });

        code5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                code5ActionPerformed(evt);
            }
        });

        az.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                azActionPerformed(evt);
            }
        });

        azer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                azerActionPerformed(evt);
            }
        });

        jLabel9.setText("CODE 2");

        note4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                note4ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("  UE FONDAMENTALE");

        jLabel2.setText("      NOTE");

        jLabel3.setText("       CREDIT");

        cred1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cred1ActionPerformed(evt);
            }
        });

        jLabel4.setText("CODE 1");

        jLabel5.setText("CODE 2");

        note2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                note2ActionPerformed(evt);
            }
        });

        cred2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cred2ActionPerformed(evt);
            }
        });

        jLabel6.setText("  UE OPTIONNELLE");

        jLabel7.setText("            NOTE");

        jLabel8.setText("CODE 1");

        jLabel10.setText("    CREDIT");

        rein.setText("Reinitialiser");
        rein.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reinActionPerformed(evt);
            }
        });

        jButton2.setText("Envoyer");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rein, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(note2, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                                    .addComponent(note1)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(note3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)
                                    .addComponent(cred3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cred2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cred1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(0, 41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cred1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(note1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(note2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cred2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(note3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cred3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rein)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void note4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_note4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_note4ActionPerformed

    private void cred2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cred2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cred2ActionPerformed

    private void code2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_code2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_code2ActionPerformed

    private void note2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_note2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_note2ActionPerformed

    private void cred1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cred1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cred1ActionPerformed

    private void code5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_code5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_code5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
double not1= Double.parseDouble(note1.getText());
double not2=Double.parseDouble(note2.getText());
int credit1= Integer.parseInt(cred1.getText());
int credit2= Integer.parseInt(cred2.getText());
double note=Double.parseDouble(note3.getText());
int    credit= Integer.parseInt(cred3.getText());   
        
new Recapitulatif(not1,not2,credit1,credit2,note,credit,lnom,lprenom,lmatricule,lfonda,lphysique,lsexe).setVisible(true);


            
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void reinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reinActionPerformed
actualiser();        
    }//GEN-LAST:event_reinActionPerformed

    private void azActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_azActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_azActionPerformed

    private void azerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_azerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_azerActionPerformed

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
            java.util.logging.Logger.getLogger(NoteDesUe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NoteDesUe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NoteDesUe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NoteDesUe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NoteDesUe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField az;
    private javax.swing.JTextField aze;
    private javax.swing.JTextField azer;
    private javax.swing.JTextField azert;
    private javax.swing.JTextField code1;
    private javax.swing.JTextField code2;
    private javax.swing.JTextField code5;
    private javax.swing.JTextField code6;
    private javax.swing.JTextField code8;
    private javax.swing.JTextField cred1;
    private javax.swing.JTextField cred2;
    private javax.swing.JTextField cred3;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField note1;
    private javax.swing.JTextField note2;
    private javax.swing.JTextField note3;
    private javax.swing.JTextField note4;
    private javax.swing.JButton rein;
    // End of variables declaration//GEN-END:variables
}
