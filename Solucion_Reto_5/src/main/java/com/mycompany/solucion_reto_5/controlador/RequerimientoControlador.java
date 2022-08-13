/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.solucion_reto_5.controlador;

import com.mycompany.solucion_reto_5.modelo.dao.AsesorPorCiudadDao;
import com.mycompany.solucion_reto_5.modelo.dao.CompraPorProveedorDao;
import com.mycompany.solucion_reto_5.modelo.dao.ProyectoCasaCampestreDao;
import com.mycompany.solucion_reto_5.modelo.vo.AsesorPorCiudadVo;
import com.mycompany.solucion_reto_5.modelo.vo.CompraPorProveedorVo;
import com.mycompany.solucion_reto_5.modelo.vo.ProyectoCasaCampestreVo;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author gagom
 */
public class RequerimientoControlador {
    
    private final AsesorPorCiudadDao asesorPorCiudadDao; 
    private final ProyectoCasaCampestreDao proyectoCasaCampestreDao;
    private final CompraPorProveedorDao compraPorProveedorDao;
    
    public RequerimientoControlador(){
        asesorPorCiudadDao = new AsesorPorCiudadDao();
        proyectoCasaCampestreDao = new ProyectoCasaCampestreDao();
        compraPorProveedorDao = new CompraPorProveedorDao();
    }
    
    public ArrayList<AsesorPorCiudadVo> ConsultarAsesorPorCiudad() throws SQLException{
        return asesorPorCiudadDao.listar();
    }
    
    public ArrayList<ProyectoCasaCampestreVo> ConsultarProyectoCasaCampestre() throws SQLException{
        return proyectoCasaCampestreDao.listar();
    }
    
    public ArrayList<CompraPorProveedorVo> ConsultarCompraPorProveedor() throws SQLException{
        return compraPorProveedorDao.listar();
    }

    

    
}
