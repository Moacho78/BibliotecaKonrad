/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.ProveedorLibro;
import modelo.Usuario;
import vista.InicioEmpleado;
import vista.InicioUsuario;
import vista.Login;
import vista.MiPerfilE;
import vista.*;

/**
 *
 * @author migue
 */
public class Controlador implements ActionListener {

    Usuario objU = new Usuario();
    ProveedorLibro Proveedor = new ProveedorLibro();
    Usuario usuarioLogueado;
    Login objLogin;
    InicioUsuario objInicioU;
    InicioEmpleado objInicioE;
    MiPerfilE objMiPerfilE;
    MiPerfilU objMiPerfilU;
    Proveedor objProveedor;
    Usuarios objRegistrar;

    public Controlador() {
        objLogin = new Login();
        objLogin.setVisible(true);
        objLogin.getBtnAcceder().addActionListener(this);

        objInicioU = new InicioUsuario();
        objInicioU.getBtnReservas().addActionListener(this);
        objInicioU.getBtnBuscar().addActionListener(this);
        objInicioU.getBtnComprar().addActionListener(this);
        objInicioU.getBtnDevoluciones().addActionListener(this);
        objInicioU.getBtnEventos().addActionListener(this);
        objInicioU.getBtnIcono().addActionListener(this);
        objInicioU.getBtnMulta().addActionListener(this);
        objInicioU.getBtnNotificacion().addActionListener(this);
        objInicioU.getBtnPerfil().addActionListener(this);
        objInicioU.getBtnPrestamo().addActionListener(this);

        objInicioE = new InicioEmpleado();
        objInicioE.getBtnBuscar().addActionListener(this);
        objInicioE.getBtnCrear().addActionListener(this);
        objInicioE.getBtnDevoluciones().addActionListener(this);
        objInicioE.getBtnEjemplar().addActionListener(this);
        objInicioE.getBtnEvento().addActionListener(this);
        objInicioE.getBtnIcono().addActionListener(this);
        objInicioE.getBtnNotificacion().addActionListener(this);
        objInicioE.getBtnPerfil().addActionListener(this);
        objInicioE.getBtnReservas().addActionListener(this);

        objMiPerfilE = new MiPerfilE();
        objMiPerfilE.getBtnCerrarSesion().addActionListener(this);
        objMiPerfilE.getBtnHistorial().addActionListener(this);
        objMiPerfilE.getBtnInventario().addActionListener(this);
        objMiPerfilE.getBtnMultas().addActionListener(this);
        objMiPerfilE.getBtnNotificaciones().addActionListener(this);
        objMiPerfilE.getBtnSanciones().addActionListener(this);
        objMiPerfilE.getBtnVolver().addActionListener(this);

        objMiPerfilU = new MiPerfilU();
        objMiPerfilU.getBtnCerrarSesion().addActionListener(this);
        objMiPerfilU.getBtnVolver().addActionListener(this);

        objProveedor = new Proveedor();
        objProveedor.getBtnBuscar().addActionListener(this);
        objProveedor.getBtnDevoluciones().addActionListener(this);
        objProveedor.getBtnEjemplar().addActionListener(this);
        objProveedor.getBtnEvento().addActionListener(this);
        objProveedor.getBtnGuardar().addActionListener(this);
        objProveedor.getBtnIcono().addActionListener(this);
        objProveedor.getBtnInicio().addActionListener(this);
        objProveedor.getBtnNotificacion().addActionListener(this);
        objProveedor.getBtnPerfil().addActionListener(this);
        objProveedor.getBtnReservas().addActionListener(this);

    }// cierra constructor

