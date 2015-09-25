/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lenguajes_robertopicazo;

/**
 *
 * @author T-107
 */
public class Lenguajes_robertopicazo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Mi primer programa de Java");
        
        Imc objeto = new Imc();
        System.out.println(objeto.calcular());
        
        // ejemplos de clases wrappers
        String x = "12";
        float valor = Float.parseFloat(x);
        System.out.println(valor);
        

        
    }
    
}
