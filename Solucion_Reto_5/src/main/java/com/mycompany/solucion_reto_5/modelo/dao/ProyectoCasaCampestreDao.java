/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.solucion_reto_5.modelo.dao;

import com.mycompany.solucion_reto_5.modelo.vo.ProyectoCasaCampestreVo;
import com.mycompany.solucion_reto_5.util.JDBCUtilities;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author gagom
 */
public class ProyectoCasaCampestreDao {
    
    public ArrayList<ProyectoCasaCampestreVo> listar() throws SQLException{
        ArrayList<ProyectoCasaCampestreVo> resultado = new ArrayList<ProyectoCasaCampestreVo>();
        Connection conn = JDBCUtilities.gConnection();
        
        try{
            String sql = "SELECT p.ID_Proyecto, p.Constructora, p.Numero_Habitaciones, p.Ciudad " +
                         "FROM Proyecto p "+
                         "WHERE p.Ciudad IN ('Santa Marta','Cartagena','Barranquilla') " +
                         "AND p.Clasificacion = 'Casa Campestre'; ";
            
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next()){
                ProyectoCasaCampestreVo proyecto = new ProyectoCasaCampestreVo(
                        rs.getInt("ID_Proyecto"),
                        rs.getString("Constructora"),
                        rs.getDouble("Numero_Habitaciones"),
                        rs.getString("Ciudad")
                );
                resultado.add(proyecto);
            }
            rs.close();
            stmt.close();
        }finally{
            if (conn != null){
                conn.close();
            }
            return resultado;
        }
    }
}
