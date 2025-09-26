public class Carrito {
    public Articulo[] Articulos;
    public int cantidad;

    public Carrito() {
        this.Articulos = new Articulo[100];
        this.cantidad = 0;
    }

    public void agregar(Articulo Articulo) {
        if (cantidad < 100) {
            Articulos[cantidad] = Articulo;
            cantidad++;
            System.out.println("\n--- Agregado");
        } else {
            System.out.println("\n--- Carrito Lleno");
        }
    }

    public void mostrar() {
        if (cantidad == 0) {
            System.out.println("--- El carrito está vacío.");
            return;
        }
        System.out.println("\n--- Articulos en el carrito");
        int i;
        for (i = 0; i < cantidad; i++) {
            System.out.println((i + 1) + ". " + Articulos[i]);
        }
    }

    public void eliminar(int pos) {
        int index;
        index = pos - 1;
        if (index >= 0 && index < cantidad) {
            String eliminado = Articulos[index].verNombre();
            int i;
            for (i = index; i < cantidad - 1; i++) {
                Articulos[i] = Articulos[i + 1];
            }
            cantidad--;
            Articulos[cantidad] = null;
            System.out.println("--- '" + eliminado + "' eliminado ");
        } else {
            System.out.println("--- Articulo inválido.");
        }
    }
}