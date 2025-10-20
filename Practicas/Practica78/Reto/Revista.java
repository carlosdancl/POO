public class Revista extends Material {
    private int numeroEdicion;

    public Revista(String titulo, String autor, int anio, int numeroEdicion) {
        super(titulo, autor, anio);
        this.numeroEdicion = numeroEdicion;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("----- Información de la Revista -----");
        super.mostrarInformacion();
        System.out.println("Número de Edición: " + numeroEdicion);
    }
}