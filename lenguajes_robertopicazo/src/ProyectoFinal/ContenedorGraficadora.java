/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoFinal;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;

/**
 *
 * @author T-107
 */
public class ContenedorGraficadora extends Canvas{
    public static float apertura = 0.01f;

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        // super = invoca la version del papa para usarlo
        
        g.setColor(Color.white);
        g.fillRect(0, 0, getWidth(), getHeight());
        // getwidth da el total de la pantalla/lugar donde se va a expandir
        g.setColor(Color.black);
        // con esta definicio del color quedaria negro
        g.drawLine(0, getHeight()/2, getWidth(), getHeight()/2);
        g.drawLine(getWidth()/2, 0, getWidth()/2, getHeight());
        g.translate(getWidth()/2, getHeight()/2);
        
        g.drawString("Origen de Coordenadas", 0, 0);
        
        // grafiquemos una parabola
        
        float x0 = -100;
        float x1 = -99;
        float y0;
        float y1;
        
        for (int i=0; i <= 200; i++){
        /*
            y0 = -apertura *MiGraficadora.a* x0 * x0 +MiGraficadora.b*x0+MiGraficadora.c;
            y1 = -apertura *MiGraficadora.a* x1 * x1 +MiGraficadora.b*x1+MiGraficadora.c;
        */
            
            y0 = -apertura * x0 * x0 - 10;
            y1 = -apertura * x1 * x1 - 10;
            
            g.drawLine((int)x0, (int)y0, (int)x1, (int)y1);
            x0++;
            x1++;
        
        }
        
        // funcion seno hay que revisarla porque no esta************
        /*
        double xseno0 = -2 * Math.PI - 1;
        double xseno1 = -2 * Math.PI;
        double yseno0;
        double yseno1;

        yseno0 = Math.sin(xseno0);
        yseno1 = Math.sin(xseno1);

        for (int i = 0; i <= 200; i++) {
        
            g.drawLine((int)yseno0, (int)yseno1, (int)xseno0, (int)xseno1);
        
        }
        //*******************************************************************
    */    
    }
    // la clase canvas es para graficos
    // tiene un metodo que se llama paint

    
    // este metodo esta 
    @Override
    public boolean mouseDown(Event evt, int x, int y) {
        System.out.println("Has hecho clic sobre la gráfica");
        System.out.println("Posicion es: " + "(" + x + "," + y + ")");
        
        return super.mouseDown(evt, x, y); //To change body of generated methods, choose Tools | Templates.
    }
    
    //
    

}
