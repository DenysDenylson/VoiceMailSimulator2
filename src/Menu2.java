/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laptop
 */
public class Menu2 extends javax.swing.JFrame {

    /**
     * Creates new form Menu2
     */
    public Menu2() {
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

        txtDisplay = new javax.swing.JTextField();
        txtMessage = new javax.swing.JTextField();
        btnUno = new javax.swing.JButton();
        btnDos = new javax.swing.JButton();
        btnTres = new javax.swing.JButton();
        btnCuatro = new javax.swing.JButton();
        btnCinco = new javax.swing.JButton();
        btnSeis = new javax.swing.JButton();
        btnSiete = new javax.swing.JButton();
        btnNueve = new javax.swing.JButton();
        btnOcho = new javax.swing.JButton();
        btnAsterisco = new javax.swing.JButton();
        btnCero = new javax.swing.JButton();
        btnNumeral = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDisplayActionPerformed(evt);
            }
        });

        txtMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMessageActionPerformed(evt);
            }
        });

        btnUno.setText("1");
        btnUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnoActionPerformed(evt);
            }
        });

        btnDos.setText("2");
        btnDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDosActionPerformed(evt);
            }
        });

        btnTres.setText("3");
        btnTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTresActionPerformed(evt);
            }
        });

        btnCuatro.setText("4");
        btnCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuatroActionPerformed(evt);
            }
        });

        btnCinco.setText("5");
        btnCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCincoActionPerformed(evt);
            }
        });

        btnSeis.setText("6");
        btnSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeisActionPerformed(evt);
            }
        });

        btnSiete.setText("7");
        btnSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSieteActionPerformed(evt);
            }
        });

        btnNueve.setText("9");
        btnNueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNueveActionPerformed(evt);
            }
        });

        btnOcho.setText("8");
        btnOcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOchoActionPerformed(evt);
            }
        });

        btnAsterisco.setText("*");
        btnAsterisco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsteriscoActionPerformed(evt);
            }
        });

        btnCero.setText("0");
        btnCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCeroActionPerformed(evt);
            }
        });

        btnNumeral.setText("#");
        btnNumeral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumeralActionPerformed(evt);
            }
        });

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                            .addComponent(txtMessage))
                        .addGap(18, 18, 18)
                        .addComponent(btnAceptar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAsterisco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnNumeral))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnCuatro)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnCinco)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnSeis))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnUno)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnDos)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnTres))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnSiete)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnOcho)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnNueve))))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAceptar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUno)
                    .addComponent(btnDos)
                    .addComponent(btnTres))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCuatro)
                    .addComponent(btnCinco)
                    .addComponent(btnSeis))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSiete)
                    .addComponent(btnNueve)
                    .addComponent(btnOcho))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAsterisco)
                    .addComponent(btnCero)
                    .addComponent(btnNumeral))
                .addGap(18, 18, 18)
                .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDisplayActionPerformed

    private void txtMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMessageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMessageActionPerformed

    private void btnTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTresActionPerformed
        String mensaje = txtDisplay.getText();
        txtDisplay.setText(mensaje + "3");
    }//GEN-LAST:event_btnTresActionPerformed

    private void btnCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuatroActionPerformed
        String mensaje = txtDisplay.getText();
        txtDisplay.setText(mensaje + "4");
    }//GEN-LAST:event_btnCuatroActionPerformed

    private void btnCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCincoActionPerformed
        String mensaje = txtDisplay.getText();
        txtDisplay.setText(mensaje + "5");
    }//GEN-LAST:event_btnCincoActionPerformed

    private void btnSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeisActionPerformed
        String mensaje = txtDisplay.getText();
        txtDisplay.setText(mensaje + "6");
    }//GEN-LAST:event_btnSeisActionPerformed

    private void btnSieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSieteActionPerformed
        String mensaje = txtDisplay.getText();
        txtDisplay.setText(mensaje + "7");
    }//GEN-LAST:event_btnSieteActionPerformed

    private void btnNueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNueveActionPerformed
        String mensaje = txtDisplay.getText();
        txtDisplay.setText(mensaje + "9");
    }//GEN-LAST:event_btnNueveActionPerformed

    private void btnOchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOchoActionPerformed
        String mensaje = txtDisplay.getText();
        txtDisplay.setText(mensaje + "8");
    }//GEN-LAST:event_btnOchoActionPerformed

    private void btnAsteriscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsteriscoActionPerformed
        String mensaje = txtDisplay.getText();
        txtDisplay.setText(mensaje + "*");
    }//GEN-LAST:event_btnAsteriscoActionPerformed

    private void btnCeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCeroActionPerformed
        String mensaje = txtDisplay.getText();
        txtDisplay.setText(mensaje + "0");
    }//GEN-LAST:event_btnCeroActionPerformed

    private void btnNumeralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumeralActionPerformed
        String mensaje = txtDisplay.getText();
        txtDisplay.setText(mensaje + "#");
    }//GEN-LAST:event_btnNumeralActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        String mensaje = "";
        mensaje = txtDisplay.getText().toString();
        txtMessage.setText(mensaje);
        txtDisplay.setText("");
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnoActionPerformed
        String mensaje = txtDisplay.getText();
        txtDisplay.setText(mensaje + "1");
    }//GEN-LAST:event_btnUnoActionPerformed

    private void btnDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDosActionPerformed
        String mensaje = txtDisplay.getText();
        txtDisplay.setText(mensaje + "2");
    }//GEN-LAST:event_btnDosActionPerformed

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
            java.util.logging.Logger.getLogger(Menu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Menu2().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAsterisco;
    private javax.swing.JButton btnCero;
    private javax.swing.JButton btnCinco;
    private javax.swing.JButton btnCuatro;
    private javax.swing.JButton btnDos;
    private javax.swing.JButton btnNueve;
    private javax.swing.JButton btnNumeral;
    private javax.swing.JButton btnOcho;
    private javax.swing.JButton btnSeis;
    private javax.swing.JButton btnSiete;
    private javax.swing.JButton btnTres;
    private javax.swing.JButton btnUno;
    private javax.swing.JTextField txtDisplay;
    private javax.swing.JTextField txtMessage;
    // End of variables declaration//GEN-END:variables
}
