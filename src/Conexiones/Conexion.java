
package Conexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Conexion {
    
   static Connection contacto=null;
   
   public static Connection getConexion(String user, String pass){
       
       String url ="jdbc:sqlserver://localhost:1433;databaseName=HaciendaMagdalena";
       try{
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
       } catch ( ClassNotFoundException e){
           JOptionPane.showMessageDialog(null, "Error de Conexion: \n" + e.getMessage(), "Error  de conexion", JOptionPane.ERROR_MESSAGE);
           
       }
       
       try {
           contacto= DriverManager.getConnection(url, user ,pass);
            System.out.println("Ingreso Exitosos");
       
       }
           catch(SQLException e){
              
       }
       
       return contacto;
       

   }
   ///INGRESO DE LOGIN
   
   public static String ingLogin(String user, String pass){
       Statement declara;
       String valCon="";
       String url ="jdbc:sqlserver://localhost:1433;databaseName=HaciendaMagdalena";
       try{
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
       } catch ( ClassNotFoundException e){
           JOptionPane.showMessageDialog(null, "Error de Conexion: \n" + e.getMessage(), "Error  de conexion", JOptionPane.ERROR_MESSAGE);
           
       }
       
       try {
           contacto= DriverManager.getConnection(url, "userAc" ,"userAc");


           declara =contacto.createStatement();
           ResultSet respuesta = declara.executeQuery("exec prodLogin @Login='"+user+"',@Pass='"+pass+"'");
           //Recuperacion del tipo de usuario
              
             while (respuesta.next()) 
                System.out.print("");
                valCon = respuesta.getString("idsysUser");
                System.out.print("\n\nResult Get: "+valCon);
  
       }
       catch (SQLException e){
           JOptionPane.showMessageDialog(null, "Error" + e.getMessage(), "Error de conexion", JOptionPane.ERROR_MESSAGE);
           
       }
       return valCon;
   }
   
   
    public static ResultSet Consulta (String consulta){
        
        Connection con =getConexion("user", "osopolar");
       Statement declara; 
       try{
           declara =con.createStatement();
           ResultSet respuesta = declara.executeQuery(consulta);
           return respuesta;
       }
       catch (SQLException e){
           JOptionPane.showMessageDialog(null, "Error" + e.getMessage(), "Erro de conexion", JOptionPane.ERROR_MESSAGE);
           
       }
   return null;
    }
   
}
