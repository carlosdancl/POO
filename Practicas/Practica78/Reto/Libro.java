public class Libro extends Material {
    private String editorial;

    public Libro(String titulo, String autor, int anio, String editorial) {
        super(titulo, autor, anio);
        this.editorial = editorial;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("----- Información del Libro -----");
        super.mostrarInformacion();
        System.out.println("Editorial: " + editorial);
    }
}