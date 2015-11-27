/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PreviewJava3;

/**
 *
 * @author T-107
 */
public class AplicacionAnimalitos {
    
    public static void main(String[] args) {
        
        //Aqui el niño seleccionara de un listado a un animal. Por ej. el raton
        ComportamientoRuido r = new Raton();
        //aqui hay herencia por la aplicacion de la interfaz
        
        
        System.out.println(botonSonido(r));
        
        
    }
    
    public static String botonSonido(ComportamientoRuido r){
        //este seria el boton de sonido
        return r.hacerRuido();
    
    }
    
}
