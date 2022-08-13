/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.solucion_reto_5.modelo.vo;

/**
 *
 * @author gagom
 */
public class AsesorPorCiudadVo {
    
    private int idLider;
    private String nombre;
    private String primerApellido;
    private String ciudadResidencia;

    public AsesorPorCiudadVo() {
    }
    
    
    public AsesorPorCiudadVo(int idLider, String nombre, String primerApellido, String ciudadResidencia) {
        this.idLider = idLider;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.ciudadResidencia = ciudadResidencia;
    }

    

    /**
     * @return the idLider
     */
    public int getIdLider() {
        return idLider;
    }

    /**
     * @param idLider the idLider to set
     */
    public void setIdLider(int idLider) {
        this.idLider = idLider;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the primerApellido
     */
    public String getPrimerApellido() {
        return primerApellido;
    }

    /**
     * @param primerApellido the primerApellido to set
     */
    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    /**
     * @return the ciudadResidenciia
     */
    public String getCiudadResidencia() {
        return ciudadResidencia;
    }

    /**
     * @param ciudadResidenciia the ciudadResidenciia to set
     */
    public void setCiudadResidencia(String ciudadResidenciia) {
        this.ciudadResidencia = ciudadResidenciia;
    }
}
