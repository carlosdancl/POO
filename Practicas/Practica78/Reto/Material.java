public class Material {
    protected String title;
    protected String author;
    protected int year;

    public Material(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String mostrarInformacion() {
        return "Título: " + title + "\n" +
               "author: " + author + "\n" +
               "Año: " + year + "\n";
    }
}