/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivaldo;

import java.io.*;

/**
 *
 * @author T-107
 */
public class LeerMensajito {
    
    //le ponemos el metodo main para poder ejecutarla
    public static void main(String[] args) throws Exception {
        // ahora vamos a leer el archivo. ESTA ES OTRA CLASE.
        
        // primer paso es obtener el archivo que se guardo
        File file = new File("D:\\sucio.xxx");
        
        // segudno paso es establecer al direccion de la informacion
        FileInputStream fis = new FileInputStream(file);
        
        // creamos el objeto que leera
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        // ahora si a leer se ha dicho
        String algodon = (String) ois.readObject();
        // aqui hace un casting entre clases (lo que normalmente se haria en datos primitivos)
        // la clase object es la madre de todas las clases, por lo tanto,
        // como es muy grande tiene que recibir un casting tipo String
        // para convertirlo en String
        System.out.println(algodon);
    }
    
}
