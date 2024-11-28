/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author USUARIO
 */
public class ReservaE extends javax.swing.JFrame {

    /**
     * Creates new form Reserva
     */
    public ReservaE() {
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReservaE().setVisible(false);
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
        btnReserva = new javax.swing.JButton();
        btnCrear = new javax.swing.JButton();
        txtCedula = new javax.swing.JTextField();
        btnReservas = new javax.swing.JButton();
        lblEjemplar = new javax.swing.JLabel();
        btnPerfil = new javax.swing.JButton();
        txtEjemplar = new javax.swing.JTextField();
        btnNotificacion = new javax.swing.JButton();
        lblFecha = new javax.swing.JLabel();
        lblBiblioteca = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        btnIcono = new javax.swing.JButton();
        lblEstado = new javax.swing.JLabel();
        lblkonrad = new javax.swing.JLabel();
        cmbEstado = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        lblInicio = new javax.swing.JLabel();
        btnEvento = new javax.swing.JButton();
        btnDevoluciones = new javax.swing.JButton();
        lblCedula = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnReserva.setText("Reservar");

        btnCrear.setText("Crear ");
        btnCrear.setContentAreaFilled(false);

        btnReservas.setText("Reservas");
        btnReservas.setContentAreaFilled(false);

        lblEjemplar.setText("Ejemplar");

        btnPerfil.setText("Mi perfil");
        btnPerfil.setContentAreaFilled(false);
        btnPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerfilActionPerformed(evt);
            }
        });

        btnNotificacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/Notifiacion.png"))); // NOI18N
        btnNotificacion.setContentAreaFilled(false);

        lblFecha.setText("Fecha Reserva");

        lblBiblioteca.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBiblioteca.setText("Biblioteca");

        btnIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/Usuario.png"))); // NOI18N
        btnIcono.setContentAreaFilled(false);
        btnIcono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIconoActionPerformed(evt);
            }
        });

        lblEstado.setText("Estado");

        lblkonrad.setText("Konrad");

        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "....", "Disponible", "Reservado" }));

        btnBuscar.setText("Buscar Libro");
        btnBuscar.setContentAreaFilled(false);

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/konrad2.png"))); // NOI18N

        lblInicio.setText("Inicio");

        btnEvento.setText("Eventos");
        btnEvento.setContentAreaFilled(false);

        btnDevoluciones.setText("Devoluciones");
        btnDevoluciones.setContentAreaFilled(false);

        lblCedula.setText("Cedula Ciudadania");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblLogo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPerfil, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblkonrad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnEvento)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnDevoluciones)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnReservas)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnBuscar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnNotificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnIcono, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEjemplar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblEjemplar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                                    .addComponent(lblEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(btnReserva)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblBiblioteca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblkonrad))
                    .addComponent(lblLogo)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnNotificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblInicio)
                                .addComponent(btnCrear)
                                .addComponent(btnEvento)
                                .addComponent(btnDevoluciones)
                                .addComponent(btnReservas)
                                .addComponent(btnBuscar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPerfil))
                    .addComponent(btnIcono, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCedula)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEjemplar)
                    .addComponent(txtEjemplar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFecha)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstado)
                    .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(btnReserva)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPerfilActionPerformed

    private void btnIconoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIconoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIconoActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnDevoluciones;
    private javax.swing.JButton btnEvento;
    private javax.swing.JButton btnIcono;
    private javax.swing.JButton btnNotificacion;
    private javax.swing.JButton btnPerfil;
    private javax.swing.JButton btnReserva;
    private javax.swing.JButton btnReservas;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBiblioteca;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblEjemplar;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblInicio;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblkonrad;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtEjemplar;
    private javax.swing.JTextField txtFecha;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnBuscar() {
        return btnBuscar;
    }

    public void setBtnBuscar(JButton btnBuscar) {
        this.btnBuscar = btnBuscar;
    }

    public JButton getBtnCrear() {
        return btnCrear;
    }

    public void setBtnCrear(JButton btnCrear) {
        this.btnCrear = btnCrear;
    }

    public JButton getBtnDevoluciones() {
        return btnDevoluciones;
    }

    public void setBtnDevoluciones(JButton btnDevoluciones) {
        this.btnDevoluciones = btnDevoluciones;
    }

   

    public JButton getBtnEvento() {
        return btnEvento;
    }

    public void setBtnEvento(JButton btnEvento) {
        this.btnEvento = btnEvento;
    }

    public JButton getBtnIcono() {
        return btnIcono;
    }

    public void setBtnIcono(JButton btnIcono) {
        this.btnIcono = btnIcono;
    }

    public JButton getBtnNotificacion() {
        return btnNotificacion;
    }

    public void setBtnNotificacion(JButton btnNotificacion) {
        this.btnNotificacion = btnNotificacion;
    }

    public JButton getBtnPerfil() {
        return btnPerfil;
    }

    public void setBtnPerfil(JButton btnPerfil) {
        this.btnPerfil = btnPerfil;
    }

    public JButton getBtnReserva() {
        return btnReserva;
    }

    public void setBtnReserva(JButton btnReserva) {
        this.btnReserva = btnReserva;
    }

    public JButton getBtnReservas() {
        return btnReservas;
    }

    public void setBtnReservas(JButton btnReservas) {
        this.btnReservas = btnReservas;
    }

    public JComboBox<String> getCmbEstado() {
        return cmbEstado;
    }

    public void setCmbEstado(JComboBox<String> cmbEstado) {
        this.cmbEstado = cmbEstado;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JLabel getLblBiblioteca() {
        return lblBiblioteca;
    }

    public void setLblBiblioteca(JLabel lblBiblioteca) {
        this.lblBiblioteca = lblBiblioteca;
    }

    public JLabel getLblCedula() {
        return lblCedula;
    }

    public void setLblCedula(JLabel lblCedula) {
        this.lblCedula = lblCedula;
    }

    public JLabel getLblEjemplar() {
        return lblEjemplar;
    }

    public void setLblEjemplar(JLabel lblEjemplar) {
        this.lblEjemplar = lblEjemplar;
    }

    public JLabel getLblEstado() {
        return lblEstado;
    }

    public void setLblEstado(JLabel lblEstado) {
        this.lblEstado = lblEstado;
    }

    public JLabel getLblFecha() {
        return lblFecha;
    }

    public void setLblFecha(JLabel lblFecha) {
        this.lblFecha = lblFecha;
    }

    public JLabel getLblInicio() {
        return lblInicio;
    }

    public void setLblInicio(JLabel lblInicio) {
        this.lblInicio = lblInicio;
    }

    public JLabel getLblLogo() {
        return lblLogo;
    }

    public void setLblLogo(JLabel lblLogo) {
        this.lblLogo = lblLogo;
    }

    public JLabel getLblkonrad() {
        return lblkonrad;
    }

    public void setLblkonrad(JLabel lblkonrad) {
        this.lblkonrad = lblkonrad;
    }

    public JTextField getTxtCedula() {
        return txtCedula;
    }

    public void setTxtCedula(JTextField txtCedula) {
        this.txtCedula = txtCedula;
    }

    public JTextField getTxtEjemplar() {
        return txtEjemplar;
    }

    public void setTxtEjemplar(JTextField txtEjemplar) {
        this.txtEjemplar = txtEjemplar;
    }

    public JTextField getTxtFecha() {
        return txtFecha;
    }

    public void setTxtFecha(JTextField txtFecha) {
        this.txtFecha = txtFecha;
    }

    public ReservaE(JButton btnBuscar, JButton btnCrear, JButton btnDevoluciones,JButton btnEvento, JButton btnIcono, JButton btnNotificacion, JButton btnPerfil, JButton btnReserva, JButton btnReservas, JComboBox<String> cmbEstado, JPanel jPanel1, JLabel lblBiblioteca, JLabel lblCedula, JLabel lblEjemplar, JLabel lblEstado, JLabel lblFecha, JLabel lblInicio, JLabel lblLogo, JLabel lblkonrad, JTextField txtCedula, JTextField txtEjemplar, JTextField txtFecha) {
        this.btnBuscar = btnBuscar;
        this.btnCrear = btnCrear;
        this.btnDevoluciones = btnDevoluciones;
       
        this.btnEvento = btnEvento;
        this.btnIcono = btnIcono;
        this.btnNotificacion = btnNotificacion;
        this.btnPerfil = btnPerfil;
        this.btnReserva = btnReserva;
        this.btnReservas = btnReservas;
        this.cmbEstado = cmbEstado;
        this.jPanel1 = jPanel1;
        this.lblBiblioteca = lblBiblioteca;
        this.lblCedula = lblCedula;
        this.lblEjemplar = lblEjemplar;
        this.lblEstado = lblEstado;
        this.lblFecha = lblFecha;
        this.lblInicio = lblInicio;
        this.lblLogo = lblLogo;
        this.lblkonrad = lblkonrad;
        this.txtCedula = txtCedula;
        this.txtEjemplar = txtEjemplar;
        this.txtFecha = txtFecha;
    }

}
