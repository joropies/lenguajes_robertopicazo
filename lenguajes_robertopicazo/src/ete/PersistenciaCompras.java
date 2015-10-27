/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ete;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author T-107
 */
public class PersistenciaCompras {
    
    ArrayList<CarritoElectronico> carritos;
    
    
    public PersistenciaCompras() {
        
        carritos = new ArrayList<CarritoElectronico>();
    
    }
    
    public void guardar(CarritoElectronico c) throws Exception {
        
        File f = new File("D:\\carritos.txt");
        
        if (f.exists()) {
            carritos = buscarTodos();
            // buscartodos es igual a un select all en SQL
        }
        // busca todos los usuraios en el archivo
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        // con el objectoutput se hace la serializacion
        carritos.add(c);
        oos.writeObject(carritos);
        // se tiene que guardar a clientes y no a u.
        // una vez sobrescrito el archivo con el nuevo registro lo guarda.
        // el array list tiene indices automaticos
        
    }
    
    public ArrayList<CarritoElectronico> buscarTodos() throws Exception {
        // buscartodos es igual a un select all en SQL
        File file = new File("D:\\carritos.txt");
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        // con el objectoutput se hace la serializacion
        carritos = (ArrayList<CarritoElectronico>) ois.readObject();
        // se tiene que hacer un casting para que se vuelva un objeto
        // readobject regresa todo el arreglo leido por el sistema
        return carritos;
    }
    
}
