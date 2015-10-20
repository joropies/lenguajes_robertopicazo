/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;
import java.io.*;

/**
 *
 * @author T-107
 */
public class ProbarSerializacion {
    
    public static void main(String[] args) {
        
        // primero generamos una direccion
        
        Direccion d1 = new Direccion();
        d1.setCalle("Calle 13");
        d1.setColonia("Colonia Sanborns");
        d1.setCp(55280);
        d1.setMunicipio("Ecatepunk");
        
        // ahorqa generamos un usuario
        
        Usuario u1 = new Usuario();
        u1.setDireccion(d1);
        u1.setLogin("picazo");
        u1.setPassword("yomero");
        
        // ahora usamos la clase persistencia para guardar
        
        PersistenciaUsuarios2 p2 = new PersistenciaUsuarios2();
        try {
        p2.guardar(u1);
        // si no se lanza ninguna excepcion se pone un mensaje
            System.out.println("El usuario se guardo con exito");
        // marcaba error en u1 porque debe manejar excepciones
        // nos debemos hacer cargo de ella
        // se pone try porque en este etapa hay comunicacion con el usuario
        // try es para el frontend
        } catch (Exception e) {
            // se le pone a la mama y se le da un nombre
            // cacha esa excepcion y le pregunta al systema que paso
            // catch muestra un resultado
            
            System.out.println(e.getMessage());
            // getMessage captura el mensaje que obtiene de ORACLE 
        
            
        
        }
    }
    
}
