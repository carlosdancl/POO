import java.util.Scanner;

public class TrianguloPascal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Ingresa el nivel del triángulo de Pascal: ");
        int nivel = s.nextInt();
        s.close();
        pascal(nivel);
    }
    
    public static void pascal(int n) {
        int[][] triangulo = new int[n + 1][n + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    triangulo[i][j] = 1;
                } else {
                    triangulo[i][j] = triangulo[i - 1][j - 1] + triangulo[i - 1][j];
                }
                System.out.print(triangulo[i][j] + " ");
            }
            System.out.println();
        }
    }
}
