/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivaldo;

/**
 *
 * @author T-107
 */

import java.io.*;
public class InterfazDeUsuario {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // primero generamos el archivo a guardar
        
        File file = new File("D:\\sucio.xxx");
        // si no existe, lo genera, sino lo lee
        // con ruta reletiva
        
        //indicar si vamos a leer o guardar algo en el archivo
        FileOutputStream fos = new FileOutputStream(file);
        
        // ponemos algo en el archivo y es lo que vamos a serializar
        String mensajito = "Este es un mensaje muy basico.";
        
        // creamos el objeto donde se gauradara
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        
        //guardamos
        oos.writeObject(mensajito);
        System.out.println("Se guardo tu mensajito");
    }
    
}
