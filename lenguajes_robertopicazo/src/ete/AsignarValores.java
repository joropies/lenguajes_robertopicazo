/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ete;

import java.util.ArrayList;

/**
 *
 * @author T-107
 */
public class AsignarValores {
    
    public static void main(String[] args) {
        
        Producto p1 = new Producto();
        p1.setCostoProducto(15.80f);
        p1.setDepartamentoProducto("Papeleria");
        
        Cliente c1 = new 
      
        c1.setNombreCliente("Roberto");
        c1.setNombreProducto("Lapiz");
      
        
        ArrayList<Producto> productos=new ArrayList<Producto>();
        productos.add(p1);
        
         Cliente cliente=new Cliente()
        
        PersistenciaCompras otro = new PersistenciaCompras();
        otro.guardar(null);
    
}
