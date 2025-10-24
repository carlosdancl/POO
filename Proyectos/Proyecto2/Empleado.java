package mx.unam.fi.poo.g1.project2;

public abstract class Empleado {
    private final String nombre;
    private final String apellidoPaterno;
    private final String nss;

    public Empleado(String nombre, String apellidoPaterno, String nss) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.nss = nss;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getNss() {
        return nss;
    }

    @Override
    public String toString() {
        return String.format("Empleado: %s %s%nNúmero de Seguro Social: %s", nombre, apellidoPaterno, nss);
    }

    public abstract double ingresos();

}