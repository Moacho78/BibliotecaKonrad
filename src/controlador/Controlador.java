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
    Libro objLibro;
    NotificacionE objNotificacionE;
<<<<<<< HEAD
    Comprar objComprar;
    ReservaU objReservaU;
    DevoluciónU objDevolucionU;
    Evento2 objEvento2;
    BuscarLibroU objBuscarLibroU;
    Multas objMultas;
    PrestamoU objPrestamoU;
    SancionU objSancionU;
    NotificacionesU objNotificacionesU;
    
=======
    Inventario objInventario;
    Multas objMultas;
   SancionCrear objSancion;
   HistoralPrestamo objHistorialPrestamo;
   PrestamoE objPrestamoE;
   SalaLecturaE objSalaLecturaE;
>>>>>>> origin/master

    public Controlador() {
        
        objSucursal=new Sucursal();
        objSucursal.getBtnBuscar().addActionListener(this);
        objSucursal.getBtnDevoluciones().addActionListener(this);
        objSucursal.getBtnEjemplar().addActionListener(this);
        objSucursal.getBtnEvento().addActionListener(this);
        objSucursal.getBtnGuardar().addActionListener(this);
        objSucursal.getBtnIcono().addActionListener(this);
        objSucursal.getBtnInicio().addActionListener(this);
        objSucursal.getBtnNotificacion().addActionListener(this);
        objSucursal.getBtnPerfil().addActionListener(this);
        objSucursal.getBtnReservas().addActionListener(this);
        
        
        objSalaLecturaE=new SalaLecturaE();
        objSalaLecturaE.getBtnGuardar().addActionListener(this);
        objSalaLecturaE.getBtnVolver().addActionListener(this);
        
        objPrestamoE=new PrestamoE();
        objPrestamoE.getBtnEnviar().addActionListener(this);
        objPrestamoE.getBtnVolver().addActionListener(this);
        
        
        objHistorialPrestamo=new HistoralPrestamo();
        objHistorialPrestamo.getBtnVolver().addActionListener(this);
                
                
        objSancion=new SancionCrear();
        objSancion.getBtnVolver().addActionListener(this);
        objSancion.getBtnGuardar().addActionListener(this);
       
        objLogin = new Login();
        objLogin.setVisible(true);
        objLogin.getBtnAcceder().addActionListener(this);
        objLogin.getBtnRegistrarse().addActionListener(this);
        
        objRegistrar=new Usuarios();
        objRegistrar.getBtnGuardar().addActionListener(this);

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
        objInicioU.getBtnPrestamo1().addActionListener(this);
        objInicioU.getBtnSancion().addActionListener(this);

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
        

        objInventario=new Inventario();
        
        objInventario.getBtnVolver().addActionListener(this);

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
        
        objComprar = new Comprar();
        objComprar.getBtnBuscar().addActionListener(this);
        objComprar.getBtnComprar().addActionListener(this);
        objComprar.getBtnComprar2().addActionListener(this);
        objComprar.getBtnComprar3().addActionListener(this);
        objComprar.getBtnDevoluciones().addActionListener(this);
        objComprar.getBtnEventos().addActionListener(this);
        objComprar.getBtnIcono().addActionListener(this);
        objComprar.getBtnInicio().addActionListener(this);
        objComprar.getBtnMulta().addActionListener(this);
        objComprar.getBtnNotificacion().addActionListener(this);
        objComprar.getBtnPerfil().addActionListener(this);
        objComprar.getBtnPrestamo1().addActionListener(this);
        objComprar.getBtnReservas().addActionListener(this);
        
        objReservaU = new ReservaU();
        objReservaU.getBtnBuscar().addActionListener(this);
        objReservaU.getBtnComprar().addActionListener(this);
        objReservaU.getBtnDevoluciones().addActionListener(this);
        objReservaU.getBtnEventos().addActionListener(this);
        objReservaU.getBtnIcono().addActionListener(this);
        objReservaU.getBtnMulta().addActionListener(this);
        objReservaU.getBtnNotificacion().addActionListener(this);
        objReservaU.getBtnPerfil().addActionListener(this);
        objReservaU.getBtnPrestamo1().addActionListener(this);
        objReservaU.getBtnReservas().addActionListener(this);
        objReservaU.getBtnSancion().addActionListener(this);
        
        objDevolucionU = new DevoluciónU();
        objDevolucionU.getBtnBuscar().addActionListener(this);
        objDevolucionU.getBtnComprar().addActionListener(this);
        objDevolucionU.getBtnDevoluciones().addActionListener(this);
        objDevolucionU.getBtnEventos().addActionListener(this);
        objDevolucionU.getBtnIcono().addActionListener(this);
        objDevolucionU.getBtnMulta().addActionListener(this);
        objDevolucionU.getBtnNotificacion().addActionListener(this);
        objDevolucionU.getBtnPerfil().addActionListener(this);
        objDevolucionU.getBtnPrestamo1().addActionListener(this);
        objDevolucionU.getBtnReservas().addActionListener(this);
        objDevolucionU.getBtnSancion().addActionListener(this);
        
        objEvento2 = new Evento2();
        objEvento2.getBtnBuscar().addActionListener(this);
        objEvento2.getBtnComprar().addActionListener(this);
        objEvento2.getBtnDevoluciones().addActionListener(this);
        objEvento2.getBtnIcono().addActionListener(this);
        objEvento2.getBtnIngresar().addActionListener(this);
        objEvento2.getBtnIngresar2().addActionListener(this);
        objEvento2.getBtnIngresar3().addActionListener(this);
        objEvento2.getBtnInicio().addActionListener(this);
        objEvento2.getBtnMulta().addActionListener(this);
        objEvento2.getBtnNotificacion().addActionListener(this);
        objEvento2.getBtnPerfil().addActionListener(this);
        objEvento2.getBtnPrestamo1().addActionListener(this);
        objEvento2.getBtnReservas().addActionListener(this);
        objEvento2.getBtnSancion().addActionListener(this);
        objEvento2.getBtnSancion1().addActionListener(this);
        
        objBuscarLibroU = new BuscarLibroU();
        objBuscarLibroU.getBtnBuscarLibro().addActionListener(this);
        objBuscarLibroU.getBtnComprar().addActionListener(this);
        objBuscarLibroU.getBtnComprar2().addActionListener(this);
        objBuscarLibroU.getBtnDevoluciones().addActionListener(this);
        objBuscarLibroU.getBtnEventos().addActionListener(this);
        objBuscarLibroU.getBtnIcono().addActionListener(this);
        objBuscarLibroU.getBtnInicio().addActionListener(this);
        objBuscarLibroU.getBtnMulta().addActionListener(this);
        objBuscarLibroU.getBtnPerfil().addActionListener(this);
        objBuscarLibroU.getBtnPrestamo1().addActionListener(this);
        objBuscarLibroU.getBtnReservas().addActionListener(this);
        objBuscarLibroU.getBtnSancion().addActionListener(this);
        
        objMultas = new Multas();
        objMultas.getBtnVolver().addActionListener(this);
        
        objPrestamoU = new PrestamoU();
        objPrestamoU.getBtnBuscar().addActionListener(this);
        objPrestamoU.getBtnComprar().addActionListener(this);
        objPrestamoU.getBtnDevoluciones().addActionListener(this);
        objPrestamoU.getBtnEventos().addActionListener(this);
        objPrestamoU.getBtnIcono().addActionListener(this);
        objPrestamoU.getBtnInicio().addActionListener(this);
        objPrestamoU.getBtnMulta().addActionListener(this);
        objPrestamoU.getBtnNotificacion().addActionListener(this);
        objPrestamoU.getBtnPerfil().addActionListener(this);
        objPrestamoU.getBtnReservas().addActionListener(this);
        objPrestamoU.getBtnSancion().addActionListener(this);
        
        objSancionU = new SancionU();
        objSancionU.getBtnBuscar().addActionListener(this);
        objSancionU.getBtnComprar().addActionListener(this);
        objSancionU.getBtnDevoluciones().addActionListener(this);
        objSancionU.getBtnEventos().addActionListener(this);
        objSancionU.getBtnIcono().addActionListener(this);
        objSancionU.getBtnInicio().addActionListener(this);
        objSancionU.getBtnMulta().addActionListener(this);
        objSancionU.getBtnNotificacion().addActionListener(this);
        objSancionU.getBtnPerfil().addActionListener(this);
        objSancionU.getBtnPrestamo1().addActionListener(this);
        objSancionU.getBtnReservas().addActionListener(this);
        
        objNotificacionesU = new NotificacionesU();
        objNotificacionesU.getBtnVolver().addActionListener(this);
        


    }// cierra constructor

    @Override
    public void actionPerformed(ActionEvent e) {
        if (objLogin.getBtnAcceder() == e.getSource()) {
            login();

        }
        
        if (objLogin.getBtnRegistrarse()==e.getSource()) {
           objRegistrar.setVisible(true);
            objLogin.dispose();
            
        }
        if (objRegistrar.getBtnGuardar()==e.getSource()) {
             insertarUsuario();
             objRegistrar.dispose();
             objLogin.setVisible(true);
             
        }

        if (objMiPerfilE.getBtnVolver() == e.getSource()) {
            objInicioE.setVisible(true);
            objMiPerfilE.dispose();
        }

        if (objMiPerfilE.getBtnCerrarSesion() == e.getSource()) {

            usuarioLogueado = null;
            objLogin.setVisible(true);
            objMiPerfilE.dispose();
        }
        if (objMiPerfilE.getBtnInventario()==e.getSource()) {
            objInventario.setVisible(true);
            objMiPerfilE.dispose();
        }
        if (objMiPerfilE.getBtnMultas()==e.getSource()) {
            objMultas.setVisible(true);
            objMiPerfilE.dispose();
        }
        if (objMiPerfilE.getBtnSanciones()==e.getSource()) {
            objSancion.setVisible(true);
            objMiPerfilE.dispose();
        }
        if (objMiPerfilE.getBtnNotificaciones()==e.getSource()) {
            objNotificacionE.setVisible(true);
            objMiPerfilE.dispose();
        }
        if (objMiPerfilE.getBtnHistorial()==e.getSource()) {
            objHistorialPrestamo.setVisible(true);
             objMiPerfilE.dispose();
        }
        if (objMiPerfilE.getBtnPrestamo()==e.getSource()) {
            objPrestamoE.setVisible(true);
             objMiPerfilE.dispose();
        }
        if (objMiPerfilE.getBtnSala()==e.getSource()) {
            objSalaLecturaE.setVisible(true);
             objMiPerfilE.dispose();
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
<<<<<<< HEAD
        if (objProveedor.getBtnEvento()==e.getSource()) {
            objEvento.setVisible(true);
            objProveedor.dispose();
        }
        if (objProveedor.getBtnDevoluciones()==e.getSource()) {
            objDevolucionE.setVisible(true);
            objProveedor.dispose();
        }
        if (objProveedor.getBtnNotificacion()==e.getSource()) {
            objNotificacionE.setVisible(true);
            objProveedor.dispose();
        }
        if (objProveedor.getBtnBuscar()==e.getSource()) {
            objBuscarLibroE.setVisible(true);
            objProveedor.dispose();
        }
        if (objProveedor.getBtnEjemplar()==e.getSource()) {
            objEjemplar.setVisible(true);
            objProveedor.dispose();
        }
        if (objProveedor.getBtnInicio()==e.getSource()) {
            objInicioE.setVisible(true);
            objProveedor.dispose();
        }
        
        if (objInicioE.getBtnIcono() == e.getSource()) {
            miPerfilE();
            objInicioE.dispose();
        }
        if (objInicioE.getBtnCrear() == e.getSource()) {
            objCrear.setVisible(true);
            objInicioE.dispose();
        }
=======
        
>>>>>>> origin/master
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
<<<<<<< HEAD
        if (objInicioU.getBtnBuscar() == e.getSource()) {
            objBuscarLibroU.setVisible(true);
            objInicioU.dispose();
        }
        if (objInicioU.getBtnComprar() == e.getSource()) {
            objComprar.setVisible(true);
            objInicioU.dispose();
        }
        if (objInicioU.getBtnDevoluciones() == e.getSource()) {
            objDevolucionU.setVisible(true);
            objInicioU.dispose();
        }
        if (objInicioU.getBtnEventos() == e.getSource()) {
            objEvento2.setVisible(true);
            objInicioU.dispose();
        }
        if (objInicioU.getBtnIcono() == e.getSource()) {
            miPerfilU();
            objInicioU.dispose();
        }
        if (objInicioU.getBtnMulta() == e.getSource()) {
            objMultas.setVisible(true);
            objInicioU.dispose();
        }
        if (objInicioU.getBtnNotificacion() == e.getSource()) {
            objNotificacionesU.setVisible(true);
            objInicioU.dispose();
        }
        if (objInicioU.getBtnPerfil() == e.getSource()) {
            miPerfilU();
            objInicioU.dispose();
        }
        if (objInicioU.getBtnPrestamo1() == e.getSource()) {
            objPrestamoU.setVisible(true);
            objInicioU.dispose();
        }
        if (objInicioU.getBtnReservas() == e.getSource()) {
            objReservaU.setVisible(true);
            objInicioU.dispose();
        }
        if (objInicioU.getBtnSancion() == e.getSource()) {
            objSancionU.setVisible(true);
            objInicioU.dispose();
        }
=======
        
        if (objSucursal.getBtnBuscar()==e.getSource()) {
            objBuscarLibroE.setVisible(true);
            objSucursal.dispose();
        }
        
        if (objSucursal.getBtnDevoluciones()==e.getSource()) {
            objDevolucionE.setVisible(true);
            objSucursal.dispose();
        }
        
        if (objSucursal.getBtnEjemplar()==e.getSource()) {
            objEjemplar.setVisible(true);
            objSucursal.dispose();
        }
        
        if (objSucursal.getBtnEvento()==e.getSource()) {
            objEvento.setVisible(true);
            objSucursal.dispose();
        }
        
        if (objSucursal.getBtnGuardar()==e.getSource()) {
            insertarSucursal();
             objSucursal.dispose();
        }
        
        if (objSucursal.getBtnIcono()==e.getSource()) {
            miPerfilE();
            objSucursal.dispose();
        }
        if (objSucursal.getBtnInicio()==e.getSource()) {
            objInicioE.setVisible(true);
            objSucursal.dispose();
        }
        if (objSucursal.getBtnNotificacion()==e.getSource()) {
            objNotificacionE.setVisible(true);
            objSucursal.dispose();
        }
        
        if (objSucursal.getBtnPerfil()==e.getSource()) {
             miPerfilE();
            objSucursal.dispose();
        }
        
        if (objSucursal.getBtnReservas()==e.getSource()) {
            objReservaE.setVisible(true);
            objSucursal.dispose();
        }
        
       
        
>>>>>>> origin/master

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
        String apellido=objRegistrar.getTxtApellido().getText();
        String cc =objRegistrar.getTxtCedula().getText();
        String correo=objRegistrar.getTxtCorreo().getText();
        String telefono=objRegistrar.getTxtTelefono().getText();
        String clave=objRegistrar.getPwdContraseña().getText();
        String Direccion=objRegistrar.getTxtDireccion().getText();
        objU.insertarUsuario(cc, Nombre, apellido, correo, telefono, rol, clave, Direccion);
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
    
    public void insertarSucursal(){
        String nombre =objSucursal.getTxtNombre().getText();
        String direccion=objSucursal.getTxtUbicacion().getText();
        SucursalModelo.insertarSucursal(nombre, direccion);
    }// cierra insertar sucursal
            
            
}// cierra class
