public class Revista extends Material {
    private int editionNum;

    public Revista(String title, String author, int year, int editionNum) {
        super(title, author, year);
        this.editionNum = editionNum;
    }

    @Override
    public String mostrarInformacion() {
        return "----- REVISTA -----\n" +
               super.mostrarInformacion() +
               "Número de Edición: " + editionNum + "\n";
    }
}