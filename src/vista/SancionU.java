/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author USUARIO
 */
public class SancionU extends javax.swing.JFrame {

    /**
     * Creates new form SancionU
     */
    public SancionU() {
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

        jPanel1 = new javax.swing.JPanel();
        btnDevoluciones = new javax.swing.JButton();
        btnComprar = new javax.swing.JButton();
        btnReservas = new javax.swing.JButton();
        btnEventos = new javax.swing.JButton();
        btnPerfil = new javax.swing.JButton();
        btnMulta = new javax.swing.JButton();
        btnNotificacion = new javax.swing.JButton();
        btnPrestamo1 = new javax.swing.JButton();
        btnIcono = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        lblBiblioteca = new javax.swing.JLabel();
        lblkonrad = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnInicio = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBuscar = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnDevoluciones.setText("Devolución");
        btnDevoluciones.setContentAreaFilled(false);

        btnComprar.setText("Comprar");
        btnComprar.setContentAreaFilled(false);

        btnReservas.setText("Reservas");
        btnReservas.setContentAreaFilled(false);

        btnEventos.setText("Eventos");
        btnEventos.setContentAreaFilled(false);

        btnPerfil.setText("Mi perfil");
        btnPerfil.setContentAreaFilled(false);
        btnPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerfilActionPerformed(evt);
            }
        });

        btnMulta.setText("Multas");
        btnMulta.setContentAreaFilled(false);

        btnNotificacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/Notifiacion.png"))); // NOI18N
        btnNotificacion.setContentAreaFilled(false);

        btnPrestamo1.setText("Prestamo");
        btnPrestamo1.setContentAreaFilled(false);
        btnPrestamo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrestamo1ActionPerformed(evt);
            }
        });

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

        jLabel1.setText("Sanción");

        btnInicio.setText("Inicio");
        btnInicio.setContentAreaFilled(false);

        tblBuscar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Sanción", "Motivo", "Fecha Aplicación", "Estado"
            }
        ));
        jScrollPane1.setViewportView(tblBuscar);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblkonrad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInicio)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNotificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPerfil)
                    .addComponent(btnIcono, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNotificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnIcono, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPerfil))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblBiblioteca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblkonrad)
                            .addComponent(btnComprar)
                            .addComponent(btnReservas)
                            .addComponent(btnDevoluciones)
                            .addComponent(btnEventos)
                            .addComponent(btnBuscar)
                            .addComponent(btnMulta)
                            .addComponent(btnPrestamo1)
                            .addComponent(jLabel1)
                            .addComponent(btnInicio)))
                    .addComponent(lblLogo))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPerfilActionPerformed

    private void btnPrestamo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrestamo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPrestamo1ActionPerformed

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
            java.util.logging.Logger.getLogger(SancionU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SancionU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SancionU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SancionU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SancionU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnDevoluciones;
    private javax.swing.JButton btnEventos;
    private javax.swing.JButton btnIcono;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnMulta;
    private javax.swing.JButton btnNotificacion;
    private javax.swing.JButton btnPerfil;
    private javax.swing.JButton btnPrestamo1;
    private javax.swing.JButton btnReservas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBiblioteca;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblkonrad;
    private javax.swing.JTable tblBuscar;
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

    public JButton getBtnInicio() {
        return btnInicio;
    }

    public void setBtnInicio(JButton btnInicio) {
        this.btnInicio = btnInicio;
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

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JLabel getLblBiblioteca() {
        return lblBiblioteca;
    }

    public void setLblBiblioteca(JLabel lblBiblioteca) {
        this.lblBiblioteca = lblBiblioteca;
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

    public JTable getTblBuscar() {
        return tblBuscar;
    }

    public void setTblBuscar(JTable tblBuscar) {
        this.tblBuscar = tblBuscar;
    }

    public SancionU(JButton btnBuscar, JButton btnComprar, JButton btnDevoluciones, JButton btnEventos, JButton btnIcono, JButton btnInicio, JButton btnMulta, JButton btnNotificacion, JButton btnPerfil, JButton btnPrestamo1, JButton btnReservas, JLabel jLabel1, JPanel jPanel1, JScrollPane jScrollPane1, JLabel lblBiblioteca, JLabel lblLogo, JLabel lblkonrad, JTable tblBuscar) {
        this.btnBuscar = btnBuscar;
        this.btnComprar = btnComprar;
        this.btnDevoluciones = btnDevoluciones;
        this.btnEventos = btnEventos;
        this.btnIcono = btnIcono;
        this.btnInicio = btnInicio;
        this.btnMulta = btnMulta;
        this.btnNotificacion = btnNotificacion;
        this.btnPerfil = btnPerfil;
        this.btnPrestamo1 = btnPrestamo1;
        this.btnReservas = btnReservas;
        this.jLabel1 = jLabel1;
        this.jPanel1 = jPanel1;
        this.jScrollPane1 = jScrollPane1;
        this.lblBiblioteca = lblBiblioteca;
        this.lblLogo = lblLogo;
        this.lblkonrad = lblkonrad;
        this.tblBuscar = tblBuscar;
    }

}
