
public class Reto {
    public static void main(String[] args){
        Punto p1 = new Punto(Double.parseDouble(args[0]), Double.parseDouble(args[1]));
        Punto p2 = new Punto(Double.parseDouble(args[2]), Double.parseDouble(args[3]));
        Punto p3 = new Punto(Double.parseDouble(args[4]), Double.parseDouble(args[5]));

        double d1 = Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y-p1.y, 2));
        double d2 = Math.sqrt(Math.pow(p3.x - p2.x, 2) + Math.pow(p3.y-p2.y, 2));
        double d3 = Math.sqrt(Math.pow(p3.x - p1.x, 2) + Math.pow(p3.y-p1.y, 2));
        String texto;
        double epsilon = 0.00001; 
        if (Math.abs(d1 - d2) < epsilon && Math.abs(d2 - d3) < epsilon) {
            texto = "Es triángulo equilátero";
        }else{
            texto = "No es triangulo";
        }
        Mensaje m = new Mensaje(texto);
        Ventana v = new Ventana(m);
        v.setVisible(true);
    }
}

