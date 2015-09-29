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
public class Imc {
    float peso;
    float altura;
    

    
    public Imc() {
        // constructor 1
        peso=80f;
        altura=1.70f;
    }
    
    public Imc(float f) {
        // constructor 2
        //Este codigo no tiene nada que ver con los constructores
        byte b = 2;
        short s = 2;
        int i = 2;
        long l = 2;
        
        //Reasignamos y hacemos casting
        b = (byte)i;
        l = i;
        s = (short)l;
        s = b;
        l = s;
        s = (short)l;
        s = (short)i;
        l = b;
    
    }
    
    // constructor 3
    public Imc(float p, float a) {
        peso = p;
        altura = a;    
    }
    
    public String calcular() {
        String mensaje = " ";
        float resultadoImc = peso / (altura * altura);
        
        if (resultadoImc < 20) {
            mensaje = "Eres Anoréxico" + ": " + resultadoImc;
        }
        if (resultadoImc > 20 && resultadoImc <= 25) {
            mensaje = "Eres muy sano" + ": " + resultadoImc;
        }
        if (resultadoImc > 25 && resultadoImc <= 30) {
            mensaje = "Te pasaste de tamales" + ": " + resultadoImc;
        }
        if (resultadoImc > 30) {
            mensaje = "Eres un tinaco con patas" + ": " + resultadoImc;
        }
        return mensaje;
    }
  
}
