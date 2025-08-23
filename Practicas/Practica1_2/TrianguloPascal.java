import java.util.Scanner;
public class TrianguloPascal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nivel;
        do {
            System.out.print("Ingresa el nivel del triángulo de Pascal: ");
            nivel = s.nextInt();
            pascal(nivel);
        } while(nivel < 1);
        s.close();
    }
    
    public static void pascal(int n) {
        int i, j, k;
        int[][] triangulo = new int[n][n];
        
        for (i = 0; i < n; i++) {
            for (j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    triangulo[i][j] = 1;
                } else {
                    triangulo[i][j] = triangulo[i - 1][j - 1] + triangulo[i - 1][j];
                }
            }
        }
        
        int max = triangulo[n - 1][n / 2]; 
        int ancho = String.valueOf(max).length() + 1;
        
        for (i = 0; i < n; i++) {
            // espacios iniciales
            for (k = 0; k < (n - i) * (ancho / 2); k++) {
                System.out.print(" ");
            }

            for (j = 0; j <= i; j++) {
                System.out.printf("%" + ancho + "d", triangulo[i][j]);
            }
            System.out.println();
        }
    }
}
