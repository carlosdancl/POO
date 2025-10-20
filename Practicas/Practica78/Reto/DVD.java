public class DVD extends Material {
    private int duracionMinutos;

    public DVD(String titulo, String autor, int anio, int duracionMinutos) {
        super(titulo, autor, anio);
        this.duracionMinutos = duracionMinutos;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("----- Información del DVD -----");
        super.mostrarInformacion();
        System.out.println("Duración: " + duracionMinutos + " minutos");
    }
}