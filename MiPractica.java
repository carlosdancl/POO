import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Practica3 {

    public static String generaHash(String texto) {
        int semilla = 0;
        for (char c : texto.toCharArray()) {
            semilla += c;
        }

        Random random = new Random(semilla);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 32; i++) {
            int valor = random.nextInt(16); // 0 - F
            sb.append(Integer.toHexString(valor));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Debes ingresar al menos una cadena como argumento.");
            return;
        }

        // Guardar entradas en un ArrayList
        ArrayList<String> entradas = new ArrayList<>();
        for (String arg : args) {
            entradas.add(arg);
        }

        // Generar HashMap con los hashes
        HashMap<String, String> mapa = new HashMap<>();
        for (String entrada : entradas) {
            mapa.put(entrada, generaHash(entrada));
        }

        // Mostrar resultados
        System.out.println("Resultados:");
        for (String entrada : entradas) {
            System.out.println("Entrada: " + entrada + " -> Hash: " + mapa.get(entrada));
        }
    }
}