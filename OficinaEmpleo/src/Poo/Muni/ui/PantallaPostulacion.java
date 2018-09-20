/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poo.Muni.ui;

import Poo.Muni.Controler.GestorOficinaEmpleo;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ButtonModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Capacitacion3
 */
public class PantallaPostulacion extends javax.swing.JFrame {
private final GestorOficinaEmpleo gestor;
private String nombreUsuario;
    /**
     * Creates new form PantallaPostulacion
     * @param gestor
     */
    public PantallaPostulacion(GestorOficinaEmpleo gestor) {
        initComponents();
        this.gestor = gestor;
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

        Sexo = new javax.swing.ButtonGroup();
        Movilidad = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtDistrito = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        boxNivelEducativo = new javax.swing.JComboBox<>();
        txtCuit_Cuil = new javax.swing.JTextField();
        txtTelPricipal = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        boxPrograma = new javax.swing.JComboBox<>();
        jRadioButton1 = new javax.swing.JRadioButton();
        Femenino = new javax.swing.JRadioButton();
        txtDispDeHorarios = new javax.swing.JTextField();
        Agergar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        txtDNI = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtTelAlternativo = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtFechaDeNacimiento = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(204, 204, 0));

        jLabel1.setForeground(new java.awt.Color(204, 204, 0));
        jLabel1.setText("Nombre");

        jLabel2.setForeground(new java.awt.Color(204, 204, 0));
        jLabel2.setText("Apellido");

        jLabel3.setForeground(new java.awt.Color(204, 204, 0));
        jLabel3.setText("DNI");

        jLabel4.setForeground(new java.awt.Color(204, 204, 0));
        jLabel4.setText("Edad");

        jLabel5.setForeground(new java.awt.Color(204, 204, 0));
        jLabel5.setText("Direccion");

        jLabel6.setForeground(new java.awt.Color(204, 204, 0));
        jLabel6.setText("Distrito");

        txtEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdadKeyTyped(evt);
            }
        });

        txtDistrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDistritoActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(204, 204, 0));
        jLabel7.setText("Cuil/Ciut");

        jLabel8.setForeground(new java.awt.Color(204, 204, 0));
        jLabel8.setText("TelPrincipal");

        jLabel9.setForeground(new java.awt.Color(204, 204, 0));
        jLabel9.setText("Nivel de Educacion");

        jLabel11.setForeground(new java.awt.Color(204, 204, 0));
        jLabel11.setText("Sexo");

        jLabel12.setForeground(new java.awt.Color(204, 204, 0));
        jLabel12.setText("Disp. de Horarios");

        boxNivelEducativo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Primario Incompleto", "Primario Completo", "Secundario Incompleto", "Secundario Completo" }));

        txtCuit_Cuil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCuit_CuilKeyTyped(evt);
            }
        });

        txtTelPricipal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelPricipalKeyTyped(evt);
            }
        });

        jLabel13.setForeground(new java.awt.Color(204, 204, 0));
        jLabel13.setText("Programa");

        jRadioButton1.setBackground(new java.awt.Color(102, 102, 102));
        Sexo.add(jRadioButton1);
        jRadioButton1.setForeground(new java.awt.Color(204, 204, 0));
        jRadioButton1.setText("Masculino");

        Femenino.setBackground(new java.awt.Color(102, 102, 102));
        Sexo.add(Femenino);
        Femenino.setForeground(new java.awt.Color(204, 204, 0));
        Femenino.setText("Femenino");

        Agergar.setText("Agregar");
        Agergar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgergarActionPerformed(evt);
            }
        });

        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(204, 204, 0));
        jLabel10.setText("Movilidad");

        jRadioButton2.setBackground(new java.awt.Color(102, 102, 102));
        Movilidad.add(jRadioButton2);
        jRadioButton2.setForeground(new java.awt.Color(204, 204, 0));
        jRadioButton2.setText("SI");

        jRadioButton3.setBackground(new java.awt.Color(102, 102, 102));
        Movilidad.add(jRadioButton3);
        jRadioButton3.setForeground(new java.awt.Color(204, 204, 0));
        jRadioButton3.setText("NO");

        txtDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDNIKeyTyped(evt);
            }
        });

        jLabel14.setForeground(new java.awt.Color(204, 204, 0));
        jLabel14.setText("Email");

        jLabel15.setForeground(new java.awt.Color(204, 204, 0));
        jLabel15.setText("TelAlternativo");

        jLabel16.setForeground(new java.awt.Color(204, 204, 0));
        jLabel16.setText("Fecha de nacimineto");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel1)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                                .addComponent(Femenino))
                            .addComponent(txtDistrito)
                            .addComponent(txtDireccion)
                            .addComponent(txtEdad)
                            .addComponent(txtApellido)
                            .addComponent(txtNombre)
                            .addComponent(txtDNI)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFechaDeNacimiento)))
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8)
                        .addComponent(jLabel13)
                        .addComponent(jLabel10)
                        .addComponent(jLabel14)
                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel12))
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Agergar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cancelar))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                        .addComponent(txtDispDeHorarios, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton3))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtTelAlternativo, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtCuit_Cuil, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtTelPricipal, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(boxNivelEducativo, javax.swing.GroupLayout.Alignment.LEADING, 0, 151, Short.MAX_VALUE)
                        .addComponent(boxPrograma, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtCuit_Cuil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtTelPricipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtTelAlternativo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(boxNivelEducativo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(boxPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jRadioButton1)
                    .addComponent(Femenino)
                    .addComponent(txtDispDeHorarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(txtFechaDeNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Agergar)
                    .addComponent(Cancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDistritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDistritoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDistritoActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        // TODO add your handling code here:
        new Poo.Muni.ui.PantallaPrincipal(gestor, nombreUsuario).setVisible(true);
        dispose();
    }//GEN-LAST:event_CancelarActionPerformed

    private void txtDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDNIKeyTyped
        // TODO add your handling code here:
        soloNumero(evt);       
    }//GEN-LAST:event_txtDNIKeyTyped

    private void txtEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadKeyTyped
        // TODO add your handling code here:
        soloNumero(evt);
    }//GEN-LAST:event_txtEdadKeyTyped

    private void txtTelPricipalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelPricipalKeyTyped
        // TODO add your handling code here:
        soloNumero(evt);
    }//GEN-LAST:event_txtTelPricipalKeyTyped

    private void txtCuit_CuilKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCuit_CuilKeyTyped
        // TODO add your handling code here:
        soloNumero(evt);
    }//GEN-LAST:event_txtCuit_CuilKeyTyped

    private void AgergarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgergarActionPerformed
        // TODO add your handling code here:
        agregarPostulante();
    }//GEN-LAST:event_AgergarActionPerformed

    public void agregarPostulante(){
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String dni = txtDNI.getText();
        String edad = txtEdad.getText();
        String direccion = txtDireccion.getText();
        String distrito = txtDistrito.getText();
        String cuil_cuit = txtCuit_Cuil.getText();
        String telprincipal = txtTelPricipal.getText();
        String telalternativo = txtTelAlternativo.getText();
        String diphorarios = txtDispDeHorarios.getText();
        String email = txtEmail.getText().replaceAll(" ","");
        ButtonModel movilidad = Movilidad.getSelection();
        ButtonModel sexo = Sexo.getSelection();
     
        if(nombre.isEmpty() || apellido.isEmpty() || dni.isEmpty() || edad.isEmpty() || direccion.isEmpty() || distrito.isEmpty() || cuil_cuit.isEmpty() || telprincipal.isEmpty() || diphorarios.isEmpty() || email.isEmpty()){            
            JOptionPane.showMessageDialog(null,"Error no deje ningun campo vacio","Error",JOptionPane.ERROR_MESSAGE);
            this.setLocationRelativeTo(null);
            return;
        }
        if(!ValidarEmail(email)){
        JOptionPane.showMessageDialog(txtEmail,"Error el correo no es valido","Error",JOptionPane.ERROR_MESSAGE);
        this.setLocationRelativeTo(null);
        return;
        }
        
        gestor.GuardarPostulante(null, null, null, nombre, apellido, dni, cuil_cuit, edad, direccion, distrito, telprincipal, telalternativo, null, email, edad);
    }
    public boolean ValidarEmail(String email){
        String regex =("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
         
        return matcher.matches();  
    }
    public void soloNumero(java.awt.event.KeyEvent evt){
    char soloNumero = evt.getKeyChar();
    
    if(Character.isLetter(soloNumero)){
        getToolkit().beep();
        evt.consume();
    }
}
   
    
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
//            java.util.logging.Logger.getLogger(PantallaPostulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(PantallaPostulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(PantallaPostulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(PantallaPostulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new PantallaPostulacion().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agergar;
    private javax.swing.JButton Cancelar;
    private javax.swing.JRadioButton Femenino;
    private javax.swing.ButtonGroup Movilidad;
    private javax.swing.ButtonGroup Sexo;
    private javax.swing.JComboBox<String> boxNivelEducativo;
    private javax.swing.JComboBox<String> boxPrograma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCuit_Cuil;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDispDeHorarios;
    private javax.swing.JTextField txtDistrito;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFechaDeNacimiento;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelAlternativo;
    private javax.swing.JTextField txtTelPricipal;
    // End of variables declaration//GEN-END:variables
}
