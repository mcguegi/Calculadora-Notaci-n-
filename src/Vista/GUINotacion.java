/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.CtrlEventos;

/**
 *
 * @author sebastian
 */
public class GUINotacion extends javax.swing.JFrame {

    
    public GUINotacion() {
        initComponents();
        String operacion = txtSolucion.getText();
    }
    String operacion;
    CtrlEventos c = new CtrlEventos();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        btnPunto = new javax.swing.JButton();
        btnSuma = new javax.swing.JButton();
        btnResta = new javax.swing.JButton();
        btnMulti = new javax.swing.JButton();
        btnElevado = new javax.swing.JButton();
        btnDivi = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        lblPosfijo = new javax.swing.JLabel();
        txtSolucion = new javax.swing.JTextField();
        btnAbierto = new javax.swing.JButton();
        btnCerrado = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnBorrrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn1.setBackground(new java.awt.Color(255, 255, 255));
        btn1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 60, 40));

        btn2.setBackground(new java.awt.Color(255, 255, 255));
        btn2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 60, 40));

        btn3.setBackground(new java.awt.Color(255, 255, 255));
        btn3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 80, 40));

        btn4.setBackground(new java.awt.Color(255, 255, 255));
        btn4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 60, 40));

        btn5.setBackground(new java.awt.Color(255, 255, 255));
        btn5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 60, 40));

        btn6.setBackground(new java.awt.Color(255, 255, 255));
        btn6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 80, 40));

        btn7.setBackground(new java.awt.Color(255, 255, 255));
        btn7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        getContentPane().add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 60, 40));

        btn8.setBackground(new java.awt.Color(255, 255, 255));
        btn8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        getContentPane().add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 60, 40));

        btn9.setBackground(new java.awt.Color(255, 255, 255));
        btn9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        getContentPane().add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 80, 40));

        btn0.setBackground(new java.awt.Color(255, 255, 255));
        btn0.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        getContentPane().add(btn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 60, 40));

        btnPunto.setBackground(new java.awt.Color(255, 255, 255));
        btnPunto.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnPunto.setText(".");
        btnPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntoActionPerformed(evt);
            }
        });
        getContentPane().add(btnPunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 80, 40));

        btnSuma.setBackground(new java.awt.Color(255, 255, 255));
        btnSuma.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnSuma.setText("+");
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });
        getContentPane().add(btnSuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 50, 40));

        btnResta.setBackground(new java.awt.Color(255, 255, 255));
        btnResta.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnResta.setText("-");
        btnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaActionPerformed(evt);
            }
        });
        getContentPane().add(btnResta, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 41, 40));

        btnMulti.setBackground(new java.awt.Color(255, 255, 255));
        btnMulti.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnMulti.setText("*");
        btnMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiActionPerformed(evt);
            }
        });
        getContentPane().add(btnMulti, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 41, 40));

        btnElevado.setBackground(new java.awt.Color(255, 255, 255));
        btnElevado.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnElevado.setText("^");
        btnElevado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElevadoActionPerformed(evt);
            }
        });
        getContentPane().add(btnElevado, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, -1, 40));

        btnDivi.setBackground(new java.awt.Color(255, 255, 255));
        btnDivi.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnDivi.setText("/");
        btnDivi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiviActionPerformed(evt);
            }
        });
        getContentPane().add(btnDivi, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 50, 40));

        btnIgual.setBackground(new java.awt.Color(255, 255, 255));
        btnIgual.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnIgual.setText("=");
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });
        getContentPane().add(btnIgual, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 292, 150, 40));

        lblPosfijo.setBackground(new java.awt.Color(204, 204, 255));
        lblPosfijo.setText("0");
        lblPosfijo.setOpaque(true);
        getContentPane().add(lblPosfijo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 54, 320, 30));
        getContentPane().add(txtSolucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 90, 380, 40));

        btnAbierto.setBackground(new java.awt.Color(255, 255, 255));
        btnAbierto.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnAbierto.setText("(");
        btnAbierto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbiertoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAbierto, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 70, 40));

        btnCerrado.setBackground(new java.awt.Color(255, 255, 255));
        btnCerrado.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnCerrado.setText(")");
        btnCerrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerradoActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 70, 40));

        jLabel1.setText("Posfijo:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, 30));

        btnLimpiar.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnLimpiar.setText("CE");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 60, 40));

        btnBorrrar.setBackground(new java.awt.Color(255, 255, 255));
        btnBorrrar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnBorrrar.setText("C");
        btnBorrrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBorrrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 40, 40));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Programa de Notación PostFijo ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 300, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
         operacion= c.btnTres(operacion);  
         txtSolucion.setText(operacion);        
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
         operacion= c.btnCuatro(operacion);  
         txtSolucion.setText(operacion);
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
         operacion= c.btnUno(operacion);  
         txtSolucion.setText(operacion);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
         operacion= c.btnDos(operacion);  
         txtSolucion.setText(operacion);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        operacion= c.btnCinco(operacion);  
        txtSolucion.setText(operacion);
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
         operacion= c.btnSeis(operacion);  
         txtSolucion.setText(operacion);
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
         operacion= c.btnSiete(operacion);  
         txtSolucion.setText(operacion);
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
         operacion= c.btnOcho(operacion);  
         txtSolucion.setText(operacion);
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
         operacion= c.btnNueve(operacion);  
         txtSolucion.setText(operacion);
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntoActionPerformed
        operacion= c.btnPunto(operacion);  
        txtSolucion.setText(operacion);
    }//GEN-LAST:event_btnPuntoActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
         operacion= c.btnCero(operacion);  
         txtSolucion.setText(operacion);
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed
         operacion= c.btnSuma(operacion);  
         txtSolucion.setText(operacion);    
    }//GEN-LAST:event_btnSumaActionPerformed

    private void btnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaActionPerformed
        operacion= c.btnResta(operacion);  
         txtSolucion.setText(operacion);
    }//GEN-LAST:event_btnRestaActionPerformed

    private void btnDiviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiviActionPerformed
       operacion= c.btnDivi(operacion);  
         txtSolucion.setText(operacion);
    }//GEN-LAST:event_btnDiviActionPerformed

    private void btnMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiActionPerformed
       operacion= c.btnMulti(operacion);  
         txtSolucion.setText(operacion);
    }//GEN-LAST:event_btnMultiActionPerformed

    private void btnElevadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElevadoActionPerformed
         operacion= c.btnElevado(operacion);  
         txtSolucion.setText(operacion);
    }//GEN-LAST:event_btnElevadoActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        operacion=txtSolucion.getText();
         String temp="";
         txtSolucion.setText("");
         temp= operacion;
         operacion = null;
         String[] salida = c.btnIgual(temp);
         lblPosfijo.setText(salida[0]);
         txtSolucion.setText(salida[1]);
    }//GEN-LAST:event_btnIgualActionPerformed

    private void btnCerradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerradoActionPerformed
         operacion= c.btnCerrado(operacion);  
         txtSolucion.setText(operacion);
    }//GEN-LAST:event_btnCerradoActionPerformed

    private void btnAbiertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbiertoActionPerformed
        operacion= c.btnAbierto(operacion);  
         txtSolucion.setText(operacion);
    }//GEN-LAST:event_btnAbiertoActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
       txtSolucion.setText("0");
       lblPosfijo.setText("0");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnBorrrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrrarActionPerformed
        operacion= operacion.substring(0, operacion.length()-1);
        txtSolucion.setText(operacion);
    }//GEN-LAST:event_btnBorrrarActionPerformed

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
            java.util.logging.Logger.getLogger(GUINotacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUINotacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUINotacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUINotacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUINotacion().setVisible(true);
            }
        });
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
    private javax.swing.JButton btnAbierto;
    private javax.swing.JButton btnBorrrar;
    private javax.swing.JButton btnCerrado;
    private javax.swing.JButton btnDivi;
    private javax.swing.JButton btnElevado;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMulti;
    private javax.swing.JButton btnPunto;
    private javax.swing.JButton btnResta;
    private javax.swing.JButton btnSuma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblPosfijo;
    private javax.swing.JTextField txtSolucion;
    // End of variables declaration//GEN-END:variables
}
