/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poo.Muni.ui;

import Poo.Muni.Controler.GestorOficinaEmpleo;
import Poo.Muni.Controler.GestorPostulante;

/**
 *
 * @author Capacitacion3
 */
public class PantallaPrincipal extends javax.swing.JFrame {
    private final GestorPostulante gestorPostulante;
    private final GestorOficinaEmpleo gestorOficinaEmpleo;
   
    private String nombreUsuario;
    /**
     * Creates new form NewJFrame
     * @param gestorPostulante
     * @param nombreUsuario
     * @param gestorOficinaEmpleo
     */
    public PantallaPrincipal(GestorPostulante gestorPostulante,String nombreUsuario,GestorOficinaEmpleo gestorOficinaEmpleo) {
       initComponents();
       this.gestorPostulante = gestorPostulante;
       this.gestorOficinaEmpleo = gestorOficinaEmpleo;     
       this.nombreUsuario = nombreUsuario;
       txtshowUsuario.setText(nombreUsuario);   
       this.setLocationRelativeTo(null);

    } 
    
    
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtLogo = new javax.swing.JLabel();
        txtshowUsuario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menDatos = new javax.swing.JMenu();
        menPostularme = new javax.swing.JMenuItem();
        menCerrarSesion = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Poo/Muni/ui/1.png"))); // NOI18N
        jPanel1.add(txtLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, -1, -1));

        txtshowUsuario.setForeground(new java.awt.Color(204, 204, 0));
        jPanel1.add(txtshowUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 48, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Poo/Muni/ui/2.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 270));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, -1));

        jMenuBar1.setBackground(new java.awt.Color(102, 102, 102));

        menDatos.setForeground(new java.awt.Color(204, 204, 0));
        menDatos.setText("Menu");
        menDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menDatosActionPerformed(evt);
            }
        });

        menPostularme.setText("Postularme");
        menPostularme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menPostularmeActionPerformed(evt);
            }
        });
        menDatos.add(menPostularme);

        jMenuBar1.add(menDatos);

        menCerrarSesion.setForeground(new java.awt.Color(204, 204, 0));
        menCerrarSesion.setText("Cerrar Sesion");
        menCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menCerrarSesionMouseClicked(evt);
            }
        });
        jMenuBar1.add(menCerrarSesion);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menPostularmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menPostularmeActionPerformed
        // TODO add your handling code here:
        new PantallaPostulacion(gestorPostulante,gestorOficinaEmpleo).setVisible(true);
        dispose();
    }//GEN-LAST:event_menPostularmeActionPerformed

    private void menDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menDatosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menDatosActionPerformed

    private void menCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menCerrarSesionMouseClicked
        // TODO add your handling code here:
        new LoginUsuario(gestorOficinaEmpleo, gestorPostulante).setVisible(true);
        dispose();
//        new Poo.Muni.ui.LoginUsuario(gestor).setVisible(true);
    }//GEN-LAST:event_menCerrarSesionMouseClicked

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new NewJFrame().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu menCerrarSesion;
    private javax.swing.JMenu menDatos;
    private javax.swing.JMenuItem menPostularme;
    private javax.swing.JLabel txtLogo;
    private javax.swing.JLabel txtshowUsuario;
    // End of variables declaration//GEN-END:variables
}
