package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Gestionar conexion a la base de datos
 *
 * @author Teddy
 */
public class Conexion {

    private ResourceBundle rb;
    private String driver, url, user, password;
    private Connection conexion;

    public Conexion() {
        rb = ResourceBundle.getBundle("sakila");
        driver = rb.getString("database.driver");
        url = rb.getString("database.url");
        user = rb.getString("database.user");
        password = rb.getString("database.password");
    }

    /**
     * Empezar conexion
     * @throws ClassNotFoundException
     * @throws SQLException 
     */
    public void abrirConexion() throws ClassNotFoundException, SQLException {
        Class.forName(this.driver);
        conexion = (Connection) DriverManager.getConnection(this.url, this.user, this.password);
    }
    
    /**
     * Es como abrir conexion pero sin usar properties
     */
    public void open(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String database = "sakila";
            String user = "2dawa";
            String password="2dawa";
            String url = "jdbc:mysql://localhost/"+database;
            conexion = DriverManager.getConnection(url,user,password);
        } catch (Exception e) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    //Getters y Setters
    public Connection getConexion() {
        return conexion;
    }

}
