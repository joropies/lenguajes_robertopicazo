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
        peso=80f;
        altura=1.70f;
    }
    
    public Imc(float f) {
        //Este codigo no tiene nada que ver con los constructores
        byte b = 2;
        short s = 2;
        int i = 2;
        long l = 2;
        
        //Reasignamos
        b = (byte)i;
        l = i;
        s = (short)l;
        s = b;
        l = s;
        s = (short)l;
        s = (short)i;
        l = b;
    
    }
    
    public float calcular() {
        float resultadoImc = peso / (altura*altura);
        return resultadoImc;
    }
}
