public class Libro extends Material {
    private String editorial;

    public Libro(String title, String author, int year, String editorial) {
        super(title, author, year);
        this.editorial = editorial;
    }

    @Override
    public String mostrarInformacion() {
        return "----- LIBRO -----\n" +
               super.mostrarInformacion() +
               "Editorial: " + editorial + "\n";
    }
}