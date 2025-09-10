import java.util.Scanner;
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
        System.err.println("\n");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a, b, c;

        System.out.print("Ingrese el valor A: ");
        a = s.nextDouble();
        System.out.print("Ingrese el valor B: ");
        b = s.nextDouble();
        System.out.print("Ingrese el valor C: ");
        c = s.nextDouble();
        s.close();

        formula(a, b, c);
    }
}