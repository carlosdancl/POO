public class Practica4 {
    public static void main(String[] args) {
        Punto p0 = new Punto(Double.parseDouble(args[0]), Double.parseDouble(args[1]));
        Punto p1 = new Punto(Double.parseDouble(args[2]), Double.parseDouble(args[3]));
                
        Mensajes controlador = new Mensajes();
        Ventana ventana = new Ventana(controlador, p0.x, p0.y, p1.x, p1.y);
        ventana.setVisible(true);
    }
}