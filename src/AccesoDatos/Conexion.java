/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class Conexion {

    public static Connection getConexion() {
        try {
            Connection con = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-6RLLLJ3\\SQLEXPRESS:1433;database=VentaAutomoviles;", "walterm", "1234");
            return con;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }
}
