/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.muni.ui;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.util.ArrayList;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;
import poo.muni.NivelEducativo;
import poo.muni.controller.gestorEmpleo;
import poo.muni.Perfil;
import poo.muni.Programa;
import poo.muni.controller.gestorPostulante;

/**
 *
 * @author oficina2
 */
public class PantallaAgregarPostulante extends javax.swing.JFrame {

    private final gestorPostulante gestor;
    private final String nombreUsuario;
    private ArrayList<NivelEducativo> listaNivelEducativo = new ArrayList<>();
    private ArrayList<Programa> listaPrograma = new ArrayList<>();
    /**
     * Creates new form PantallaAgregarPostulante
     */
    public PantallaAgregarPostulante(gestorPostulante gestor, String nombreUsuario) {
        initComponents();

        soloNumeros(txtTelPrincipal);
        soloNumeros(txtTelAlt);
        soloNumeros(txtDni);
        soloNumeros(txtEdad);
        this.gestor = gestor;
        this.nombreUsuario = nombreUsuario;
        //enmascarar(txtCuil);
        cargarComboNivelEducativo();
        cargarComboPrograma();
        this.setLocationRelativeTo(null);

        txtNombre.setText("asd");
        txtApellido.setText("das");
        txtEdad.setText("18");
        txtCuil.setText("12321");
        txtDisHoraria.setText("sadasd");
        txtDni.setText("1231");
        txtDomicilio.setText("ddd");
        txtEmail.setText("aa@h.com");
        txtMovilidad.setText("asdsa");
        txtTelAlt.setText("123213");
        txtTelPrincipal.setText("213213");
        txtDocAdicional.setText("dasdsa");
        radioBtnFemenino.setSelected(false);
        radioBtnMasculino.setSelected(true);

    }

