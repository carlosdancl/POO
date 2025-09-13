import java.lang.Math;

public class Mensajes {
    public String mensaje(double x0, double y0, double x1, double y1) {
        return "La distancia entre  P1" + " (" + x0 + "," + y0 + ") " + " y " + "P2(" + x1 + "," + y1 + ")" + " es: " + Math.sqrt(Math.pow((x1 - x0), 2)+Math.pow((y1 - y0), 2));
    }   
}