
public class Reto {
    public static void main(String[] args){
        Punto p1 = new Punto(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        Punto p2 = new Punto(Integer.parseInt(args[2]), Integer.parseInt(args[3]));
        Punto p3 = new Punto(Integer.parseInt(args[4]), Integer.parseInt(args[5]));
        double d1 = Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y-p1.y, 2));
        double d2 = Math.sqrt(Math.pow(p3.x - p2.x, 2) + Math.pow(p3.y-p2.y, 2));
        double d3 = Math.sqrt(Math.pow(p3.x - p1.x, 2) + Math.pow(p3.y-p1.y, 2));
        String texto;
        if (d1 == d2 && d2 == d3){
            texto = "Es triangulo";
        }else{
            texto = "No es triangulo";
        }
        Mensaje m = new Mensaje(texto);
        Ventana v = new Ventana(m);
        v.setVisible(true);
    }
}

