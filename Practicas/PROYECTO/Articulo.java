public class Articulo {
    String nombre;
    String precio;

    public Articulo(String nombre, String precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    
    public String verNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre + " $" + precio;
    }
}