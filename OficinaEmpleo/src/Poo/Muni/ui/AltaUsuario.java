/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.muni.ui;

import Poo.Muni.Controler.GestorOficinaEmpleo;
import Poo.Muni.Controler.GestorPostulante;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
//import Poo.Muni.ui.LoginUsuario;

/**
 *
 * @author Capacitacion5
 */
public class AltaUsuario extends javax.swing.JFrame {

    private final  GestorOficinaEmpleo gestorOficinaEmpleo;   
    private final  GestorPostulante gestorPostulante;    
    /**
     * Creates new form AltaUsuario
     * @param gestorOficinaEmpleo
     * @param gestorPostulante
     */
    public AltaUsuario(GestorOficinaEmpleo gestorOficinaEmpleo,GestorPostulante gestorPostulante) {
        initComponents();
        this.gestorOficinaEmpleo = gestorOficinaEmpleo;
        this.gestorPostulante=gestorPostulante;
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

        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        NombreUsuario = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        Contraseña = new javax.swing.JLabel();
        Jlabel5 = new javax.swing.JPanel();
        ConfirmarContraseña = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        Apellido = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        Nombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JPasswordField();
        txtConfirmarContraseña = new javax.swing.JPasswordField();
        Guarda = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        Email = new javax.swing.JLabel();
        txtMail = new javax.swing.JTextField();
        txtnombreUsuario = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Registro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setForeground(new java.awt.Color(200, 38, 82));

        jPanel7.setBackground(new java.awt.Color(77, 77, 77));
        jPanel7.setForeground(new java.awt.Color(252, 225, 0));

        NombreUsuario.setBackground(new java.awt.Color(252, 225, 0));
        NombreUsuario.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 18)); // NOI18N
        NombreUsuario.setForeground(new java.awt.Color(252, 225, 0));
        NombreUsuario.setText(" Nombre Usuario");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(NombreUsuario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NombreUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel8.setBackground(new java.awt.Color(77, 77, 77));
        jPanel8.setForeground(new java.awt.Color(252, 225, 0));

        Contraseña.setBackground(new java.awt.Color(252, 225, 0));
        Contraseña.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 18)); // NOI18N
        Contraseña.setForeground(new java.awt.Color(252, 225, 0));
        Contraseña.setText("Contraseña");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Jlabel5.setBackground(new java.awt.Color(77, 77, 77));

        ConfirmarContraseña.setBackground(new java.awt.Color(252, 225, 0));
        ConfirmarContraseña.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 18)); // NOI18N
        ConfirmarContraseña.setForeground(new java.awt.Color(252, 225, 0));
        ConfirmarContraseña.setText("Confirmar  Contraseña");

        javax.swing.GroupLayout Jlabel5Layout = new javax.swing.GroupLayout(Jlabel5);
        Jlabel5.setLayout(Jlabel5Layout);
        Jlabel5Layout.setHorizontalGroup(
            Jlabel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Jlabel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ConfirmarContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                .addContainerGap())
        );
        Jlabel5Layout.setVerticalGroup(
            Jlabel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Jlabel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ConfirmarContraseña)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(77, 77, 77));
        jPanel6.setForeground(new java.awt.Color(252, 225, 0));

        Apellido.setBackground(new java.awt.Color(77, 77, 77));
        Apellido.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 18)); // NOI18N
        Apellido.setForeground(new java.awt.Color(252, 225, 0));
        Apellido.setText("Apellido");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Apellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(77, 77, 77));

        Nombre.setBackground(new java.awt.Color(200, 38, 82));
        Nombre.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 18)); // NOI18N
        Nombre.setForeground(new java.awt.Color(252, 225, 0));
        Nombre.setText("Nombre");
        Nombre.setToolTipText("");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        Guarda.setBackground(new java.awt.Color(250, 250, 250));
        Guarda.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        Guarda.setText("GUARDAR");
        Guarda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardaActionPerformed(evt);
            }
        });

        jPanel11.setBackground(new java.awt.Color(77, 77, 77));
        jPanel11.setForeground(new java.awt.Color(252, 225, 0));

        Email.setBackground(new java.awt.Color(77, 77, 77));
        Email.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 18)); // NOI18N
        Email.setForeground(new java.awt.Color(252, 225, 0));
        Email.setText("E-mail");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Email, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        jButton1.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Jlabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtContraseña)
                            .addComponent(txtConfirmarContraseña)
                            .addComponent(txtApellido)
                            .addComponent(txtMail)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtnombreUsuario)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Guarda, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNombre))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtApellido)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtMail))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtnombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtConfirmarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jlabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Guarda, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))
                .addGap(0, 93, Short.MAX_VALUE))
        );

        Registro.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Registro.setText("Registro");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(308, 308, 308)
                        .addComponent(Registro)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(Registro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GuardaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardaActionPerformed
       GuardarAltaUsuario();
        
    }//GEN-LAST:event_GuardaActionPerformed
      
    public void GuardarAltaUsuario(){
         
        String contraseña = txtContraseña.getText().replaceAll(" ","");
        String confirmarcontraseña = txtConfirmarContraseña.getText().replaceAll(" ","");
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String mail = txtMail.getText().replaceAll(" ","");
        String nombreUsuario = txtnombreUsuario.getText();
        
        
       
        
    if(contraseña.isEmpty() || confirmarcontraseña.isEmpty() || nombre.isEmpty() || apellido.isEmpty() || mail.isEmpty() || nombreUsuario.isEmpty()){
        JOptionPane.showMessageDialog(null,"Error no deje ningun campo vacio","Error", JOptionPane.ERROR_MESSAGE);
        this.setLocationRelativeTo(null);
        return;
    }
    if(contraseña.length()<6){
        JOptionPane.showMessageDialog(null,"Error la contraseña debe de tener mas de 5 caracteres","Error",JOptionPane.ERROR_MESSAGE);
        this.setLocationRelativeTo(null);
        return;
    }
    
    if(!ValidarEmail(mail)){
        JOptionPane.showMessageDialog(txtMail,"Error el correo no es valido","Error",JOptionPane.ERROR_MESSAGE);
        this.setLocationRelativeTo(null);
        return;
    }
    
    if(!gestorOficinaEmpleo.isUsuarioExistente(nombreUsuario)){
        JOptionPane.showMessageDialog(null,"Error el usuario ya existe","Error",JOptionPane.ERROR_MESSAGE);
        this.setLocationRelativeTo(null);
        return;
    }
    if(nombreUsuario.contains(" ")){
        JOptionPane.showMessageDialog(null,"No se puede usar espacio en el Usuario","Error",JOptionPane.ERROR_MESSAGE);
        this.setLocationRelativeTo(null);
        return;
    }
        
            
    if(String.valueOf(contraseña).equals(String.valueOf(confirmarcontraseña))){
        JOptionPane.showMessageDialog(null,"Se registro correctamente ","Informacion",JOptionPane.INFORMATION_MESSAGE);
        this.setLocationRelativeTo(null);
        dispose();
        new Poo.Muni.ui.LoginUsuario(gestorOficinaEmpleo,gestorPostulante).setVisible(true);

        }else{
        JOptionPane.showMessageDialog(null,"Error las contraseñas no coinciden","Error", JOptionPane.ERROR_MESSAGE);   
        this.setLocationRelativeTo(null);
    }  
    
    gestorOficinaEmpleo.GuardarUsuario(nombre,apellido,contraseña,nombreUsuario,mail);
    
    }

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
      
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

   
    public  boolean ValidarEmail(String mail){
        String regex =("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mail);
         
        return matcher.matches();  
    }
    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new Poo.Muni.ui.LoginUsuario(gestorOficinaEmpleo,gestorPostulante).setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
//            java.util.logging.Logger.getLogger(AltaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(AltaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(AltaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(AltaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new AltaUsuario().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Apellido;
    private javax.swing.JLabel ConfirmarContraseña;
    private javax.swing.JLabel Contraseña;
    private javax.swing.JLabel Email;
    private javax.swing.JButton Guarda;
    private javax.swing.JPanel Jlabel5;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel NombreUsuario;
    private javax.swing.JLabel Registro;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JPasswordField txtConfirmarContraseña;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtnombreUsuario;
    // End of variables declaration//GEN-END:variables
}
