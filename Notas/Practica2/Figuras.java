import java.util.Scanner;

public class Figuras {
    final static double PI = 3.1416;
    public static void main(String[] args) {
        int opcion;
        Scanner e = new Scanner(System.in);
        do {
            System.out.println("Elige una opción");
            System.out.println("1. Area Circulo");
            System.out.println("2. Area Triangulo");
            System.out.println("3. Area Cuadrado");
            System.out.println("4. Salir");
            opcion=e.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("El area del círculo es "+areaCirculo(15));
                    break;
                case 2:
                    System.out.println("El area del triángulo es "+areaTriangulo(8, 4));
                    break;
                case 3:
                    System.out.println("El area del cuadrado es "+areaCuadrado(4));
                case 4:
                    System.out.println("Saliendouuu");
                    break;
                default:
                    System.out.println("Opción no válida");
                    continue;
            }
        } while (opcion != 4);
        e.close();
    }
    
    public static double areaCirculo(double radio) {
        return PI * radio * radio;
    }

    public static double areaTriangulo (double base, double altura) {
        return (base * altura)/2.0;
    }

    public static double areaCuadrado(double lado) {
         return lado * lado;
    }
}