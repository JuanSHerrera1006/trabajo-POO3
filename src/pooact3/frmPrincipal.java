/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pooact3;

/**
 *
 * @author Canned
 */
public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {
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

        dp = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        miSalir = new javax.swing.JMenuItem();
        miCalcularPitagoras = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        calcularVoltaje = new javax.swing.JMenuItem();
        miCalcularCorriente = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        miAcercade = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dp.setBackground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout dpLayout = new javax.swing.GroupLayout(dp);
        dp.setLayout(dpLayout);
        dpLayout.setHorizontalGroup(
            dpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        dpLayout.setVerticalGroup(
            dpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        jMenu1.setText("Archivo");

        miSalir.setText("Salir");
        miSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSalirActionPerformed(evt);
            }
        });
        jMenu1.add(miSalir);

        jMenuBar1.add(jMenu1);

        miCalcularPitagoras.setText("Pitagoras");

        jMenuItem2.setText("Calcular Pitagoras");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        miCalcularPitagoras.add(jMenuItem2);

        jMenuBar1.add(miCalcularPitagoras);

        jMenu3.setText("Ohm");

        calcularVoltaje.setText("Calcular Voltaje");
        calcularVoltaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularVoltajeActionPerformed(evt);
            }
        });
        jMenu3.add(calcularVoltaje);

        miCalcularCorriente.setText("Calcular Corriente");
        miCalcularCorriente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCalcularCorrienteActionPerformed(evt);
            }
        });
        jMenu3.add(miCalcularCorriente);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Acerca");

        miAcercade.setText("Acerca de");
        miAcercade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAcercadeActionPerformed(evt);
            }
        });
        jMenu4.add(miAcercade);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dp)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dp)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_miSalirActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        frmPitagoras pitagoras = new frmPitagoras();
        dp.add(pitagoras);
        pitagoras.setClosable(true);
        pitagoras.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void calcularVoltajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularVoltajeActionPerformed
        // TODO add your handling code here:
        frmVoltaje voltaje = new frmVoltaje();
        dp.add(voltaje);
        voltaje.setClosable(true);
        voltaje.setVisible(true);
    }//GEN-LAST:event_calcularVoltajeActionPerformed

    private void miCalcularCorrienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCalcularCorrienteActionPerformed
        // TODO add your handling code here:
        frmCorriente corriente = new frmCorriente();
        dp.add(corriente);
        corriente.setClosable(true);
        corriente.setVisible(true);
    }//GEN-LAST:event_miCalcularCorrienteActionPerformed

    private void miAcercadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAcercadeActionPerformed
        // TODO add your handling code here:
        frmAcercade acercade = new frmAcercade();
        dp.add(acercade);
        acercade.setClosable(true);
        acercade.setVisible(true);
    }//GEN-LAST:event_miAcercadeActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem calcularVoltaje;
    private javax.swing.JDesktopPane dp;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem miAcercade;
    private javax.swing.JMenuItem miCalcularCorriente;
    private javax.swing.JMenu miCalcularPitagoras;
    private javax.swing.JMenuItem miSalir;
    // End of variables declaration//GEN-END:variables
}
