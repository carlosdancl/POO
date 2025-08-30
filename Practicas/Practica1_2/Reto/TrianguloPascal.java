import java.util.Scanner;

public class TrianguloPascal {
    public static int C(int n, int k) { // Generación del número por la definición C(n, k) = C(n - 1, k - 1) + C(n - 1, k)
        if (k < 0 || k > n) {
            return 0;
        }
        if (k == 0 || k == n) {
            return 1;
        }
        return C(n - 1, k - 1) + C(n - 1, k);
    }

    public static int dig(int numero) { // Cuenta del número de dígitos de un número
        if (numero == 0) {
            return 1;
        }
        int contador = 0;
        if (numero < 0) {
            numero = -numero;
        }
        while (numero > 0) {
            numero /= 10;
            contador++;
        }
        return contador;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // Variables y Funciones
        int i = 0, j = 0, k = 0, m = 0, valor, anchoActual;
        System.out.print("Número de niveles: ");
        int n = s.nextInt();
        
        int valorMaximo = C(n - 1, (n - 1) / 2);
        int anchoMaximo = dig(valorMaximo);
        
        for (i = 0; i < n; i++) {                                           // Impresión de Resultados
            for (k = 0; k < (n - 1 - i) * (anchoMaximo + 1) / 2; k++) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                valor = C(i, j);
                anchoActual = dig(valor);
                for (m = 0; m < anchoMaximo - anchoActual; m++) {
                    System.out.print(" ");
                }
                System.out.print(valor + " ");
            }
            System.out.println();
        }
        s.close();
    }
}