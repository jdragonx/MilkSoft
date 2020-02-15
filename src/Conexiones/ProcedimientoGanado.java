/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexiones;

import java.sql.CallableStatement;
import java.sql.SQLException;

/**
 *
 * @author elefa
 */
public class ProcedimientoGanado {
    
    public static void ingresoGanado( int a, String b , String c , String d ) throws SQLException{
        CallableStatement entrada = Conexion.getConexion("prototipo","admin").prepareCall(" {call ingresoGanado (@areteMadre=?,@sexo=?,@raza=?,@Salud=?)}");
        entrada.setInt(1, a);
        entrada.setString(2, b);
        entrada.setString(3, c);
        entrada.setString(4, d);
        entrada.execute();
    }
    
    
    
    
    
    
    
    
    
    
    
}
