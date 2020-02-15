/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author elefa
 */
public class Conexion {
    
   static Connection contacto=null;
   
   public static Connection getConexion(String user, String pass){
       
       String url ="jdbc:sqlserver://localhost:1433;databaseName=HaciendaMagdalena";
       try{
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
       } catch ( ClassNotFoundException e){
           JOptionPane.showMessageDialog(null, " no se pudo estrablecer la conexion de  base de datos  revisar el  driver" + e.getMessage(), "Error  de conexion", JOptionPane.ERROR_MESSAGE);
           
       }
       
       try {
           contacto= DriverManager.getConnection(url, user ,pass);
       System.out.println("la base de datos  ha  sido conectada ");
         System.out.println("XD xdxdfx ");
       
       }
           catch(SQLException e){
              
       }
       
       return contacto;
       
       //consultas para la base  de datos 
   }
   
   
   ///  consultas para la  base  de datos 
   
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