    @Override
    public void actionPerformed(ActionEvent e) {
        if (objLogin.getBtnAcceder() == e.getSource()) {
            login();

        }

        if (objMiPerfilE.getBtnVolver() == e.getSource()) {
            objInicioE.setVisible(true);
            objMiPerfilE.setVisible(false);
        }

        if (objMiPerfilE.getBtnCerrarSesion() == e.getSource()) {

            usuarioLogueado = null;
            objLogin.setVisible(true);
            objMiPerfilE.setVisible(false);
        }

        if (objMiPerfilU.getBtnCerrarSesion() == e.getSource()) {
            usuarioLogueado = null;
            objLogin.setVisible(true);
            objMiPerfilU.setVisible(false);
        }

        if (objMiPerfilU.getBtnVolver() == e.getSource()) {
            objMiPerfilU.setVisible(false);
            objInicioU.setVisible(true);
        }

        if (objProveedor.getBtnPerfil() == e.getSource()) {
            objProveedor.setVisible(false);
            miPerfilE();
        }
        if (objProveedor.getBtnIcono() == e.getSource()) {
            objProveedor.setVisible(false);
            miPerfilE();
        }
        if (objProveedor.getBtnGuardar()==e.getSource()) {
            ingresarProveedor();
            objProveedor.setVisible(false);
            objInicioE.setVisible(true);
        }

    }// cierra action 

    public void login() {

        String correo = objLogin.getTxtCorreo().getText();
        String clave = objLogin.getPwdContraseña().getText();
        usuarioLogueado = objU.loginUsuario(correo, clave);
        if (usuarioLogueado.getRol() == 2) {
            objInicioU.setVisible(true);
        }

        if (usuarioLogueado.getRol() == 1) {
            objInicioE.setVisible(true);
        }
        objLogin.setVisible(false);

        System.out.println("Se logueo desde la clase controlador");
        System.out.print("El usuario  loguead desde el controlador es " + usuarioLogueado);
    }// cierra login 

    public void miPerfilE() {
        objMiPerfilE.getLblMostrarNombre().setText(usuarioLogueado.getNombre());
        objMiPerfilE.getLblMostrarApellido().setText(usuarioLogueado.getApellido());
        objMiPerfilE.getLblMostrarCedula().setText(usuarioLogueado.getUsuarioID());
        objMiPerfilE.getLblMostrarCorreo().setText(usuarioLogueado.getCorreo());
        objMiPerfilE.getLblMostrarTelefono().setText(usuarioLogueado.getTelefono());
        objMiPerfilE.getLblContraseña1().setText(usuarioLogueado.getClave());
        objMiPerfilE.getLblMostrarDireccion().setText(usuarioLogueado.getDireccion());
        objMiPerfilE.setVisible(true);

    }// cierra mi perfil E

    public void miPerfilU() {
        objMiPerfilU.getLblMostrarNombre().setText(usuarioLogueado.getNombre());
        objMiPerfilU.getLblMostrarApellido().setText(usuarioLogueado.getApellido());
        objMiPerfilU.getLblMostrarCedula().setText(usuarioLogueado.getUsuarioID());
        objMiPerfilU.getLblMostrarTelefono().setText(usuarioLogueado.getTelefono());
        objMiPerfilU.getLblMostrarDireccion().setText(usuarioLogueado.getDireccion());
        objMiPerfilU.getLblMostrarCorreo().setText(usuarioLogueado.getCorreo());
        objMiPerfilU.getLblContraseña1().setText(usuarioLogueado.getClave());
        objMiPerfilU.setVisible(true);
    }// cierra perfi u 

    public void ingresarProveedor() {

        String nombreProveedor = objProveedor.getTxtNombre().getText();
        String telefono = objProveedor.getTxtTelefono().getText();
        String correo = objProveedor.getTxtCorreo().getText();
        String contacto= objProveedor.getTxtContacto().getText();
        Proveedor.insertarProveedor(nombreProveedor, contacto, telefono, correo);
    }// cierr ingresar proveedor
    
    public void insertarUsuario(){
    int rol =2;
    String Nombre=objRegistrar.getTxtNombre().getText();
    objU.insertarUsuario(Nombre, Nombre, Nombre, Nombre, Nombre, rol, Nombre, Nombre);
    }
}// cierra class
