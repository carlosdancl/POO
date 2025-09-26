package mx.unam.fi.poo.p56;

public class Articulo {
    private String nombre;
    private double precio;

    public Articulo(){}
    public Articulo(String nombre, double precio) {
        setNombre(nombre);
        setPrecio(precio);
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nom){
        this.nombre = nom;
    }
    public double getPrecio(){
        return precio;
    }
    public void setPrecio(double coast){
        this.precio = coast;
    }

    public String toItemString() {
        long cents = Math.round(precio * 100);
        String entero = String.valueOf(cents/100);
        int dec = (int)(cents % 100);
        String decStr = dec < 10 ? ("0" + dec) : String.valueOf(dec);
        return nombre + " - $" + entero + "." + decStr;
    }
}
