/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ete;
import java.io.Serializable;

/**
 *
 * @author T-107
 */
public class Producto implements Serializable {
    
    private String nombreProducto;
    private Float costoProducto;
    private String departamentoProducto;
    private String nombreCliente;


    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Float getCostoProducto() {
        return costoProducto;
    }

    public void setCostoProducto(Float costoProducto) {
        this.costoProducto = costoProducto;
    }

    public String getDepartamentoProducto() {
        return departamentoProducto;
    }

    public void setDepartamentoProducto(String departamentoProducto) {
        this.departamentoProducto = departamentoProducto;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    
}
