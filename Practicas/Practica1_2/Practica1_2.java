import java.util.Scanner;

public class Practica1_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int op, n;

        do {
            System.out.println("Practica 1");
            System.out.println("Menu (Seleccione una opcion):");
            System.out.println("1.- Factorial");
            System.out.println("2.- Serie de Fibonacci");
            System.out.println("3.- Conjetura de Collatz");
            System.out.println("4.- Salir");
            System.out.print("-> ");
            op = s.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Introduzce el valor de n: ");
                    n = s.nextInt();
                    System.out.println("Factorial de " + n + " es " + factorial(n));
                    break;
                case 2:
                    System.out.println("Introduzce el valor de n: ");
                    n = s.nextInt();
                    System.out.println("El numero en la posicion " + n + " de la Serie de Fibonacci es " + fibonacci(n - 1));
                    break;
                case 3:
                    System.out.println("Introduzce el valor de n: ");
                    n = s.nextInt();
                    collatz(n);
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("Fin del programa...");
                    break;
                default:
                    System.out.println("Opcion invalida...");
                    continue;
            }
        } while (op != 4);
        s.close();
    }    

    public static int factorial (int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static int fibonacci (int n) {
        System.out.println(n + " ");
        if (n == 0) {
            return n;
        } else if (n == 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void collatz (int n) {
        System.out.print(n + "  ");
        if (n == 1) {
            return;
        } else if (n % 2 == 0) {
            collatz(n / 2);
        } else {
            collatz((n * 3) + 1 );
        }
    }

}
