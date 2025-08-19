import java.util.Scanner;

public class Ejemplo0 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.print("Ingresa el valor del operador 1: ");
        int op1 = e.nextInt();
        System.out.println();
        System.out.println("Ingresa el valor del operador 2: ");
        int op2 = e.nextInt();
        e.close();
        op1 += op2;
        boolean res = op1 > 0 ? true : false;
        System.out.print("el resultado de la comparación es "+res);
        System.out.println();
    }
}