/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.solucion_reto_5.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author gagom
 */
public class JDBCUtilities {
    private static final String UBICACION_DB = "ProyectosCOnstruccion.db";
    
    public static Connection gConnection() throws SQLException{
        String url = "jdbc:sqlite:" + UBICACION_DB;
        return DriverManager.getConnection(url);
    }
}
