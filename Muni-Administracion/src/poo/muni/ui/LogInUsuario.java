/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.muni.ui;

import java.awt.Color;
import javax.swing.JOptionPane;
import poo.muni.controller.gestorEmpleo;
import poo.muni.controller.gestorPostulante;
import poo.muni.dao.usuarioDao;

/**
 *
 * @author oficina2
 */
public class LogInUsuario extends javax.swing.JFrame {
    gestorEmpleo gestorEmpleo;
    gestorPostulante gestorPostulante;
    /**
     * Creates new form LogInUsuario
     */
    public LogInUsuario(gestorEmpleo gestorEmpleo, gestorPostulante gePostulante) {
        initComponents();
        this.gestorEmpleo = gestorEmpleo;
        this.gestorPostulante = gePostulante;
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

        jPanel2 = new javax.swing.JPanel();
        txtUsuarioLogin = new javax.swing.JTextField();
        btnLoguear = new javax.swing.JButton();
        btnRegistrarse = new javax.swing.JButton();
        lblIconOficina = new javax.swing.JLabel();
        lblOlvideContraseña = new javax.swing.JLabel();
        txtContraseñaLogin = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblBackground_blur = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(txtUsuarioLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 180, 40));

        btnLoguear.setBackground(new java.awt.Color(0, 0, 0));
        btnLoguear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLoguear.setForeground(new java.awt.Color(255, 255, 255));
        btnLoguear.setText("Loguear");
        btnLoguear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoguearActionPerformed(evt);
            }
        });
        jPanel2.add(btnLoguear, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 120, 40));

        btnRegistrarse.setBackground(new java.awt.Color(0, 0, 0));
        btnRegistrarse.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegistrarse.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarse.setText("Registrarse");
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 120, 40));

        lblIconOficina.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconOficina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poo/imagenes/imgEmpleo.png"))); // NOI18N
        jPanel2.add(lblIconOficina, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 390, -1));

        lblOlvideContraseña.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblOlvideContraseña.setForeground(new java.awt.Color(255, 255, 255));
        lblOlvideContraseña.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOlvideContraseña.setText("¿Olvidaste Tu Contraseña?");
        lblOlvideContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblOlvideContraseñaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblOlvideContraseñaMouseExited(evt);
            }
        });
        jPanel2.add(lblOlvideContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 190, -1));
        jPanel2.add(txtContraseñaLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 180, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 70, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contraseña:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 90, -1));

        lblBackground_blur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poo/imagenes/blur_background.jpg"))); // NOI18N
        jPanel2.add(lblBackground_blur, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, -4, 410, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblOlvideContraseñaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOlvideContraseñaMouseEntered
        lblOlvideContraseña.setForeground(Color.decode("#6277EE"));
    }//GEN-LAST:event_lblOlvideContraseñaMouseEntered

    private void lblOlvideContraseñaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOlvideContraseñaMouseExited
        lblOlvideContraseña.setForeground(java.awt.Color.WHITE);
    }//GEN-LAST:event_lblOlvideContraseñaMouseExited

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
        new AltaUsuario(gestorEmpleo, gestorPostulante).setVisible(true);
    }//GEN-LAST:event_btnRegistrarseActionPerformed

    private void btnLoguearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoguearActionPerformed
       String usuario = txtUsuarioLogin.getText();
       String contraseña = txtContraseñaLogin.getText();
   
       if(gestorEmpleo.validarInicioSession(usuario, contraseña)){
           new PantallaMenuPrincipal(gestorPostulante, usuario).setVisible(true);
           dispose();
       }else{
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
       }
    }//GEN-LAST:event_btnLoguearActionPerformed

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
            java.util.logging.Logger.getLogger(LogInUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogInUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogInUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogInUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new LogInUsuario().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoguear;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblBackground_blur;
    private javax.swing.JLabel lblIconOficina;
    private javax.swing.JLabel lblOlvideContraseña;
    private javax.swing.JPasswordField txtContraseñaLogin;
    public javax.swing.JTextField txtUsuarioLogin;
    // End of variables declaration//GEN-END:variables
}
