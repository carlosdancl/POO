import java.util.Scanner;

public class Proyecto {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Carrito miCarrito = new Carrito();
        
        int op = 0;
        
        while (op != 4) {
            System.out.println("\n--- MI CARRITO\n");
            System.out.println("1. Agregar Articulo");
            System.out.println("2. Ver Articulos");
            System.out.println("3. Eliminar Articulo");
            System.out.println("4. Salir");
            System.out.print("\nElige una opción: ");
            op = s.nextInt();

            s.nextLine();
            switch (op) {
                case 1:
                    System.out.print("\nIntroduce el nombre del articulo: ");
                    String nombre = s.nextLine();
                    System.out.print("Introduce el precio del articulo: ");
                    String precio = s.nextLine();
                    Articulo nArticulo = new Articulo(nombre, precio);
                    miCarrito.agregar(nArticulo);
                    break;
                case 2:
                    miCarrito.mostrar();
                    break;
                case 3:
                    miCarrito.mostrar();
                    System.out.print("\nQue elemento deseas eliminar: ");
                    int posicion = s.nextInt();
                    s.nextLine();
                    miCarrito.eliminar(posicion);
                    break;
                case 4:
                    System.out.println("--- Saliendo");
                    break;
                default:
                    System.out.println("--- Opción inválida.");
                    break;
            }
        }
        s.close();
    }
}