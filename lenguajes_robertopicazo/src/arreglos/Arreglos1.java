/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

/**
 *
 * @author T-107
 */
public class Arreglos1 {
    
    public static void main(String[] args) {
        
        //como ests declarada adentro del metodo TIENE que estar inicializada
        // para poder funcionar
        int x;
        
        // inicializacion explicita
        // arreglo de tamaño 3
        int []y = {7,-20,15};
        
        //inicializacion implicita
        //arreglo de tamaño 4
        int []z = new int[4];
        
        String mensaje[] = {"Hola", " como", " estas", "hoy"};
        
        // imprimir un elemento segun su indice
        System.out.println(y[2]);
        
        //aqui el resultado es 0 porque si esta inicializada en el metodo
        // pero no tiene nada, por eso devuelve 0
        System.out.println(z[2]);
        
        // ciclo for para iterar los elementos del arreglo de Strings
        for (int i = 0; i < mensaje.length; i++) {
            
            System.out.println(mensaje[i]);
        
        }// aqui termina el ciclo for tradicional
        
        // ciclo for mejorado
        for (String valor:mensaje) {
            System.out.println(valor);
            //if (valor.equals("como")) {
              //break;            
            }
        }
        
        
    }
}
