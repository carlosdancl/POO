package mx.unam.fi.poo.p78;

import java.awt.Dimension;
import java.awt.Graphics2D;

public class Rectangulo extends Figura{
    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }
    
    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }   

    @Override
    public double area() {
        return ancho * alto;
    }

    @Override
    public double perimetro() {
        return 2 * (ancho + alto);
    }

    @Override
    public void dibujar(Graphics2D g, Dimension size) {
        double margen = 20;
        double maxW = size.width - 2 * margen;
        double maxH = size.height - 2 * margen;

        double escalaW = maxW / Math.max(getAncho(), 1.0);
        double escalaH = maxH / Math.max(getAlto(), 1.0);
        double escala = Math.min(escalaW, escalaH);

        int w = (int) Math.round(getAncho() * escala);
        int h = (int) Math.round(getAlto() * escala);
        int x = (size.width - w) / 2;
        int y = (size.height - h) / 2;

        g.drawRect(x, y, w, h);
    }
}