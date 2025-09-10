import java.util.Scanner;
import java.lang.Math;

public class EcuacionSegundoGrado {
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

        double disc = b * b - 4 * a * c;
        
        System.err.println("\nLas Raíces son:\n");
        if (disc > 0) {
            double raiz1 = (-b + Math.sqrt(disc)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(disc)) / (2 * a);
            System.out.println("x1 = " + raiz1);
            System.out.println("x2 = " + raiz2);
        } else if (disc == 0) {
            double raiz = -b / (2 * a);
            System.out.println("x = " + raiz);
        } else {
            double pReal = -b / (2 * a);
            double pIm = Math.sqrt(-disc) / (2 * a);
            System.out.println("x1 = " + pReal + " + " + pIm + "i");
            System.out.println("x2 = " + pReal + " - " + pIm + "i");
        }
        System.err.println("\n");
    }
}