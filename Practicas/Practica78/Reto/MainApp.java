public class Biblioteca {
    public static void main(String[] args) {
        Material[] misMateriales = new Material[3];

        misMateriales[0] = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 1967, "Sudamericana");
        misMateriales[1] = new Revista("National Geographic", "Varios", 2023, 10);
        misMateriales[2] = new DVD("El Origen", "Christopher Nolan", 2010, 148);
        for (Material material : misMateriales) {
            material.mostrarInformacion();
            System.out.println();
        }
    }
}