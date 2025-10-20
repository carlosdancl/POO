public class DVD extends Material {
    private int minutes;

    public DVD(String title, String author, int year, int minutes) {
        super(title, author, year);
        this.minutes = minutes;
    }

    @Override
    public String mostrarInformacion() {
        return "----- DVD -----\n" +
               super.mostrarInformacion() +
               "Duración: " + minutes + " minutos\n";
    }
}