/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoFinal;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author T-107
 */
public class ContenedorGraficadora extends Canvas{

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        // super = invoca la version del papa para usarlo
        
        g.setColor(Color.white);
        g.fillRect(0, 0, getHeight(), getHeight());
        // getwidth da el total de la pantalla/lugar donde se va a expandir
        g.setColor(Color.black);
        // con esta definicio del color quedaria negro
        g.drawLine(0, getHeight()/2, getWidth(), getHeight()/2);
        g.drawLine(getWidth()/2, getWidth()/2, getWidth(), getWidth()/2);
        
    }
    // la clase canvas es para graficos
    // tiene un metodo que se llama paint
    
    
    
    
    
}
