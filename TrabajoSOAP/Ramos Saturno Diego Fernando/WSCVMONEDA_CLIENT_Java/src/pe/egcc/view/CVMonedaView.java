/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.view;

import pe.egcc.services.ConvertidorMoneda;

/**
 *
 * @author Diego
 */
public class CVMonedaView extends javax.swing.JFrame {

    ConvertidorMoneda cvm = new ConvertidorMoneda();
    /**
     * Creates new form CVMonedaView
     */
    public CVMonedaView() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        txtN1Dolar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnDolarASol = new javax.swing.JButton();
        txtN1CSol = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtN2Dolar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnDolarAEuro = new javax.swing.JButton();
        txtN2CEuro = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtN1Euro = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnEuroADolar = new javax.swing.JButton();
        txtN1CDolar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtN2CSol = new javax.swing.JTextField();
        btnEuroASol = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtN2Euro = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        txtN1Sol = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnSolADolar = new javax.swing.JButton();
        txtN11CDolar = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtN21CEuro = new javax.swing.JTextField();
        btnSolAEuro = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtN2Sol = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Convtidor de Moneda");

        jLabel1.setText("Dolar");

        btnDolarASol.setText("A");
        btnDolarASol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDolarASolActionPerformed(evt);
            }
        });

        txtN1CSol.setEditable(false);

        jLabel2.setText("Nuevo Sol");

        jLabel3.setText("Dolar");

        btnDolarAEuro.setText("A");
        btnDolarAEuro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDolarAEuroActionPerformed(evt);
            }
        });

        txtN2CEuro.setEditable(false);
        txtN2CEuro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtN2CEuroActionPerformed(evt);
            }
        });

        jLabel4.setText("Euros");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtN1Dolar, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                    .addComponent(txtN2Dolar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDolarASol))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDolarAEuro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtN1CSol, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(txtN2CEuro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtN1Dolar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btnDolarASol)
                    .addComponent(txtN1CSol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtN2Dolar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(btnDolarAEuro)
                    .addComponent(txtN2CEuro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Dolar", null, jPanel1, "");

        jLabel5.setText("Euro");

        btnEuroADolar.setText("A");
        btnEuroADolar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEuroADolarActionPerformed(evt);
            }
        });

        txtN1CDolar.setEditable(false);

        jLabel6.setText("Dolar");

        jLabel7.setText("Nuevo Sol");

        txtN2CSol.setEditable(false);
        txtN2CSol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtN2CSolActionPerformed(evt);
            }
        });

        btnEuroASol.setText("A");
        btnEuroASol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEuroASolActionPerformed(evt);
            }
        });

        jLabel8.setText("Euro");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtN1Euro, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                    .addComponent(txtN2Euro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEuroASol))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEuroADolar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtN1CDolar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtN2CSol, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtN1Euro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(btnEuroADolar)
                    .addComponent(txtN1CDolar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtN2Euro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(btnEuroASol)
                    .addComponent(txtN2CSol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Euro", jPanel2);

        jLabel9.setText("Nuevo Sol");

        btnSolADolar.setText("A");
        btnSolADolar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolADolarActionPerformed(evt);
            }
        });

        txtN11CDolar.setEditable(false);

        jLabel10.setText("Dolar");

        jLabel11.setText("Euros");

        txtN21CEuro.setEditable(false);
        txtN21CEuro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtN21CEuroActionPerformed(evt);
            }
        });

        btnSolAEuro.setText("A");
        btnSolAEuro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolAEuroActionPerformed(evt);
            }
        });

        jLabel12.setText("Nuevo Sol");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtN1Sol, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                    .addComponent(txtN2Sol))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSolADolar))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSolAEuro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtN11CDolar, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(txtN21CEuro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtN1Sol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(btnSolADolar)
                    .addComponent(txtN11CDolar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtN2Sol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(btnSolAEuro)
                    .addComponent(txtN21CEuro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Nuevo Sol", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtN2CEuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtN2CEuroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtN2CEuroActionPerformed

    private void btnDolarAEuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDolarAEuroActionPerformed
        double numDolar = Double.parseDouble(txtN2Dolar.getText());
        double numEuro = cvm.dollarToEuro(numDolar);
        txtN2CEuro.setText(""+numEuro); 
    }//GEN-LAST:event_btnDolarAEuroActionPerformed

    private void btnDolarASolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDolarASolActionPerformed
        double numDolar = Double.parseDouble(txtN1Dolar.getText());
        double numSol = cvm.dollarToSol(numDolar);
        txtN1CSol.setText(""+numSol);  
    }//GEN-LAST:event_btnDolarASolActionPerformed

    private void btnEuroADolarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEuroADolarActionPerformed
        double numEuro = Double.parseDouble(txtN1Euro.getText());
        double numDolar = cvm.euroToDollar(numEuro);
        txtN1CDolar.setText(""+numDolar);
    }//GEN-LAST:event_btnEuroADolarActionPerformed

    private void txtN2CSolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtN2CSolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtN2CSolActionPerformed

    private void btnEuroASolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEuroASolActionPerformed
        double numEuro = Double.parseDouble(txtN2Euro.getText());
        double numSol = cvm.euroToSol(numEuro);
        txtN2CSol.setText(""+numSol);
    }//GEN-LAST:event_btnEuroASolActionPerformed

    private void btnSolADolarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolADolarActionPerformed
        double numSol = Double.parseDouble(txtN1Sol.getText());
        double numDolar = cvm.solToDollar(numSol);
        txtN11CDolar.setText(""+numDolar);
    }//GEN-LAST:event_btnSolADolarActionPerformed

    private void txtN21CEuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtN21CEuroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtN21CEuroActionPerformed

    private void btnSolAEuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolAEuroActionPerformed
        double numSol = Double.parseDouble(txtN2Sol.getText());
        double numEuro = cvm.solToEuro(numSol);
        txtN21CEuro.setText(""+numEuro);
    }//GEN-LAST:event_btnSolAEuroActionPerformed

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
            java.util.logging.Logger.getLogger(CVMonedaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CVMonedaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CVMonedaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CVMonedaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CVMonedaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDolarAEuro;
    private javax.swing.JButton btnDolarASol;
    private javax.swing.JButton btnEuroADolar;
    private javax.swing.JButton btnEuroASol;
    private javax.swing.JButton btnSolADolar;
    private javax.swing.JButton btnSolAEuro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtN11CDolar;
    private javax.swing.JTextField txtN1CDolar;
    private javax.swing.JTextField txtN1CSol;
    private javax.swing.JTextField txtN1Dolar;
    private javax.swing.JTextField txtN1Euro;
    private javax.swing.JTextField txtN1Sol;
    private javax.swing.JTextField txtN21CEuro;
    private javax.swing.JTextField txtN2CEuro;
    private javax.swing.JTextField txtN2CSol;
    private javax.swing.JTextField txtN2Dolar;
    private javax.swing.JTextField txtN2Euro;
    private javax.swing.JTextField txtN2Sol;
    // End of variables declaration//GEN-END:variables
}
