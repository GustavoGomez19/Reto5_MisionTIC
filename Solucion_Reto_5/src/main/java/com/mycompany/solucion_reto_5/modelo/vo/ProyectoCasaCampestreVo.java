/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.solucion_reto_5.modelo.vo;

/**
 *
 * @author gagom
 */
public class ProyectoCasaCampestreVo {
    
    private int idProyecto;
    private String constructora;
    private Double numeroHabitaciones;
    private String ciudad;

    public ProyectoCasaCampestreVo() {
    }

    public ProyectoCasaCampestreVo(int idProyecto, String constructora, Double numeroHabitaciones, String ciudad) {
        this.idProyecto = idProyecto;
        this.constructora = constructora;
        this.numeroHabitaciones = numeroHabitaciones;
        this.ciudad = ciudad;
    }
    
    

    /**
     * @return the idProyecto
     */
    public int getIdProyecto() {
        return idProyecto;
    }

    /**
     * @param idProyecto the idProyecto to set
     */
    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    /**
     * @return the constructora
     */
    public String getConstructora() {
        return constructora;
    }

    /**
     * @param constructora the constructora to set
     */
    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }

    /**
     * @return the numeroHabitaciones
     */
    public Double getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    /**
     * @param numeroHabitaciones the numeroHabitaciones to set
     */
    public void setNumeroHabitaciones(Double numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    /**
     * @return the ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
}
