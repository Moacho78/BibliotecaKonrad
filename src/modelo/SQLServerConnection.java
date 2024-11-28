/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author migue
 */
public class SQLServerConnection {
     // Datos de conexión
    private static final String URL = "jdbc:sqlserver://MIGUEL\\SQLEXPRESS:1433;databaseName=BibliotecaKonrad;encrypt=false;";
    private static final String USER = "sa";
    private static final String PASSWORD = "G01fukl*";

    // Método para obtener la conexión
public Connection getConexion() {
        Connection con = null;
        try {
            // Registra el controlador JDBC de SQL Server
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            // Establece la conexión con la base de datos
            con = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            // Muestra el mensaje de error si ocurre un problema
            System.out.println("Error: " + e.getMessage());
        }
        return con;
    }
}
