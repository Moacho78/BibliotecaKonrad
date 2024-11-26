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
public class Crear extends javax.swing.JFrame {

    /**
     * Creates new form Crear
     */
    public Crear() {

        initComponents();
        
        btnInicio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InicioEmpleado inicioEmpleado = new InicioEmpleado();
                inicioEmpleado.setVisible(true);
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
        btnDevoluciones.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DevolucionE devolocionE = new DevolucionE();
                devolocionE.setVisible(true);
                dispose(); // Cierra la ventana actual

            }
        });

        btnReservas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ReservaE reservaE = new ReservaE();
                reservaE.setVisible(true);
                dispose(); // Cierra la ventana actual

            }
        });

        btnBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BuscarLibroE buscarLibroE = new BuscarLibroE();
                buscarLibroE.setVisible(true);
                dispose(); // Cierra la ventana actual

            }
        });

        btnEjemplar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ejemplar ejemplar = new Ejemplar();
                ejemplar.setVisible(true);
                dispose(); // Cierra la ventana actual

            }
        });

        btnNotificacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NotificacionE notificacionE = new NotificacionE();
                notificacionE.setVisible(true);
                dispose(); // Cierra la ventana actual

            }
        });

        btnIcono.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MiPerfilE perfirE = new MiPerfilE();
                perfirE.setVisible(true);
                dispose(); // Cierra la ventana actual

            }
        });

        btnPerfil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MiPerfilE perfirE = new MiPerfilE();
                perfirE.setVisible(true);
                dispose(); // Cierra la ventana actual

            }
        });

        btnEditorial.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Editorial editorial = new Editorial();
                editorial.setVisible(true);
                dispose(); // Cierra la ventana actual

            }
        });
        btnSucursal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Sucursal sucursal = new Sucursal();
                sucursal.setVisible(true);
                dispose(); // Cierra la ventana actual

            }
        });

        btnProveedor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Proveedor proveedor = new Proveedor();
                proveedor.setVisible(true);
                dispose(); // Cierra la ventana actual

            }
        });

        btnLibro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Libro libro = new Libro();
                libro.setVisible(true);
                dispose(); // Cierra la ventana actual

            }
        });

        btnAutor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Autor autor = new Autor();
                autor.setVisible(true);
                dispose(); // Cierra la ventana actual

            }
        });

        btnEjemplar2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ejemplar ejemplar = new Ejemplar();
                ejemplar.setVisible(true);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnEditorial = new javax.swing.JButton();
        btnLibro = new javax.swing.JButton();
        btnSucursal = new javax.swing.JButton();
        btnAutor = new javax.swing.JButton();
        btnProveedor = new javax.swing.JButton();
        btnReservas = new javax.swing.JButton();
        btnPerfil = new javax.swing.JButton();
        btnNotificacion = new javax.swing.JButton();
        btnIcono = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnEjemplar = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        lblBiblioteca = new javax.swing.JLabel();
        lblkonrad = new javax.swing.JLabel();
        btnEvento = new javax.swing.JButton();
        btnDevoluciones = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        lblCrear = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnEjemplar2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("jLabel1");

        btnEditorial.setText("Editorial");

        btnLibro.setText("Libro");

        btnSucursal.setText("Sucursal");

        btnAutor.setText("Autor");

        btnProveedor.setText("Proveerdor");

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

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/konrad2.png"))); // NOI18N

        lblBiblioteca.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBiblioteca.setText("Biblioteca");

        lblkonrad.setText("Konrad");

        btnEvento.setText("Eventos");
        btnEvento.setContentAreaFilled(false);

        btnDevoluciones.setText("Devoluciones");
        btnDevoluciones.setContentAreaFilled(false);

        btnInicio.setText("Inicio");
        btnInicio.setContentAreaFilled(false);

        lblCrear.setText("Crear");

        jLabel2.setText("jLabel2");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("¡Elige lo que deseas crear!");

        btnEjemplar2.setText("Ejemplar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnPerfil))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblkonrad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnInicio)
                                .addGap(24, 24, 24)
                                .addComponent(lblCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnLibro)
                                    .addComponent(btnEditorial))
                                .addGap(40, 40, 40)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEvento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDevoluciones)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnAutor)
                                    .addComponent(btnSucursal))
                                .addGap(80, 80, 80)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnReservas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEjemplar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnNotificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnIcono, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnEjemplar2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnProveedor))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(9, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
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
                                .addComponent(btnEvento)
                                .addComponent(btnDevoluciones)
                                .addComponent(btnReservas)
                                .addComponent(btnBuscar)
                                .addComponent(btnEjemplar)
                                .addComponent(btnInicio)
                                .addComponent(lblCrear)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPerfil))
                    .addComponent(btnIcono, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnEditorial)
                                    .addComponent(btnSucursal)
                                    .addComponent(btnProveedor))
                                .addGap(56, 56, 56)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnAutor)
                                    .addComponent(btnLibro)
                                    .addComponent(btnEjemplar2))
                                .addGap(94, 94, 94))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))))
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

    private void btnPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPerfilActionPerformed

    private void btnIconoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIconoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIconoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAutor;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnDevoluciones;
    private javax.swing.JButton btnEditorial;
    private javax.swing.JButton btnEjemplar;
    private javax.swing.JButton btnEjemplar2;
    private javax.swing.JButton btnEvento;
    private javax.swing.JButton btnIcono;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnLibro;
    private javax.swing.JButton btnNotificacion;
    private javax.swing.JButton btnPerfil;
    private javax.swing.JButton btnProveedor;
    private javax.swing.JButton btnReservas;
    private javax.swing.JButton btnSucursal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBiblioteca;
    private javax.swing.JLabel lblCrear;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblkonrad;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnAutor() {
        return btnAutor;
    }

    public void setBtnAutor(JButton btnAutor) {
        this.btnAutor = btnAutor;
    }

    public JButton getBtnBuscar() {
        return btnBuscar;
    }

    public void setBtnBuscar(JButton btnBuscar) {
        this.btnBuscar = btnBuscar;
    }

    public JButton getBtnDevoluciones() {
        return btnDevoluciones;
    }

    public void setBtnDevoluciones(JButton btnDevoluciones) {
        this.btnDevoluciones = btnDevoluciones;
    }

    public JButton getBtnEditorial() {
        return btnEditorial;
    }

    public void setBtnEditorial(JButton btnEditorial) {
        this.btnEditorial = btnEditorial;
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

    public JButton getBtnInicio() {
        return btnInicio;
    }

    public void setBtnInicio(JButton btnInicio) {
        this.btnInicio = btnInicio;
    }

    public JButton getBtnLibro() {
        return btnLibro;
    }

    public void setBtnLibro(JButton btnLibro) {
        this.btnLibro = btnLibro;
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

    public JButton getBtnProveedor() {
        return btnProveedor;
    }

    public void setBtnProveedor(JButton btnProveedor) {
        this.btnProveedor = btnProveedor;
    }

    public JButton getBtnReservas() {
        return btnReservas;
    }

    public void setBtnReservas(JButton btnReservas) {
        this.btnReservas = btnReservas;
    }

    public JButton getBtnSucursal() {
        return btnSucursal;
    }

    public void setBtnSucursal(JButton btnSucursal) {
        this.btnSucursal = btnSucursal;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
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

    public JLabel getLblCrear() {
        return lblCrear;
    }

    public void setLblCrear(JLabel lblCrear) {
        this.lblCrear = lblCrear;
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

    public JButton getBtnEjemplar2() {
        return btnEjemplar2;
    }

    public void setBtnEjemplar2(JButton btnEjemplar2) {
        this.btnEjemplar2 = btnEjemplar2;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public Crear(JButton btnAutor, JButton btnBuscar, JButton btnDevoluciones, JButton btnEditorial, JButton btnEjemplar, JButton btnEjemplar2, JButton btnEvento, JButton btnIcono, JButton btnInicio, JButton btnLibro, JButton btnNotificacion, JButton btnPerfil, JButton btnProveedor, JButton btnReservas, JButton btnSucursal, JLabel jLabel1, JLabel jLabel2, JLabel jLabel3, JPanel jPanel1, JLabel lblBiblioteca, JLabel lblCrear, JLabel lblLogo, JLabel lblkonrad) {
        this.btnAutor = btnAutor;
        this.btnBuscar = btnBuscar;
        this.btnDevoluciones = btnDevoluciones;
        this.btnEditorial = btnEditorial;
        this.btnEjemplar = btnEjemplar;
        this.btnEjemplar2 = btnEjemplar2;
        this.btnEvento = btnEvento;
        this.btnIcono = btnIcono;
        this.btnInicio = btnInicio;
        this.btnLibro = btnLibro;
        this.btnNotificacion = btnNotificacion;
        this.btnPerfil = btnPerfil;
        this.btnProveedor = btnProveedor;
        this.btnReservas = btnReservas;
        this.btnSucursal = btnSucursal;
        this.jLabel1 = jLabel1;
        this.jLabel2 = jLabel2;
        this.jLabel3 = jLabel3;
        this.jPanel1 = jPanel1;
        this.lblBiblioteca = lblBiblioteca;
        this.lblCrear = lblCrear;
        this.lblLogo = lblLogo;
        this.lblkonrad = lblkonrad;
    }

}