    public void enmascarar(JFormattedTextField text) {
        try {
            MaskFormatter mask = new MaskFormatter("##-########-#");
            mask.install(text);
            mask.setValidCharacters("0123456789");

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void soloNumeros(JTextField txt) {
        txt.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume();
                }
            }

        });

    }

    public void limpiarCajasDeTexto() {
        txtNombre.setText("");
        txtApellido.setText("");
        txtEdad.setText("");
        txtCuil.setText("");
        txtDisHoraria.setText("");
        txtDni.setText("");
        txtDomicilio.setText("");
        txtEmail.setText("");
        txtMovilidad.setText("");
        txtTelAlt.setText("");
        txtTelPrincipal.setText("");
        txtDocAdicional.setText("");
        radioBtnFemenino.setSelected(false);
        radioBtnMasculino.setSelected(false);
    }

    public void cargarComboNivelEducativo() {
        listaNivelEducativo = gestor.getNivelEducativo();

        comboNivelEducativo.removeAllItems();

        for (NivelEducativo item : listaNivelEducativo) {
            comboNivelEducativo.addItem(item.getNombre());
        }
    }

    public void cargarComboPrograma() {
       

        listaPrograma = gestor.getPrograma();

        comboPrograma.removeAllItems();

        for (Programa item : listaPrograma) {
            comboPrograma.addItem(item.getNombre());
        }
    }

    public void verificarCamposVacios() {
        if (txtNombre.getText().isEmpty() || txtApellido.getText().isEmpty() || txtEdad.getText().isEmpty() || txtCuil.getText().isEmpty() || txtDisHoraria.getText().isEmpty() || txtDni.getText().isEmpty() || txtDomicilio.getText().isEmpty() || txtEmail.getText().isEmpty() || txtMovilidad.getText().isEmpty() || txtTelPrincipal.getText().isEmpty() || txtTelAlt.getText().isEmpty() || txtDocAdicional.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No deje campos vacios", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }

    public boolean isValidEmailAddress(String email) {
        String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
        java.util.regex.Matcher m = p.matcher(email);
        return m.matches();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        el_grupo = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblEdad = new javax.swing.JLabel();
        lblDni = new javax.swing.JLabel();
        lblGenero = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        lblCuil_cuit = new javax.swing.JLabel();
        lblDomicilio = new javax.swing.JLabel();
        txtDomicilio = new javax.swing.JTextField();
        lblTelPrincipal = new javax.swing.JLabel();
        txtTelPrincipal = new javax.swing.JTextField();
        txtTelAlt = new javax.swing.JTextField();
        lblTelAlt = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtDisHoraria = new javax.swing.JTextField();
        lblMovilidad = new javax.swing.JLabel();
        lblDispHoraria = new javax.swing.JLabel();
        txtMovilidad = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        lblPrograma = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDocAdicional = new javax.swing.JTextArea();
        txtDni = new javax.swing.JFormattedTextField();
        txtCuil = new javax.swing.JFormattedTextField();
        radioBtnFemenino = new javax.swing.JRadioButton();
        radioBtnMasculino = new javax.swing.JRadioButton();
        btnCancelarPostulante = new javax.swing.JButton();
        lblNivelEducativo = new javax.swing.JLabel();
        comboNivelEducativo = new javax.swing.JComboBox<>();
        comboPrograma = new javax.swing.JComboBox<>();
        lblAgregarPostulante = new javax.swing.JLabel();
        lblImgEmpleo = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblNombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre.setText("Nombre");

        lblApellido.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblApellido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblApellido.setText("Apellido");

        lblEdad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEdad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEdad.setText("Edad");

        lblDni.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblDni.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDni.setText("Dni");

        lblGenero.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblGenero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGenero.setText("Sexo");

        lblCuil_cuit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCuil_cuit.setText("Cuil/Cuit");

        lblDomicilio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblDomicilio.setText("Domicilio");

        lblTelPrincipal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTelPrincipal.setText("Telefono Principal");

        lblTelAlt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTelAlt.setText("Telefono Alt");

        lblEmail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEmail.setText("Email");

        lblMovilidad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblMovilidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMovilidad.setText("Movilidad");

        lblDispHoraria.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblDispHoraria.setText("DispHoraria");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Doc Adicional");

        lblPrograma.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPrograma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrograma.setText("Programa");

        btnAgregar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poo/imagenes/ic_add_postulante.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poo/imagenes/ic_editar_postulante.png"))); // NOI18N
        btnEditar.setText("Editar");

        txtDocAdicional.setColumns(20);
        txtDocAdicional.setRows(5);
        jScrollPane1.setViewportView(txtDocAdicional);

        txtCuil.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        el_grupo.add(radioBtnFemenino);
        radioBtnFemenino.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        radioBtnFemenino.setText("Femenino");

        el_grupo.add(radioBtnMasculino);
        radioBtnMasculino.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        radioBtnMasculino.setText("Masculino");

        btnCancelarPostulante.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancelarPostulante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poo/imagenes/cancel_icon.png"))); // NOI18N
        btnCancelarPostulante.setText("Cancelar");
        btnCancelarPostulante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarPostulanteActionPerformed(evt);
            }
        });

        lblNivelEducativo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNivelEducativo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNivelEducativo.setText("Nivel Educativo");

        comboNivelEducativo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboPrograma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelarPostulante))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblApellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblEdad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDni, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblMovilidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPrograma, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblNivelEducativo))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMovilidad)
                                    .addComponent(comboPrograma, 0, 174, Short.MAX_VALUE)
                                    .addComponent(txtApellido)
                                    .addComponent(txtNombre)
                                    .addComponent(txtEdad, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtDni)
                                    .addComponent(comboNivelEducativo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 218, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblEmail)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblDomicilio)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblCuil_cuit)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCuil, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblTelPrincipal)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtTelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                            .addComponent(lblDispHoraria)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtDisHoraria, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                            .addComponent(lblTelAlt)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtTelAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(radioBtnMasculino, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel14)
                                        .addGap(18, 18, 18))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(radioBtnFemenino)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCuil_cuit)
                    .addComponent(txtCuil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblApellido)
                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDomicilio))
                        .addGap(3, 3, 3)))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelPrincipal)
                    .addComponent(txtTelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEdad))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelAlt)
                    .addComponent(txtTelAlt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDni))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail)
                    .addComponent(lblMovilidad)
                    .addComponent(txtMovilidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDispHoraria)
                    .addComponent(txtDisHoraria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrograma)
                    .addComponent(comboPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboNivelEducativo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNivelEducativo)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGenero)
                            .addComponent(radioBtnMasculino, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radioBtnFemenino))
                        .addGap(49, 49, 49))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarPostulante)
                    .addComponent(btnEditar)
                    .addComponent(btnAgregar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblAgregarPostulante.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblAgregarPostulante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgregarPostulante.setText("Agregar Postulantes");

        lblImgEmpleo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImgEmpleo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poo/imagenes/imgEmpleo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImgEmpleo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAgregarPostulante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAgregarPostulante)
                .addGap(30, 30, 30)
                .addComponent(lblImgEmpleo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarPostulanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarPostulanteActionPerformed
        dispose();
        new PantallaMenuPrincipal(gestor, nombreUsuario).setVisible(true);
    }//GEN-LAST:event_btnCancelarPostulanteActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String sexo = "";
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String edad = txtEdad.getText();
        String dni = txtDni.getText();
        String cuil = txtCuil.getText();
        String dispHoraria = txtDisHoraria.getText();
        String email = txtEmail.getText();
        String domicilio = txtDomicilio.getText();
        String movilidad = txtMovilidad.getText();
        //String programa = txtPrograma.getText();
        String telPrincipal = txtTelPrincipal.getText();
        String telAlternativo = txtTelAlt.getText();
        String docAdicional = txtDocAdicional.getText();
        Object itemNivelEducacion = comboNivelEducativo.getSelectedItem();
        Object itemPrograma = comboPrograma.getSelectedIndex();
        NivelEducativo nivelEdu = new NivelEducativo();
        Programa prog = new Programa();
        for (NivelEducativo nivel : listaNivelEducativo) {
            if (nivel.getNombre() == itemNivelEducacion) {
                nivelEdu = nivel;
            }
        }
        
        for(Programa program : listaPrograma){
            if(program.getNombre() == itemPrograma){
                prog = program;
            }
        }

        if (radioBtnMasculino.isSelected()) {
            sexo = "Masculino";
        } else if (radioBtnFemenino.isSelected()) {
            sexo = "Femenino";
        }

        if (nombre.isEmpty() || apellido.isEmpty() || txtEdad.getText().isEmpty() || cuil.isEmpty() || dispHoraria.isEmpty() || txtDni.getText().isEmpty() || domicilio.isEmpty() || email.isEmpty() || movilidad.isEmpty() || txtTelPrincipal.getText().isEmpty() || txtTelAlt.getText().isEmpty() || docAdicional.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No deje campos vacios.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!isValidEmailAddress(email)) {
            JOptionPane.showMessageDialog(null, "El email no es valido.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (gestor.guardarPostulante(nivelEdu, null, movilidad, dispHoraria, docAdicional, prog, dni, sexo, edad, nombre, cuil, domicilio, telPrincipal, telAlternativo, email, apellido)) {
            JOptionPane.showMessageDialog(null, "Has registrado un postulante correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
            limpiarCajasDeTexto();
        }

    }//GEN-LAST:event_btnAgregarActionPerformed

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
//                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(PantallaAgregarPostulante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(PantallaAgregarPostulante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(PantallaAgregarPostulante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(PantallaAgregarPostulante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new PantallaAgregarPostulante().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelarPostulante;
    private javax.swing.JButton btnEditar;
    private javax.swing.JComboBox<String> comboNivelEducativo;
    private javax.swing.JComboBox<String> comboPrograma;
    private javax.swing.ButtonGroup el_grupo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAgregarPostulante;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblCuil_cuit;
    private javax.swing.JLabel lblDispHoraria;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblDomicilio;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblImgEmpleo;
    private javax.swing.JLabel lblMovilidad;
    private javax.swing.JLabel lblNivelEducativo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrograma;
    private javax.swing.JLabel lblTelAlt;
    private javax.swing.JLabel lblTelPrincipal;
    private javax.swing.JRadioButton radioBtnFemenino;
    private javax.swing.JRadioButton radioBtnMasculino;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JFormattedTextField txtCuil;
    private javax.swing.JTextField txtDisHoraria;
    private javax.swing.JFormattedTextField txtDni;
    private javax.swing.JTextArea txtDocAdicional;
    private javax.swing.JTextField txtDomicilio;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMovilidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelAlt;
    private javax.swing.JTextField txtTelPrincipal;
    // End of variables declaration//GEN-END:variables
}
