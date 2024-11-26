/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author USUARIO
 */
public class InicioUsuario extends javax.swing.JFrame {

    /**
     * Creates new form InicioE
     */
    public InicioUsuario() {
        initComponents();

        btnComprar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Comprar comprar = new Comprar();
                comprar.setVisible(true);
                dispose(); // Cierra la ventana actual

            }
        });

        btnReservas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ReservaU reservaU = new ReservaU();
                reservaU.setVisible(true);
                dispose(); // Cierra la ventana actual

            }
        });

        btnDevoluciones.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DevoluciónU devolocionU = new DevoluciónU();
                devolocionU.setVisible(true);
                dispose(); // Cierra la ventana actual

            }
        });
        /*btnEvento.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Sucursal sucursal = new Sucursal();
                sucursal.setVisible(true);
                dispose(); // Cierra la ventana actual

            }
        });*/ // A QUE VISTA DEBE DIRIGIRSE

        btnBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BuscarLibroU buscarLibroU = new BuscarLibroU();
                buscarLibroU.setVisible(true);
                dispose(); // Cierra la ventana actual

            }
        });

        btnMulta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Multas multas = new Multas();
                multas.setVisible(true);
                dispose(); // Cierra la ventana actual

            }
        });
        
        btnPrestamo1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Multas multas = new Multas();
                multas.setVisible(true);
                dispose(); // Cierra la ventana actual

            }
        });

        btnNotificacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NotificacionesU notificacionU = new NotificacionesU();
                notificacionU.setVisible(true);
                dispose(); // Cierra la ventana actual

            }
        });

        btnIcono.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MiPerfilU perfirU = new MiPerfilU();
                perfirU.setVisible(true);
                dispose(); // Cierra la ventana actual

            }
        });

        btnPerfil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MiPerfilU perfirU = new MiPerfilU();
                perfirU.setVisible(true);
                dispose(); // Cierra la ventana actual

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

        jSlider1 = new javax.swing.JSlider();
        btnPrestamo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnReservas = new javax.swing.JButton();
        btnPerfil = new javax.swing.JButton();
        btnNotificacion = new javax.swing.JButton();
        btnIcono = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        lblBiblioteca = new javax.swing.JLabel();
        lblkonrad = new javax.swing.JLabel();
        lblInicio = new javax.swing.JLabel();
        btnDevoluciones = new javax.swing.JButton();
        btnComprar = new javax.swing.JButton();
        btnEventos = new javax.swing.JButton();
        btnMulta = new javax.swing.JButton();
        btnPrestamo1 = new javax.swing.JButton();
        lblImagen = new javax.swing.JLabel();

        btnPrestamo.setText("Prestamo");
        btnPrestamo.setContentAreaFilled(false);
        btnPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrestamoActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/konrad2.png"))); // NOI18N

        lblBiblioteca.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBiblioteca.setText("Biblioteca");

        lblkonrad.setText("Konrad");

        lblInicio.setText("Inicio");

        btnDevoluciones.setText("Devolución");
        btnDevoluciones.setContentAreaFilled(false);

        btnComprar.setText("Comprar");
        btnComprar.setContentAreaFilled(false);

        btnEventos.setText("Eventos");
        btnEventos.setContentAreaFilled(false);

        btnMulta.setText("Multas");
        btnMulta.setContentAreaFilled(false);

        btnPrestamo1.setText("Prestamo");
        btnPrestamo1.setContentAreaFilled(false);
        btnPrestamo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrestamo1ActionPerformed(evt);
            }
        });

        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/imagen.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblImagen)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblLogo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblkonrad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(lblInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnComprar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnReservas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDevoluciones)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEventos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMulta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPrestamo1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNotificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnIcono, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 8, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnPerfil))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNotificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnIcono, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPerfil))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblBiblioteca)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblkonrad)
                                    .addComponent(lblInicio)
                                    .addComponent(btnComprar)
                                    .addComponent(btnReservas)
                                    .addComponent(btnDevoluciones)
                                    .addComponent(btnEventos)
                                    .addComponent(btnBuscar)
                                    .addComponent(btnMulta)
                                    .addComponent(btnPrestamo1)))
                            .addComponent(lblLogo))))
                .addGap(30, 30, 30)
                .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void btnPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrestamoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPrestamoActionPerformed

    private void btnPrestamo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrestamo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPrestamo1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnDevoluciones;
    private javax.swing.JButton btnEventos;
    private javax.swing.JButton btnIcono;
    private javax.swing.JButton btnMulta;
    private javax.swing.JButton btnNotificacion;
    private javax.swing.JButton btnPerfil;
    private javax.swing.JButton btnPrestamo;
    private javax.swing.JButton btnPrestamo1;
    private javax.swing.JButton btnReservas;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSlider jSlider1;
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

    public JButton getBtnComprar() {
        return btnComprar;
    }

    public void setBtnComprar(JButton btnComprar) {
        this.btnComprar = btnComprar;
    }

    public JButton getBtnDevoluciones() {
        return btnDevoluciones;
    }

    public void setBtnDevoluciones(JButton btnDevoluciones) {
        this.btnDevoluciones = btnDevoluciones;
    }

    public JButton getBtnEventos() {
        return btnEventos;
    }

    public void setBtnEventos(JButton btnEventos) {
        this.btnEventos = btnEventos;
    }

    public JButton getBtnIcono() {
        return btnIcono;
    }

    public void setBtnIcono(JButton btnIcono) {
        this.btnIcono = btnIcono;
    }

    public JButton getBtnMulta() {
        return btnMulta;
    }

    public void setBtnMulta(JButton btnMulta) {
        this.btnMulta = btnMulta;
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

    public JButton getBtnPrestamo() {
        return btnPrestamo;
    }

    public void setBtnPrestamo(JButton btnPrestamo) {
        this.btnPrestamo = btnPrestamo;
    }

    public JButton getBtnPrestamo1() {
        return btnPrestamo1;
    }

    public void setBtnPrestamo1(JButton btnPrestamo1) {
        this.btnPrestamo1 = btnPrestamo1;
    }

    public JButton getBtnReservas() {
        return btnReservas;
    }

    public void setBtnReservas(JButton btnReservas) {
        this.btnReservas = btnReservas;
    }

    public JPanel getjPanel2() {
        return jPanel2;
    }

    public void setjPanel2(JPanel jPanel2) {
        this.jPanel2 = jPanel2;
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

    public InicioUsuario(JButton btnBuscar, JButton btnComprar, JButton btnDevoluciones, JButton btnEventos, JButton btnIcono, JButton btnMulta, JButton btnNotificacion, JButton btnPerfil, JButton btnPrestamo, JButton btnPrestamo1, JButton btnReservas, JPanel jPanel2, JLabel lblBiblioteca, JLabel lblImagen, JLabel lblInicio, JLabel lblLogo, JLabel lblkonrad) {
        this.btnBuscar = btnBuscar;
        this.btnComprar = btnComprar;
        this.btnDevoluciones = btnDevoluciones;
        this.btnEventos = btnEventos;
        this.btnIcono = btnIcono;
        this.btnMulta = btnMulta;
        this.btnNotificacion = btnNotificacion;
        this.btnPerfil = btnPerfil;
        this.btnPrestamo = btnPrestamo;
        this.btnPrestamo1 = btnPrestamo1;
        this.btnReservas = btnReservas;
        this.jPanel2 = jPanel2;
        this.lblBiblioteca = lblBiblioteca;
        this.lblImagen = lblImagen;
        this.lblInicio = lblInicio;
        this.lblLogo = lblLogo;
        this.lblkonrad = lblkonrad;
    }

}
