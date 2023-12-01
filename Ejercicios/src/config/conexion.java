
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class conexion {
    Connection con;

    public conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/registro", "root", "admin");
            JOptionPane.showMessageDialog(null, "Conexión exitosa a la base de datos");
      } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error al conectarse a la base de datos, erro: " + e.toString());
        }
    }

    public Connection getConnection() {
       return con;
    }
}
