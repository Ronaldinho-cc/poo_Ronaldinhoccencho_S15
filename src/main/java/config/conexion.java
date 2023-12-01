/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package config;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author GIGABYTE
 */
public class Conexion {
    Connection con;
    public Conexion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/S17","root","admin");
             JOptionPane.showMessageDialog(null, "La conexion se ha realizado con exito");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error:"+e);
        }        
    }
    public Connection getConnection(){
        return con;
    }
}
