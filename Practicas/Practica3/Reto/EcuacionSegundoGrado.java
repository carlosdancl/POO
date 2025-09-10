import java.lang.Math;

public class EcuacionSegundoGrado {
    public static void formula(double a, double b, double c){
        double disc;

        disc = b * b - 4 * a * c;
        
        System.err.println("\nLas Raíces son:\n");
        if (disc > 0) {
            System.out.println("x1 = " + (-b + Math.sqrt(disc)) / (2 * a));
            System.out.println("x2 = " + (-b - Math.sqrt(disc)) / (2 * a));
        } else if (disc == 0) {
            System.out.println("x = " + -b / (2 * a));
        } else {
            System.out.println("x1 = " + -b / (2 * a) + " + " + Math.sqrt(-disc) / (2 * a) + "i");
            System.out.println("x2 = " + -b / (2 * a) + " - " + Math.sqrt(-disc) / (2 * a) + "i");
        }
        System.err.println("");
    }

    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        
        formula(a, b, c);
    }
}