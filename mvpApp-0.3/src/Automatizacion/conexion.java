/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Automatizacion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author daniel
 */
public class conexion {
    public static final String URL = "jdbc:mysql://192.168.68.111:3306/proyecto";
    
    public static final String USER = "dani";
    public static final String CLAVE = "1234";
    
    public Connection getConexion(){
        Connection con = null;
    
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USER, CLAVE);
        } catch (Exception e) {
               System.out.println("Error: " + e.getMessage());
        }
        
        return con;
    }
    
    
}
