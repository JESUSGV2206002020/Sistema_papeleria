package MODELO;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
public class Conexion {
    Connection con;
    String url="jdbc:mysql://localhost:3306/bd_sistema";
    String usuario="sistema";
    String contraseña="OELgM0CHclgJw2QW";
    public Connection Conectar(){
        try{
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection(url,usuario,contraseña);
         System.out.println("TODO CHIDO");
        }catch (Exception e){
            System.out.println("Error, no se ha podido cargar MySQL JDBC Driver");
        }
        return con;    
        }  
    }
