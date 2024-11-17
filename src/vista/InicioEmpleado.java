/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;

/**
 *
 * @author USUARIO
 */
public class InicioEmpleado extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public InicioEmpleado() {
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

        lblBiblioteca = new javax.swing.JLabel();
        lblkonrad = new javax.swing.JLabel();
        lblInicio = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        btnEvento = new javax.swing.JButton();
        btnDevoluciones = new javax.swing.JButton();
        btnCrear = new javax.swing.JButton();
        btnReservas = new javax.swing.JButton();
        btnPerfil = new javax.swing.JButton();
        btnNotificacion = new javax.swing.JButton();
        btnIcono = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnEjemplar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblBiblioteca.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBiblioteca.setText("Biblioteca");

        lblkonrad.setText("Konrad");

        lblInicio.setText("Inicio");

        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/imagen.png"))); // NOI18N

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/konrad2.png"))); // NOI18N

        btnEvento.setText("Eventos");
        btnEvento.setContentAreaFilled(false);

        btnDevoluciones.setText("Devoluciones");
        btnDevoluciones.setContentAreaFilled(false);

        btnCrear.setText("Crear ");
        btnCrear.setContentAreaFilled(false);

        btnReservas.setText("Reservas");
        btnReservas.setContentAreaFilled(false);

        btnPerfil.setText("Mi perfil");
        btnPerfil.setContentAreaFilled(false);
        btnPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerfilActionPerformed(evt);
            }
        });

        btnNotificacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/Notifiacion.png"))); // NOI18N
        btnNotificacion.setContentAreaFilled(false);

        btnIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/Usuario.png"))); // NOI18N
        btnIcono.setContentAreaFilled(false);
        btnIcono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIconoActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar Libro");
        btnBuscar.setContentAreaFilled(false);

        btnEjemplar.setText("Ejemplar");
        btnEjemplar.setContentAreaFilled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblLogo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblkonrad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblBiblioteca, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
                                .addGap(40, 40, 40)
                                .addComponent(lblInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEvento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDevoluciones)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnReservas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEjemplar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnNotificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnIcono, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnPerfil, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblBiblioteca)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblkonrad))
                            .addComponent(lblLogo)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnNotificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblInicio)
                                        .addComponent(btnCrear)
                                        .addComponent(btnEvento)
                                        .addComponent(btnDevoluciones)
                                        .addComponent(btnReservas)
                                        .addComponent(btnBuscar)
                                        .addComponent(btnEjemplar)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnPerfil))))
                    .addComponent(btnIcono, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
            java.util.logging.Logger.getLogger(InicioEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnDevoluciones;
    private javax.swing.JButton btnEjemplar;
    private javax.swing.JButton btnEvento;
    private javax.swing.JButton btnIcono;
    private javax.swing.JButton btnNotificacion;
    private javax.swing.JButton btnPerfil;
    private javax.swing.JButton btnReservas;
    private javax.swing.JLabel lblBiblioteca;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblInicio;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblkonrad;
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

    public JButton getBtnEjemplar() {
        return btnEjemplar;
    }

    public void setBtnEjemplar(JButton btnEjemplar) {
        this.btnEjemplar = btnEjemplar;
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

    public JButton getBtnReservas() {
        return btnReservas;
    }

    public void setBtnReservas(JButton btnReservas) {
        this.btnReservas = btnReservas;
    }

    public JLabel getLblBiblioteca() {
        return lblBiblioteca;
    }

    public void setLblBiblioteca(JLabel lblBiblioteca) {
        this.lblBiblioteca = lblBiblioteca;
    }

    public JLabel getLblImagen() {
        return lblImagen;
    }

    public void setLblImagen(JLabel lblImagen) {
        this.lblImagen = lblImagen;
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

    public InicioEmpleado(JButton btnBuscar, JButton btnCrear, JButton btnDevoluciones, JButton btnEjemplar, JButton btnEvento, JButton btnIcono, JButton btnNotificacion, JButton btnPerfil, JButton btnReservas, JLabel lblBiblioteca, JLabel lblImagen, JLabel lblInicio, JLabel lblLogo, JLabel lblkonrad) {
        this.btnBuscar = btnBuscar;
        this.btnCrear = btnCrear;
        this.btnDevoluciones = btnDevoluciones;
        this.btnEjemplar = btnEjemplar;
        this.btnEvento = btnEvento;
        this.btnIcono = btnIcono;
        this.btnNotificacion = btnNotificacion;
        this.btnPerfil = btnPerfil;
        this.btnReservas = btnReservas;
        this.lblBiblioteca = lblBiblioteca;
        this.lblImagen = lblImagen;
        this.lblInicio = lblInicio;
        this.lblLogo = lblLogo;
        this.lblkonrad = lblkonrad;
    }

 

}
