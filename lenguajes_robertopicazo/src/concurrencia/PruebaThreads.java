/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrencia;

/**
 *
 * @author T-107
 */
public class PruebaThreads implements Runnable{
    public static void main(String[] args) {
        //Primer paso creado
        PrimerThread pt = new PrimerThread();
        //Segundo paso iniciado
        
        
        //ejemplo con polimorfismo // Es un tipo de casting
        Runnable r2 = new PruebaThreads();
        
        Thread pt2 = new Thread(r2);
        pt.start();
        pt2.start();
        
    }
    
    public void run(){
    
        System.out.println("Soy el segundo thread");
    
    };
    
}
