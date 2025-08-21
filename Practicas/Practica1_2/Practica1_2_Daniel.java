import java.util.Scanner;

public class Practica1_2_Daniel {
    public static void main(String[] args) {
        int opc;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Elige una opción:");
            System.out.println("1. Factorial");
            System.out.println("2. Serie de Fibonacci");
            System.out.println("3. Conjetura de Collatz");
            System.out.println("4. Salir");
            opc = teclado.nextInt();
            switch (opc) {
                case 1:
                    System.out.print("Introduce un número para calcular su factorial: ");
                    int numFactorial = teclado.nextInt();
                    System.out.println("El factorial de " + numFactorial + " es: " + factorial(numFactorial));
                    break;
                case 2:
                    System.out.print("Introduce un número para calcular su serie de Fibonacci: ");
                    int numFibonacci = teclado.nextInt();
                    System.out.println("El " + numFibonacci + "º número de Fibonacci es: " + fibonacci(numFibonacci));
                    break;
                case 3:
                    System.out.print("Introduce un número para aplicar la Conjetura de Collatz: ");
                    int numCollatz = teclado.nextInt();
                    System.out.println("La secuencia de Collatz para " + numCollatz + "   es: ");
                    collartz(numCollatz);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, por favor elige una opción del 1 al 4.");
                    continue;
            }
        } while (opc != 4);
        teclado.close();
    }

    public static double factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void collartz (int n){
        System.out.println(n);
        if (n == 1) return;

        n = n%2 == 0 ? n/2 : 3*n +1;
        collartz(n);
    }
    
}
