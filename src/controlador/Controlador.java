/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.*;
import vista.*;

/**
 *
 * @author migue
 */
public class Controlador implements ActionListener {

    Usuario objU = new Usuario();
    ProveedorLibro Proveedor = new ProveedorLibro();
    AutorModelo AutorModelo = new AutorModelo();
    Reserva Reserva = new Reserva();
    SucursalModelo SucursalModelo = new SucursalModelo();
    Devolucion Devolucion = new Devolucion();
    Libros Libros = new Libros();
    EditorialModelo EditorialModelo = new EditorialModelo();
    EjemplarModelo EjemplarModelo = new EjemplarModelo();
    EventoBiblioteca EventoBiblioteca = new EventoBiblioteca();
    Notificacion Notificacion = new Notificacion();
    Usuario usuarioLogueado;
    Login objLogin;
    InicioUsuario objInicioU;
    InicioEmpleado objInicioE;
    MiPerfilE objMiPerfilE;
    MiPerfilU objMiPerfilU;
    Proveedor objProveedor;
    Usuarios objRegistrar;
    Crear objCrear;
    Autor objAutor;
    ReservaE objReservaE;
    Sucursal objSucursal;
    BuscarLibroE objBuscarLibroE;
    DevolucionE objDevolucionE;
    Editorial objEditorial;
    Ejemplar objEjemplar;
    Evento objEvento;
    Evento2 objEvento2;
    Libro objLibro;
    NotificacionE objNotificacionE;

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

        objCrear = new Crear();
        objCrear.getBtnAutor().addActionListener(this);
        objCrear.getBtnBuscar().addActionListener(this);
        objCrear.getBtnDevoluciones().addActionListener(this);
        objCrear.getBtnEditorial().addActionListener(this);
        objCrear.getBtnEjemplar().addActionListener(this);
        objCrear.getBtnEjemplar2().addActionListener(this);
        objCrear.getBtnEvento().addActionListener(this);
        objCrear.getBtnIcono().addActionListener(this);
        objCrear.getBtnInicio().addActionListener(this);
        objCrear.getBtnLibro().addActionListener(this);
        objCrear.getBtnNotificacion().addActionListener(this);
        objCrear.getBtnPerfil().addActionListener(this);
        objCrear.getBtnProveedor().addActionListener(this);
        objCrear.getBtnReservas().addActionListener(this);
        objCrear.getBtnSucursal().addActionListener(this);

        objAutor = new Autor();
        objAutor.getBtnAgregar().addActionListener(this);
        objAutor.getBtnBuscar().addActionListener(this);
        objAutor.getBtnDevoluciones().addActionListener(this);
        objAutor.getBtnEjemplar().addActionListener(this);
        objAutor.getBtnEvento().addActionListener(this);
        objAutor.getBtnIcono().addActionListener(this);
        objAutor.getBtnInicio().addActionListener(this);
        objAutor.getBtnNotificacion().addActionListener(this);
        objAutor.getBtnPerfil().addActionListener(this);
        objAutor.getBtnReservas().addActionListener(this);
        objAutor.getBtnVolver().addActionListener(this);
        
        objLibro = new Libro();
        objLibro.getBtnAgregar().addActionListener(this);
        objLibro.getBtnBuscar().addActionListener(this);
        objLibro.getBtnDevoluciones().addActionListener(this);
        objLibro.getBtnEjemplar().addActionListener(this);
        objLibro.getBtnEvento().addActionListener(this);
        objLibro.getBtnIcono().addActionListener(this);
        objLibro.getBtnInicio().addActionListener(this);
        objLibro.getBtnNotificacion().addActionListener(this);
        objLibro.getBtnPerfil().addActionListener(this);
        objLibro.getBtnReservas().addActionListener(this);
        
