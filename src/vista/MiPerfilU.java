/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author USUARIO
 */
public class MiPerfilU extends javax.swing.JFrame {

    /**
     * Creates new form MiPerfilU
     */
    public MiPerfilU() {
        initComponents();
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MiPerfilU().setVisible(false);
            }
        });
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
        lblMostrarNombre = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JButton();
        lblMostrarCedula = new javax.swing.JLabel();
        lblIcono = new javax.swing.JLabel();
        lblMostrarDireccion = new javax.swing.JLabel();
        lblMostrar = new javax.swing.JLabel();
        lblMostrarApellido = new javax.swing.JLabel();
        lblNombre1 = new javax.swing.JLabel();
        lblMostrarTelefono = new javax.swing.JLabel();
        lblApellido1 = new javax.swing.JLabel();
        lblMostrarCorreo = new javax.swing.JLabel();
        lblCorreo1 = new javax.swing.JLabel();
        lblTelefono1 = new javax.swing.JLabel();
        lblDireccion1 = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        lblCedula1 = new javax.swing.JLabel();
        lblContraseña1 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        lblImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblMostrarNombre.setText("jLabel6");
        lblMostrarNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnCerrarSesion.setText("Cerrar Sesión");
        btnCerrarSesion.setContentAreaFilled(false);

        lblMostrarCedula.setText("jLabel7");
        lblMostrarCedula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/Icono.png"))); // NOI18N

        lblMostrarDireccion.setText("jLabel8");
        lblMostrarDireccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblMostrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblMostrar.setText("Mi Perfil");

        lblMostrarApellido.setText("jLabel9");
        lblMostrarApellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblNombre1.setText("Nombre");

        lblMostrarTelefono.setText("jLabel10");
        lblMostrarTelefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblApellido1.setText("Apellido");

        lblMostrarCorreo.setText("jLabel11");
        lblMostrarCorreo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblCorreo1.setText("Correo");

        lblTelefono1.setText("Teléfono");

        lblDireccion1.setText("Dirección");

        lblContraseña.setText("Contraseña");

        lblCedula1.setText("Cédula de ciudadanía");

        lblContraseña1.setText("jLabel4");
        lblContraseña1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnVolver.setText("Volver");

        lblImagen.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(lblIcono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(147, 147, 147))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCerrarSesion)
                                .addGap(22, 22, 22))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnVolver)
                        .addGap(231, 231, 231))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblContraseña1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblMostrarCedula, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblMostrarNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCedula1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblMostrarDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblContraseña, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDireccion1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblCorreo1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblMostrarTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblMostrarCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblMostrarApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(136, 136, 136))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnCerrarSesion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMostrar))
                    .addComponent(lblIcono, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellido1)
                    .addComponent(lblNombre1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMostrarNombre)
                    .addComponent(lblMostrarApellido))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCedula1)
                    .addComponent(lblTelefono1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMostrarCedula)
                    .addComponent(lblMostrarTelefono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDireccion1)
                    .addComponent(lblCorreo1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMostrarCorreo)
                    .addComponent(lblMostrarDireccion))
                .addGap(18, 18, 18)
                .addComponent(lblContraseña)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblContraseña1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVolver)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnVolver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblApellido1;
    private javax.swing.JLabel lblCedula1;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblContraseña1;
    private javax.swing.JLabel lblCorreo1;
    private javax.swing.JLabel lblDireccion1;
    private javax.swing.JLabel lblIcono;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblMostrar;
    private javax.swing.JLabel lblMostrarApellido;
    private javax.swing.JLabel lblMostrarCedula;
    private javax.swing.JLabel lblMostrarCorreo;
    private javax.swing.JLabel lblMostrarDireccion;
    private javax.swing.JLabel lblMostrarNombre;
    private javax.swing.JLabel lblMostrarTelefono;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblTelefono1;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnCerrarSesion() {
        return btnCerrarSesion;
    }

    public void setBtnCerrarSesion(JButton btnCerrarSesion) {
        this.btnCerrarSesion = btnCerrarSesion;
    }

    public JButton getBtnVolver() {
        return btnVolver;
    }

    public void setBtnVolver(JButton btnVolver) {
        this.btnVolver = btnVolver;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JLabel getLblApellido1() {
        return lblApellido1;
    }

    public void setLblApellido1(JLabel lblApellido1) {
        this.lblApellido1 = lblApellido1;
    }

    public JLabel getLblCedula1() {
        return lblCedula1;
    }

    public void setLblCedula1(JLabel lblCedula1) {
        this.lblCedula1 = lblCedula1;
    }

    public JLabel getLblContraseña() {
        return lblContraseña;
    }

    public void setLblContraseña(JLabel lblContraseña) {
        this.lblContraseña = lblContraseña;
    }

    public JLabel getLblContraseña1() {
        return lblContraseña1;
    }

    public void setLblContraseña1(JLabel lblContraseña1) {
        this.lblContraseña1 = lblContraseña1;
    }

    public JLabel getLblCorreo1() {
        return lblCorreo1;
    }

    public void setLblCorreo1(JLabel lblCorreo1) {
        this.lblCorreo1 = lblCorreo1;
    }

    public JLabel getLblDireccion1() {
        return lblDireccion1;
    }

    public void setLblDireccion1(JLabel lblDireccion1) {
        this.lblDireccion1 = lblDireccion1;
    }

    public JLabel getLblIcono() {
        return lblIcono;
    }

    public void setLblIcono(JLabel lblIcono) {
        this.lblIcono = lblIcono;
    }

    public JLabel getLblImagen() {
        return lblImagen;
    }

    public void setLblImagen(JLabel lblImagen) {
        this.lblImagen = lblImagen;
    }

    public JLabel getLblMostrar() {
        return lblMostrar;
    }

    public void setLblMostrar(JLabel lblMostrar) {
        this.lblMostrar = lblMostrar;
    }

    public JLabel getLblMostrarApellido() {
        return lblMostrarApellido;
    }

    public void setLblMostrarApellido(JLabel lblMostrarApellido) {
        this.lblMostrarApellido = lblMostrarApellido;
    }

    public JLabel getLblMostrarCedula() {
        return lblMostrarCedula;
    }

    public void setLblMostrarCedula(JLabel lblMostrarCedula) {
        this.lblMostrarCedula = lblMostrarCedula;
    }

    public JLabel getLblMostrarCorreo() {
        return lblMostrarCorreo;
    }

    public void setLblMostrarCorreo(JLabel lblMostrarCorreo) {
        this.lblMostrarCorreo = lblMostrarCorreo;
    }

    public JLabel getLblMostrarDireccion() {
        return lblMostrarDireccion;
    }

    public void setLblMostrarDireccion(JLabel lblMostrarDireccion) {
        this.lblMostrarDireccion = lblMostrarDireccion;
    }

    public JLabel getLblMostrarNombre() {
        return lblMostrarNombre;
    }

    public void setLblMostrarNombre(JLabel lblMostrarNombre) {
        this.lblMostrarNombre = lblMostrarNombre;
    }

    public JLabel getLblMostrarTelefono() {
        return lblMostrarTelefono;
    }

    public void setLblMostrarTelefono(JLabel lblMostrarTelefono) {
        this.lblMostrarTelefono = lblMostrarTelefono;
    }

    public JLabel getLblNombre1() {
        return lblNombre1;
    }

    public void setLblNombre1(JLabel lblNombre1) {
        this.lblNombre1 = lblNombre1;
    }

    public JLabel getLblTelefono1() {
        return lblTelefono1;
    }

    public void setLblTelefono1(JLabel lblTelefono1) {
        this.lblTelefono1 = lblTelefono1;
    }

    public MiPerfilU(JButton btnCerrarSesion, JButton btnVolver, JPanel jPanel1, JLabel lblApellido1, JLabel lblCedula1, JLabel lblContraseña, JLabel lblContraseña1, JLabel lblCorreo1, JLabel lblDireccion1, JLabel lblIcono, JLabel lblImagen, JLabel lblMostrar, JLabel lblMostrarApellido, JLabel lblMostrarCedula, JLabel lblMostrarCorreo, JLabel lblMostrarDireccion, JLabel lblMostrarNombre, JLabel lblMostrarTelefono, JLabel lblNombre1, JLabel lblTelefono1) {
        this.btnCerrarSesion = btnCerrarSesion;
        this.btnVolver = btnVolver;
        this.jPanel1 = jPanel1;
        this.lblApellido1 = lblApellido1;
        this.lblCedula1 = lblCedula1;
        this.lblContraseña = lblContraseña;
        this.lblContraseña1 = lblContraseña1;
        this.lblCorreo1 = lblCorreo1;
        this.lblDireccion1 = lblDireccion1;
        this.lblIcono = lblIcono;
        this.lblImagen = lblImagen;
        this.lblMostrar = lblMostrar;
        this.lblMostrarApellido = lblMostrarApellido;
        this.lblMostrarCedula = lblMostrarCedula;
        this.lblMostrarCorreo = lblMostrarCorreo;
        this.lblMostrarDireccion = lblMostrarDireccion;
        this.lblMostrarNombre = lblMostrarNombre;
        this.lblMostrarTelefono = lblMostrarTelefono;
        this.lblNombre1 = lblNombre1;
        this.lblTelefono1 = lblTelefono1;
    }

}
