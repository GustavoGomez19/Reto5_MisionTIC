/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.solucion_reto_5.modelo.vo;

/**
 *
 * @author gagom
 */
public class CompraPorProveedorVo {
    
    private int idCompra;
    private String constructora;
    private String bancoVinculado;

    public CompraPorProveedorVo() {
    }

    public CompraPorProveedorVo(int idCompra, String constructora, String bancoVinculado) {
        this.idCompra = idCompra;
        this.constructora = constructora;
        this.bancoVinculado = bancoVinculado;
    }
    
    

    /**
     * @return the idCompra
     */
    public int getIdCompra() {
        return idCompra;
    }

    /**
     * @param idCompra the idCompra to set
     */
    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
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
     * @return the bancoVinculado
     */
    public String getBancoVinculado() {
        return bancoVinculado;
    }

    /**
     * @param bancoVinculado the bancoVinculado to set
     */
    public void setBancoVinculado(String bancoVinculado) {
        this.bancoVinculado = bancoVinculado;
    }
}