        objEvento = new Evento();
        objEvento.getBtnBuscar().addActionListener(this);
        objEvento.getBtnCrear().addActionListener(this);
        objEvento.getBtnDevoluciones().addActionListener(this);
        objEvento.getBtnEjemplar().addActionListener(this);
        objEvento.getBtnGuardar().addActionListener(this);
        objEvento.getBtnIcono1().addActionListener(this);
        objEvento.getBtnInicio().addActionListener(this);
        objEvento.getBtnNotificacion().addActionListener(this);
        objEvento.getBtnPerfil1().addActionListener(this);
        objEvento.getBtnReservas().addActionListener(this);
        
        objDevolucionE = new DevolucionE();
        objDevolucionE.getBtnBuscar().addActionListener(this);
        objDevolucionE.getBtnCrear().addActionListener(this);
        objDevolucionE.getBtnEjemplar().addActionListener(this);
        objDevolucionE.getBtnEnviar().addActionListener(this);
        objDevolucionE.getBtnEvento().addActionListener(this);
        objDevolucionE.getBtnIcono().addActionListener(this);
        objDevolucionE.getBtnInicio().addActionListener(this);
        objDevolucionE.getBtnNotificacion().addActionListener(this);
        objDevolucionE.getBtnPerfil().addActionListener(this);
        objDevolucionE.getBtnReservas().addActionListener(this);
        
        objReservaE = new ReservaE();
        objReservaE.getBtnBuscar().addActionListener(this);
        objReservaE.getBtnCrear().addActionListener(this);
        objReservaE.getBtnDevoluciones().addActionListener(this);
        objReservaE.getBtnEjemplar().addActionListener(this);
        objReservaE.getBtnEvento().addActionListener(this);
        objReservaE.getBtnIcono().addActionListener(this);
        objReservaE.getBtnNotificacion().addActionListener(this);
        objReservaE.getBtnPerfil().addActionListener(this);
        objReservaE.getBtnReserva().addActionListener(this);
        objReservaE.getBtnReservas().addActionListener(this);
        
        objBuscarLibroE = new BuscarLibroE();
        objBuscarLibroE.getBtnBuscarLibro().addActionListener(this);
        objBuscarLibroE.getBtnCrear().addActionListener(this);
        objBuscarLibroE.getBtnDevoluciones().addActionListener(this);
        objBuscarLibroE.getBtnEjemplar().addActionListener(this);
        objBuscarLibroE.getBtnEvento().addActionListener(this);
        objBuscarLibroE.getBtnIcono().addActionListener(this);
        objBuscarLibroE.getBtnInicio().addActionListener(this);
        objBuscarLibroE.getBtnNotificacion().addActionListener(this);
        objBuscarLibroE.getBtnPerfil().addActionListener(this);
        objBuscarLibroE.getBtnReservas().addActionListener(this);
        
        objEjemplar = new Ejemplar();
        objEjemplar.getBtnBuscar().addActionListener(this);
        objEjemplar.getBtnCrear().addActionListener(this);
        objEjemplar.getBtnDevoluciones().addActionListener(this);
        objEjemplar.getBtnEjemplar().addActionListener(this);
        objEjemplar.getBtnEvento().addActionListener(this);
        objEjemplar.getBtnGuardar().addActionListener(this);
        objEjemplar.getBtnIcono().addActionListener(this);
        objEjemplar.getBtnInicio().addActionListener(this);
        objEjemplar.getBtnNotificacion().addActionListener(this);
        objEjemplar.getBtnPerfil().addActionListener(this);
        objEjemplar.getBtnReservas().addActionListener(this);
        objEjemplar.getBtnVolver().addActionListener(this);
        
        objNotificacionE = new NotificacionE();
        objNotificacionE.getBtnVolver().addActionListener(this);
        
        objEditorial = new Editorial();
        objEditorial.getBtnAgregar().addActionListener(this);
        objEditorial.getBtnBuscar().addActionListener(this);
        objEditorial.getBtnDevoluciones().addActionListener(this);
        objEditorial.getBtnEjemplar().addActionListener(this);
        objEditorial.getBtnEvento().addActionListener(this);
        objEditorial.getBtnIcono().addActionListener(this);
        objEditorial.getBtnInicio().addActionListener(this);
        objEditorial.getBtnNotificacion().addActionListener(this);
        objEditorial.getBtnPerfil().addActionListener(this);
        objEditorial.getBtnReservas().addActionListener(this);
        
        

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
        if (objProveedor.getBtnGuardar() == e.getSource()) {
            ingresarProveedor();
            objProveedor.setVisible(false);
            objInicioE.setVisible(true);
        }
        
        if (objCrear.getBtnAutor() == e.getSource()) {
            objAutor.setVisible(true);
            objCrear.dispose();
        }
        if (objCrear.getBtnBuscar() == e.getSource()) {
            objBuscarLibroE.setVisible(true);
            objCrear.dispose();
        }
        if (objCrear.getBtnDevoluciones() == e.getSource()) {
            objDevolucionE.setVisible(true);
            objCrear.dispose();
        }
        if (objCrear.getBtnEditorial() == e.getSource()) {
            objEditorial.setVisible(true);
            objCrear.dispose();
        }
        if (objCrear.getBtnEjemplar() == e.getSource()) {
            objEjemplar.setVisible(true);
            objCrear.dispose();
        }
        if (objCrear.getBtnEjemplar2() == e.getSource()) {
            objEjemplar.setVisible(true);
            objCrear.dispose();
        }
        if (objCrear.getBtnEvento() == e.getSource()) {
            objEvento.setVisible(true);
            objCrear.dispose();
        }
        if (objCrear.getBtnIcono() == e.getSource()) {
            miPerfilE();
            objCrear.dispose();
        }
        if (objCrear.getBtnLibro() == e.getSource()) {
            objLibro.setVisible(true);
            objCrear.dispose(); 
        }
        if (objCrear.getBtnNotificacion() == e.getSource()) {
            objNotificacionE.setVisible(true);
            objCrear.dispose();
        }
      
        if (objCrear.getBtnPerfil() == e.getSource()) {
            miPerfilE();
            objCrear.dispose();
        }
        if (objCrear.getBtnProveedor() == e.getSource()) {
            objProveedor.setVisible(true);
            objCrear.dispose();
        }
        if (objCrear.getBtnReservas() == e.getSource()) {
            objReservaE.setVisible(true);
            objCrear.dispose();
        }
        if (objCrear.getBtnSucursal() == e.getSource()) {
            objSucursal.setVisible(true);
            objCrear.dispose();
        }
        
        if (objAutor.getBtnAgregar() == e.getSource()) {
            insertarAutor();
            objCrear.setVisible(true);
            objAutor.dispose();
        }
        if (objAutor.getBtnDevoluciones() == e.getSource()) {
            objDevolucionE.setVisible(true);
            objAutor.disable();
        }
        if (objAutor.getBtnEjemplar() == e.getSource()) {
            objEjemplar.setVisible(true);
            objAutor.dispose();
        }
        if (objAutor.getBtnEvento() == e.getSource()) {
            objEvento.setVisible(true);
            objAutor.dispose();
        }
        if (objAutor.getBtnIcono() == e.getSource()) {
            miPerfilE();
            objAutor.dispose();
        }
        if (objAutor.getBtnInicio() == e.getSource()) {
            objInicioE.setVisible(true);
            objAutor.dispose();
        }
        if (objAutor.getBtnNotificacion() == e.getSource()) {
            objNotificacionE.setVisible(true);
            objAutor.dispose();
        }
        if (objAutor.getBtnPerfil() == e.getSource()) {
            miPerfilE();
            objAutor.dispose();
        }
        if (objAutor.getBtnReservas() == e.getSource()) {
            objReservaE.setVisible(true);
            objAutor.dispose();
        }
        if (objAutor.getBtnVolver() == e.getSource()) {
            objCrear.setVisible(true);
            objAutor.dispose();
        }
        if (objEditorial.getBtnAgregar() == e.getSource()) {
            insertarEditorial();
            objCrear.setVisible(true);
            objEditorial.dispose();
        }
        if (objEditorial.getBtnBuscar() == e.getSource()) {
            objBuscarLibroE.setVisible(true);
            objEditorial.dispose();
        }
        if (objEditorial.getBtnDevoluciones() == e.getSource()) {
            objDevolucionE.setVisible(true);
            objEditorial.dispose();
        }
        if (objEditorial.getBtnEjemplar() == e.getSource()) {
            objEjemplar.setVisible(true);
            objEditorial.dispose();
        }
        if (objEditorial.getBtnEvento() == e.getSource()) {
            objEvento.setVisible(true);
            objEditorial.dispose();
        }
        if (objEditorial.getBtnIcono() == e.getSource()) {
            miPerfilE();
            objEditorial.dispose();
        }
        if (objEditorial.getBtnInicio() == e.getSource()) {
            objInicioE.setVisible(true);
            objEditorial.dispose();
        }
        if (objEditorial.getBtnNotificacion() == e.getSource()) {
            objNotificacionE.setVisible(true);
            objEditorial.dispose();
        }
        if (objEditorial.getBtnPerfil() == e.getSource()) {
            miPerfilE();
            objEditorial.dispose();
        }
        if (objEditorial.getBtnReservas() == e.getSource()) {
            objReservaE.setVisible(true);
            objEditorial.dispose();
        }
        if (objInicioE.getBtnBuscar() == e.getSource()) {
            objBuscarLibroE.setVisible(true);
            objInicioE.dispose();
        }
        if (objInicioE.getBtnCrear() == e.getSource()) {
            objCrear.setVisible(true);
            objInicioE.dispose();
        }
        if (objInicioE.getBtnDevoluciones() == e.getSource()) {
            objDevolucionE.setVisible(true);
            objInicioE.dispose();
        }
        if (objInicioE.getBtnEjemplar() == e.getSource()) {
            objEjemplar.setVisible(true);
            objInicioE.dispose();
        }
        if (objInicioE.getBtnEvento() == e.getSource()) {
            objEvento.setVisible(true);
            objInicioE.dispose();
        }
        if (objInicioE.getBtnIcono() == e.getSource()) {
            miPerfilE();
            objInicioE.dispose();
        }
        if (objInicioE.getBtnNotificacion() == e.getSource()) {
            objNotificacionE.setVisible(true);
            objInicioE.dispose();
        }
        if (objInicioE.getBtnPerfil() == e.getSource()) {
            miPerfilE();
            objInicioE.dispose();
        }
        if (objInicioE.getBtnReservas() == e.getSource()) {
            objReservaE.setVisible(true);
            objInicioE.dispose();
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
        objLogin.dispose();

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
        String contacto = objProveedor.getTxtContacto().getText();
        Proveedor.insertarProveedor(nombreProveedor, contacto, telefono, correo);
    }// cierr ingresar proveedor

    public void insertarUsuario() {
        int rol = 2;
        String Nombre = objRegistrar.getTxtNombre().getText();
        objU.insertarUsuario(Nombre, Nombre, Nombre, Nombre, Nombre, rol, Nombre, Nombre);
    }
    
    public void insertarAutor(){
        String nombre = objAutor.getTxtNombre().getText();
        String apellido = objAutor.getTxtApellido().getText();
        String nacionalidad = objAutor.getTxtNacionalidad().getText();
        
        AutorModelo.insertarAutor(nombre, apellido, nacionalidad);
    }// Cierra insertar autor
    
    public void insertarEditorial(){
        String nombre = objEditorial.getTxtNombre().getText();
        String pais = objEditorial.getTxtPais().getText();
        
        EditorialModelo.insertarEditorial(nombre, pais);
    }
            
            
}// cierra class
